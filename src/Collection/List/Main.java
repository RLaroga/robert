package Collection.List;
public class Main {
    public static void main (String [] args) {
        /**
         * What is List?
         *      - Represents an ordered collection of elemets, allowing duplication values.
         *      It provides methods to add, remove, access, and manipulate elements based on their index.
         *
         * What are the Implementations of List
         *      - ArrayList : Implements List using a dynamic array. It allows fast random access and is efficient
         *                    when elements are frequently accessed by their index. {@link ArrayList}
         *
         *      - LinkedList : Implements List using a doubly-linked list. It is efficient for frequent insertions
         *                     and deletions at the beginning, end, or middle of the list. {@link LinkedList}
         *
         *      - Vector : Similar to ArrayList, but it is synchronized (thread-safe). It is less commonly used
         *                 nowadays, and ArrayList is generally preferred in most scenarios. {@link VetorList}
         *
         *      - Stack (java.util.Stack) : Implements the stack data structure using a Vector. It is considered
         *                                  a legacy class, and is not typically recommended for use due to its
         *                                  synchronization overhead. Instead, you can use the Deque interface
         *                                  (ArrayDeque or LinkedList) to work as a stack. {@link StackList}
         *
         */

        System.out.println("Now you understand the List and its Implementation");
        System.out.println("CONGRATULATIONS");
    }
}
