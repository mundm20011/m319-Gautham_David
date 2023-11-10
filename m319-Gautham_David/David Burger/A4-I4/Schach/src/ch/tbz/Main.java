// Defines package
package ch.tbz;

// Imports libraries
import static java.lang.System.*;   // System-IO Library for abbriviation purpose to static functions
//import static java.lang.Math.*;     // Mathematic Library for abbriviation purpose to static functions
//import java.util.*;                 // Random is part of this library

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

        String[] position = {" 8 ", "A8", "B8", "C8", "D8", "E8", "F8", "G8", "H8", 
                            " 7 ", "A7", "B7", "C7", "D7", "E7", "F7", "G7", "H7", 
                            " 6 ", "A6", "B6", "C6", "D6", "E6", "F6", "G6", "H6", 
                            " 5 ", "A5", "B5", "C5", "D5", "E5", "F5", "G5", "H5", 
                            " 4 ", "A4", "B4", "C4", "D4", "E4", "F4", "G4", "H4", 
                            " 3 ", "A3", "B3", "C3", "D3", "E3", "F3", "G3", "H3", 
                            " 2 ", "A2", "B2", "C2", "D2", "E2", "F2", "G2", "H2", 
                            " 1 ", "A1", "B1", "C1", "D1", "E1", "F1", "G1", "H1", 
                            " - ", " A ", " B ", " C ", " D ", " E ", " F ", " G ", " H "};

        List<String> positionList  = Arrays.asList(position);
        int indexvon = positionList.indexOf("E8");
        int indexnach = positionList.indexOf("E7");

        /*String koenig = "König kg";
        String dame = "Dame 9 d9";
        String turm = "Turm 5 t5";
        String laeufer = "Läufer 3 l3";
        String springer = "Springer 3 s3";
        String bauer = "Bauer 1 b1";*/
        String picker;
        
        String spielStart = inputString("bitte geben sie spielStart ein");

        if (spielStart.equals("spielStart")) {                                      //Bug Die Felder sind so fest an die Figur Gebunden
            brett[10] = "bXs"; brett[11] = "bOs"; brett[12] = "bXs"; brett[13] = "bOs";
            brett[14] = "bXs"; brett[15] = "bOs"; brett[16] = "bXs"; brett[17] = "bOs";

            brett[55] = "bOw"; brett[56] = "bXw"; brett[57] = "bOw"; brett[58] = "bXw";
            brett[59] = "bOw"; brett[60] = "bXw"; brett[61] = "bOw"; brett[62] = "bXw";
            
            brett[1] = "tOs"; brett[2] = "sXs"; brett[3] = "lOs"; brett[4] = "kXs";
            brett[5] = "dOs"; brett[6] = "lXs"; brett[7] = "sOs"; brett[8] = "tXs";

            brett[64] = "tXw"; brett[65] = "sOw"; brett[66] = "lXw"; brett[67] = "dOw";
            brett[68] = "kXw"; brett[69] = "lOw"; brett[70] = "sXw"; brett[71] = "tOw";
        }

        int brettSize = brett.length;
        int teiler = 0;
        
        List<String> siegesBedingung  = Arrays.asList(brett);
        String zielSchwarz = "kXw";
        String zielWeiss = "kXs";
        int zaehlerWeiss = Collections.frequency(siegesBedingung, zielSchwarz);
        int zaehlerSchwarz = Collections.frequency(siegesBedingung, zielWeiss);
        System.out.println(zielSchwarz + " " + zaehlerWeiss);
        System.out.println(zielWeiss + " " + zaehlerSchwarz);
        

        do {
        zaehlerWeiss = Collections.frequency(siegesBedingung, zielSchwarz);
        zaehlerSchwarz = Collections.frequency(siegesBedingung, zielWeiss);
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
            indexvon = positionList.indexOf(vonFeld);
            String nachFeld = inputString("bitte geben sie ein zu welchen feld die figur gehen soll");
            indexnach = positionList.indexOf(nachFeld);

            picker = brett[indexvon];
            //Bauer Validirung
            if (brett[indexvon] == "bXs" || brett[indexvon] == "bOs") {
                if (indexnach == indexvon + 9) {
                    brett[indexnach] = picker;
                }
                else {
                    zaehlerSchwarz = 0;
                }
            }
            if (brett[indexvon] == "bXw" || brett[indexvon] == "bOw") {
                if (indexnach == indexvon - 9) {
                    brett[indexnach] = picker;
                }
                else {
                    zaehlerSchwarz = 0;
                }
            }
            //Springer Validirung
            if (brett[indexvon] == "sXs" || brett[indexvon] == "sOs") {
                if (indexnach == indexvon + 11 || indexnach == indexvon + 7 ||
                    indexnach == indexvon + 19 || indexnach == indexvon + 13) {
                    brett[indexnach] = picker;
                }
                else {
                    zaehlerSchwarz = 0;
                }
            }
            brett[indexvon] = " O ";
        } while (zaehlerSchwarz == 1 && zaehlerWeiss == 1);

        /*System.out.println(Arrays.toString(brett));
        System.out.println(Arrays.toString(brett));*/

        


        out.println();
        System.out.println(indexvon);
        System.out.println(indexnach);

        // Input

    }
}
