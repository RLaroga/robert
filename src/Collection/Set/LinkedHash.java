package Collection.Set;

import java.util.LinkedHashSet;

public class LinkedHash {
    public static void main(String [] args) {
        //This Set is Displayed based on Inserted order
        LinkedHashSet<String> lInkedHashSet = new LinkedHashSet<>();
        lInkedHashSet.add("Robert");
        lInkedHashSet.add("Franz");
        lInkedHashSet.add("Daniel");
        lInkedHashSet.add("King");

        System.out.println("LinkedHashSet : " + lInkedHashSet);
        System.out.println("LinkedHashSet remove: " + lInkedHashSet.remove("Daniel"));
        System.out.println("LinkedHashSet : " + lInkedHashSet);
    }
}
