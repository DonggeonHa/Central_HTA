package com.sample.school.dao;

import org.apache.ibatis.session.SqlSessionFactory;

import com.sample.school.utils.MybatisUtils;
import com.sample.school.vo.Professor;

public class ProfessorDao {

	private static ProfessorDao instance = new ProfessorDao();
	private ProfessorDao() {
		this.sqlSessionFactory = MybatisUtils.getSqlSessionFactory();
	}
	public static ProfessorDao getInstance() {
		return instance;
	}
	
	private SqlSessionFactory sqlSessionFactory;
	
	/**
	 * 교수정보를 전달받아서 SAMPLE_SCHOOL_PROFESSORS에 저장한다.
	 * @param professor 교수정보
	 */
	public void insertProfessor(Professor professor) {
		
	}
	
	/**
	 * 교수아이디를 전달받아서 SAMPLE_SCHOOL_PROFESSORS에서 교수정보를 조회해서 반환한다.
	 * @param professorId
	 * @return
	 */
	public Professor getProfessorById(String professorId) {
		return null;
	}
}
