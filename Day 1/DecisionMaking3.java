/*
    This program shows the use of OR (||) operator and AND(&&) operator
    For OR atleast one condition need to be TRUE
    For AND all the conditions need to be TRUE
*/
public class DecisionMaking3 {
    public static void main(String[] args) {
		
        int firstNum = 10; 
        int secondNum = 11;
        
    //This will not execute as both the conditions are FALSE. In OR atleast one condition needs to be TRUE
        if(!(firstNum < secondNum) || (firstNum == secondNum)) { 
            System.out.println("Condition is TRUE");
        }
        else { // This will execute
            System.out.println("Condition is FALSE"); 
        }
        
        int ageOfBoy = 36;
        int ageOfGirl = 25;

    //This will execute as both the conditions are TRUE. In AND all conditions has to be TRUE
        if ((ageOfBoy >= 21) && (ageOfGirl >= 18)) {
            System.out.println("Ready to get married!");
        } 
        else {
            System.out.println("Wait for it kiddo!");
        }
   }   
}
