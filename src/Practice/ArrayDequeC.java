package Practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeC {
    public static void main(String[] args) {
    //Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Jr Java0");
        deque.add("Jr Java1");
        deque.add("Jr Java2");
    //Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }
    }
}
