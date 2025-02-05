package SingleStringSepratedByComa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "banana", "orange", "mango");

        String collect = stringList.stream().collect(Collectors.joining(","));
        System.out.println(collect);
    }
}
