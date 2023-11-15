package Collection.Set;

import java.util.TreeSet;

public class Tree {
    public static void main(String [] args) {
        //This Set is displayed in a Sorted order
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Robert");
        treeSet.add("Franz");
        treeSet.add("Daniel");
        treeSet.add("King");

        System.out.println("TreeSet : "+ treeSet);
        System.out.println("TreeSet remove King: "+ treeSet.remove("King"));
        System.out.println("TreeSet : "+ treeSet);
    }
}
