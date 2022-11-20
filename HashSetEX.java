import java.util.HashSet;
import java.util.Set;

public class HashSetEX {
	public static void main(String[] args) {
			
		Set<String> obj=new HashSet<>();
	
		obj.add("Yogita");
		obj.add("Sharvari");
		obj.add("Govind");
		obj.add("Rekha");
		obj.add("Samiksha");
		obj.add(null);
		
		Set<String> obj1=new HashSet<>();
		
		obj1.add("Yogita");
		obj1.add("Sharvari");
		obj1.add("Govind");
		obj1.add("Rekha");
		
		obj1.add(null);
	
		System.out.println(obj);
		
		System.out.println(obj.size());
		System.out.println(obj.contains("Nayna"));
		System.out.println(obj.getClass());
		System.out.println(obj.isEmpty());
		System.out.println(obj.equals(obj1));
	}
}