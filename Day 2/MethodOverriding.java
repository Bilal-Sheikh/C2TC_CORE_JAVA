/*
    This program show the workng of Method Overriding. Also known as Run Time polymorphism
*/ 
class Super {

    void disp() {
        System.out.println("Super Class");
    }
}
class SubClass extends Super {
    
    @Override // By convention we have to write @Override before a overridden method
    void disp() { 
        super.disp(); 
        // System.out.println("Only Sub Class");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.disp();
    } 
}