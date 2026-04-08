//package study.ex05;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//
//interface Students {
//    void addStudent(int id, Student s);
//    Student findById(String id);
//    List<Student> findByMinScore(int min);
//    void printAll();
//
//}
//
//
//class Student {
//    private String name;
//    int id, score;
//    private Map<Integer, Student> studentMap = new HashMap<>();
//
//    Student(String name, int id, int score) {
//    }
//
//    void addStudent(int id, Student s) {
//        studentMap.put(id, s);
//    }
//
//    Student findById(int id) {
//        return studentMap.get(id);
//    }
//
//    List<Student> findByMinScore(int min) {
//        List<Student> result = new ArrayList<>();
//        for (Student s : studentMap.values()) {
//            if (s.score >= min) result.add(s);
//        }
//        return result;
//    }
//
//    double getAverage() {
//        double sum = 0;
//        for (Student s : studentMap.values()) sum += s.score;
//        return sum / studentMap.size();
//    }
//    @Override
//    public List<Student> findByMinScore(int min) {
//        return studentMap.values().stream().filter(student -> student.getScore() >= min);
//    }
//}
//
//
//
//
//
//
//
//
//
//public class Ex17 {
//    public static void main(String[] args) {
//
//    }
//}
