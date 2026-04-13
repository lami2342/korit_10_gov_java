package testcc.twst;

import java.util.List;
import java.util.Scanner;

class Main {
    private static Scanner sc = new Scanner(System.in);
    private static StudentManager mgr = new StudentManager();

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = readInt("선택: ");

            switch (choice) {
                case 1 -> registerStudent();
                case 2 -> mgr.printAll();
                case 3 -> searchStudent();
                case 4 -> printHonors();
                case 5 -> printSorted();
                case 6 -> {
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
                }
                default -> System.out.println("1~6 사이의 번호를 입력하세요.");
            }
        }
    }

    // ── 메뉴 출력 ──────────────────────────────────────────
    private static void showMenu() {
        System.out.println("\n╔══════════════════════════╗");
        System.out.println("║    학생 성적 관리 시스템     ║");
        System.out.println("╠══════════════════════════╣");
        System.out.println("║  1. 학생 등록              ║");
        System.out.println("║  2. 전체 목록 출력          ║");
        System.out.println("║  3. 이름으로 검색           ║");
        System.out.println("║  4. 우등생 목록 (평균 80↑)  ║");
        System.out.println("║  5. 평균 기준 정렬 출력     ║");
        System.out.println("║  6. 종료                  ║");
        System.out.println("╚══════════════════════════╝");
    }

    // ── 1. 학생 등록 ───────────────────────────────────────
    private static void registerStudent() {
        System.out.print("이름 입력: ");
        String name = sc.next();
        int kor  = readInt("국어 점수: ");
        int eng  = readInt("영어 점수: ");
        int math = readInt("수학 점수: ");

        mgr.addStudent(new Student(name, kor, eng, math));
        System.out.println("✔ 등록 완료: " + name);
    }

    // ── 3. 검색 ────────────────────────────────────────────
    private static void searchStudent() {
        System.out.print("검색할 이름: ");
        String name = sc.next();
        Student found = mgr.findByName(name);

        if (found == null) {
            System.out.println("'" + name + "' 학생을 찾을 수 없습니다.");
        } else {
            mgr.printStudent(found);
        }
    }

    // ── 4. 우등생 목록 ─────────────────────────────────────
    private static void printHonors() {
        List<Student> honors = mgr.getHonorStudents();
        if (honors.isEmpty()) {
            System.out.println("평균 80점 이상 학생이 없습니다.");
            return;
        }
        System.out.println("▶ 우등생 목록 (평균 80점 이상)");
        System.out.println("-".repeat(70));
        for (Student s : honors) {
            System.out.println(s);
        }
        System.out.println("-".repeat(70));
    }

    // ── 5. 정렬 출력 ───────────────────────────────────────
    private static void printSorted() {
        List<Student> sorted = mgr.getSortedByAverage();
        if (sorted.isEmpty()) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }
        System.out.println("▶ 평균 내림차순 정렬");
        System.out.println("-".repeat(70));
        int rank = 1;
        for (Student s : sorted) {
            System.out.printf("%2d위  %s%n", rank++, s);
        }
        System.out.println("-".repeat(70));
    }

    // ── 숫자 입력 헬퍼 (예외 처리) ──────────────────────────
    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int v = Integer.parseInt(sc.next().trim());
                if (v >= 0 && v <= 100) return v;
                System.out.println("0~100 사이의 값을 입력하세요.");
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력하세요.");
            }
        }
    }
}
public class wetw {
}
