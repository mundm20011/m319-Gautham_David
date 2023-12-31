/*Celsius – Fahrenheit Berechner
Schreiben Sie ein Programm, das dem Benutzer erlaubt, entweder die Grad in
Celcius oder Fahrenheit zu berechnen. Überlegen Sie sich zuerst, welche
Datentypen Sie verwenden sollten.
Geben Sie eine Meldung aus, wenn die Temperatur unter 0℃ (Gefrierpunkt), oder 100℃ (Siedepunkt) ist! */
//273,15=0°
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

			//eingabe auswahl:
			System.out.print("Bitte geben sie ein ob sie Grad celsius->Fahrenheit oder Fahrenheit->Grad celsius erfahren wollen");
			String auswahl = inputString(" //celsius/fahrenheit: ");
			String grad = "celsius";

			//assigns a value:
			if (auswahl.equals(grad)) {
			float celsius = inputFloat("Geben sie die Temperatur in Grad Celsius ein: ");
			float fahrenheit;
			fahrenheit = (celsius * 9 / 5 + 32);
			System.out.println(celsius + "//" + fahrenheit);
				if (celsius >= 100) {
					System.out.println("Die Temperatur hat der Siedepunkt erreicht");
				} if (celsius <= 0) {
					System.out.println("Die Temperatur hat der Gefrierpunkt erreicht");
				}
			} else {
				float fahrenheit = inputFloat("Geben sie die Temperatur in grad Fahrenheit ein: ");
				float celsius;
				celsius = ((fahrenheit - 32) * 5 / 9);
				System.out.println(fahrenheit + "//" + celsius);
				if (celsius >= 100) {
					System.out.println("Die Temperatur hat der Siedepunkt erreicht");
				} if (celsius <= 0) {
					System.out.println("Die Temperatur hat der Gefrierpunkt erreicht");
				}
			}

			//calculates results:
			//fahrenheit = (celsius * 9 / 5 + 32);

			//System.out.println(celsius + "//" + fahrenheit);

			//print out using the System libary:
			//System.out.println(celsius + " celsius is " + fahrenheit + " fahrenheit.");
		}
}
