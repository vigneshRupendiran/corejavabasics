package com.corejava.immutablebasics;

import java.util.Date;

public class ImmutableTest {

    public static void main(String[] args) {
        // Create an instance of UserProfile
        Date birthDate = new Date();
        ImmutableCls user = new ImmutableCls("John Doe", "john.doe@example.com", 30, birthDate);

        System.out.println("Before changing birthDate: " + user);

        // Attempt to modify the birthDate externally
        birthDate.setTime(birthDate.getTime() - 1000000000L);

        System.out.println("After changing birthDate: " + user);
        // The UserProfile's birthDate remains unchanged!
    }
}
