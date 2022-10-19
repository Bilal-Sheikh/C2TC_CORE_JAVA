/*
    This program show the working of If-Else, Else-If and Switch Case statement with int

    Syntax: switch(expression) {
                case value1:
                    //code
                    break;
                case value2:
                    //code
                    break;
                .
                .
                .
                default: //this executes if no above condition is met
                    //code
                    break;
            }

    NOTE: It executes all statements after the first condition is met if a break statement is not present.
*/
public class SwitchCaseInt {
    public static void main(String[] args) {
		
        int x = 10;
        
        //IF-ELSE

        if (x == 1) { 
            System.out.println("The value of x is 1"); 
        } 
        else if (x == 2) {
            System.out.println("The value of x is 2"); 
        } 
        else if (x == 3) { 
            System.out.println("The value of x is 3"); 
        } 
        else {
		    System.out.println("The value of x is other than 1,2,3"); 
		}
	
        //SWITCH CASE
    
		switch (x) {
            case 1: 
                System.out.println("The value of x is 1");
                break;
            case 2:
                System.out.println("The value of x is 2");
                break;
            case 3:
                System.out.println("The value of x is 3");
                break;
            default:
                System.out.println("The value of x is other than 1,2,3");
                break;
		}
	}
}
