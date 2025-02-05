package ListOfTransaction;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Transaction> transactions = List.of(
                new Transaction("deposit", 100),
                new Transaction("withdrawal", 50),
                new Transaction("deposit", 200),
                new Transaction("transfer", 150)
        );

        String targetType= "deposit";

        Set<Transaction> transactionSet = transactions.stream().filter(s -> targetType.equals(s.getType()))
                .collect(Collectors.toSet());
        System.out.println("result:  "+transactionSet);
    }
}
