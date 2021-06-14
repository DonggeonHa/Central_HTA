package com.sample.school.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sample.school.utils.MybatisUtils;
import com.sample.school.vo.Department;

public class DepartmentDao {

	private static DepartmentDao instance = new DepartmentDao();
	private DepartmentDao() {
		this.sqlSessionFactory = MybatisUtils.getSqlSessionFactory();
	}
	public static DepartmentDao getInstance() {
		return instance;
	}
	
	private SqlSessionFactory sqlSessionFactory;
	
	/**
	 * SAMPLE_SCHOOL_DEPARTMENTS에서 모든 부서정보를 조회해서 반환한다.
	 * @return 모든 부서정보 목록
	 */
	public List<Department> getAllDepartments() {
		SqlSession session = sqlSessionFactory.openSession();
		List<Department> departments = session.selectList("getAllDepartments");
		session.close();
		
		return departments;
	}
}
