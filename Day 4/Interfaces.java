/*
    Interfaces in Java are a sub-feature of abstraction. 
    It is used to achieve abstraction and multiple inheritance in Java.

    Note: Relation between Class and Interface

           1. Class >> extends >> Class

           2. Class >> implements >> Interface
           
           3. Interface >> implements >> Interface

    Syntax:
            interface <interface_name>
            {		
                // declare constant fields		
                // declare methods that abstract		
                // by default.		
            }
*/

interface Bank { // Compiler automatically converts interface into a abstract class
    float rateOfInterest();
}

class SBI implements Bank {
    @Override
    public float rateOfInterest() {
        return 9.15f;
    }
}

class ICICI implements Bank {
    @Override
    public float rateOfInterest() {
        return 9.7f;
    }
}

public class Interfaces {
    public static void main(String[] args) {
        
        Bank b1 = new SBI();
        Bank b2 = new ICICI();
        
        System.out.println("ROI in SBI: " + b1.rateOfInterest());
        System.out.println("ROI in ICICI: " + b2.rateOfInterest());
    }
}