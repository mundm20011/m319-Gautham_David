// Defines package
package ch.tbz;

// Imports libraries
import static java.lang.System.*;   // System-IO Library for abbriviation purpose to static functions
//import static java.lang.Math.*;     // Mathematic Library for abbriviation purpose to static functions
//import java.util.*;                 // Random is part of this library

// Imports Input functions
import static ch.tbz.lib.Input.*;       // All the functions can be used now!

//Every program must be placed in a class ...
public class Main {

    // Our main function which runs the program12
    public static void main(String[] args ) {

        // Title
        // schachbrett 8*8
        // jede Figur hat einen Wert
        // Darsstellung O = Weiss
        // Darsstellung X = Schwarz
        // Darsstellung Erste Buchstabe der Figur + ihr wert
        // Darsstellung der Figur Bauer B1

        // O && X kann ich mit hilfe von findInString rausfinden was für ein feld (für Validierung beispiel läufer)
        // bezeichnung b,s,l,t,d,k kann ich für findInString Validierung nutzen

        String[] brett = {" 8 ", " O ", " X ", " O ", " X ", " O ", " X ", " O ", " X ", 
                            " 7 ", " X ", " O ", " X ", " O ", " X ", " O ", " X ", " O ", 
                            " 6 ", " O ", " X ", " O ", " X ", " O ", " X ", " O ", " X ", 
                            " 5 ", " X ", " O ", " X ", " O ", " X ", " O ", " X ", " O ", 
                            " 4 ", " O ", " X ", " O ", " X ", " O ", " X ", " O ", " X ", 
                            " 3 ", " X ", " O ", " X ", " O ", " X ", " O ", " X ", " O ", 
                            " 2 ", " O ", " X ", " O ", " X ", " O ", " X ", " O ", " X ", 
                            " 1 ", " X ", " O ", " X ", " O ", " X ", " O ", " X ", " O ", 
                            " - ", " A ", " B ", " C ", " D ", " E ", " F ", " G ", " H "};

        /*String koenig = "König kg";
        String dame = "Dame 9 d9";
        String turm = "Turm 5 t5";
        String laeufer = "Läufer 3 l3";
        String springer = "Springer 3 s3";
        String bauer = "Bauer 1 b1";*/
        String picker;
        
        String neuesSpiel = inputString("bitte geben sie neuesSpiel ein");

        if (neuesSpiel.equals("neuesSpiel")) {
            brett[10] = "bX1"; brett[11] = "bO1"; brett[12] = "bX1"; brett[13] = "bO1";
            brett[14] = "bX1"; brett[15] = "bO1"; brett[16] = "bX1"; brett[17] = "bO1";

            brett[55] = "bO1"; brett[56] = "bX1"; brett[57] = "bO1"; brett[58] = "bX1";
            brett[59] = "bO1"; brett[60] = "bX1"; brett[61] = "bO1"; brett[62] = "bX1";
            
            brett[1] = "tO5"; brett[2] = "sX3"; brett[3] = "lO3"; brett[4] = "kXg";
            brett[5] = "dO9"; brett[6] = "lX3"; brett[7] = "sO3"; brett[8] = "tX5";

            brett[64] = "tX5"; brett[65] = "sO3"; brett[66] = "lX3"; brett[67] = "dO9";
            brett[68] = "kXg"; brett[69] = "lO3"; brett[70] = "sX3"; brett[71] = "tO5";
        }

        int brettSize = brett.length;
        int teiler = 0;

        for (int i = 0; i < brettSize; i++) {
            /*if (i == 8 || i == 17 || i == 26 || i == 35 || i == 44 || i == 53 || i == 62 || i == 71 || i == 80) {
                System.out.println(brett[i]);
            }*/
            if (teiler == 8) {
                System.out.println(brett[i]);
                System.out.println("___________________________________");
                teiler = 0;
            }
            else {
                System.out.print(brett[i]);
                System.out.print("|");
                teiler = teiler + 1;
            }
        };
            String vonFeld = inputString("bitte geben sie ein von welchen Feld sie bewegen");
            String nachFeld = inputString("bitte geben sie ein zu welchen feld die figur gehen soll");

            if (vonFeld.equals("A2")) {
                picker = brett[55];
                brett[55] = " O ";
                if (nachFeld.equals("A3")) {
                    brett[46] = picker;
                }
            }

            for (int i = 0; i < brettSize; i++) {
                /*if (i == 8 || i == 17 || i == 26 || i == 35 || i == 44 || i == 53 || i == 62 || i == 71 || i == 80) {
                    System.out.println(brett[i]);
                }*/
                if (teiler == 8) {
                    System.out.println(brett[i]);
                    System.out.println("___________________________________");
                    teiler = 0;
                }
                else {
                    System.out.print(brett[i]);
                    System.out.print("|");
                    teiler = teiler + 1;
                }
            }

        /*System.out.println(Arrays.toString(brett));
        System.out.println(Arrays.toString(brett));*/

        
        out.println();

        // Input

    }
}
