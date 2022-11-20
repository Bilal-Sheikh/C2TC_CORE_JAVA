import java.util.ArrayList;

public class ArrayList_EX {
	public static void main(String[] args) {
 
		ArrayList <String> player = new ArrayList <String>();
		
		player.add("Dhoni");
		player.add("Virat");
		player.add("Rohit");
		player.add("Yuvraj");
		player.add("Surya");
		
		System.out.println(player);
		
//		System.out.println(player.remove());
//		System.out.println(player.remove());
		
		System.out.println(player);

		player.add("Hardik");
		System.out.println(player);
		
//		player.addFirst("Pant");
//		player.addLast("KL");
		System.out.println(player);
		
		player.add(2, "Bumrahhhhhhh");
		System.out.println(player);
		
		//modify
		player.set(2, "Bumrah");
		System.out.println(player);
		
		
		System.out.println(player.indexOf("Hardik"));

		
		System.out.println(player.get(2));
		
		player.remove(5);
		System.out.println(player);	
	}
}