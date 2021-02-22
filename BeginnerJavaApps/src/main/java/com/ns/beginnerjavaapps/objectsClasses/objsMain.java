/*
Objects are a key feature of understanding the form of data such that we can program in a way that mirrors real life
If we want to do -object oriented programming-, we are creating objects that store data in a way a real life object have 1) defining traits and 2) behaviors
For our purposes,
Traits -> fields
Behaviors -> methods

In this program, we will create a Person class, which defines what a Person obj will look and behave like
Read thru the "Person" class files first, then come back here
 */
package com.ns.beginnerjavaapps.objectsClasses;

public class objsMain {

    public static void main(String[] args) {
        //1. lets demonstrate that you don't need an object to print a static field
        //we will access this field with dot notation -> syntax = ClassName.StaticFieldName
        System.out.println("All people are of the species" + Person.SPECIES);

        //2. Lets make a Person with the default constructor, set its fields, and print their info
        Person p1 = new Person();
        p1.setFullName("John Doe");
        p1.setAge(53);

        //use the Getters to print
        System.out.println("Person 1's name: " + p1.getFullName());
        System.out.println("Person 1's age: " + p1.getAge());

        //or we can be lazy
        System.out.println(p1.toString());

        //3. Use the 1 param ctor
        Person p2 = new Person("Juan Dos");
        p2.setAge(26);

        System.out.println("Person 2's name: " + p2.getFullName());
        System.out.println("Person 2's age: " + p2.getAge());

        System.out.println(p2.toString());

        //4. Use the full ctor
        Person p3 = new Person("Maria Tres", 24);

        System.out.println("Person 3's name: " + p3.getFullName());
        System.out.println("Person 3's age: " + p3.getAge());

        System.out.println(p3.toString());

        //1a. Lets check if these Person obj's all share the same static field -> species
        //the compiler will give a warning because you should use Person.SPECIES, but this is just for proof
        System.out.println(p1.SPECIES);
        System.out.println(p2.SPECIES);
        System.out.println(p3.SPECIES);

        //5. Greet
        System.out.println(p1.greeting());
        System.out.println(p2.greeting());
        System.out.println(p3.greeting());

        //6. Weather comment from them
        System.out.println(p1.getFullName() + " says " + p1.weatherComment("Rain"));
        System.out.println(p2.getFullName() + " says " + p2.weatherComment("Sunny"));
        System.out.println(p3.getFullName() + " says " + p3.weatherComment("Snow"));

        //7. Farewell
        System.out.println(p1.farewell());
        System.out.println(p2.farewell());
        System.out.println(p3.farewell());

        //8. Are they the same person?
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p3.equals(p1));

        //clone the obj
        Person p1QuickClone = p1; //this just creates a reference to the 1st object
        Person p1ThoroughClone = new Person(p1.getFullName(), p1.getAge()); //this is a more complete clone, as it snatched all their data
        System.out.println(p1.equals(p1QuickClone));
        System.out.println(p1.equals(p1ThoroughClone));
    }
}
