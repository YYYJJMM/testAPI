package com.bjpublic.intellij.tutorial;

import java.util.Arrays;
//import java.util.Scanner;

public class Main {
    public static final int SIZE = 3;

    public static void main(String[] args) {
        int[] array = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = generator();
            System.out.println("Genarator complete! : " +array[i]);
        }

        System.out.println("정렬 전 >>" + Arrays.toString(array));

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);

        System.out.println("정렬 후 >>" + Arrays.toString(array));
    }

    public static int generator(){
        return (int) (Math.random() *10) + 1;
    }
}
