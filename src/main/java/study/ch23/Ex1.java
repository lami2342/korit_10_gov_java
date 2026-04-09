package study.ch23;

import java.util.List;
import java.util.stream.Stream;


public class Ex1 {
    static void main(String[] args) {
        Stream<Integer> numStream = Stream.of (5, 12, 3, 8, 20, 1);
        Stream<Integer> numStream2 = numStream.filter(num -> num > 10);
        System.out.print("출력: ");
        System.out.println(numStream2.toList());
    }
}
