package FlatternListOfLists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> listList = Arrays.asList(Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6, 7),
                Arrays.asList(8, 9, 10));

        List<Integer> result = listList.stream().flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("result: "+result);
    }
}
