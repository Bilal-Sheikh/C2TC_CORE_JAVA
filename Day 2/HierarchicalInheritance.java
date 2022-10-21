// This program show the workng of Hierarchical Inheritance
// All other child classes will inherit one parent class
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
class Three extends One{
    
    void disp3() {
        System.out.println("Three");
    }
}
class Four extends One{
    
    void disp4() {
        System.out.println("Four");
    }
}
public class HierarchicalInheritance {

    public static void main(String[] args) {
        
        Four obj1 = new Four();
        obj1.disp1(); // accessing method defined in parent class through child class
        obj1.disp4();

        Three obj2 = new Three();
        obj2.disp1(); 
        obj2.disp3();
        
        Two obj3 = new Two(); 
        obj3.disp1();
        obj3.disp2();;
    }
}