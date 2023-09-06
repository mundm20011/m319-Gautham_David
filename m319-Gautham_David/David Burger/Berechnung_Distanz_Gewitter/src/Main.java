/*Berechnung Distanz Gewitter
Schreiben Sie eine Klasse GewitterBerechner, der die Entfernung eines
Gewitters berechnet.
Die schallSchallgeschwindigkeit in Luft beträgt etwa 344 m/s (Meter pro Sekunde).
Lassen Sie den Benutzer die entsprechenden Sekunden eingeben.
Welche Datentypen verwenden wir für die Variablen?
Wiederholen Sie die Berechnung, wenn der Benutzer dies wünscht (Do ... while) */

// Defines package
//package ch.tbz;

// Imports libraries

// Imports Input functions
import static lib.Input.*;       // All the functions can be used now!

//Every program must be placed in a class ...
public class Main {

    //our main function which runs the program
		public static void main( String[] args ) {

			//definition variables:
			double sekunde = inputDouble("bitte geben die sekunden ein");
			double schallgeschwindigkeit;
			double distanz;

			//assigns a value:
			distanz = 0;

			//calculates results:
			schallgeschwindigkeit = distanz / 3.7854;
			schallgeschwindigkeit = 344;
			distanz = schallgeschwindigkeit * sekunde;

			while (distanz < 100) {
				distanz = distanz + 1;
				if (distanz == 10 || distanz == 20 || distanz == 30 || distanz == 40 || distanz == 50 || distanz == 60 || distanz == 70 || distanz == 80 || distanz == 90) {
					//System.out.println(distanz + " distanz is " + schallgeschwindigkeit + " schallgeschwindigkeit.");
					System.out.println(distanz + "/" + schallgeschwindigkeit + "//");
				} else {
				//System.out.print(distanz + " distanz is " + schallgeschwindigkeit + " schallgeschwindigkeit.");
				System.out.print(distanz + "/" + schallgeschwindigkeit + "//");
				}
			}

			//print out using the System libary:
			//System.out.println(distanz + " distanz is " + schallgeschwindigkeit + " schallgeschwindigkeit.");
		}
}