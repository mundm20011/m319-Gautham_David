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
public class GewitterBerechner {

    //our main function which runs the program
		public static void main( String[] args ) {

			//definition variables:
			String weiter;
			do {
			double sekunde = inputDouble("bitte geben die sekunden ein");
			double schallgeschwindigkeit;
			double distanz;
			double distanzkm;

			//assigns a value:
			distanz = 0;
			schallgeschwindigkeit = 344;

			//calculates results:
			distanz = schallgeschwindigkeit * sekunde;
			distanzkm = distanz / 1000;
			//distanz = wie viel meter das gewiter entfernt ist

			System.out.println("Das Gewitter ist " + distanz + "m entfernt");
			System.out.println("Das Gewitter ist " + distanzkm + "km entfernt");
			weiter = inputString("Wollen sie eine weitere zahl eingeben? ");
			}
			while (weiter.equals("ja"));

			//print out using the System libary:
			//System.out.println(distanz + " distanz is " + schallgeschwindigkeit + " schallgeschwindigkeit.");
		}
}