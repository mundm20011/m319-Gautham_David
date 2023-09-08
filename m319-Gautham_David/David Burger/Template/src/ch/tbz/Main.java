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
        int Zahl1 = inputInt("Geben Sie die 1. Zahl ein: ");
        int Zahl2 = inputInt("Geben Sie die 2. Zahl ein: ");
        String name = inputString("Bitte geben sie ihren vollständigen Namen an: ");
        String adress = inputString("Bitte geben sie ihre Adresse an: ");

        // Calculation
        double c = Math.sqrt(Math.pow(a,2) + pow(b,2));
        int ergebnis_addition = Zahl1 + Zahl2;
        int ergebnis_subtraktion = Zahl1 - Zahl2;
        int ergebnis_multiplikation = Zahl1 * Zahl2;
        int ergebnis_division = Zahl1 / Zahl2;

        // System.Out function (Short version)
        out.println("Das Resultat ist: " + c);
        out.println("Das Resultat der Addition ist: " + ergebnis_addition);
        out.println("Das Resultat der Subtraktion ist: " + ergebnis_subtraktion);
        out.println("Das Resultat der Multiplikation ist: " + ergebnis_multiplikation);
        out.println("Das Resultat der Division ist: " + ergebnis_division);
        out.println("Guten tag " + name + " Anhand der eingegebene informationen Wohnen sie bei der Adresse: " + adress);


        Random random = new Random();
        //Calling the nextInt() method
        System.out.println("Hier noch eine zufällige Ganzzahl: " + random.nextInt());

    }
}
