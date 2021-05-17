package vo;

import java.util.Date;

import utils.StringUtils;

public class Todo {
	
	// 일정 상태값
	public static final String TODO_STATUS_ADDED = "등록";
	public static final String TODO_STATUS_DELETED = "삭제";
	public static final String TODO_STATUS_COMPLETED = "완료";
	
	private int no;
	private String title;
	private String writer;
	private Date day;
	private String status;
	private String text;
	private Date createdDate;
	private Date completedDate;
	private Date deletedDate;
	
	public Todo() {
		this.no = StringUtils.getSequence();
	}
	
	public Todo(int no, String title, String writer, Date day, String status, String text, Date createdDate,
			Date completedDate, Date deletedDate) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.day = day;
		this.status = status;
		this.text = text;
		this.createdDate = createdDate;
		this.completedDate = completedDate;
		this.deletedDate = deletedDate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getCompletedDate() {
		return completedDate;
	}

	public void setCompletedDate(Date completedDate) {
		this.completedDate = completedDate;
	}

	public Date getDeletedDate() {
		return deletedDate;
	}

	public void setDeletedDate(Date deletedDate) {
		this.deletedDate = deletedDate;
	}
	
	public Date getDay() {
		return day;
	}
	
	public void setDay(Date day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "Todo [no=" + no + ", title=" + title + ", writer=" + writer + ", day=" + StringUtils.dateTimeToString(day) +", status=" + status + ", text=" + text
				+ ", createdDate=" + StringUtils.dateTimeToString(createdDate) + ", completedDate=" + StringUtils.dateTimeToString(completedDate) + ", deletedDate=" + StringUtils.dateTimeToString(deletedDate)
				+ "]";
	}
	
}
