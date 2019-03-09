package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //选出1集合中与2集合中子数组的元素相同的元素
        List<String> unionSet = new ArrayList<String>();

        for (String s : collection1) {
            for (List<String> strings : collection2) {
                if (strings.contains(s)) {
                    unionSet.add(s);
                    break;
                }
            }
        }
        return unionSet;
    }
}
