// Defines package
package ch.tbz;

// Imports Input functions
import static ch.tbz.lib.Input.*;

/* Die Fibonacci-Folge ist eine unendliche Folge von Zahlen (den Fibonacci-Zahlen),
bei der sich die jeweils folgende Zahl durch Addition ihrer beiden vorherigen Zahlen ergibt: 0, 1, 1, 2, 3, 5, 8, 13/
http://www.mat.uc.pt/~mat1164/FibonacciAN.html */

public class Fibonnaci {
    public static void main(String[] args ) {

        // Title
        System.out.println("Fibonnaci Zahlen:");

        // Variablen
        int zaehler = 0;
        int wechsel_zahl = 0;
        int zahl1 = 1;
        int zahl2 = 0;
        int ergebnis = 0;
        int unterschieds_beschraenkung = 20;
        
        //Input
        int start_zahl = inputInt("Geben Sie die anfangs zahl ein: ");
        int zu_erreichender_zahl = inputInt("Geben Sie die zu erreichender zahl ein: ");
        
        //Optionen
        if (start_zahl == -543210 || zu_erreichender_zahl == -543210) {
            unterschieds_beschraenkung = inputInt("Die änderung des 'unterschieds_beschraenkung' ist auf eigener gefahr");
            start_zahl = inputInt("Geben Sie eine neue anfangs zahl ein: ");
            zu_erreichender_zahl = inputInt("Geben Sie eine neue zu erreichender zahl ein: ");
        }
        //Input Kontrolle
        do {
            if (start_zahl > 46 || zu_erreichender_zahl > 46) {
                System.out.println("Da die Fibonnaci zahl bis ins unermässliche steigt erlaube ich nicht die zahl höher als 46 zu nutzen");
                start_zahl = inputInt("Geben Sie die anfangs zahl ein: ");
                zu_erreichender_zahl = inputInt("Geben Sie die zu erreichender zahl ein: ");
            }
            if (start_zahl < 0) {
                System.out.println("wie es scheint haben sie eine Ungültige anfangs zahl eingegeben");
                start_zahl = inputInt("Geben Sie eine neue anfangs zahl ein: ");
            }
            if (zu_erreichender_zahl < 0) {
                System.out.println("wie es scheint haben sie eine Ungültige zu erreichender zahl eingegeben");
                zu_erreichender_zahl = inputInt("Geben Sie eine neue zu erreichender zahl ein: ");
            }
            if ( start_zahl > zu_erreichender_zahl) {
                System.out.println("wie es scheint haben sie eine Ungültige zu erreichender zahl eingegeben");
                System.out.println("bitte achten sie darauf das die zu erreichender zahl " + zu_erreichender_zahl + " nicht kleiner als die start zahl " + start_zahl + " ist");
                zu_erreichender_zahl = inputInt("Geben Sie eine neue zu erreichender zahl ein: ");
            }
            if (zu_erreichender_zahl - start_zahl > unterschieds_beschraenkung) {
                    System.out.println("Damit durch die berechnung die wartezeiten nicht zu hoch werden habe ich die anzahl ausgaben auf " +
                    unterschieds_beschraenkung + " beschränkt");
                    System.out.println("Bitte achten sie darauf das der unterschied der start zahl und der zu erreichender zahl nicht mehr als " +
                    unterschieds_beschraenkung + " ist");
                    start_zahl = inputInt("Geben Sie eine neue anfangs zahl ein: ");
                    zu_erreichender_zahl = inputInt("Geben Sie eine neue zu erreichender zahl ein: ");
                }
        } while (start_zahl < 0 || zu_erreichender_zahl < 0 || start_zahl > zu_erreichender_zahl || zu_erreichender_zahl - start_zahl > unterschieds_beschraenkung || start_zahl > 46 || zu_erreichender_zahl > 46);
        
        // Calculation
        if (ergebnis == start_zahl && start_zahl == 0) {
                System.out.println(ergebnis + " ist die fibonacci zahl von " + zaehler);
            }

        do {
            if (wechsel_zahl == 0) {
                ergebnis = zahl1 + zahl2;
                zahl1 = ergebnis;
                wechsel_zahl = wechsel_zahl + 1;
                zaehler = zaehler + 1;
                    if (zaehler >= start_zahl) {
                        System.out.println(ergebnis + " ist die fibonacci zahl von " + zaehler);
                    }
                    if (zaehler >= zu_erreichender_zahl) {
                        break;
                    }
            } else {
                ergebnis = zahl1 + zahl2;
                zahl2 = ergebnis;
                wechsel_zahl = wechsel_zahl - 1;
                zaehler = zaehler + 1;
                    if (zaehler >= start_zahl) {
                        System.out.println(ergebnis + " ist die fibonacci zahl von " + zaehler);
                    }
            }
        } while (zaehler < zu_erreichender_zahl);
    }
}
