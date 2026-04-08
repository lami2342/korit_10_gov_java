package study.ch20.ex03;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Builder
@Data
class Employee{
    private String name;//이름
    private String dept;
    private int salary;

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }
}
//
//public class Ex01 {
//    private static String devTeam;
//    private static String markTeam;
//    private static String persTeam;
//
//    public static void main(String[] args) {
//        //전체 직원 리스트
//        List<study.ch20.exanswer.Employee> employeeList = new ArrayList<>();
//
//
//       List<study.ch20.exanswer.Employee> emps; List.of(
//                study.ch20.exanswer.Employee.builder().name("김").dept(devTeam).salary(5000).build(),
//                study.ch20.exanswer.Employee.builder().name("이").dept(markTeam).salary(3000).build(),
//                study.ch20.exanswer.Employee.builder().name("박").dept(devTeam).salary(2000).build(),
//                study.ch20.exanswer.Employee.builder().name("최").dept(persTeam).salary(6000).build(),
//                study.ch20.exanswer.Employee.builder().name("정").dept(devTeam).salary(3000).build()
//        );
//
//        for (study.ch20.exanswer.Employee employee : employeeList){
//            study.ch20.exanswer.Employee employee1 = employeeList.get(employee.getDept()).add(employee);
//        }
//        Map<String, List<study.ch20.exanswer.Employee>> employeesMap = Map.of(
//                "devTeam", new ArrayList<>(),
//                "markTeam", new ArrayList<>(),
//                "persTeam", new ArrayList<>()
//        );
//
//        //부서별 직원 리스트
//        List<study.ch20.exanswer.Employee> devTeam;
//        List<study.ch20.exanswer.Employee> markTeam;
//        List<study.ch20.exanswer.Employee> persTeam;
//    }
//}
