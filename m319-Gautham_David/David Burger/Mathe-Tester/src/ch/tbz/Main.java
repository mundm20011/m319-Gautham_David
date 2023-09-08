// Defines package
package ch.tbz;

// Imports libraries
//import static java.lang.System.*;   // System-IO Library for abbriviation purpose to static functions
//import static java.lang.Math.*;     // Mathematic Library for abbriviation purpose to static functions
import java.util.*;                 // Random is part of this library

// Imports Input functions
import static ch.tbz.lib.Input.*;       // All the functions can be used now!

//Every program must be placed in a class ...
public class Main {

    // Our main function which runs the program12
    public static void main(String[] args ) {

        //What do you want to train? +, - or * ?
        //Users enters +
        //35 + 55 = ?
        //Enter the second number:55
        //Users enters 80
        //WRONG: The Result is 90
        //Do you want to test again? Yes or no?
        //Users enters no
        //Okay, goodbye!


        Random random = new Random();
        //Calling the nextInt() method
        int zahl1;
        int zahl2;
        int lösung;
        zahl1 = random.nextInt(101);
        zahl2 = random.nextInt(101);
        lösung = zahl1 + zahl2;
        

        String operator = inputString("What do you want to train? +, - or * ?");
        System.out.println(zahl1 + " + " + zahl2 + " = ?");
        String ergebnis = inputString("Enter the second number: ");
        System.out.println("Users enters " + ergebnis);
        System.out.println("WRONG: The Result is " + lösung);
        String wiederholen = inputString("Do you want to test again? Yes or no?");
        System.out.println("Okay, goodbye!");


    }
}
