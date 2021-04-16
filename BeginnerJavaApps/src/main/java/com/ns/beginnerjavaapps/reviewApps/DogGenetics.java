package com.ns.beginnerjavaapps.reviewApps;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static int[] calculateDna() {
        int[] genetics = new int[5];
        Random rng = new Random();
        int bound = 101;

        //As we generate numbers, we slice off that from the upper bound
        for (int i = 0; i < genetics.length; i++) {
            genetics[i] = rng.nextInt(bound); //exclude the bound -> 101 = 0-100
            bound -= genetics[i];
        }

        return genetics;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dogName;

        System.out.print("What is your dog's name?: ");
        dogName = input.nextLine();

        System.out.println("Well then, I have this highly reliable report on" + dogName + "prestigious background right here.");
        System.out.println(dogName + " is: ");

        //rng will create the percentages
        int[] myDogGenetics = calculateDna();
        String[] dogBreeds = new String[]{"Corgi", "Husky", "Pug", "Pitbull", "Rothweiler"};
        for (int i = 0; i < myDogGenetics.length; i++) {
            System.out.println(myDogGenetics[i] + "% " + dogBreeds[i]);
        }
    }
}
