/*
    "this" keyword has 5 implementations

    1. It can be used to refer current class instance variable
*/
public class ThisKeyword {
    
    int num;
    
    public void setNum(int num) {
        this.num = num;
    }
    public static void main(String[] args) {
     
        ThisKeyword obj = new ThisKeyword();
        obj.setNum(5);
        
        System.out.println("Num value: " + obj.num);
    }
}
/*
    2. "this" can be passed as argument in the constructor call
*/

public class ThisKeyword {
    
    int num;

    ThisKeyword() { }
    
    ThisKeyword(int num) {
        this.num = num;
    }
    public static void main(String[] args) {
    
        ThisKeyword obj = new ThisKeyword(5);
    
        System.out.println("Num value: " + obj.num); 
    }
}
/*
    3. "this" can be passed as argument in the method call
*/

public class ThisKeyword {
    
    void function1(ThisKeyword obj) {
        System.out.println("Function 1 invoked");
    }

    void function2() {
        function1(this);
    }
    public static void main(String[] args) {
    
        ThisKeyword obj = new ThisKeyword();
        obj.function2(); 
    }
}
/*
    4. "this" can be used to return current class instance
*/

class ThisKeyword {
    
    int a;
    int b;

    //Default constructor
    ThisKeyword() {
        a = 10;
        b = 20;
    }

    //Method that returns current class instance
    ThisKeyword get() {
        return this;
    }

    //Displaying value of variables a and b
    void display() {
        System.out.println("a = " + a + " b = " + b);
    }
    public static void main(String[] args) {
        
        ThisKeyword object = new ThisKeyword();
        object.get().display();
    }
}
/*
    5. "this" can be used to invoke current class constructor
*/

class ThisKeyword {
    
    int rollno;
    String name,course;
    float fee;
    
    ThisKeyword(int rollno, String name, String course) {
        
        this.rollno = rollno;
        this.name = name;
        this.course = course; 
    }

    ThisKeyword(int rollno, String name, String course, float fee) {
    
        this(rollno, name, course); // reusing constructor
        this.fee = fee; 
    }

    void display() {
        System.out.println(rollno + " " + name + " " + course + " " + fee); 
    }
    public static void main(String args[]) {

        ThisKeyword s1 = new ThisKeyword(111,"ankit","java");
        ThisKeyword s2 = new ThisKeyword(112,"sumit", "java" ,6000f);

        s1.display();
        s2.display(); 
    }
}