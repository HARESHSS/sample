package Assignment;

public class Comparison {
	int x = 25;
	public void lessthan() {
		if (x>=18){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}
	public void greaterthan() {
		if (x<=18) {
			System.out.println("child");
		}
		else {
			System.out.println("Teen");
		}
	}
	public static void main(String[]args) {
		Comparison comp = new Comparison();
		comp.lessthan();
		comp.greaterthan();
	}

}
