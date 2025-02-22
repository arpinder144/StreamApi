package CountNoOfOccurrence;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String str="HelloWorld";
        Map<Character, Long> result = str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("result: "+result);
    }
}
