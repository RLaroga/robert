package Collection.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHash {
    public static void main(String[] args) {
        Map<String, Double> raceRunner = new LinkedHashMap<>();
        raceRunner.put("Robert", 10.5);
        raceRunner.put("Franz", 10.6);
        raceRunner.put("Daniel", 11.2);
        raceRunner.put("King", 12.1);

        for(Map.Entry<String, Double> entry : raceRunner.entrySet()) {
            String name = entry.getKey();
            Double score = entry.getValue();
            System.out.println(name+" time is : "+score);
        }

        //This collection is displaying the elements based on insertion order
    }
}
