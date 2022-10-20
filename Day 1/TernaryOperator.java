/*
  This program shows the working of ternary operator "?" ":" 
  This operator acts as an if else statement
  If the condition specified before "?" is TRUE then the code after "?" will execute
  If the condition specified before "?" is FALSE then the code after ":" will execute
*/
public class TernaryOperator {
    public static void main(String[] args) {
        
        int number = 10;
        
        // Here the condition is TRUE so the code after "?" will execute
        number = (number == 10) ? 1 : 0;
        
        System.out.println(number);
	}
}
