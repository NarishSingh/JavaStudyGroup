package com.ns.beginnerjavaapps.objectsClasses.inheritance;

import com.ns.beginnerjavaapps.objectsClasses.StudentsInClass.Student;

import java.util.Arrays;
import java.util.Objects;

public class Classroom {

    private int classNumber;
    private Student[] students; //composition - the classroom obj is composed of other objects

    public Classroom(int classNumber) {
        this.classNumber = classNumber;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Classroom)) return false;
        Classroom classroom = (Classroom) o;
        return getClassNumber() == classroom.getClassNumber() && Arrays.equals(getStudents(), classroom.getStudents());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getClassNumber());
        result = 31 * result + Arrays.hashCode(getStudents());
        return result;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "classNumber=" + classNumber +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
