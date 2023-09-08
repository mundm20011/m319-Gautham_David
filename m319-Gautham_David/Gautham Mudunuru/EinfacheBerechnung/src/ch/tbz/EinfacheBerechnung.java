// Defines package
package ch.tbz;

// Imports libraries
import static java.lang.System.*;   // System-IO Library for abbriviation purpose to static functions
//import static java.lang.Math.*;     // Mathematic Library for abbriviation purpose to static functions
//import java.util.*;                 // Random is part of this library

// Imports Input functions
import static ch.tbz.lib.Input.*;       // All the functions can be used now!

//Every program must be placed in a class ...
public class EinfacheBerechnung {

    // Our main function which runs the program12
    public static void main(String[] args ) {

        // Title
        System.out.println("Einfache Berechnung");
        out.println();

        // Input
        int a = inputInt("Geben Sie die Zahl a ein: ");
        int b = inputInt("Geben Sie die Zahl b ein: ");

        // Calculation
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;

        // System.Out function (Short version)
        out.println("Das Resultate sind: " + add + "/" + sub + "/" + mul + "/" + div);


        //Calling the nextInt() method
    }
}
