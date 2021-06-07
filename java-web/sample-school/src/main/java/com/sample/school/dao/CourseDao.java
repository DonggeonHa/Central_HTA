package com.sample.school.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;

import com.sample.school.dto.CourseDto;
import com.sample.school.utils.MybatisUtils;
import com.sample.school.vo.Course;

public class CourseDao {

	private static CourseDao instance = new CourseDao();
	private CourseDao() {
		this.sqlSessionFactory = MybatisUtils.getSqlSessionFactory();
	}
	public static CourseDao getInstance() {
		return instance;
	}
	
	private SqlSessionFactory sqlSessionFactory;
	
	/**
	 * 개설과정정보를 전달받아서 SAMPLE_SCHOOL_COURSES에 저장한다.
	 * @param course 신규 개설과정 정보
	 */
	public void insertCourse(Course course) {
		
	}
	
	/**
	 * 과정번호를 전달받아서 SAMPLE_SCHOOL_COURSES에서 개설과정정보를 조회해서 반환한다.
	 * @param courseNo 개설과정번호
	 * @return 개설과정정보
	 */
	public CourseDto getCourseByNo(int courseNo) {
		return null;
	}
	
	/**
	 * 변경된 개설과정정보를 전달받아서 SAMPLE_SCHOOL_COURSE에 반영한다.
	 * @param course 변경된 정보가 포함된 개설과정정보
	 */
	public void updateCourse(Course course) {
		
	}
	
	/**
	 * 학과번호를 전달받아서 해당 학과에 등록된 과정정보를 조회해서 반환한다.
	 * @param departmentNo 학과번호
	 * @return 개설과정목록
	 */
	public List<CourseDto> getCoursesByDepartmentNo(int departmentNo) {
		return null;
	}
	
	/**
	 * 교수아이디를 전달받아서 해당 교수가 개설한 과정정보를 조회해서 반환한다.
	 * @param professorId 교수아이디
	 * @return 개설과정목록
	 */
	public List<CourseDto> getCoursesByProfessorId(String professorId) {
		return null;
	}
}
