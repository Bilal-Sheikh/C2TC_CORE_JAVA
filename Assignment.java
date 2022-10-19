/*
    Print this pattern:
                        @
                        @@
                        @@@
                        @@@@
                        @@@@@

*/
public class Assignment {
    public static void main(String[] args) {

	    for (int i = 1; i <= 5; i++) { // Outer loop
			for (int j = 1; j <= i; j++) { // Inner loop

				System.out.print('@'); // Prints "@" jth times
			}
			System.out.println(); // Prints next line
		}
	}
}
