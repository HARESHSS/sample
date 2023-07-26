package time;
import java.util.HashMap;

public class Hash {
	public static void main(String[]args) {
		HashMap<Integer,String> obj=new HashMap<Integer,String>();
		obj.put(1,"Vivo");
		obj.put(2,"apple");
		obj.put(3,"Sumsung");
		obj.put(4,"Lava");
		//System.out.println(obj);
		obj.put(3,"iphone");
		System.out.println(obj);
	}

}