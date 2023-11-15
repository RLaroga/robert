package Collection.Set;

import java.util.HashSet;

public class Hash {
    public static void main(String [] args) {

        //This Set is in a Random Order
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Robert");
        hashSet.add("Franz");
        hashSet.add("Daniel");
        hashSet.add("King");

        System.out.println("HashSet : " + hashSet);
        System.out.println("HashSet Remove: " + hashSet.remove("King"));
        System.out.println("HashSet : " + hashSet);
    }
}
