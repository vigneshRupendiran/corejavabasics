package com.corejava.immutablebasics;

import java.util.Date;

    //Step 1 : Declare Class as FINAL
public final class ImmutableCls {
    // Step 2: Declare all fields as private and final
    private final String name;
    private final String email;
    private final int age;
    private final Date birthDate; // Mutable field

    // Step 3: Initialize all fields via a constructor
    public ImmutableCls(String name, String email, int age, Date birthDate) {
        this.name = name;
        this.email = email;
        this.age = age;
        // Step 5: Make a defensive copy of the mutable object
        this.birthDate = new Date(birthDate.getTime());
    }

    // Step 4: No setter methods (only getter methods)
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    // Step 5: Return a copy of the mutable object, not the original reference
    public Date getBirthDate() {
        return new Date(birthDate.getTime());
    }

    @Override
    public String toString() {
        return "ImmutableCls{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                '}';
    }
}
