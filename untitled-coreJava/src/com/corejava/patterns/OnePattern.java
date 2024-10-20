package com.corejava.patterns;

public class OnePattern {

    public static void main(String[] args) {
OnePattern one = new OnePattern();
/*one.doPrintStar(5);
        one.doPrintStar2(5);
        one.doPrintStar3(5);
        one.doPrintStar4(5);
        one.doPrintStar5(5);*/
        one.doPrintStar6(5);
        one.doPrintStar7(5);


    }

    public void doPrintStar(int count){
        System.out.println(" ");
        for (int row= 1; row<=count; row++) {
            for (int column = 1; column <= count; column++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void doPrintStar2(int count){
        System.out.println(" ");
        for (int row= 1; row<=count; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void doPrintStar3(int count){
        System.out.println(" ");
        for (int row= count; row>=1; row--) {
            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void doPrintStar4(int count){
        for (int row = 1; row <= count; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column);
            }
            System.out.println(" ");
        }
    }

    public void doPrintStar5(int count){
        System.out.println(" ");
        //print the first half
        for (int row = 1; row <=count; row++) {
            for (int column = 1; column <=row ; column++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //print the second half
        for (int row = 1; row <=count ; row++) {
            for (int column = 5; column >=row ; column--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    public void doPrintStar6(int count){
        System.out.println(" ");
        for (int row = 1; row <= count; row++) {
            for (int spaces = row; spaces <= count; spaces++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void doPrintStar7(int count){
        System.out.println(" ");
        for (int row = 1; row <= count; row++) {
            for (int spaces = 1; spaces <= count; spaces++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }




}
