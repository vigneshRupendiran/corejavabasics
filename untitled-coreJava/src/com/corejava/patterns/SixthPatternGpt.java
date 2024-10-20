package com.corejava.patterns;

public class SixthPatternGpt {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        // Loop for each row, starting from 0
        for (int i = 0; i < n; i++) {

            // Print spaces for each row
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars for each row
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
