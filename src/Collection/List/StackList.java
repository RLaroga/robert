package Collection.List;

import java.util.List;
import java.util.Stack;

public class StackList {
    public static void main(String [] args) {
        List<String> stack = new Stack<>();
        stack.add("Robert");
        stack.add("Franz");
        stack.add("Daniel");
        stack.add("King");
        stack.add("Robert");

        System.out.println("Size of the Stack : " + stack.size());
        System.out.println("Contains Robert? :" +stack.contains("Robert"));
        System.out.println("Get first element :" +stack.get(0));
        System.out.println("Check if empty :" + stack.isEmpty());
        System.out.println(stack.remove(3));
    }
}
