package com.sample.school.dao;

import org.apache.ibatis.session.SqlSessionFactory;

import com.sample.school.utils.MybatisUtils;
import com.sample.school.vo.Student;

public class StudentDao {

	private static StudentDao instance = new StudentDao();
	private StudentDao() {
		this.sqlSessionFactory = MybatisUtils.getSqlSessionFactory();
	}
	public static StudentDao getInstance() {
		return instance;
	}
	
	private SqlSessionFactory sqlSessionFactory;
	
	/**
	 * 학생아이디를 전달받아서 SAMPLE_SCHOOL_STUDENTS에서 학생정보를 조회해서 반환한다.
	 * @param studentId 학생아이디
	 * @return 학생정보
	 */
	public Student getStudentById(String studentId) {
		return null;
	}
}
