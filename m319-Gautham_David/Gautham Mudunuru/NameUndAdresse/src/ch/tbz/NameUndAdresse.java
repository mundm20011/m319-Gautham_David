// Defines package
package ch.tbz;

// Imports libraries
import static java.lang.System.*;   // System-IO Library for abbriviation purpose to static functions
//import static java.lang.Math.*;     // Mathematic Library for abbriviation purpose to static functions
//import java.util.*;                 // Random is part of this library

// Imports Input functions
import static ch.tbz.lib.Input.*;       // All the functions can be used now!

//Every program must be placed in a class ...
public class NameUndAdresse {

    // Our main function which runs the program12
    public static void main(String[] args ) {

        //Input
        String name = inputString("Geben Sie Ihren Namen ein:");
        String adress = inputString("Geben Sie Ihre Adresse ein:");


        //Output
        out.println("Hello, " + name + ".");
        out.println("Sie wohnen in " + adress + ".");
    }
}
