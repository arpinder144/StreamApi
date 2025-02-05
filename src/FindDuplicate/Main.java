package FindDuplicate;

import java.awt.image.SinglePixelPackedSampleModel;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {


        public static void main(String[] args) {
            List<String> strings = Arrays.asList("Hello", "World", "Streams", "API");

            // Counting total characters in all strings
            long totalCharacterCount = strings.stream()
                    .flatMapToInt(String::chars) // Convert each string to an IntStream of characters
                    .count(); // Count the total characters

            System.out.println("Total number of characters: " + totalCharacterCount);
        }


//    public static void main(String[] args) {
//        List<Integer> input= Arrays.asList(1,2,3,4,5,6,2,3,7,8,4);
//        List<Integer> collect = input.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()))
//                .entrySet().stream()
//                .filter(entry -> entry.getValue() > 1)
//                .map(s -> s.getKey())
//                .collect(Collectors.toList());
//        System.out.println("duplicate: "+collect);
//
//    }


}
