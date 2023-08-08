package Practice;

import java.util.Iterator;
import java.util.Vector;

public class VectorC {
        public static void main(String args[]) {
            Vector<String> v = new Vector<String>();
            v.add("Robert0");
            v.add("Robert1");
            v.add("Robert2");
            v.add("Robert3");
            Iterator<String> itr = v.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
}
