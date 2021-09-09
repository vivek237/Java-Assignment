package Composition;

public class School {
	private int Schoolid;
	private String Schoolname;
	
	public void SchoolName(String name) {
		this.Schoolname=name;
	}
	public void SchoolId(int id) {
		this.Schoolid=id;
	}
	public void SchoolInfo() {
		System.out.println("School name "+Schoolname+"\nSchool Id "+Schoolid);
	}
}

class SchoolStatus{
	public void open() {
		System.out.println("School open");
	}
	public void close() {
		System.out.println("School close");
	}
}

class Student extends School{
	public void student() {
		SchoolStatus status=new SchoolStatus();
		status.open();
		status.close();
	}

public static void main(String args[]) {
	//creating school object
	School school=new School();
	school.SchoolName("DPS");
	school.SchoolId(101);
	school.SchoolInfo();
	//creating object of Student
	Student student=new Student();
	student.student();
	
}
}