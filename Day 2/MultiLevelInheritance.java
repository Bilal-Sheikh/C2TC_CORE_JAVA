// This program show the workng of Multi-Level Inheritance
// Each class will inherit its previous class
class One{
    
    void disp1() {
        System.out.println("One");
    }
}
class Two extends One{ 
    
    void disp2() {
        System.out.println("Two");
    }
}
class Three extends Two{
    
    void disp3() {
        System.out.println("Three");
    }
}
class Four extends Three{
    
    void disp4() {
        System.out.println("Four");
    }
}
public class MultiLevelInheritance {

    public static void main(String[] args) {
        
        Four obj = new Four();

        obj.disp1(); // Class four can access all the above classes
        obj.disp2(); 
        obj.disp3();
        obj.disp4(); 
    }
}