
/* Drop Indexes */

DROP INDEX DEPT_LOCATION_IX;
DROP INDEX EMP_DEPARTMENT_IX;
DROP INDEX EMP_JOB_IX;
DROP INDEX EMP_MANAGER_IX;
DROP INDEX EMP_NAME_IX;
DROP INDEX JHIST_DEPARTMENT_IX;
DROP INDEX JHIST_EMPLOYEE_IX;
DROP INDEX JHIST_JOB_IX;
DROP INDEX LOC_CITY_IX;
DROP INDEX LOC_COUNTRY_IX;
DROP INDEX LOC_STATE_PROVINCE_IX;



/* Drop Tables */

DROP TABLE HR.JOB_HISTORY CASCADE CONSTRAINTS;
DROP TABLE HR.EMPLOYEES CASCADE CONSTRAINTS;
DROP TABLE HR.DEPARTMENTS CASCADE CONSTRAINTS;
DROP TABLE HR.LOCATIONS CASCADE CONSTRAINTS;
DROP TABLE HR.COUNTRIES CASCADE CONSTRAINTS;
DROP TABLE HR.JOBS CASCADE CONSTRAINTS;
DROP TABLE HR.REGIONS CASCADE CONSTRAINTS;
DROP TABLE HR.SALARY_GRADE CASCADE CONSTRAINTS;




/* Create Tables */

-- country table. Contains 25 rows. References with locations table.
CREATE TABLE HR.COUNTRIES
(
	-- Primary key of countries table.
	COUNTRY_ID char(2 char) NOT NULL,
	-- Country name
	COUNTRY_NAME varchar2(40 char),
	-- Region ID for the country. Foreign key to region_id column in the departments table.
	REGION_ID ,
	CONSTRAINT COUNTRY_C_ID_PK PRIMARY KEY (COUNTRY_ID)
);


-- Departments table that shows details of departments where employees
-- work. Contains 27 rows; references with locations, employees, and job_history tables.
CREATE TABLE HR.DEPARTMENTS
(
	-- Primary key column of departments table.
	DEPARTMENT_ID number(4,0) NOT NULL,
	-- A not null column that shows name of a department. Administration,
	-- Marketing, Purchasing, Human Resources, Shipping, IT, Executive, Public
	-- Relations, Sales, Finance, and Accounting. 
	DEPARTMENT_NAME varchar2(30 char) NOT NULL,
	-- Manager_id of a department. Foreign key to employee_id column of employees table. The manager_id column of the employee table references this column.
	MANAGER_ID number(6),
	-- Location id where a department is located. Foreign key to location_id column of locations table.
	LOCATION_ID number(4,0),
	CONSTRAINT DEPT_ID_PK PRIMARY KEY (DEPARTMENT_ID)
);


-- employees table. Contains 107 rows. References with departments,
-- jobs, job_history tables. Contains a self reference.
CREATE TABLE HR.EMPLOYEES
(
	-- Primary key of employees table.
	EMPLOYEE_ID number(6) NOT NULL,
	-- First name of the employee. A not null column.
	FIRST_NAME varchar2(20 char),
	-- Last name of the employee. A not null column.
	LAST_NAME varchar2(25 char) NOT NULL,
	-- Email id of the employee
	EMAIL varchar2(25 char) NOT NULL UNIQUE,
	-- Phone number of the employee; includes country code and area code
	PHONE_NUMBER varchar2(20 char),
	-- Date when the employee started on this job. A not null column.
	HIRE_DATE date NOT NULL,
	-- Current job of the employee; foreign key to job_id column of the
	-- jobs table. A not null column.
	JOB_ID varchar2(10 char) NOT NULL,
	-- Monthly salary of the employee. Must be greater
	-- than zero (enforced by constraint emp_salary_min)
	SALARY number(8,2),
	-- Commission percentage of the employee; Only employees in sales
	-- department elgible for commission percentage
	COMMISSION_PCT number(2,2),
	-- Manager id of the employee; has same domain as manager_id in
	-- departments table. Foreign key to employee_id column of employees table.
	-- (useful for reflexive joins and CONNECT BY query)
	MANAGER_ID number(6),
	-- Department id where employee works; foreign key to department_id
	-- column of the departments table
	DEPARTMENT_ID number(4,0),
	CONSTRAINT EMP_EMP_ID_PK PRIMARY KEY (EMPLOYEE_ID)
);


