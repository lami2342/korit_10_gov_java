package study.ch19;

import lombok.Builder;
import lombok.Data;

import java.util.*;
@Data
@Builder
class Student{

    private String name;
    private int studentYear;
    private int korScore;
    private int engScore;
    private int mathScore;

}




public class Ex06 {
    public static void main(String[] args) {
        int currentStudentCode = 20260000;
        List<Student> studentList = List.of(
                Student.builder().name("김준일").studentYear(1).korScore(44).engScore(24).mathScore(66).build(),
                Student.builder().name("김준이").studentYear(2).korScore(44).engScore(24).mathScore(66).build(),
                Student.builder().name("김준삼").studentYear(1).korScore(44).engScore(24).mathScore(66).build(),
                Student.builder().name("김준사").studentYear(2).korScore(44).engScore(24).mathScore(66).build()
        );
        Map<Integer, List<Student>> studentMap = Map.of(
                1, new ArrayList<>(),
                2, new ArrayList<>()
        );
        for (Student student : studentList){
            studentMap.get(student.getStudentYear()).add(student);
        }
        Map<String, Double> scoreMap = new HashMap<>(Map.of(
                "korScore", 0.0,
                "engScore", 0.0,
                "mathScore", 0.0
        ));
       for (Student student : studentList) {
           scoreMap.replace("korScore",scoreMap.get("korScore") + student.getKorScore());
           scoreMap.replace("engScore",scoreMap.get("engScore") + student.getEngScore());
           scoreMap.replace("mathScore",scoreMap.get("mathScore") + student.getMathScore());
       }
       for (String key : scoreMap.keySet()) {
           scoreMap.replace(key, scoreMap.get(key)/studentList.size());
       }
        System.out.println(scoreMap);

       Map<String, Integer> totalScoreMap = new HashMap<>(Map.of(
               "김준일", 0,
               "김준이", 0,
               "김준삼", 0,
               "김준사", 0
       ));
       for (Student student : studentList) {
           totalScoreMap.put(student.getName(),student.getKorScore() + student.getEngScore() + student.getMathScore());

       }
        System.out.println(totalScoreMap);
    }
}