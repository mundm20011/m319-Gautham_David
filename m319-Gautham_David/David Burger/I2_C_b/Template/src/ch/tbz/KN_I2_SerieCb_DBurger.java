// Defines package
package ch.tbz;

// Imports libraries
import static java.lang.System.*;   // System-IO Library for abbriviation purpose to static functions

// Imports Input functions
import static ch.tbz.lib.Input.*;       // All the functions can be used now!

//Every program must be placed in a class ...
public class KN_I2_SerieCb_DBurger {

    // Our main function which runs the program12
    public static void main(String[] args ) {

        // Title
        System.out.println("Dreiecksberechnung:");
        out.println();

        boolean ungleich = false;
        boolean gleich = false;
        boolean zwei_zahlen_gleich = false;

        do {
            // Input
            int zahl1 = inputInt("Geben Sie die Seite a ein: ");
            int zahl2 = inputInt("Geben Sie die Seite b ein: ");
            int zahl3 = inputInt("Geben Sie die Seite c ein: ");

            // Calculation
            ungleich = zahl1 != zahl2 && zahl1 != zahl3 && zahl2 != zahl3;
            gleich = zahl1 == zahl2 && zahl1 == zahl3 && zahl2 == zahl3;
            zwei_zahlen_gleich = zahl1 == zahl2 && zahl1 != zahl3 && zahl2 != zahl3 
                                || zahl1 != zahl2 && zahl1 == zahl3 && zahl2 != zahl3 
                                || zahl1 != zahl2 && zahl1 != zahl3 && zahl2 == zahl3;

            // System.Out function (Short version)
            if (ungleich == true) {
                out.println("Alle Zahlen sind verschieden!");
            } else if (gleich == true) {
                out.println("Alle Zahlen sind gleich!");
            } else if (zwei_zahlen_gleich == true) {
                out.println("Zwei Zahlen sind gleich, nämlich X.");
            }
        } while (gleich == false);
    }
}