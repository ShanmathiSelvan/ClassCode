package myfirstprog;

public class Student {
	int rollno;
	static int age= 23;
	String name;
	String standard;
	public void getDetails(Student s) {
		System.out.println("Age is "+s.age);
		System.out.println("Name is "+s.name);
		System.out.println("She is in "+s.standard+" Standard");
		System.out.println("Rollno is "+s.rollno);
	}
	

}
