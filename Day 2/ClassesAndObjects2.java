class Car {
    
    private String doors; // data member
    private int speed;

    public void setSpeed(int speed) { //member method
        this.speed = speed;
    }
    public int getSpeed(){ //member method
        return speed;
    } 
    public String getDoors() { //member method
        return doors;
    }
    public void setDoors(String doors) { //member method
        this.doors = doors;
    } 

    public String run(){ //member method
        
        if(doors.equals("closed") && speed > 0 ) {
            return "running";
        }
        else{
            return "not running";
        }
    }
}
public class ClassesAndObjects2 {
    public static void main (String[] args) {

        Car obj = new Car();
        
        obj.setDoors("closed"); // passing the value for the class method
        obj.setSpeed (10);

        System.out.println(obj.run());
    }
}