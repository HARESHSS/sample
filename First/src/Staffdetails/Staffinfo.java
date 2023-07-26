package Staffdetails;

public class Staffinfo {
	public void StaffDetails(String name) {
		System.out.println("username:"+name);
	}
	public void StaffDetails(int id) {
		System.out.println("ID:"+id);
	}
	public void StaffDetails(int phone,String gmail) {
		System.out.println("phone:"+phone +"email:"+gmail);
	}
	public static void main(String[]args) {
		Staffinfo Details=new Staffinfo();
		Details.StaffDetails("Haresh");
		Details.StaffDetails(456);
		Details.StaffDetails(98767899,"haresh@gmail.com");
	}
	   
}