package Collection.Map;

import java.util.concurrent.ConcurrentHashMap;

public class CuncurrentHash {
    public static void main(String[] args) {
        // Creating a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();

        // Adding elements to the ConcurrentHashMap
        concurrentHashMap.put("One", 1);
        concurrentHashMap.put("Two", 2);
        concurrentHashMap.put("Three", 3);

        System.out.println("ConcurrentHashMap before modification: " + concurrentHashMap);

        // Updating the value for a key
        concurrentHashMap.put("Two", concurrentHashMap.get("Two") + 10);

        System.out.println("ConcurrentHashMap after modification: " + concurrentHashMap);

    }
}
