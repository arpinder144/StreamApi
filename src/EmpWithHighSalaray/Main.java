package EmpWithHighSalaray;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee("Ram", 4000.0),
                new Employee("Sham", 7523.0),
                new Employee("John", 4500.0),
                new Employee("Tim", 6400.0),
                new Employee("Tom", 9000.0)
        );

        Optional<Employee> highestSalary = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
        highestSalary.ifPresent(employee ->System.out.println("HighestSalary:"+employee ));



    }
}
