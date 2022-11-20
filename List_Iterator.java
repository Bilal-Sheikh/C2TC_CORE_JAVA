import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_Iterator {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<String>();

        list.add("I");
        list.add("am");
        list.add("BILAL");

        ListIterator<String> itr= list.listIterator(list.size());

        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}