package calci;

public class calculator {
	public static void main(String[]args) {
		int x = 3;
		int y = 10;
		int m = 10;
		switch(m) {
		case 1:
			System.out.println(x*y);
		break;
		case 2:
			System.out.println(x+y);
		break;
		case 3:
			System.out.println(x-y);
		break;
		case 4:
			System.out.println(x/y);
		break;
		case 5:
			System.out.println(x%y);
		break;
		default:
			System.out.println("Give m value properly");
		}
		
		
	}
}
