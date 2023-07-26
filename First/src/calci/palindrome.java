package calci;
import java.util.Scanner;

public class palindrome {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();//123
		int tem=num;
		int r,s=0;
		while(num>0){
			r=num%10;//3//2//1
			s=(r*r*r)+s;//s=(s*10)+r;//3//32//321
			num=num/10;//12//1
		}
		System.out.println(s);	
        if (tem==s) {
        	System.out.println("am");//Palindrome
        }
        else {
        	System.out.println("Not a am");
        }
	}
	
}

//123=1*1*1+2*2*2+3*3*3=