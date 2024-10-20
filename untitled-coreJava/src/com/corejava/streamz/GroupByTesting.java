package com.corejava.streamz;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByTesting {
    public static void main(String[] args) {
GroupByTesting grp = new GroupByTesting();
grp.doPrintTheGrouped(grp.doTestGroupBy(grp.doLoadPersonData()));
    }

    private void doPrintTheGrouped(Map<String, List<Person>> stringListMap) {
        stringListMap.forEach((city,person) -> {
            System.out.println("City : "+city);
            person.forEach(perObj -> {
                System.out.println("Person Name : "+perObj.getName());
            });
        });
    }

    public Map<String,List<Person>> doTestGroupBy(List<Person> personList){
       Map<String,List<Person>> grouped = new HashMap<>();
       grouped = personList.stream().collect(Collectors.groupingBy(Person::getCity));
       return grouped;
   }

   public List<Person> doLoadPersonData(){
        Person person = new Person("Alexa","New York");
        Person person1= new Person("Google","New York");
        Person person2 = new Person("Amazon","Dallas");
        Person person3= new Person("Azure","Florida");

       List<Person> returnPersonList = new ArrayList<>();
       returnPersonList = Arrays.asList(person,person1,person2,person3);
       return returnPersonList;
   }
}

class Person{
    String name;
    String City;

    public Person(String name, String city) {
        this.name = name;
        City = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCity() {
        return City;
    }

}
