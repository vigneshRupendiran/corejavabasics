package com.corejava.streamz;

import com.corejava.streamz.utils.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 25, 50000));
        employees.add(new Employee("Alice", 30, 60000));
        employees.add(new Employee("Bob", 35, 70000));
        employees.add(new Employee("Charlie", 28, 55000));

        Optional<Employee> result = doCheckNameOpt(employees, "dummy");

        if (result.isPresent()){
            System.out.println("Employee Found : "+result.get());
        }
        else {
            System.out.println("Employee NOT Found");
        }

        Employee defaultEmployee = new Employee("Defualt",0,0);
        Employee employeeChk = result.orElse(defaultEmployee);
        System.out.println("Employee : "+employeeChk);

        result.ifPresent(emp -> System.out.println("Employee details : "+emp));
    }

    private static Optional<Employee> doCheckNameOpt(List<Employee> employees, String name) {
        return employees.stream()
                .filter(employee -> employee.getName().equalsIgnoreCase(name))
                .findFirst();
    }
}