-- jobs table with job titles and salary ranges. Contains 19 rows.
-- References with employees and job_history table.
CREATE TABLE HR.JOBS
(
	-- Primary key of jobs table.
	JOB_ID varchar2(10 char) NOT NULL,
	-- A not null column that shows job title, e.g. AD_VP, FI_ACCOUNTANT
	JOB_TITLE varchar2(35 char) NOT NULL,
	-- Minimum salary for a job title.
	MIN_SALARY number(6),
	-- Maximum salary for a job title
	MAX_SALARY number(6),
	CONSTRAINT JOB_ID_PK PRIMARY KEY (JOB_ID)
);


-- Table that stores job history of the employees. If an employee
-- changes departments within the job or changes jobs within the department,
-- new rows get inserted into this table with old job information of the
-- employee. Contains a complex primary key: employee_id+start_date.
-- Contains 25 rows. References with jobs, employees, and departments tables.
CREATE TABLE HR.JOB_HISTORY
(
	-- A not null column in the complex primary key employee_id+start_date.
	-- Foreign key to employee_id column of the employee table
	EMPLOYEE_ID number(6) NOT NULL,
	-- A not null column in the complex primary key employee_id+start_date.
	-- Must be less than the end_date of the job_history table. (enforced by
	-- constraint jhist_date_interval)
	START_DATE date NOT NULL,
	-- Last day of the employee in this job role. A not null column. Must be
	-- greater than the start_date of the job_history table.
	-- (enforced by constraint jhist_date_interval)
	END_DATE date NOT NULL,
	-- Job role in which the employee worked in the past; foreign key to
	-- job_id column in the jobs table. A not null column.
	JOB_ID varchar2(10 char) NOT NULL,
	-- Department id in which the employee worked in the past; foreign key to deparment_id column in the departments table
	DEPARTMENT_ID number(4,0),
	CONSTRAINT JHIST_EMP_ID_ST_DATE_PK PRIMARY KEY (EMPLOYEE_ID, START_DATE)
);


-- Locations table that contains specific address of a specific office,
-- warehouse, and/or production site of a company. Does not store addresses /
-- locations of customers. Contains 23 rows; references with the
-- departments and countries tables. 
CREATE TABLE HR.LOCATIONS
(
	-- Primary key of locations table
	LOCATION_ID number(4,0) NOT NULL,
	-- Street address of an office, warehouse, or production site of a company.
	-- Contains building number and street name
	STREET_ADDRESS varchar2(40 char),
	-- Postal code of the location of an office, warehouse, or production site
	-- of a company. 
	POSTAL_CODE varchar2(12 char),
	-- A not null column that shows city where an office, warehouse, or
	-- production site of a company is located. 
	CITY varchar2(30 char) NOT NULL,
	-- State or Province where an office, warehouse, or production site of a
	-- company is located.
	STATE_PROVINCE varchar2(25 char),
	-- Country where an office, warehouse, or production site of a company is
	-- located. Foreign key to country_id column of the countries table.
	COUNTRY_ID char(2 char),
	CONSTRAINT LOC_ID_PK PRIMARY KEY (LOCATION_ID)
);


CREATE TABLE HR.REGIONS
(
	REGION_ID  NOT NULL,
	REGION_NAME varchar2(25 char),
	CONSTRAINT REG_ID_PK PRIMARY KEY (REGION_ID)
);


CREATE TABLE HR.SALARY_GRADE
(
	GRADE varchar2(20 char) NOT NULL,
	MIN_SALARY number(8),
	MAX_SALARY number(8)
);



/* Create Foreign Keys */

ALTER TABLE HR.LOCATIONS
	ADD CONSTRAINT LOC_C_ID_FK FOREIGN KEY (COUNTRY_ID)
	REFERENCES HR.COUNTRIES (COUNTRY_ID)
;


ALTER TABLE HR.EMPLOYEES
	ADD CONSTRAINT EMP_DEPT_FK FOREIGN KEY (DEPARTMENT_ID)
	REFERENCES HR.DEPARTMENTS (DEPARTMENT_ID)
;


ALTER TABLE HR.JOB_HISTORY
	ADD CONSTRAINT JHIST_DEPT_FK FOREIGN KEY (DEPARTMENT_ID)
	REFERENCES HR.DEPARTMENTS (DEPARTMENT_ID)
;


ALTER TABLE HR.DEPARTMENTS
	ADD CONSTRAINT DEPT_MGR_FK FOREIGN KEY (MANAGER_ID)
	REFERENCES HR.EMPLOYEES (EMPLOYEE_ID)
;


