package APractice;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueC {
    public static void main(String [] args){
        /*PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(4);
        queue.offer(5);
        queue.offer(1);

        System.out.println(queue.poll());
        System.out.println(queue.poll());

        PriorityQueue<UserProfile> usersQueue = new PriorityQueue<>(
                Comparator.comparing((UserProfile u ) -> u.age)
        );

        usersQueue.offer(new UserProfile(30));
        usersQueue.offer(new UserProfile(20));
        usersQueue.offer(new UserProfile(40));

        System.out.println(usersQueue.poll().age);*/

        //Example 2
        PriorityQueue<String> queue1 =new PriorityQueue<String>();
        queue1.add("Junior Java0");
        queue1.add("Junior Java1");
        queue1.add("Junior Java2");
        queue1.add("Junior Java3");
        System.out.println("head:"+queue1.element());
        System.out.println("head:"+queue1.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr=queue1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue1.remove(); //removing value from iterator
        queue1.poll(); // removing value from iterator
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue1.iterator(); //saving value of old iterator to new iterator
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }

    static class UserProfile{
        private final Integer age;

        public UserProfile(Integer age) {
            this.age = age;
        }
        public Integer getAge(){
            return age;
        }
    }
}
