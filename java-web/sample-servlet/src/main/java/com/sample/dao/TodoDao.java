package com.sample.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sample.util.MybatisUtils;
import com.sample.vo.Todo;

public class TodoDao {

	private SqlSessionFactory sqlSessionFactory;
	
	private static TodoDao instance = new TodoDao();
	private TodoDao() {
		this.sqlSessionFactory = MybatisUtils.getSqlSessionFactory();
	}
	public static TodoDao getInstance() {
		return instance; 
	}
	
	/**
	 * 가장 최근에 등록된 일정 5개를 조회해서 반환한다.
	 * @return 최근 일정 리스트
	 */
	public List<Todo> getNewTodos() {
		SqlSession session = sqlSessionFactory.openSession();
		List<Todo> todos = session.selectList("todos.getNewTodos");
		session.close();
		return todos;
	}
	
	/**
	 * 전달받은 사용자아이디로 등록된 모든 일정정보를 조회해서 반환한다
	 * @param userId 사용자아아디
	 * @return 지정된 사용자의 모든 일정정보
	 */
	public List<Todo> getTodosByUserId(String userId) {
		SqlSession session = sqlSessionFactory.openSession();
		List<Todo> todos = session.selectList("todos.getTodosByUserId", userId);
		session.close();
		return todos;
	}
	
	/**
	 * 일정번호를 전달받아서 해당 일정정보를 조회해서 반환한다.
	 * @param todoNo 일정번호
	 * @return 일정정보
	 */
	public Todo getTodoByNo(int todoNo) {
		SqlSession session = sqlSessionFactory.openSession();
		Todo todo = session.selectOne("getTodoByNo", todoNo);
		session.close();
		return todo;
	}
	
	/**
	 * 변경된 정보가 포함된 일정정보를 전달받아서 데이터베이스에 반영시킨다.
	 * @param todo 변경된 정보가 포함된 일정정보
	 */
	public void updateTodo(Todo todo) {
		SqlSession session = sqlSessionFactory.openSession(true);
		session.update("updateTodo", todo);
		session.close();
	}
} 