ALTER TABLE HR.EMPLOYEES
	ADD CONSTRAINT EMP_MANAGER_FK FOREIGN KEY (MANAGER_ID)
	REFERENCES HR.EMPLOYEES (EMPLOYEE_ID)
;


ALTER TABLE HR.JOB_HISTORY
	ADD CONSTRAINT JHIST_EMP_FK FOREIGN KEY (EMPLOYEE_ID)
	REFERENCES HR.EMPLOYEES (EMPLOYEE_ID)
;


ALTER TABLE HR.EMPLOYEES
	ADD CONSTRAINT EMP_JOB_FK FOREIGN KEY (JOB_ID)
	REFERENCES HR.JOBS (JOB_ID)
;


ALTER TABLE HR.JOB_HISTORY
	ADD CONSTRAINT JHIST_JOB_FK FOREIGN KEY (JOB_ID)
	REFERENCES HR.JOBS (JOB_ID)
;


ALTER TABLE HR.DEPARTMENTS
	ADD CONSTRAINT DEPT_LOC_FK FOREIGN KEY (LOCATION_ID)
	REFERENCES HR.LOCATIONS (LOCATION_ID)
;


ALTER TABLE HR.COUNTRIES
	ADD CONSTRAINT COUNTR_REG_FK FOREIGN KEY (REGION_ID)
	REFERENCES HR.REGIONS (REGION_ID)
;



/* Create Indexes */

CREATE INDEX DEPT_LOCATION_IX ON HR.DEPARTMENTS (LOCATION_ID);
CREATE INDEX EMP_DEPARTMENT_IX ON HR.EMPLOYEES (DEPARTMENT_ID);
CREATE INDEX EMP_JOB_IX ON HR.EMPLOYEES (JOB_ID);
CREATE INDEX EMP_MANAGER_IX ON HR.EMPLOYEES (MANAGER_ID);
CREATE INDEX EMP_NAME_IX ON HR.EMPLOYEES (LAST_NAME, FIRST_NAME);
CREATE INDEX JHIST_DEPARTMENT_IX ON HR.JOB_HISTORY (DEPARTMENT_ID);
CREATE INDEX JHIST_EMPLOYEE_IX ON HR.JOB_HISTORY (EMPLOYEE_ID);
CREATE INDEX JHIST_JOB_IX ON HR.JOB_HISTORY (JOB_ID);
CREATE INDEX LOC_CITY_IX ON HR.LOCATIONS (CITY);
CREATE INDEX LOC_COUNTRY_IX ON HR.LOCATIONS (COUNTRY_ID);
CREATE INDEX LOC_STATE_PROVINCE_IX ON HR.LOCATIONS (STATE_PROVINCE);



/* Comments */

