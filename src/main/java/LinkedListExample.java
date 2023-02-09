import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> linkedList=new LinkedList<>();//adding and removing thing faster than ArrayList
        linkedList.add("John");
        linkedList.add("Paul");
        linkedList.add("George");
        linkedList.add("Ringo");
        linkedList.add(2,"Jerry");
        ArrayList<String> arrayList=new ArrayList<>();//getting or retrieving something is faster than LinkedList
        arrayList.add("John");
        arrayList.add("Paul");
        arrayList.add("George");
        arrayList.add("Ringo");
        arrayList.add(2,"Jerry");

        String[] strings=new String[4];

        System.out.println(linkedList.get(2));
        System.out.println(arrayList.get(2));
    }
}
