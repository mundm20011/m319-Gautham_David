/*Celsius – Fahrenheit Berechner
Schreiben Sie ein Programm, das dem Benutzer erlaubt, entweder die Grad in
Celcius oder Fahrenheit zu berechnen. Überlegen Sie sich zuerst, welche
Datentypen Sie verwenden sollten.
Geben Sie eine Meldung aus, wenn die Temperatur unter 0℃ (Gefrierpunkt), oder 100℃ (Siedepunkt) ist! */
//fahrenheit = (celsius * 9 / 5 + 32);

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
			double fahrenheit;

			//assigns a value:
			double celsius = inputDouble("Geben sie die Temperatur in Grand Celsius ein: ");

			//calculates results:
			fahrenheit = (celsius * 9 / 5 + 32);

			System.out.println(celsius + "//" + fahrenheit);

			//print out using the System libary:
			//System.out.println(celsius + " celsius is " + fahrenheit + " fahrenheit.");
		}
}
