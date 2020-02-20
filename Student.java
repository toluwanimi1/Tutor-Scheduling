
public class Student {
	
	static String username;

	static String student_name;

	static String student_id;

	static String student_email;

	static String subject;
	
	static double student_hours=0;

	public Student (String uname, String name, String id, String email) {
		
		Student.username = uname;
		Student.student_name = name;
		Student.student_id = id;
		Student.student_email = email;		
	
	}
	public  void setUserName (String name) {
		username = name;
	}
	
	public String getUserName() {
		return(username);
	}
	
	public  void setStudentName (String name) {
		student_name = name;
	}
	
	public String getStudentName() {
		return(student_name);
	}
	
	public void setStudentID (String id) {
		student_id = id;
	}
	public String getStudentID() {
		return student_id;
	}
	public  void setStudentEmail (String email) {
		student_email= email;
	}
	
	public String getStudentEmail() {
		return(student_email);
	}
	
	
	//The total hours the student spent being tutored. Can be used to log time
	public static void setStudenthours(double hours) {
		 
		double h;
		h= student_hours+hours;
		
		System.out.println(Student.student_name+" tutoring Hours:  "+ h);				
	
	}
	
	public double getStudentHours() {
		return(student_hours);
	}
	
	public void showStudentReport() {
		System.out.println("Username: "+Student.username );
		System.out.println("Student Name: "+ Student.student_name);
		System.out.println("Student Email "+ Student.student_email);
		System.out.println("Total Hours: " + Student.student_hours);
	}
	
	
	
	

 }
