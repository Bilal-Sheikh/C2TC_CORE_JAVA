/*
    Encapsulation is a OOP feature for storing data members and member methods in a single unit
    called Class. By doing this other classes cant access these data members and member methods.
*/
class Student {
    
    private String name; // Data memebers 
 
    public String getName() { // Data methods
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Encapsulation {
    public static void main(String[] args) {
        
        Student s = new Student();
        s.setName("Bilal"); 
 
        System.out.println(s.getName());
    }
}