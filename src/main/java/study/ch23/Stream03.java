package study.ch23;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Data
@AllArgsConstructor
class Student {
    private int studentCode;
    private String name;
    private int score;

    public int getStudentCode() {
        return studentCode;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

public class Stream03 {
    static void main(String[] args) {
        Map<String, Object> studentMap = Map.of(
                "studentCode", 20260001,
                "name", "김준일",
                "score", 80
        );
        Map<String, Object> studentMap2 = Map.of(
                "studentCode", 20260002,
                "name", "김준이",
                "score", 90
        );
        Map<String, Object> studentMap3 = Map.of(
                "studentCode", 20260003,
                "name", "김준삼",
                "score", 70
        );
        List<Map<String, Object>> studentMapList = List.of(studentMap,studentMap2, studentMap3);
        List<Student> studentList = studentMapList.stream()
                .map(sm -> new Student(
                        (Integer) sm.get("studentCode"),
                        (String) sm.get("name"),
                        (Integer) sm.get("score")
                ))
                .toList();

        System.out.println(studentList);


    }
}
