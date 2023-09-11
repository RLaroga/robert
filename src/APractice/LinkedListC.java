package APractice;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListC {
    public static void main (String [] args){
        /*LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(0);
        list.remove(Integer.valueOf(3));
        list.clear();

        list.offer(1);
        list.offer(2);
        list.offer(3);

        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());

        list.push(1);
        list.push(2);
        list.push(3);

        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        */
        //Example 2 of LinkedList
        LinkedList<String> al=new LinkedList<String>();
        al.add("Robert0");
        al.add("Robert1");
        al.add("Robert2");
        al.add("Robert3");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
