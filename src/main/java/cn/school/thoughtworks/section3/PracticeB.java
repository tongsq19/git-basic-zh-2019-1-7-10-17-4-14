package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> updatedCollection = new HashMap<String, Integer>(collectionA);

        List<String> collectionB = object.get("value");
        for (String s: collectionB) {
            if(updatedCollection.containsKey(s)) {
                int newValue = updatedCollection.get(s) - updatedCollection.get(s)/3;
                updatedCollection.put(s, newValue);
            }
        }
        return updatedCollection;
    }
}
