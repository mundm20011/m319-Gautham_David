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

        // Variablen
        int zaehler = 0;
        int wechsel_zahl = 0; //besere variablen namen?
        int zahl1 = 1;
        int zahl2 = 0;
        int ergebnis = 0;
        int unterschieds_beschraenkung = 20;
        
        //Input
        int start_zahl = inputInt("Geben Sie die anfangs zahl ein: ");
        int zu_erreichender_zahl = inputInt("Geben Sie die zu erreichender zahl ein: ");
        

        if (start_zahl == -543210 || zu_erreichender_zahl == -543210) {
            unterschieds_beschraenkung = inputInt("Die änderung des 'unterschieds_beschraenkung' ist auf eigener gefahr");
            start_zahl = inputInt("Geben Sie eine neue anfangs zahl ein: ");
            zu_erreichender_zahl = inputInt("Geben Sie eine neue zu erreichender zahl ein: ");
        }

        if (start_zahl < 0) {
            System.out.println("wie es scheint haben sie eine Ungültige anfangs zahl eingegeben");
            start_zahl = inputInt("Geben Sie eine neue anfangs zahl ein: ");
        }
        if (zu_erreichender_zahl < 0) {
            System.out.println("wie es scheint haben sie eine Ungültige zu erreichender zahl eingegeben");
            zu_erreichender_zahl = inputInt("Geben Sie eine neue zu erreichender zahl ein: ");
        }
        if (zu_erreichender_zahl < start_zahl) {
            System.out.println("wie es scheint haben sie eine Ungültige zu erreichender zahl eingegeben");
            System.out.println("bitte achten sie darauf das die zu erreichender zahl " + zu_erreichender_zahl + " nicht kleiner als die start zahl " + start_zahl + " ist");
            zu_erreichender_zahl = inputInt("Geben Sie eine neue zu erreichender zahl ein: ");
        }

        if (zu_erreichender_zahl - start_zahl > unterschieds_beschraenkung) {
            do {
                System.out.println("Damit durch die berechnung die wartezeiten nicht zu hoch werden habe ich die anzahl ausgaben auf " +
                unterschieds_beschraenkung + " beschränkt");
                System.out.println("Bitte achten sie darauf das der unterschied der start zahl und der zu erreichender zahl nicht mehr als " +
                unterschieds_beschraenkung + " ist");
                start_zahl = inputInt("Geben Sie eine neue anfangs zahl ein: ");
                zu_erreichender_zahl = inputInt("Geben Sie eine neue zu erreichender zahl ein: ");
            } while (zu_erreichender_zahl - start_zahl > unterschieds_beschraenkung);
        }

        // Calculation
        do {

            if (ergebnis == start_zahl && start_zahl == 0) {
                System.out.println(ergebnis + " ist die fibonacci zahl von " + zaehler);
            }
            if (zaehler >= zu_erreichender_zahl) {
                break;
            }
            if (wechsel_zahl == 0) {
                ergebnis = zahl1 + zahl2;
                zahl1 = ergebnis;
                wechsel_zahl = wechsel_zahl + 1;
                zaehler = zaehler + 1;
            }
            if (zaehler >= start_zahl) {
                System.out.println(ergebnis + " ist die fibonacci zahl von " + zaehler);
            }
            if (zaehler >= zu_erreichender_zahl) {
                break;
            }
            else if (wechsel_zahl == 1); {
                ergebnis = zahl1 + zahl2;
                zahl2 = ergebnis;
                wechsel_zahl = wechsel_zahl - 1;
                zaehler = zaehler + 1;
            }
            if (zaehler >= start_zahl) {
                System.out.println(ergebnis + " ist die fibonacci zahl von " + zaehler);
            }

        } while (zaehler < zu_erreichender_zahl);
//ab zähler 47 wird merkwürdig online prüfen //die zahl wird zu gross alles davor wird korekt angezeigt
//2147483647 ist die höchst mögliche zahl bei Int
//beschränkung? nicht höher als zähler 46?
//andere Datentyp nicht `Int`?
    }
}
