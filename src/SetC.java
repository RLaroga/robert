import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetC {
    public static void main(String [] args){
        Set<Integer> set = new HashSet<>(); // set using hashset
        set.add(3);
        set.add(4);
        set.add(3); // set doesn't allowed duplicate element

        System.out.println(set);

        Set<Integer> linkedHashSet = new LinkedHashSet<>(); //Set using LinkedHashset
        Set<Integer> treeset = new TreeSet<>(); //Set using TreeSet
    }
}
