package study.ch19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer, String> userMap = new HashMap<>();
        userMap.put(1,"aAA");
        userMap.put(123,"ddd");
        userMap.put(15455,"fff");
        userMap.put(111231,"sss");
        System.out.println(userMap);
        System.out.println(userMap.get(123));

        List<Map.Entry<Integer,String>> userEntries = new ArrayList<>(userMap.entrySet());
        System.out.println(userEntries.get(0));

        for (Map.Entry<Integer,String> entry : userMap.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
