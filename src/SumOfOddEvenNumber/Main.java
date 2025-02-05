package SumOfOddEvenNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> input= Arrays.asList(1,2,3,4,5,6,7,8,9);
        Map<Boolean, Integer> sum = input.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0, Collectors.summingInt(Integer::intValue)));
        System.out.println("sum of even:"+sum.get(true));
        System.out.println("sum of Odd: "+sum.get(false));


    }
}
