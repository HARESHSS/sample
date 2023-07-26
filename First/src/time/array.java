package time;
import java.util.LinkedList;


public class array {
	public static void main(String[]args) {
		LinkedList<String> car=new LinkedList<String>();
		car.add("BMW");
		car.add("Audi");
		car.add("Mini cooper");
		car.addFirst("Maruthi");
		System.out.println(car);
		car.addLast("jaguar");
		System.out.println(car);
		car.removeFirst();
		System.out.println(car.getFirst());	
	}
}
