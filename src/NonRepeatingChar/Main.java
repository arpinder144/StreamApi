package NonRepeatingChar;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        String input = "iindiia";

        findFirstNonRepeatingCharacter(input).ifPresentOrElse(c-> System.out.println("First Non Repeating character:  "+c),()-> System.out.println("No NON-reateating character"));



    }
    public static Optional<Character> findFirstNonRepeatingCharacter(String s) {

        // Create a LinkedHashMap to store character frequencies

        // and maintain insertion order



        // Count the frequency of each character
        LinkedHashMap<Character, Long> charCountMap = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));


        // Find the first character with a frequency of 1

        return charCountMap.entrySet().stream()

                .filter(entry -> entry.getValue() == 1)

                .map(Map.Entry::getKey)

                .findFirst();

    }
}
