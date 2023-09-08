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
			int zähler = 0;

			//calculates results:
			litres = gallons / 3.7854;

			while (zähler < 100) {
				gallons = gallons + 1;
				zähler = zähler + 1;
				litres = gallons / 3.7854;
				if (gallons == 10 || gallons == 20 || gallons == 30 || gallons == 40 || gallons == 50 || gallons == 60 || gallons == 70 || gallons == 80 || gallons == 90) {
					//System.out.println(gallons + " gallons is " + litres + " litres.");
					System.out.println(gallons + "/" + litres);
					System.out.println("");
				} else {
				//System.out.print(gallons + " gallons is " + litres + " litres.");
				System.out.println(gallons + "/" + litres);
				}
			}

			//print out using the System libary:
			//System.out.println(gallons + " gallons is " + litres + " litres.");
		}
}
