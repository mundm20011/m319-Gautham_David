// Defines package
package ch.tbz;

// Imports libraries
import java.util.*;                 // Random is part of this library

// Imports Input functions

//Every program must be placed in a class ...
public class ZahlenScannerA {

    // Our main function which runs the program12
    public static void main(String[] args) {
        //include scanner for reading input
        Scanner scan = new Scanner(System.in);
    
        int input; //declare variable
    
        System.out.println("Geben Sie eine Zahl zwischen 2 und 6 ein:");
    
        input = scan.nextInt();
    
        if ((input >= 2) && (input <= 6)) {
            int zaehler = 0;
            for (int i = -5; i < 5; i++) {
                zaehler = zaehler + i + input;
                System.out.println(zaehler);
            }
    
        } else {
            System.err.println("Achtung, falsche Eingabe!");
        }
        System.out.println("und fertig");
    
        scan.close();
    }
}
