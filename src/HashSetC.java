import java.util.HashSet;
import java.util.Iterator;

public class HashSetC {
    public static void main(String args[]){
    //Creating HashSet and adding elements
        HashSet<String> set=new HashSet<String>();
        set.add("Jr Java0");
        set.add("Jr Java1");
        set.add("Jr Java2");
        set.add("Jr Java3");
    //Traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
