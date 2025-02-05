package ListOfStringByLength;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "kiwi", "date", "mango");
        Map<Integer, List<String>> result = fruits.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("result:"+result);
    }
}
