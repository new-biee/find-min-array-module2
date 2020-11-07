package com.findminarray;

public class Main {

    public static int getminValue(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length-1; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = getminValue(arr);
        System.out.println("The smallest element in the array is: " + index);
    }
}
