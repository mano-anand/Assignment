package week3.day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student id:" + id );
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student id:" + id );
		System.out.println("Student name:" + name );
		
	}
	public void getStudentInfo(String  email, long mobileno) {
		System.out.println("Student email id :" + email);
		System.out.println("Student Mobile no : " +mobileno);
	}

	public static void main(String[] args) {
		
		Students obj1 = new Students();
		obj1.getStudentInfo(123);	
		obj1.getStudentInfo(123, "Mano");
		obj1.getStudentInfo("mano@testmail.com", 1234567890l);
		
	}

}
