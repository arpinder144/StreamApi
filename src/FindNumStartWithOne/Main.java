package FindNumStartWithOne;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11, 18, 20, 24, 85, 66, 13);
        List<Integer> collect = list.stream()
                .filter(n -> String.valueOf(n).startsWith("1"))
                .collect(Collectors.toList());
        System.out.println("output:"+collect);
    }
}
