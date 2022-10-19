/*
    This program show the working of Do While Loop
    Syntax: do {
                //code
               } while(condition);

    NOTE: This loop always executes atleast ONCE no matter the condition, as the condition is checked
          after the closing "}"
 */
public class DoWhile {
    public static void main(String[] args) {
		
        int i = 11;
		
        do {
			System.out.println(i);
			i++;
		}   while(i <= 1); //condition for the do-while loop
	}
}
