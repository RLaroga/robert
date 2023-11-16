package Collection.List;

import java.util.List;

public class Linked {
    public static void main(String [] args) {
        List<String> linkedList = new java.util.LinkedList<>();
        linkedList.add("Robert");
        linkedList.add("Franz");
        linkedList.add("Daniel");
        linkedList.add("King");

        System.out.println("Size of the LinkedList : " + linkedList.size());
        System.out.println("Contains Robert? :" +linkedList.contains("Robert"));
        System.out.println("Get first element : " + linkedList.get(0));
        System.out.println("Check if empty : "+linkedList.isEmpty());
        System.out.println(linkedList.remove(3));
    }
}
