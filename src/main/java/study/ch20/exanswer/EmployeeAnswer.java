package study.ch20.exanswer;

import java.util.ArrayList;
import java.util.List;

class Employee {
    String name, dept; int salary;
    Employee(String name, String dept, int salary) {
        this.name = name; this.dept = dept; this.salary = salary;
    }
}

public class EmployeeAnswer {
    public static void main(String[] args) {
        List<Employee> emps = List.of(
                new Employee("김", "개발팀", 4000),
                new Employee("이", "마케팅", 3500),
                new Employee("박", "개발팀", 4500),
                new Employee("최", "인사팀", 3000),
                new Employee("정", "개발팀", 3800)
        );

        emps.add(new Employee("신","개발팀",4000));

        List<Employee> devTeam = new ArrayList<>();
        for (Employee e : emps) {
            if (e.dept.equals("개발팀")) devTeam.add(e);
        }


        int sum = 0;
        for (Employee e : devTeam) sum += e.salary;
        System.out.printf("개발팀 평균 연봉: %d%n", sum / devTeam.size());
    }
}
