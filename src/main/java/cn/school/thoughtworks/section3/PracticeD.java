package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {

        Map<String, Integer> collectionC = new HashMap<String, Integer>();
        List<String> collectionB = object.get("value");

        for(String s: collectionA) {
            int index = s.indexOf('-');

            if(index != -1) {
                String key = s.substring(0, index);
                int value = Integer.valueOf(s.substring(index+1));
                if(collectionC.containsKey(s)) {
                    collectionC.put(key, collectionC.get(s) + value);
                } else {
                    collectionC.put(key, value);
                }
            } else {
                if(collectionC.containsKey(s)) {
                    collectionC.put(s, collectionC.get(s) + 1);
                } else {
                    collectionC.put(s, 1);
                }
            }
        }

        for(String s: collectionB) {
            if(collectionC.containsKey(s)) {
                collectionC.put(s, collectionC.get(s) - collectionC.get(s)/3);
            }
        }
        return collectionC;
    }
}
