package OldestPersonQ17;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person(28, "Singh", "Ram"),
                new Person(46, "Singh", "Sham"),
                new Person(29, "Singh", "Lal"),
                new Person(78, "Singh", "Joginder")
        );

        Optional<Person> OldestPerson = personList.stream().max((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));

        String firstNameOfOldest = OldestPerson.map(Person::getFirstName).orElse("Not found");
        System.out.println("FirstOldest: "+firstNameOfOldest);


    }
}
