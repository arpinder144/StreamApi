package NumberOfMaleFemale;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(new Employee(1,"John","Male",4200),
                new Employee(2,"Rock","Male",6000),
                new Employee(3,"Jane","Female",8000),
                new Employee(4,"Emily","Female",6500));


        Map<String, Long> filterByGender = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(filterByGender);

        Map<String, Double> averageSalary = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Salary: "+averageSalary);
    }
}
