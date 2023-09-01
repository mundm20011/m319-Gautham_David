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
        double Zahl1 = inputDouble("Geben Sie die 1. Zahl ein: ");
        double Zahl2 = inputDouble("Geben Sie die 2. Zahl ein: ");

        // Calculation
        double ergebnis_dreiecksberechnung = Math.sqrt(Math.pow(Zahl1,2) + pow(Zahl2,2));
        double ergebnis_addition = Zahl1 + Zahl2;
        double ergebnis_subtraktion = Zahl1 - Zahl2;
        double ergebnis_multiplikation = Zahl1 * Zahl2;
        double ergebnis_division = Zahl1 / Zahl2;

        // System.Out function (Short version)
        out.println("Das Resultat der Dreiecksberechnung ist: " + ergebnis_dreiecksberechnung);
        out.println("Das Resultat der Addition ist: " + ergebnis_addition);
        out.println("Das Resultat der Subtraktion ist: " + ergebnis_subtraktion);
        out.println("Das Resultat der Multiplikation ist: " + ergebnis_multiplikation);
        out.println("Das Resultat der Division ist: " + ergebnis_division);


        Random random = new Random();
        //Calling the nextInt() method
        System.out.println("Hier noch eine zufällige Ganzzahl: " + random.nextInt());

    }
}
