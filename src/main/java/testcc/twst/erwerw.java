package testcc.twst;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    // 이름으로 검색 (null 반환 시 없음)
    public Student findByName(String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    // 평균 80점 이상 우등생 목록
    public List<Student> getHonorStudents() {
        List<Student> honors = new ArrayList<>();
        for (Student s : students) {
            if (s.getAverage() >= 80.0) {
                honors.add(s);
            }
        }
        return honors;
    }

    // 평균 기준 내림차순 정렬
    public List<Student> getSortedByAverage() {
        List<Student> sorted = new ArrayList<>(students);
        Collections.sort(sorted);          // Comparable 활용
        // 또는: sorted.sort(Comparator.comparingDouble(Student::getAverage).reversed());
        return sorted;
    }

    // 전체 학급 평균
    public double getClassAverage() {
        if (students.isEmpty()) return 0.0;
        double sum = 0;
        for (Student s : students) {
            sum += s.getAverage();
        }
        return sum / students.size();
    }

    // 전체 목록 출력 (총점·평균 포함)
    public void printAll() {
        if (students.isEmpty()) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }
        System.out.println("=".repeat(70));
        System.out.printf("%-10s | %6s | %6s | %6s | %6s | %8s%n",
                "이름", "국어", "영어", "수학", "총점", "평균");
        System.out.println("-".repeat(70));
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("=".repeat(70));
        System.out.printf("학급 전체 평균: %.2f%n", getClassAverage());
    }

    // 단일 학생 출력
    public void printStudent(Student s) {
        System.out.println("-".repeat(70));
        System.out.println(s);
        System.out.println("-".repeat(70));
    }
}
public class erwerw {
}
