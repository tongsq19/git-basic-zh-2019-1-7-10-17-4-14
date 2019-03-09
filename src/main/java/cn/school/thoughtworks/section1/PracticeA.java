package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //选出1集合中与2集合中相同的元素
        List<String> unionSet = new ArrayList<String>();
        for (String s : collection1) {
            if (collection2.contains(s)) {
                unionSet.add(s);
            }
        }
        return unionSet;
    }
}

