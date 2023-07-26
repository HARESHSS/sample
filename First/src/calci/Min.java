package calci;

public class Min {
	public static void main(String[]args) {
		int [] num= {5,8,6,2,7,9};
		int min = num[0];
		for (int i = 0;i<num.length;i++) {
			if(num[i]<min) {
				min=num[i];
			}
			
		}
		System.out.println(min);
	}
}
