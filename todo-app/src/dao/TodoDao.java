package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import utils.StringUtils;
import vo.Todo;

public class TodoDao {

	private List<Todo> db = new ArrayList<Todo>();
	
	/**
	 * 새 Todo을 db에 추가한다.
	 * @param todo 새 Todo
	 */
	public void insertTodo(Todo todo) {
		
	}
	
	/**
	 * 모든 Todo 정보를 반환한다.
	 * @return Todo 리스트
	 */
	public List<Todo> getTodos() {
		return db;
	}
	
	/**
	 * 지정한 Todo 번호의 Todo 정보를 반환한다.
	 * @param no 일정번호
	 * @return Todo정보
	 */
	public Todo getTodoByNo(int no) {
		return null;
	}
	
	/**
	 * todos.csv에 기록된 Todo정보를 읽어서 db에 저장한다.
	 */
	public void loadData() {
		try (FileReader fr = new FileReader("todos.csv"); BufferedReader reader = new BufferedReader(fr)) {

			String value = null;
			while ((value = reader.readLine()) != null) {
				// value - 10000, hong, 프로젝트회의, 5월초 신규프로젝트 관련회의, 2021-05-04, .....
				String[] items = value.split(",");
				int no = StringUtils.stringToInt(items[0]);
				String title = items[1];
				String writer = items[2];
				Date day = StringUtils.stringToDate(items[3]);
				String status = items[4];
				String text = items[5];
				Date createDate = StringUtils.stringToDate(items[6]);
				Date completedDate = StringUtils.stringToDate(items[7]);
				Date deletedDate = StringUtils.stringToDate(items[8]);
				
				Todo todo = new Todo(no, title, writer, day, status, text, createDate, completedDate, deletedDate);
				
				db.add(todo);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * db에 저장된 Todo 정보를 totos.csv 파일에 저장한다.
	 */
	public void saveData() {
		try (PrintWriter writer = new PrintWriter("todos.csv")) {
			for (Todo todo : db) {
				StringBuilder sb = new StringBuilder();
				
				sb.append(todo.getNo())
					.append(",")
					.append(todo.getTitle())
					.append(",")
					.append(todo.getWriter())
					.append(",")
					.append(todo.getDay())
					.append(",")
					.append(todo.getStatus())
					.append(",")
					.append(todo.getText())
					.append(",")
					.append(todo.getCreatedDate())
					.append(",")
					.append(todo.getCompletedDate())
					.append(",")
					.append(todo.getDeletedDate());
				
				String text = sb.toString();
				
				writer.println(text);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
