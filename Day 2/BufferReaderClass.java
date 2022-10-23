// This programs shows the working of Buffer reader class
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BufferedReaderClass {
    public static void main(String[] args) throws IOException {
        
        // BufferReader class has another class as InputStreamReader
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        
        System. out.println("Enter your name: "); 
        String name = reader.readLine();
        
        System. out.println("The entered name is: " + name); 
    }
}