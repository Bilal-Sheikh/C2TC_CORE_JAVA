//This program shows the working of Classes and Objects
class Car { //creating a class
    private String doors; // data members
    private String engine; 
    private String driver;
    private int speed;
    
    public void setSpeed(int speed) { // Class method
        this.speed = speed; 
    } 
    public int getSpeed() {
        return speed;
    }
} 
public class ClassesAndObjects1 { // main class 
    public static void main(String[] args) {
        
        Car obj = new Car(); // Craeting class object
        obj.setSpeed(10); // calling class methods
        System.out.println(obj.getSpeed()); 
    }
}