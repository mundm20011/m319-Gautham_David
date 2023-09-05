/*Berechnung Distanz Gewitter
Schreiben Sie eine Klasse GewitterBerechner, der die Entfernung eines
Gewitters berechnet.
Die Schallgeschwindigkeit in Luft beträgt etwa 344 m/s (Meter pro Sekunde).
Lassen Sie den Benutzer die entsprechenden Sekunden eingeben.
Welche Datentypen verwenden wir für die Variablen?
Wiederholen Sie die Berechnung, wenn der Benutzer dies wünscht (Do ... while) */

// Defines package
//package ch.tbz;

// Imports libraries

// Imports Input functions
//import static lib.Input.*;       // All the functions can be used now!

//Every program must be placed in a class ...
public class Main {

    //our main function which runs the program
		public static void main( String[] args ) {

			//definition variables:
			double gallons;
			double litres;

			//assigns a value:
			gallons = 0;

			//calculates results:
			litres = gallons / 3.7854;

			while (gallons < 100) {
				gallons = gallons + 1;
				if (gallons == 10 || gallons == 20 || gallons == 30 || gallons == 40 || gallons == 50 || gallons == 60 || gallons == 70 || gallons == 80 || gallons == 90) {
					//System.out.println(gallons + " gallons is " + litres + " litres.");
					System.out.println(gallons + "/" + litres + "//");
				} else {
				//System.out.print(gallons + " gallons is " + litres + " litres.");
				System.out.print(gallons + "/" + litres + "//");
				}
			}

			//print out using the System libary:
			//System.out.println(gallons + " gallons is " + litres + " litres.");
		}
}