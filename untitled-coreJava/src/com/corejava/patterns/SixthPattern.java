package com.corejava.patterns;

public class SixthPattern {

    public static void main(String[] args) {

        extracted(5);
    }

    private static void extracted(int count) {
        for (int row = 0; row < count; row++) {
            
            //print the spaces for each row
            for (int col = 0; col < count-row-1; col++) {
                System.out.print("6");
            }
            
            //print the star for the each row
            for (int star = 0; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
