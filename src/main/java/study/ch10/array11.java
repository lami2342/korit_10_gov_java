package study.ch10;

import study.ch10.entity.Student;

public class array11 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("신동수", 80);
        students[1] = new Student("신정수", 30);
        students[2] = new Student("헌정수", 70);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());

        }

        for (int i = 0; i < students.length; i++) {
            students[i].setScore(students[i].getScore()-5);
        }
        for (Student student : students) {
            student.setScore(student.getScore() - 5);
            System.out.println(student.toString());


        }

        String searchName = "신정수";
        Student foundStudent = null;
//        객체 주소값이 없음이 null로 표현됨
        for (int i = 0; i < students.length; i++) {
            if (searchName.equals(students[i].getName())){
                foundStudent = (students[i]);
                break;
            }
        }
        if (foundStudent.equals(null)) {
            System.out.println("해당 이름의 학생이 존재하지 않습니다");
            return;
        }
        System.out.println("[ 찾은 학생 정보 ]");
        System.out.println("이름: " + foundStudent.getName());
        System.out.println("이름: " + foundStudent.getScore());

    }
}
