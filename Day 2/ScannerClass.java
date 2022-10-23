// This programs show the basic working of a Scanner class
import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int x = scr.nextInt();
        // x scr.nextDouble(); 
        
        System.out.println("Enter a String: ");
        String str = scr.nextLine();

        System.out.println("The number that you entered is: " + x);
        System.out.println("the string you entered is: " + str);

        scr.close();
    }
} 