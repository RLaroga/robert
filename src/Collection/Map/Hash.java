package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class Hash {
    public static void main(String[] args) {
        Map<String, Integer> scoresMap = new HashMap<>();
        scoresMap.put("Robert", 1);
        scoresMap.put("Franz", 2);
        scoresMap.put("Daniel", 3);
        scoresMap.put("King", 4);

        int robertScore = scoresMap.get("Robert");
        boolean isRobertPresent = scoresMap.containsKey("Robert");

        for(String name : scoresMap.keySet()) {
            int score = scoresMap.get(name);
            System.out.println(name + " : " + score);
        }
        // The elements are displayed in a random order
    }
}
