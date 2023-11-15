package Collection;

import java.util.List;
import java.util.Vector;

public class VetorList {
    public static void main(String [] args) {
        List<String> vector = new Vector<>();
        vector.add("Robert");
        vector.add("Franz");
        vector.add("Daniel");
        vector.add("King");

        System.out.println("Size of the Vector : " + vector.size());
        System.out.println("Contain Robert? : "+vector.contains("Robert"));
        System.out.println("First Vector element :" + vector.get(0));
        System.out.println("Is Vector empty? :" + vector.isEmpty());
        System.out.println(vector.remove(3));
    }
}
