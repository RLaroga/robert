package Collection.Set;

public class Main {
    public static void main(String [] args) {
        /**
         *  What is Set?
         *     - A Set cannot contain duplicate elements. Unordered collection of unique elements.
         *
         *  What its Implementation?
         *     - LinkedHashSet :
         *          It uses hash table and doubly-linked list to store elements.
         *          It does maintain insertion order due to doubly-link storing of elements.
         *          {@link LinkedHash}
         *     - HashSet :
         *          It uses a hash table data structure to store elements.
         *          It is based on the concept of hashing, which provides fast access and retrieval of elements.
         *              Important points:
         *                  1. Uniqueness of Elements:
         *                      - If you need to ensure that your Set contains only unique elements,
         *                      and the order of elements doesn't matter, then HashSet is a suitable choice.
         *                  2. Fast Lookup:
         *                      - HashSet is optimized for fast lookup operations due to its hash table data structure.
         *                      If your application requires frequent lookups to check if an element exists in the set, HashSet is a good option.
         *                  3. Unordered Elements:
         *                      - If you don't need the elements to be in any specific order,
         *                      HashSet is preferred over implementations like TreeSet, which maintain a sorted order of elements.
         *                  4. Thread-safety:
         *                      - HashSet is not threadsafe.
         *                  5. Null Elements:
         *                      - HashSet allows one null element, while TreeSet does not allow any null elements.
         *                      If you need to handle null values in your set, HashSet is the appropriate choice.
         *           {@link Hash}
         *     - TreeSet :
         *          Implemented as a Red-Black tree, which ensures that elements are stored in sorted(ascending) order.
         *              Important points:
         *                  1. Suitable when you need elements to be stored in a sorted order.
         *                  2. When you want to perform range queries (e.g., finding elements within a specific range).
         *          {@link Tree}
         *
         */

        System.out.println("Now you understand the List and its Implementation");
        System.out.println("CONGRATULATIONS");
    }
}
