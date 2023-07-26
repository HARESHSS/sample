package calci;

public class fib {
	public static void main(String[]args) {
		int a =0;
		int b =1;
		System.out.print(a+" "+b);
		for (int k=0;k<=50;k++) {
			k=a+b;
			System.out.print(" "+k);
			a=b; //a=1
			b=k; //b=1
		}
	}

}
  