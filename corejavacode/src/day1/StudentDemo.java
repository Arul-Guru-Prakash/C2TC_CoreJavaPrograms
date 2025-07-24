package day1;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		
		s1.setSid(101);
		s1.setSname("ankit");
		s1.setCourse("JFS");
		
		System.out.println(s1);//when printing the object , it automatically calls the tostring
		
		Student s2=new Student();
		
		s2.setSid(102);
		s2.setSname("Rja");
		s2.setCourse("JFS");

		System.out.println(s2);
		
		Student s3=new Student();
		
		s3.setSid(103);
		s3.setSname("Jagan");
		s3.setCourse("AngularJs");
		
		System.out.println(s3);
		
	}

}
