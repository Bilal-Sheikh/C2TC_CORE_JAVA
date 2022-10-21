/*
    This program show the workng of Method Overloading. Also known as Compile Time polymorphism
    A class can have multiple methods with same name but they all should have different number of parameters
*/ 
public class MethodOverloading  {
    
    void add(int x, int y) { // original method
        System.out.println("Addition is: " + (x + y));
    }
    void add(int x, int y, int z) { // overloaded method with one extra parameter
        System.out.println("Addition is: " + (x + y + z));
    }
    public static void main(String[] args) {

        MethodOverloading  obj = new MethodOverloading();
        obj.add(5, 4); // calling original method
        obj.add(5, 5, 4); // calling overloaded method
    }
}