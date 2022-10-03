import java.util.Iterator;
import java.util.Stack;

public class StackC {
    public static void main (String [] args){
        Stack<String> stack = new Stack<String>();
        stack.push("Robert0");
        stack.push("Robert1");
        stack.push("Robert2");
        stack.push("Robert3");
        stack.push("Robert4");
        stack.pop();
        Iterator<String> itr=stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
