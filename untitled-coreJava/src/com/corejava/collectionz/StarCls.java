package com.corejava.collectionz;

public class StarCls {

    public static void main(String[] args) {
        char star = '*';
        int count = 5;
        for (int i = 1; i <= count ; i++) {
            for (int j = i; j <= count; j++) {
                   System.out.print('*');



            }
            System.out.println("\n");
        }
    }
}
