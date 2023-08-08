package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListC {

    public static void main(String [] args){

        //Example 1 of Arraylist

        /*ArrayList <String> people = new ArrayList<>();
        people.add("Robert");
        people.add("Raymond");
        people.add("R");
        people.remove(1);
        System.out.println(people);
        if(people.contains("Robert")){
            System.out.println("Robert is in the list!");
        }
        if(people.isEmpty()){
            System.out.println("The list is empty!");
        }*/


        //Example 2 of Arraylist

        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Robert0");//Adding object in arraylist
        list.add("Robert1");
        list.add("Robert2");
        list.add("Robert3");
        //Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
