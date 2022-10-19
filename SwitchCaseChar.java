//This shows the working of Switch Case statement with char
public class SwitchCaseChar {
    public static void main(String[] args) {
		
        char letter = 'F';
		
        switch (letter) {
            case 'a': 
            case 'A': 
                System.out.println("The value is a");
                break;

            case 'b':
            case 'B':
                System.out.println("The value is b");
                break;

            case 'c':
            case 'C':	
                System.out.println("The value is c");
                break;

            default:
                System.out.println("The value is other than a,b,c");
                break;
		}
	}
}
