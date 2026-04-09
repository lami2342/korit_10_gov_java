package study.ch23;

import java.util.stream.Stream;

public class Streams02 {
    static void main(String[] args) {
        //스트림은 1회용임
        Stream<Integer> numStream = Stream.of (10, 20, 30, 40);
        Stream<Integer> numStream2 = numStream.map(num -> num * 10);
        Stream<Integer> numStream3 = numStream2.filter(num -> num % 3 != 0);
        System.out.println(numStream3.toList());
    }
}
