package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class dicesim {

    static Random rng = new Random(); //true randomness

    /**
     * Roll one 6-sided dice
     *
     * @return {int} 1-6
     */
    public static int roll() {
        return rng.nextInt(6) + 1; //0-5 -> 1-6
    }

    /**
     * Roll many dice - method overload
     *
     * @param numOfDice {int} the number of dice to roll
     * @return {int} a valid roll for that many dice
     */
    public static int roll(int numOfDice) {
        return rng.nextInt(6 * numOfDice) + numOfDice;
    }

    /**
     * Find the max value of an arr
     *
     * @param arr {int[]} an array of integers
     * @return {int} the max value present in the array
     */
    public static int arrayMax(int[] arr) {
        int max = 0; //initalize it low, so the scan will grab higher numbers

        //scanning the entire array
        for (int i = 0; i < arr.length; i++) {
            //conditional logic -> ONLY IF the next element is larger, will you save that number
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max; //remembered the highest number encounter
    }

    /**
     * Find the min value of an array
     *
     * @param arr {int[]} array of integers
     * @return {int} the minimum value present in the array
     */
    public static int arrayMin(int[] arr) {
//        int min = Integer.MAX_VALUE;
        int min = 6;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    /**
     * Find the average value of the arr
     *
     * @param arr {int[]} array of integers
     * @return {double} (decimal) the average value of the array
     */
    public static double arrayAverage(int[] arr) {
        //avg = sum / numOfElements
        double sum = 0; //int/int -> int, double/int -> double

        //take a running sum of the array
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum / arr.length;
    }

    public static void main(String[] args) {
        //initialize some variables for randomness

//        Random rng2 = new Random(100); //using a random seed -> pseudorandomness
        //true random generator
        /*
        for (int i = 0; i < 100; i++) {
            System.out.println(rng.nextInt());
        }
         */
        int numOfRolls;
        int numOfDice;
        Scanner input = new Scanner(System.in);

        //get a number from the user -> number of rolls of the dice
//        System.out.print("Please enter number of dice to roll: ");
//        numOfDice = input.nextInt();
        System.out.print("Please enter the amount of times to roll: ");
        numOfRolls = input.nextInt();
        int[] rolls = new int[numOfRolls]; //exactly fits the number of rolls to be done

        //Roll the dice that many times -> store the results to an array
        for (int i = 0; i < numOfRolls; i++) {
//            rolls[i] = roll(numOfDice);
            rolls[i] = roll();
        }

        System.out.println(Arrays.toString(rolls));

        //using the array, run simple stats, and print the results to the console
        //min, max, average
        System.out.println("Max = " + arrayMax(rolls));
        System.out.println("Min = " + arrayMin(rolls));
        System.out.println("Average = " + arrayAverage(rolls));
    }

}
