// This program shows the working of constructors in Java
// Constructors have the same name as the class

class Car {
    private String doors;
    private int speed;
    
    public Car() { // Default Constructor
        doors = "opened";
        speed = 0;
    }

    public Car(String doors, int speed) { // Parameterized Constructor
    this.doors = doors;
    this.speed = speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String getDoors() { 
        return doors; 
    } 
    
    public void setDoors(String doors) {
        this.doors = doors;
    }
     
    public String run(){
        if(doors.equals("closed") && speed > 0 ){
            return "running";
        }
        else{
            return "not running";
        } 
    }
}
public class Constructors {
    public static void main(String[] args) {

        Car obj = new Car("closed",10);  // passsing value in pararmeterized constructor
        
        System.out.println(obj.run()); 
    }
}   