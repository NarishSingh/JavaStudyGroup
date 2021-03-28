package com.ns.beginnerjavaapps.objectsClasses.inheritance;

import com.ns.beginnerjavaapps.objectsClasses.StudentsInClass.Student;

import java.util.Objects;

/**
 * Transfer student child/subclass inherits from the Student parent/superclass
 */
public class TransferStudent extends Student {

    /*FIELDS*/
    //name and grades fields are inherited from the parent
    private String originInfo; //unique to the TransferStudent class

    /*CONSTRUCTOR*/
    public TransferStudent(String name) {
        super(name); //super is an alias for the parent's constructor
    }

    public TransferStudent(String name, String originInfo) {
        super(name);
        this.originInfo = originInfo; //here we use super + the new child's info
    }

    /*GETTERS/SETTERS*/
    public String getOriginInfo() {
        return originInfo;
    }

    public void setOriginInfo(String originInfo) {
        this.originInfo = originInfo;
    }

    /*METHODS*/
    public String getMentorsName(Student s){
        return s.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransferStudent)) return false;
        if (!super.equals(o)) return false;
        TransferStudent that = (TransferStudent) o;
        return Objects.equals(getOriginInfo(), that.getOriginInfo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getOriginInfo());
    }
}
