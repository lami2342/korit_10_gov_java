package study.ch19;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<String>strSet = new HashSet<>();

//      값 추가(중복X)
        strSet.add("A");
        strSet.add("A");
        strSet.add("A");
        strSet.add("A");

        Set<User> userSet = new HashSet<>(Set.of(
                new User(1,"aaa"),
                new User(4,"bbb"),
                new User(2,"vvv"),
                new User(3,"sss")
        ));
        System.out.println(userSet);
        int id = 3;
        for (User user : userSet) {
            if (user.getId() == id) {
                System.out.println("3번 아이디 찾음");
                System.out.println(user);
            }
        }


    }

}
