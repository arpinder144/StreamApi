package FindNumberGreatThan10AndAvgQ13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,10,25,20,29);
        Double result = list.stream().filter(n -> n > 10)
                .collect(Collectors.averagingDouble(Integer::intValue));
        System.out.println("result: "+result);

    }
}
