package main;

public class Main {

    public static void main(String[] args) {
        int[] argss = new int[args.length];
        boolean isRunning = true;
        for (int i = 0; i < argss.length; i++) {
            if (isNumeric(args[i])){
                argss[i] = Integer.parseInt(args[i]);
            }
            else {
                isRunning = false;
                System.out.println("You have entered a wrong value! Please enter numbers "+
                        "\n number like [ 1 , 2 ,3 ) or [-1, -2 -3] ");
            }
        }
        if (isRunning ){
            Sorter.selctSort(argss);
            Sorter.printArray(argss);
        }
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
