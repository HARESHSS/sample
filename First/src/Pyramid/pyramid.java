package Pyramid;

public class pyramid {
	public static void main(String[]args) {
		int row =5;
		for(int i =0 ;i<=row;i++) {
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
		    System.out.println();
		}
		for(int i =row ;i>0;i--) {
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
		    System.out.println();
		}
	}
	
}
//if((x%4==0 && x%100!=0) || x%400==0)

















