package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        HashMap<String, Integer> stringCountMap = new HashMap<>();
        for (String s: collection1) {

            int index1 = s.indexOf('-');
            int index2 = s.indexOf(':');
            int index3 = s.indexOf('[');

            if (index1 != -1) {
                String key = s.substring(0, index1);
                int value = Integer.parseInt(s.substring(index1 + 1));
                addCount(stringCountMap, key, value);
            } else if (index2 != -1) {
                String key = s.substring(0, index2);
                int value = Integer.parseInt(s.substring(index2 + 1));
                addCount(stringCountMap, key, value);
            } else if (index3 != -1) {
                String key = s.substring(0, index3);
                int endIndex = s.indexOf(']');
                int value = Integer.parseInt(s.substring(index3 + 1, endIndex));
                addCount(stringCountMap, key, value);
            } else {
                addCount(stringCountMap, s, 1);
            }
        }
        return stringCountMap;
    }

    private void addCount(HashMap<String, Integer> stringCountMap, String key, int value) {
        if (!stringCountMap.containsKey(key)) {
            stringCountMap.put(key, value);
        } else {
            stringCountMap.put(key, stringCountMap.get(key) + value);
        }
    }
}
