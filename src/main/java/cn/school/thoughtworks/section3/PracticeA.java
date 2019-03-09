package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {

        Map<String, Integer> updatedCollection = new HashMap<String, Integer>(collectionA);

        List<String> collectionB = object.get("value");
        for (String s: collectionB) {
            if(updatedCollection.containsKey(s)) {
                updatedCollection.put(s, updatedCollection.get(s)-1);
            }
        }
        return updatedCollection;
    }
}

