package Collection.List;

import java.util.List;

public class Array {
    public static void main(String [] args) {
        //ArrayList
        List<String> arrayList = new java.util.ArrayList<>();
        arrayList.add("Robert");
        arrayList.add("Franz");
        arrayList.add("Daniel");
        arrayList.add("King");

        System.out.println("Size of the ArrayList : " + arrayList.size());
        System.out.println("Contains 'Robert' ? : " + arrayList.contains("Robert"));
        System.out.println("Check if empty: " + arrayList.isEmpty());
        System.out.println(arrayList.remove(3));

    }
}
