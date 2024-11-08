package com.corejava.streamz;

import com.corejava.streamz.utils.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalTest2 {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("John", 25, 50000));
        empList.add(new Employee("Alice", 30, 60000));
        empList.add(new Employee("Bob", 35, 70000));
        empList.add(new Employee("Charlie", 28, 55000));

        Employee defaultEmp = new Employee("no Employee",0,0);

Employee resultOpt = doCheckOpt("Lollai",empList).orElse(defaultEmp);
        System.out.println(resultOpt);

    }

    public static Optional<Employee> doCheckOpt(String name,List<Employee> empList){
        return empList.stream()
                .filter(emp -> emp.getName() == name)
                .findFirst();
    }
}
