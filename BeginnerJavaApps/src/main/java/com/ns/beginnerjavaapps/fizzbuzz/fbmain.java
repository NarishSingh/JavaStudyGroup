package com.ns.beginnerjavaapps.fizzbuzz;

public class fbmain {

    public static void main(String[] args) {
        //loop through from 1-100
        //for loop = "for the numbers x through y -> do something"
        //index i
        //i++ -> i = i + 1 -> i += 1
        for (int i = 0; i <= 100; i++) {
            // /3 -> fizz
            // /5 -> buzz
            // both -> fizzbuzz
            // % -> do division, but give me the remainder -only-
            // && -> logic

            //"detour"
            if (i == 2) {
                System.out.println("Hey this number is 2");
            }

            //"branching path/fork in the road"
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

}
