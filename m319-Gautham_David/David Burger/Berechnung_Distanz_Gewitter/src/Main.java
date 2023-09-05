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
			double celsius;
			double fahrenheit;

			//assigns a value:
			celsius = 0;

			//calculates results:
			fahrenheit = celsius * 9 / 5 + 32;

			while (celsius < 100) {
				celsius = celsius + 1;
				if (celsius == 10 || celsius == 20 || celsius == 30 || celsius == 40 || celsius == 50 || celsius == 60 || celsius == 70 || celsius == 80 || celsius == 90) {
					//System.out.println(celsius + " celsius is " + fahrenheit + " fahrenheit.");
					System.out.println(celsius + "/" + fahrenheit + "//");
				} else {
				//System.out.print(celsius + " celsius is " + fahrenheit + " fahrenheit.");
				System.out.print(celsius + "/" + fahrenheit + "//");
				}
			}

			//print out using the System libary:
			//System.out.println(celsius + " celsius is " + fahrenheit + " fahrenheit.");
		}
}
