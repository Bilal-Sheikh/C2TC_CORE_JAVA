/*
    This program shows the working of While Loop
    Syntax: while(condition){
            //code
            Increment / decrement statement
            }
    
    NOTE: This loop will go into an infinite loop if the exit condition is not met or not given.
*/
public class WhileLoop { 
    public static void main(String[] args) {
		
        int i = 99;
		
        while(i <= 100) {// Checks if the condtion is TRUE or not
			System.out.println(i);
			i++; //exit expression
		}
	}
}
