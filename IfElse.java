/*
    Shows the working of If-Else statement 
    Whichever condition is TRUE that code will execute
    
    Syntax: if (condition){
        //code
    }
    else if (condition){
        //code
    }
    else {
        //code
    }

    NOTE: Even if all the conditions are only the first TRUE condition's statement 
          will execute NOT all the statements
*/
public class IfElse {
    public static void main(String[] args) {
		
        int x = 5;
		
        if (x == 5) { 
            if (x >= 5) {
                System.out.println("X is greater than 5"); 
            }
            else {
                System.out.println("X is smaller than 5"); 
            } 
        }
    
		if(x == 5) {
			System.out.println("X equals to 5");
		}
		else if(x > 5) {
			System.out.println("X is greater to 5");		
		}
		else {
			System.out.println("X is smaller than 5");
		}	
	}
}
