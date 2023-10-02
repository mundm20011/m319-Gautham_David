// Defines package
package ch.tbz;

// Imports libraries
//import static java.lang.System.*;   // System-IO Library for abbriviation purpose to static functions
//import static java.lang.Math.*;     // Mathematic Library for abbriviation purpose to static functions
//import java.util.*;                 // Random is part of this library

// Imports Input functions
import static ch.tbz.lib.Input.*;       // All the functions can be used now!

/* Die Fibonacci-Folge ist eine unendliche Folge von Zahlen (den Fibonacci-Zahlen),
bei der sich die jeweils folgende Zahl durch Addition ihrer beiden vorherigen Zahlen ergibt: 0, 1, 1, 2, 3, 5, 8, 13/
http://www.mat.uc.pt/~mat1164/FibonacciAN.html */

//Every program must be placed in a class ...
public class Fibonnaci {

    // Our main function which runs the program12
    public static void main(String[] args ) {

        // Title
        System.out.println("Fibonnaci Zahlen:");

        // Input
        int start_zahl = inputInt("Geben Sie die Seite b ein: ");
        int zähler = start_zahl;
        int wechsel_zahl = 0;
        int zahl1 = 1;
        int zahl2 = 0;
        int zu_erreichender_zahl = inputInt("Geben Sie die zu erreichender zahl ein: ");
        int ergebnis = 0;

        // Calculation
        do {

            if (ergebnis == start_zahl && start_zahl == 0) {
                System.out.println(ergebnis);
            }
            if (wechsel_zahl == 0) {
                ergebnis = zahl1 + zahl2;
                zahl1 = ergebnis;
                wechsel_zahl = wechsel_zahl + 1;
                zähler = zähler + 1;
            }
            if (ergebnis >= start_zahl) {
                System.out.println(ergebnis);
            }
            if (ergebnis > zu_erreichender_zahl) {
                break;
            }
            else if (wechsel_zahl == 1); {
                ergebnis = zahl1 + zahl2;
                zahl2 = ergebnis;
                wechsel_zahl = wechsel_zahl - 1;
                zähler = zähler + 1;
            }
            if (ergebnis >= start_zahl) {
                System.out.println(ergebnis);
            }

        } while (ergebnis < zu_erreichender_zahl);
//muss noch ein break einbauen damit es nicht das else if ausführt wenn die zahl erreicht wurde

    }
}
