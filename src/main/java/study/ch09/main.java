package study.ch09;

import study.ch09.entity.Teacher;
import study.ch09.entity.User;

public class main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "김준일";
        s1.age = 33;
        s1.printInfo();

        System.out.println("----------------------");

        Teacher t1 = new Teacher("김준이", 43); {

//            t1.월급계산(200000);

            User user = new User("korit001");
            user.setPassword("1111");
            user.setName("신동수");
            System.out.println(user.getUsername());

        }
    }


}


