package inheritanceOdev;

public class Student extends User {

	private int studentId;

	public Student() {

	}

	public Student(int studentId) {
		this.studentId = studentId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
}
