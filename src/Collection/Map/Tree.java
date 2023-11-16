package Collection.Map;

import java.util.Map;
import java.util.TreeMap;

public class Tree {
    public static void main(String[] args) {
        Map<String, Integer> scoresTreeMap = new TreeMap<>();
        scoresTreeMap.put("Robert", 90);
        scoresTreeMap.put("Franz", 91);
        scoresTreeMap.put("Daniel", 92);
        scoresTreeMap.put("King", 100);

        for (Map.Entry<String, Integer> entry : scoresTreeMap.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            System.out.println(name + " got score of : " + score);
        }
        //This collections is displaying the elements in a sorted order
    }
}
