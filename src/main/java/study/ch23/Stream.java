package study.ch23;

import lombok.AllArgsConstructor;

import javax.imageio.stream.IIOByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@AllArgsConstructor
class CustomStream<T,R> {
    private List<T> list;

    public List<R> map(Function<T,R> function) {
        List<R> newList = new ArrayList<>();
        for (T data : list) {
            newList.add(function.apply(data));
        }
    return newList;
    }
}

public class Stream {
    static void main(String[] args) {
        // map 반복(치환)패턴
        List<String> strNums= List.of("10","23","30");
        List<Integer> nums = new ArrayList<>();
        for (String s : strNums){
            nums.add(Integer.parseInt(s));
        }
        System.out.println(nums);

        System.out.println(new CustomStream<>(strNums).map(str -> Integer.parseInt(str)*10));

        CustomStream<String, Integer> customStream = new CustomStream<>(strNums);
        Function<String, Integer> f = str -> Integer.parseInt(str) *10;
        List<Integer> nums2 = customStream.map(str -> Integer.parseInt(str));

        CustomStream<String, String> customStream2 = new CustomStream<>(List.of("준일","준이","준삼"));
        System.out.println(customStream2.map(name -> "김" + name));
    }
}
