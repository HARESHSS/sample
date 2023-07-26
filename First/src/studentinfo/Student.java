package studentinfo;

public class Student {
	public void StudentDetails(int id) {
		System.out.println("user id:"+id);
	}
	public void StudentDetails(String name) {
		System.out.println("Username:"+name);
	}
	protected void StudentDetails(int phone,String email) {
		System.out.println("phone:"+phone +"email :"+email);
	}
    public static void main(String[]args) {
    	Student info=new Student();
    	info.StudentDetails(1);
    	info.StudentDetails("shree");
    	info.StudentDetails(989765789,"shree@hmail.vom");    
    	}
}
