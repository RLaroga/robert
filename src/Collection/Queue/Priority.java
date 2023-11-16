package Collection.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(2);
        priorityQueue.add(9);

        int minElement = priorityQueue.poll();
        System.out.println(minElement);

        //Display the minimum element of the Queue
        //is an implementation of a priority queue based on a priority heap.
        //Elements are ordered based on their natural order or by a specified comparator.
    }
}
