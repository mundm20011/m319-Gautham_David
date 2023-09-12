// Defines package
package ch.tbz;

// Imports libraries
//import static java.lang.System.*;   // System-IO Library for abbriviation purpose to static functions
//import static java.lang.Math.*;     // Mathematic Library for abbriviation purpose to static functions
import java.util.*;                 // Random is part of this library

// Imports Input functions
import static ch.tbz.lib.Input.*;       // All the functions can be used now!

//Every program must be placed in a class ...
public class Main {

    // Our main function which runs the program12
    public static void main(String[] args ) {

        //What do you want to train? +, - or * ?
        //Users enters +
        //35 + 55 = ?
        //Enter the second number:55
        //Users enters 80
        //WRONG: The Result is 90
        //Do you want to test again? Yes or no?
        //Users enters no
        //Okay, goodbye!


        Random random = new Random();
        //Calling the nextInt() method
        int zahl1;
        int zahl2;
        int lösung;
        String wiederholen;

        lösung = 0+0;
        
        do {
            String operator = inputString("What do you want to train? +, - or * ?");
            do {
                zahl1 = random.nextInt(101);
                zahl2 = random.nextInt(101);
                if (operator.equals("+")) {
                    lösung = zahl1 + zahl2;
                } if (operator.equals("-")) {
                    lösung = zahl1 - zahl2;
                } if (operator.equals("*")) {
                    lösung = zahl1 * zahl2;
                }
            } while (lösung > 100);
            if (operator.equals("+")) {
                System.out.println(zahl1 + " + " + zahl2 + " = ?");
            } if (operator.equals("-")) {
                System.out.println(zahl1 + " - " + zahl2 + " = ?");
            } if (operator.equals("*")) {
                System.out.println(zahl1 + " * " + zahl2 + " = ?");
            }
            int ergebnis = inputInt("Enter the second number: ");
            System.out.println("Users enters " + ergebnis);
            if (ergebnis == lösung) {
                System.out.println("RIGHT: The Result is " + lösung);    
            } else {
                System.out.println("WRONG: The Result is " + lösung);
            }
            wiederholen = inputString("Do you want to test again? Yes or no?");
        } while (wiederholen.equals("yes"));
        System.out.println("Okay, goodbye!");
    }
}
