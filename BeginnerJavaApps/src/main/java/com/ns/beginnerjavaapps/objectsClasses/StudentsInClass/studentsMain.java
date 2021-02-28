package com.ns.beginnerjavaapps.objectsClasses.StudentsInClass;

public class studentsMain {

    public static void main(String[] args) {
        //constructed the obj -> had to assign its name
        Student s1 = new Student("John Doe");

        //assign the grades for the Student obj
        //create the grades array
        int[] johnsGrades = new int[]{99, 77, 68};

        //set the grades field
        s1.setGrades(johnsGrades);

        System.out.println(s1.toString());
        System.out.println(s1.gradePointAvg());
    }
}
