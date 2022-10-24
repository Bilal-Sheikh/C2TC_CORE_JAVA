/*
    A Wrapper class is a class whose object wraps or contains a primitive data types.

    Primitive Type              Wrapper	 class
        boolean                      Boolean
        char                         Character
        byte                         Byte
        short                        Short
        int                          Integer
        long                         Long
        float                        Float
        double                       Double

    Autoboxing – Automatic conversion of primitive types to the object of their corresponding 
                 wrapper classes is known as autoboxing.
*/

public class WrapperClass {		
    public static void main(String args[]) {		
        
        int a = 20;

        Integer i = a; // Converting int into Integer
        Integer j = 10;
        
        System.out.println(a + " " +i+ " " + j);
    }
}
/*
    Unboxing – It is just the reverse process of autoboxing. Converting an object of a wrapper class to its
               corresponding primitive type is known as unboxing.
*/

public class WrapperClass {
    public static void main(String[] args) {
                    
        Character ch = 'a'; 
        
        // unboxing - Character object to primitive conversion
        char a = ch;
        
        System.out.println("Character ch: " + ch);
        System.out.println("char a: " + a);
    }
}
