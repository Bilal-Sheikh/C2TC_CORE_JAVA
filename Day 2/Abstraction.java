/*
    Abstraction has 4 different types of implementations
    
    1. In Java, an instance of an abstract class cannot be created, we can have references of
       abstract class type though.
*/
abstract class Base {
    
    abstract void fun(); // If a method is made abstract a class should also be abstract
}

class Derived extends Base {

    void fun() { // Accessing base class method 
        System.out.println("Derived fun() called");
    } 
}
class Abstraction {
    public static void main(String args[]) {
    
    // Uncommenting the following line will cause compiler error as the
    // line tries to create an instance of abstract class.
    // Base b = new Base();
    
    // We can have references of Base type.
    Base b = new Derived();
    b.fun();
    } 
}
/*
    2. An abstract class can contain constructors in Java. And a constructor 
       of abstract class is called when an instance of a inherited class is created.
*/

abstract class Base {
    
    Base() { // Constructor
        System.out.println("Base Constructor Called");
    }

    abstract void fun();
}
class Derived extends Base {
    
    Derived() {
        System.out.println("Derived Constructor Called");
    }

    void fun() {
        System.out.println("Derived fun() called");
    }
}
class Abstraction {
    public static void main(String args[]) {
    
        Derived d = new Derived(); // Constructors get automatically called
    } 
} 
/*
    3. In Java, we can have an abstract class without any abstract method. This allows us to
       create classes that cannot be instantiated, but can only be inherited. 
*/

abstract class Base { // If a class is made abstract, there is no compulsion to make methods abstract

    void fun() {
        System.out.println("Base fun() called");
    } 
}
class Derived extends Base { }

class Abstraction {
    public static void main(String args[]) {
    
        Derived d = new Derived();
        d.fun();
    }
}

/*
    4. Abstract classes can also have final methods (methods that cannot be overridden). For
       example, the following program compiles and runs fine. 
*/

abstract class Base {
    
    final void fun() {
        System.out.println("Derived fun() called");
    } 
}
class Derived extends Base { }

class Abstraction {
    public static void main(String args[]) {
        
        Base b = new Derived(); // Instantiating base with reference
        b.fun();
    }
} 