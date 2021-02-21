package com.ns.beginnerjavaapps.arrays;

import java.util.Arrays;

public class array {

    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        String firstName = "Narish";
        String lastName = "Singh";

        //collection of data -> array = indexed (first, second ...) collection of objects of the same type
        //index 0 - array.Length-1
        
        //decl + init
        int[] intArr = new int[]{1, 2, 3}; //completely filled -> premade, Length = 3, i: 0 -> 1, 1 -. 2, 2 -> 3 
        String[] sArr = new String[]{firstName, lastName};

        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(sArr));

        //declare array -> fill as needed
        int[] secondIntArr = new int[3]; //reserve a blank array of length 3 -> [0, 0, 0] = 0 -> 0, 1 -> 0, 2 -> 0
        //arrName[index] = number;
        secondIntArr[0] = x;
        secondIntArr[1] = y;
//        intArr2[2] = "Narish";
//        intArr2[3] = x;
        System.out.println(Arrays.toString(secondIntArr));

        String[] secondStringArr = new String[2]; // [null, null] com.ns.beginnerjavaapps.arrays of reference types like string will initialize to null
        secondStringArr[0] = firstName;
        secondStringArr[1] = lastName;
        System.out.println(Arrays.toString(secondStringArr));
    }

}
