package com.ns.beginnerjavaapps.reviewApps;

import java.math.BigDecimal;
import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //use for console input from the user

        System.out.print("What is your age?: ");
        int age = input.nextInt();

        //print the max rate for age
        int maxHeartRate = 220 - age;
        System.out.println("Your max HR is: " + maxHeartRate);

        //print the target HR zon -> .5 & .85
        //integer -> int
        //decimals -> float, double
        double minTargetHr = .5 * maxHeartRate;
        double maxTargetHr = .85 * maxHeartRate;
        System.out.println("Your target HR zone is " + minTargetHr + " - " + maxTargetHr + " BPM");
    }
}