COMMENT ON TABLE HR.COUNTRIES IS 'country table. Contains 25 rows. References with locations table.';
COMMENT ON COLUMN HR.COUNTRIES.COUNTRY_ID IS 'Primary key of countries table.';
COMMENT ON COLUMN HR.COUNTRIES.COUNTRY_NAME IS 'Country name';
COMMENT ON COLUMN HR.COUNTRIES.REGION_ID IS 'Region ID for the country. Foreign key to region_id column in the departments table.';
COMMENT ON TABLE HR.DEPARTMENTS IS 'Departments table that shows details of departments where employees
work. Contains 27 rows; references with locations, employees, and job_history tables.';
COMMENT ON COLUMN HR.DEPARTMENTS.DEPARTMENT_ID IS 'Primary key column of departments table.';
COMMENT ON COLUMN HR.DEPARTMENTS.DEPARTMENT_NAME IS 'A not null column that shows name of a department. Administration,
Marketing, Purchasing, Human Resources, Shipping, IT, Executive, Public
Relations, Sales, Finance, and Accounting. ';
COMMENT ON COLUMN HR.DEPARTMENTS.MANAGER_ID IS 'Manager_id of a department. Foreign key to employee_id column of employees table. The manager_id column of the employee table references this column.';
COMMENT ON COLUMN HR.DEPARTMENTS.LOCATION_ID IS 'Location id where a department is located. Foreign key to location_id column of locations table.';
COMMENT ON TABLE HR.EMPLOYEES IS 'employees table. Contains 107 rows. References with departments,
jobs, job_history tables. Contains a self reference.';
COMMENT ON COLUMN HR.EMPLOYEES.EMPLOYEE_ID IS 'Primary key of employees table.';
COMMENT ON COLUMN HR.EMPLOYEES.FIRST_NAME IS 'First name of the employee. A not null column.';
COMMENT ON COLUMN HR.EMPLOYEES.LAST_NAME IS 'Last name of the employee. A not null column.';
COMMENT ON COLUMN HR.EMPLOYEES.EMAIL IS 'Email id of the employee';
COMMENT ON COLUMN HR.EMPLOYEES.PHONE_NUMBER IS 'Phone number of the employee; includes country code and area code';
COMMENT ON COLUMN HR.EMPLOYEES.HIRE_DATE IS 'Date when the employee started on this job. A not null column.';
COMMENT ON COLUMN HR.EMPLOYEES.JOB_ID IS 'Current job of the employee; foreign key to job_id column of the
jobs table. A not null column.';
COMMENT ON COLUMN HR.EMPLOYEES.SALARY IS 'Monthly salary of the employee. Must be greater
than zero (enforced by constraint emp_salary_min)';
COMMENT ON COLUMN HR.EMPLOYEES.COMMISSION_PCT IS 'Commission percentage of the employee; Only employees in sales
department elgible for commission percentage';
COMMENT ON COLUMN HR.EMPLOYEES.MANAGER_ID IS 'Manager id of the employee; has same domain as manager_id in
departments table. Foreign key to employee_id column of employees table.
(useful for reflexive joins and CONNECT BY query)';
COMMENT ON COLUMN HR.EMPLOYEES.DEPARTMENT_ID IS 'Department id where employee works; foreign key to department_id
column of the departments table';
COMMENT ON TABLE HR.JOBS IS 'jobs table with job titles and salary ranges. Contains 19 rows.
References with employees and job_history table.';
COMMENT ON COLUMN HR.JOBS.JOB_ID IS 'Primary key of jobs table.';
COMMENT ON COLUMN HR.JOBS.JOB_TITLE IS 'A not null column that shows job title, e.g. AD_VP, FI_ACCOUNTANT';
COMMENT ON COLUMN HR.JOBS.MIN_SALARY IS 'Minimum salary for a job title.';
COMMENT ON COLUMN HR.JOBS.MAX_SALARY IS 'Maximum salary for a job title';
COMMENT ON TABLE HR.JOB_HISTORY IS 'Table that stores job history of the employees. If an employee
changes departments within the job or changes jobs within the department,
new rows get inserted into this table with old job information of the
employee. Contains a complex primary key: employee_id+start_date.
Contains 25 rows. References with jobs, employees, and departments tables.';
COMMENT ON COLUMN HR.JOB_HISTORY.EMPLOYEE_ID IS 'A not null column in the complex primary key employee_id+start_date.
Foreign key to employee_id column of the employee table';
COMMENT ON COLUMN HR.JOB_HISTORY.START_DATE IS 'A not null column in the complex primary key employee_id+start_date.
Must be less than the end_date of the job_history table. (enforced by
constraint jhist_date_interval)';
COMMENT ON COLUMN HR.JOB_HISTORY.END_DATE IS 'Last day of the employee in this job role. A not null column. Must be
greater than the start_date of the job_history table.
(enforced by constraint jhist_date_interval)';
COMMENT ON COLUMN HR.JOB_HISTORY.JOB_ID IS 'Job role in which the employee worked in the past; foreign key to
job_id column in the jobs table. A not null column.';
COMMENT ON COLUMN HR.JOB_HISTORY.DEPARTMENT_ID IS 'Department id in which the employee worked in the past; foreign key to deparment_id column in the departments table';
COMMENT ON TABLE HR.LOCATIONS IS 'Locations table that contains specific address of a specific office,
warehouse, and/or production site of a company. Does not store addresses /
locations of customers. Contains 23 rows; references with the
departments and countries tables. ';
COMMENT ON COLUMN HR.LOCATIONS.LOCATION_ID IS 'Primary key of locations table';
COMMENT ON COLUMN HR.LOCATIONS.STREET_ADDRESS IS 'Street address of an office, warehouse, or production site of a company.
Contains building number and street name';
COMMENT ON COLUMN HR.LOCATIONS.POSTAL_CODE IS 'Postal code of the location of an office, warehouse, or production site
of a company. ';
COMMENT ON COLUMN HR.LOCATIONS.CITY IS 'A not null column that shows city where an office, warehouse, or
production site of a company is located. ';
COMMENT ON COLUMN HR.LOCATIONS.STATE_PROVINCE IS 'State or Province where an office, warehouse, or production site of a
company is located.';
COMMENT ON COLUMN HR.LOCATIONS.COUNTRY_ID IS 'Country where an office, warehouse, or production site of a company is
located. Foreign key to country_id column of the countries table.';



