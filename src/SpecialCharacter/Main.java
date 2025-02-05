package SpecialCharacter;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String str="Hello, World!123@#";
        String collect = str.chars().filter(c -> !Character.isLetterOrDigit(c))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println("output:"+collect);

        /// ////////////////////////////////////

        String collect1 = str.chars()
                .filter(c -> !Character.isAlphabetic(c))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println("collect1:"+collect1);
    }
}
