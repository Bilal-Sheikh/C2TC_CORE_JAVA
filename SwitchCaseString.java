//This shows the working of Switch Case statement with Strings
public class SwitchCaseString {
    public static void main(String[] args) {
		
        String name = "team";

		switch (name.toLowerCase()) { //"toLowerCase()" converts the name to lowercase
            case "author":
                System.out.println("Vikas");
                break;

            case "team":
                System.out.println("Team Java Full Stack");
                break;

            case "editor":
                System.out.println("Vishnu & Krishna");
                break;

            default:
                System.out.println("Invalid entry");
                break;
	    }
    }
}
