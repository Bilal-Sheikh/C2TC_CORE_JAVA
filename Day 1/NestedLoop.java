//This program demonstrates the working of nested for loops
public class NestedLoop {
    public static void main(String[] args) {
		
        for(int i = 1; i <= 10; i++) { // Outer for loop
			for(int j = 1; j <= 10; j++) { // Inner for loop

	            System.out.println("Value of i: " + i + " and value of j: " + j); // Runs jth times
			}

			System.out.println("****** NOW i WILL INCREMENT BY 1 ******"); // Runs ith times
		}
	}
}
