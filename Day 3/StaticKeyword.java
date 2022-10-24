// Static keyword can be used in 4 different types
        
   // 1. Static Variable

public class StaticKeyword {
    
    int side;
    static int objectCount = 0;

    StaticKeyword() {
        objectCount++;
    }

    StaticKeyword(int x) {
        side = x;
        objectCount++;
    }

    public static void main(String[] args) {

        StaticKeyword c1 = new StaticKeyword();
        StaticKeyword c2 = new StaticKeyword(5);
        StaticKeyword c3 = new StaticKeyword(8);
        StaticKeyword c4 = new StaticKeyword(10);
        StaticKeyword c5 = new StaticKeyword(11);

        System.out.println("Number of Cube Objects: " + objectCount); //prints the number of created objeccts
    }
}

  // 2. Static Method

public class StaticKeyword {
    
    static int calculateCube(int side) {
        return (side*side*side);
    }
    public static void main(String[] args) {

        //System.out.println("Cube value of 5 is: " + calculateCube(5));
        System.out.println("Cube value is: " + StaticKeyword.calculateCube(2));
    }
}

    // 3. Static Blocks in Java
    // It	is	executed	before	main	method	at	the	time	of	classloading.

public class StaticKeyword {
    
    static {
        System.out.println("Static block is invoked first");
    }

    static int calculateCube(int side) {
        return (side*side*side);
    }
    public static void main(String[] args) {

        // System.out.println("Cube value of 5 is: " + calculateCube(5));
        System.out.println("Cube value is: " + StaticKeyword.calculateCube(5));
    }
}

4. Static class
A class can be made static only if it is a nested class.

class StaticKeyword {
    
    private static String str = "TNS Java Sessions";
    
    static class MyNestedClass {
        
        public void disp() {
            System.out.println(str);
        }
    }
    public static void main(String args[]) {
        StaticKeyword.MyNestedClass obj = new StaticKeyword.MyNestedClass();
        obj.disp();
    }
}