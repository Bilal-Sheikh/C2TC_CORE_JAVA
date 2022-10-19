/*
    This program show the working of "break" and "continue" keywords

    break: It will simply break the loop

    continue: The continue statement breaks one iteration of the loop 
              if a specified condition occurs, and continues with the next iteration in the loop.
*/
public class BreakContinue {
    public static void main(String[] args) {	
        
        for(int i = 1; i <= 10; i++) {
            if(i == 1) { // This will skip 1 and print all values other than 1
                continue;   // break;
            }
            System.out.println(i);
        }
	} 
}
