package com.company;

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
                System.out.println("You have entered wrong value! Please enter Numeric value ");
            }
        }
        if (isRunning ){
            Sorter.selctSort(argss);
            Sorter.printArray(argss);
        }


    }

    // method to verify user input is a number not a Srtring
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }



    


}
