package com.ns.beginnerjavaapps.objectsClasses.inheritance;

import com.ns.beginnerjavaapps.objectsClasses.StudentsInClass.Student;

public class classroomMain {

    public static void main(String[] args) {
        Classroom c111 = new Classroom(111);

        Student[] c111Students = new Student[]{
                new Student("Bob"), //0
                new Student("Jill"), //1
                new Student("Jane") //2
        };
        //for each
        int[] everyoneIsSmart = new int[]{100, 100, 100};
        for (Student s : c111Students) {
            s.setGrades(everyoneIsSmart);
        }

        c111.setStudents(c111Students);

        System.out.println(c111.toString());
    }
}
