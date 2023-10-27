// Defines package
package ch.tbz;

// Imports libraries
//import static java.lang.System.*;   // System-IO Library for abbriviation purpose to static functions

// Imports Input functions
//import static ch.tbz.lib.Input.*;       // All the functions can be used now!

//Every program must be placed in a class ...
public class KN_A3_SerieAe_DBurger {

    // Our main function which runs the program12
    
    public static void main(String[] args)
    {   // Custom string input
        String str = "DieserStringwirdsortiert";
        // Convertiiring string into an array for computation
        char arr[] = str.toCharArray(); // Convert to static array
        char temp;
        int i = 0;                      // Sort starts at the beginning
        while (i < arr.length) {        // outer loop i
            int j = i + 1;              // j is next character in row
            while (j < arr.length) {    // inner loop j till the end
                if (arr[j] < arr[i]) {  // Comparing the characters one by one
                    temp = arr[i];      // Swap characters if second is "smaller"
                    arr[i] = arr[j];    // this takes "smaller" char to front
                    arr[j] = temp;
                }
                j += 1;                 // get next character to compare
            }
            i += 1;                     // get next character to sort
        }
        // Output sorted Array
        System.out.println(arr);
    }
}