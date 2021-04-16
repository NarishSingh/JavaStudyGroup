package com.ns.beginnerjavaapps.reviewApps;

public class SummativeSums {

    public static int arraySum(int[] arr) {
        int sum = 0;

        //iterate through the array -> for loop
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; //the same thing as saying sum = sum + arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        //T[] arrayName = new T[]{1, 2, 3};
        //T[] emptyArray = new T[size];
        int[] arr1 = new int[]{1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] arr2 = new int[]{999, -60, -77, 14, 160, 301};
        int[] arr3 = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99};

        System.out.println("#1 sum: " + arraySum(arr1));
        System.out.println("#2 sum: " + arraySum(arr2));
        System.out.println("#3 sum: " + arraySum(arr3));
    }
}
