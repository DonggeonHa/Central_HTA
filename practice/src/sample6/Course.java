package sample6;

public class Course {

	private int courseNo;
	private String courseName;
	private int quota;
	private int registeredCount;
	
	Course() {}

	public Course(int courseNo, String courseName, int quota) {
		this.courseNo = courseNo;
		this.courseName = courseName;
		this.quota = quota;
	}

	public int getCourseNo() {
		return courseNo;
	}

	public void setCourseNo(int courseNo) {
		this.courseNo = courseNo;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getQuota() {
		return quota;
	}

	public void setQuota(int quota) {
		this.quota = quota;
	}

	public int getRegisteredCount() {
		return registeredCount;
	}

	public void setRegisteredCount(int registeredCount) {
		this.registeredCount = registeredCount;
	}
	
	
}
