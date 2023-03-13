package myfirstprog;

public class CallStudent {
public static void main(String [] args) {
	Student s = new Student();
	s.rollno=2345;
	s.age=33;
	s.standard="8";
	s.name="Sukanya";
	s.getDetails(s);
	System.out.println("-----------");
	Student s1= new Student();
	s1.name="Monika";
	s1.rollno=3456;
	s1.standard="9";
	s.getDetails(s1);
}
}
