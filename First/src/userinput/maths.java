package userinput;
import java.util.Scanner;

public class maths {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int n=0;
	public void Add() {
	    n=a+b;
		System.out.println("ADD=   " +n);
	}
	public void Sub() {
		n=a-b;
		System.out.println("SUB=" +n);
	}
	public static void main(String[]args) {
		maths problem = new maths();
		problem.Add();
	 	problem.Sub();
	}
}
