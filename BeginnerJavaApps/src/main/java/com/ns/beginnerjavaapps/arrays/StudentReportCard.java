package com.ns.beginnerjavaapps.arrays;

import java.util.Scanner;

public class StudentReportCard {

    /**
     * Calculate the GPA of the 3 test grades
     *
     * @param arr {int} array of grades
     * @return {double} the average of all grades
     */
    public static double gradePointAvg(int[] arr) {
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum / arr.length;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //save name of student
        System.out.print("Enter student name: ");
        String name = in.nextLine();

        //get 3 grades for the student
        int[] grades = new int[3];

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grade " + (i + 1) + ": ");
            grades[i] = in.nextInt();
        }

        System.out.println("GPA: " + gradePointAvg(grades));
    }
}
