import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
 
		LinkedList<String> player=new LinkedList<String>();
		
		player.add("India");
		player.add("Japan");
		player.add("USA");
		player.add("Russia");
		player.add("China");
		
		System.out.println(player);
		
//		System.out.println(player.remove());
//		System.out.println(player.remove());
		
		System.out.println(player);

		player.add("Africa");
		System.out.println(player);
		
		player.addFirst("Mexico");
		player.addLast("Brazil");

		System.out.println(player);
		
		player.add(2, "Indiaaaaaaaa");
		System.out.println(player);
		
		//modify
		player.set(2, "India");
		System.out.println(player);
		
		System.out.println(player.indexOf("China"));
		
		System.out.println(player.get(2));
	}
}