import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Array_List {
        public static void main(String[] args) {

        List <String> obj = new LinkedList<>();

        obj.add("Football");
        obj.add("Cricket");
        obj.add("Vollyball");
        obj.add("Kho Kho");
        obj.add("Kabaddi");

        System.out.println(obj);

        List <String> obj1 = (List<String>) new ArrayList();

        obj1.add("Football");
        obj1.add("Cricket");
        obj1.add("Vollyball");
        obj1.add("Kho Kho");
        obj1.add("Kabaddi");

        System.out.println(obj1);

        }
}