/*
    This program shows how to use 1D arrays. Arrays can be of any datatype.
    
    int intArray[];
    or int[] intArray;
    
    byte byteArray[];
    boolean booleanArray[];
    long longArray[];
    float floatArray[];
    double doubleArray[];
    char charArray[];

    Syntax: 
            type[] var-name = new type [size];
*/ 

public class OneDimensionalArray
{
    public static void main(String args[]){

        int a[] = new int[5]; //declaration and instantiation
        
        a[0] = 10; //initialization
        a[1] = 20;
        a[2] = 70;
        a[3] = 40;
        a[4] = 50;

        for (int i = 0; i < a.length; i++){ //length is the property of array
            System.out.println(a[i]);
        }
    }
}

// Array of Object

class Student1 {
    
    public int roll_no;
    public String name;
    
    Student1(int roll_no, String name) {
        
        this.roll_no = roll_no;
        this.name = name;
    }
}
public class OneDimensionalArray {
    public static void main (String[] args) {
        
        // declares an Array of integers.
        Student1[] arr;
        
        // allocating memory for 5 objects of type Student.
        arr = new Student1[5];
        
        // initialize the first elements of the array
        arr[0] = new Student1(101,"Aman");
        
        // initialize the second elements of the array
        arr[1] = new Student1(102,"Vaibhav");
        
        // so on...
        arr[2] = new Student1(103,"Shikar");
        arr[3] = new Student1(104,"Dharmesh");
        arr[4] = new Student1(105,"Mohit");
        
        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++) {
            
            System.out.println("Element at " + i + ": " + arr[i].roll_no + ", " + arr[i].name);
        }
    }
}

