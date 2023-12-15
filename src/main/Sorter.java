package main;

public class Sorter {
    public static void printArray(int[] args){
        for (int i : args) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    public static void swap(int[] args, int left, int right){
        int temp = args[left];
        args[left] = args[right];
        args[right] = temp;
    }

    public static void selectSort(int[] args){
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
