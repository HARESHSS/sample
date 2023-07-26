
package userinput;
import java.util.Scanner;



public class user {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String Name = sc.nextLine();
		int age = sc.nextInt();
		boolean isactive = sc.nextBoolean();
		float height = sc.nextFloat();
		Double Amount = sc.nextDouble();
		System.out.println("Name:" +Name);
		System.out.println("Age :"+age);
		System.out.println("is active :"+isactive);
		System.out.println("height :"+height);
		System.out.println("Amount :"+Amount);
		
	}
}
