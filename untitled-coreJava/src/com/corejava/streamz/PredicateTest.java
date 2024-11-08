package com.corejava.streamz;

import com.corejava.streamz.utils.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 25, 50000));
        employees.add(new Employee("Alice", 30, 60000));
        employees.add(new Employee("Bob", 35, 70000));
        employees.add(new Employee("Charlie", 28, 55000));

        Predicate<Employee> condition = employee -> employee.getAge() >32;

        List<Employee> result = employees.stream().filter(condition).collect(Collectors.toUnmodifiableList());
        for (Employee e : result)
            System.out.println(result);
    }
}
