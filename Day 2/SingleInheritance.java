// This program show the workng of Single Inheritance
class One { 
    void disp1() {
        System.out.println("One");
    }
}

class Two extends One { //Class Two inherits class One
    void disp2() { 
        System. out.println("Two");
    } 
}
public class SingleInheritance {
    public static void main(String[] args) {
        Two obj = new Two(); // object of class Two
        obj.disp1(); // method of class One 
        obj.disp2(); // method of class Two
    }
}