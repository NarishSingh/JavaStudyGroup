package com.ns.beginnerjavaapps.nameagestrings;

import java.util.Scanner;

public class stringstuff {

    public static void main(String[] args) {
        int x = 10; //primitive type
        char c = 'a'; //primitive type

        String name; //reference type -> array of char
        int age; //primitive type
        Scanner in = new Scanner(System.in); //we will use this to get data from the user

        //print something to the console
        //printed a greeting
        String greet = "Hi, I am a computer";
        System.out.println(greet);

        //get the user's name
        System.out.println("What is your name?");
        name = in.nextLine(); //we are using the "in" scanner obj -> nextLine() to grab what the user wrote -- "enter" -> assign it to name var

        //control flow -> if-else statement
        if (name.isBlank()) {
            //stringVar.isBlank() will check if the input is blank, or has only spaces, which is not useful to us
            System.out.println("I hate you");
        } else {
            System.out.println("Hello " + name);
        }

        //get their age
        System.out.print("Tell me your age: ");
        age = in.nextInt();

        if (age > 110) {
            System.out.println("You are lying");
        } else {
            System.out.println("You are " + age + " years old.");
        }
    }

}
