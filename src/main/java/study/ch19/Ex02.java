package study.ch19;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Java","Python","Java","C++","Python","Go"));
        ArrayList<String> unique = new ArrayList<>();
        for (String s : list) {
            if (!unique.contains(s)) unique.add(s);
        }
        System.out.println(unique);
    }
}
