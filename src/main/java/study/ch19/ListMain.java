package study.ch19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
//      값 추가
        numList.add(100);

//      해당 인덱스 위치에 값 추가
        numList.add(0, 200);

//      값 조회
        Integer n1 = numList.get(1);
        System.out.println(n1);

//        여려 값 한번에 추가
        ArrayList<Integer> numList2 = new ArrayList<>();
        numList2.add(1000);
        numList2.add(3000);
        numList2.add(5000);

        numList.addAll(numList2);
        System.out.println(numList);
        numList.addAll(1,numList2);
        System.out.println(numList);

        for (int i = 0; i < numList.size(); i++) {
            System.out.println(numList.get(i));


        }
        List<String> imStrList = List.of("a", "b", "v", "E");
        imStrList.add("e");
        System.out.println(imStrList);

        List<String> nonImStrList = new ArrayList<>();
        nonImStrList.addAll(imStrList);
        nonImStrList.add("e");
        System.out.println(nonImStrList);
        List<String> nonImStrList2 = new ArrayList<>(List.of());

    }
}
