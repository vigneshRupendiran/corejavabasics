package com.corejava.collectionz;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Sample {
    Employee emp = new Employee();
    Employee emp1 = new Employee();
    String nameAny = "anyString";


    public static void main(String[] args) {
        HashMap<String,List<Employee>> dataz = new HashMap<String, List<Employee>>();

        List<Employee> empNamList = new ArrayList<>();

        //List<String> output = empNamList.stream().filter(e ->e.name);
    }




}

  class Employee{
    int age;
    String name;
    Date dob;

    public void dpTest(){
        age=10;
        name="sarava";
        dob = new Date();

        String nameAny = "anyString";


      char star = '*';
    int count = 5;
    for(int i=0;i<=count;i++){
        for(int j=i;j<=count;j++){
            System.out.println("*");
        }


    }





    }

}