package ListOfStringToMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "kiwi", "mango", "date");
        Map<String, Integer> result = fruits.stream().collect(Collectors.toMap(str->str,String::length));
        System.out.println("result: "+result);


    }
}
