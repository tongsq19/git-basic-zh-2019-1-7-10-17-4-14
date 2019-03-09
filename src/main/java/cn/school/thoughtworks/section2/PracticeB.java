package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        HashMap<String, Integer> stringCountMap = new HashMap<>();
        for (String s: collection1) {

            int index = s.indexOf('-');
            if (index == -1) {
                addCount(stringCountMap, s, 1);
            } else {
                String key = s.substring(0, index);
                int value = Integer.parseInt(s.substring(index + 1));
                addCount(stringCountMap, key, value);
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
