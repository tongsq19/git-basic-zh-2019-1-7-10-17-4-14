package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {

        Map<String, Integer> collectionC = new HashMap<String, Integer>();
        List<String> collectionB = object.get("value");

        for(String s: collectionA) {
            if(collectionC.containsKey(s)) {
                collectionC.put(s, collectionC.get(s) + 1);
            } else {
                collectionC.put(s, 1);
            }
        }

        for(String s: collectionB) {
            if(collectionC.containsKey(s)) {
                int newValue = collectionC.get(s) - collectionC.get(s)/3;
                collectionC.put(s, newValue);
            }
        }

        return collectionC;
    }
}
