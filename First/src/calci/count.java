package calci;
import java.util.Scanner;
public class count {
	public static void main(String[]args) {
		int alpcount=0;
		int numcount=0;
		int special=0;
		Scanner sc = new Scanner(System.in);
		String word=sc.nextLine();
		
		for(int i=0;i<=word.length()-1;i++) {
			char ch=word.charAt(i);
			if((ch>='a'&&ch<='z')||(ch>='A' && ch<='Z')) {
				alpcount++;
			}
			else if(ch>=0 && ch<=9) {
				numcount++;
			}
			else {
				special++;
			}
			
			
			
		}System.out.println(alpcount);
		System.out.println(numcount);
		System.out.println(special);
		
	}
}
