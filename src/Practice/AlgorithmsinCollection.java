package Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AlgorithmsinCollection {
    public static void main(String [] args){
        List <Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(2);
        System.out.println("Unsorted - > " + list);
        //sorting
        Collections.sort(list);
        System.out.println("Sorted - > " + list);

        //search
        System.out.println("Binary Search result - > " + Collections.binarySearch(list, 4));
        System.out.println("Binary Search result - > " + Collections.binarySearch(list, 7));

        //number of times we have an element in the list
        System.out.println("Frequency of 3 - > "+ Collections.frequency(list, 3));

        //Min/max to get the corresponding element of the list
        System.out.println("Max element in the list: "+ Collections.max(list));
        System.out.println("Max element in the list: "+ Collections.min(list));

        //shuffled the element order in a list
        Collections.shuffle(list);
        System.out.println("Shuffled list: " + list);

        //swap to enter change the two elements to their position
        Collections.swap(list, 0, 1);
        System.out.println("First 2 elements swapped: " + list);

        //to replace all element with the same value
        Collections.fill(list, 3);
        System.out.println("List filled with 3: "+ list);
    }
}
