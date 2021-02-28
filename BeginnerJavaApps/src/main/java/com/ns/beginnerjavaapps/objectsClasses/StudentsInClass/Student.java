package com.ns.beginnerjavaapps.objectsClasses.StudentsInClass;

import java.util.Arrays;
import java.util.Objects;

public class Student {

    /*FIELDS*/
    private String name;
    private int[] grades;

    /*CONSTRUCTOR*/
    public Student(String name) {
        this.name = name;
    }

    /*GETTERS/SETTERS*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    /*METHOD*/
    /**
     * Calculate the GPA of the 3 test grades
     *
     * @return {double} the average of all grades
     */
    public double gradePointAvg() {
        double sum = 0;

        for (int i = 0; i < this.grades.length; i++) {
            sum += this.grades[i];
        }

        return sum / this.grades.length;
    }

    /*BUILT INS*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getName().equals(student.getName()) && Arrays.equals(getGrades(), student.getGrades());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName());
        result = 31 * result + Arrays.hashCode(getGrades());
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
