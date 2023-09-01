// Defines package
package ch.tbz;

// Imports libraries
import static java.lang.System.*;   // System-IO Library for abbriviation purpose to static functions
import static java.lang.Math.*;     // Mathematic Library for abbriviation purpose to static functions
import java.util.*;                 // Random is part of this library

// Imports Input functions
import static ch.tbz.lib.Input.*;       // All the functions can be used now!

//Every program must be placed in a class ...
public class Main {

    // Our main function which runs the program12
    public static void main(String[] args ) {

        // Title
        System.out.println("Dreiecksberechnung:");
        out.println();

        // Input
        double a = inputDouble("Geben Sie die Seite a ein: ");
        double b = inputDouble("Geben Sie die Seite b ein: ");

        // Calculation
        double c = Math.sqrt(Math.pow(a,2) + pow(b,2));

        // System.Out function (Short version)
        out.println("Das Resultat ist: " + c);


        Random random = new Random();
        //Calling the nextInt() method
        System.out.println("Hier noch eine zufällige Ganzzahl: " + random.nextInt());

    }
}
