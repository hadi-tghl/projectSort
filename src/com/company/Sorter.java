package com.company;

public class Sorter {
    // printing methods to print out arrays
    public static void printArray(int[] args){
        for (int i : args) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    // method for swapings args from smallest to the largest
    public static void swap(int[] args, int left, int right){
        int temp = args[left];
        args[left] = args[right];
        args[right] = temp;
    }

    // method for sorting with help of swap method
    public static void selctSort(int[] args){
        int min;
        for (int i = 0; i < args.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < args.length ; j++) {
                if (args[j] < args[min]){
                    min = j;
                }
            }
            if (min != i){
                swap(args, i, min);
            }
        }
    }

}
