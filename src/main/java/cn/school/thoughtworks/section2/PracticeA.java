package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //把1集合中相同的元素统计出数量

        HashMap<String, Integer> stringCountMap = new HashMap<>();
        for (String s: collection1) {
            if(stringCountMap.containsKey(s)) {
                stringCountMap.put(s, stringCountMap.get(s) + 1);
            } else {
                stringCountMap.put(s, 1);
            }
        }
        return stringCountMap;
    }
}
