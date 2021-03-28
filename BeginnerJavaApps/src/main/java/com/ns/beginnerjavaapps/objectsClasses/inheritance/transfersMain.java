package com.ns.beginnerjavaapps.objectsClasses.inheritance;

import com.ns.beginnerjavaapps.objectsClasses.StudentsInClass.Student;

import java.util.*;

public class transfersMain {

    public static void main(String[] args) {
        //using Student parent class
        Student s1 = new Student("Regular Student");
        s1.setGrades(new int[]{100, 99, 98});

        System.out.println(s1.toString());

        //Transfer #1
        TransferStudent ts1 = new TransferStudent("Transferee 1", "Class 2");
        ts1.setGrades(new int[]{89, 91, 95});

        System.out.println(ts1.getName());
        System.out.println(Arrays.toString(ts1.getGrades()));
        System.out.println(ts1.getOriginInfo());
        System.out.println("GPA = " + ts1.gradePointAvg());

        System.out.println("Mentor = " + ts1.getMentorsName(s1));

        //Transfer #2 - polymorphic
        Student ts2 = new TransferStudent("Transferee 2", "Ohio");
        ts2.setGrades(new int[]{69, 89, 100});

        System.out.println(ts2.getName());
        System.out.println(Arrays.toString(ts2.getGrades()));
//        System.out.println(ts2.getOriginInfo());
    }
}
