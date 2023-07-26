package time;
import java.util.HashSet;

public class Set {
	public static void main(String[]args) {
		HashSet<String> obj=new HashSet<String>();
		obj.add("haresh");
		//obj.add("haresh");
		obj.add("OHM");
		obj.add("raja");
		obj.add("ASHWIN");
		System.out.println(obj);
		obj.remove("HARESH");
		System.out.println(obj.size());
		System.out.println(obj.contains("raja"));		
		obj.clear();
		System.out.println(obj);
	}

}
