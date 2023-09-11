package APractice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetC {
    public static void main(String [] args){
        LinkedHashSet<String> set=new LinkedHashSet<String>();
        set.add("Jr Java0");
        set.add("Jr Java1");
        set.add("Jr Java2");
        set.add("Jr Java3");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
