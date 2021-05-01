package inheritanceOdev;

public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.setStudentId(1);
		student.setId(1);
		student.setFirstName("Murat");
		student.setLastName("Güney");
		student.setUserName("Murat");
		student.setPassword("1234");
		student.setMailAdress("abcabc@abc.com");
		
		
		student.getStudentId();
		student.getUserName();
		

		Instructor instructor = new Instructor();
		instructor.setInstructorId(1);
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setUserName("Engin");
		instructor.setPassword("1234");
		instructor.setMailAdress("abcabc@abc.com");

		instructor.getInstructorId();
		instructor.getUserName();

		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.update(student);

		InstructorManager instructorManager = new InstructorManager();

		instructorManager.addInstructorMessage();
		instructorManager.update(instructor);

		UserManager userManager = new UserManager();
		userManager.add(student);
	}

}
