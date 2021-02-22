package com.ns.beginnerjavaapps.objectsClasses;

import java.util.Objects;

/**
 * Structure of a class
 * 1. Fields - data about the obj, usually is private for data security
 * 2. Constructors - when we construct the obj, we can choose to set its fields in memory on creation
 * Or we can set its traits later with
 * 3. Getters/Setters - these are "middle men" methods that write and read the data in the fields
 * Technically G/S methods would not be necessary if all fields were publicly accessible, but this then opens up your objects to other people corrupting the data
 * 4. Member methods - other behaviors of the object
 * 4a. "built in" methods - methods that the java language pre-makes for us to do simple but necessary things
 */
public class Person {

    /*1 - FIELDS*/
    //these 2 fields are private fields, they define traits of the Person obj
    private String fullName;
    private int age;
    //sometimes we may want a trait, that isn't really tied to any one object in particular, but still applicable to it. For this we can use "static" fields
    public static final String SPECIES = "Homo Sapien";

    /*2 - CTOR*/
    public Person() {
        //this is a default constructor which every object comes with, even if not written by us -> hold space in memory for this object, even though we are not assigning any data
    }

    public Person(String fullName) {
        this.fullName = fullName; //this constructor creates the object and assigns the name of the Person
    }

    public Person(String fullName, int age) {
        this.fullName = fullName; //here we construct and assign data to all fields
        this.age = age;
        //notice, we already assigned the species, no need to worry about it
    }

    /*3 - GETTERS/SETTERS or "accessor/mutator" methods*/
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*4 - MEMBER METHODS*/
    /**
     * Person gives a greeting
     *
     * @return {String} an english casual greeting
     */
    public String greeting() {
        return "Hello!";
    }

    /**
     * Person gives a comment on the weather - methods can also take params
     *
     * @param weather {String} weather condition
     * @return {String} a comment on the weather, if unknown Person will just want to stay inside
     */
    public String weatherComment(String weather) {
        //a Switch statement is a form of control structure that is really just a slimmed down if-else-if statement
        //try re-writing it as an if-else-if statement! You'll see
        switch (weather) {
            case "Sunny":
                return "It's nice out!";
            case "Rain":
                return "It's so gloomy...";
            case "Snow":
                return "Where's my shovel???";
            default:
                return "I just want to stay home";
        }
    }

    /**
     * Person gives a farewell
     *
     * @return {String} an english casual farewell
     */
    public String farewell() {
        return "Good bye!!!";
    }

    /*4a - BUILT INS - Necessary for testing, but also just generally useful for debugging*/
    //this checks if one Person is the same as another Person
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && Objects.equals(getFullName(), person.getFullName());
    }

    //this is useful for testing suites
    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), getAge());
    }

    //this lets you print the data of an object in full
    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
