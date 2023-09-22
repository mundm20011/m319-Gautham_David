package ch.tbz;

import static ch.tbz.lib.Input.*;       // All the functions can be used now!

public class TestKonv {
    public static void main(String[] args) {
        double d;
        do {
            d = inputDouble("Geben Sie eine Testzahl ein:");

            float f = (float) d;    // >>> explicit conversion to float
            int i   =   (int) d;    // >>> explicit conversion to int
            byte b  =  (byte) d;    // >>> explicit conversion to byte
            char c  =  (char) d;    // >>> explicit conversion to char  // Alt-Code?

            System.out.println("Double value " + d);
            System.out.println("Float  value " + f);
            System.out.println("Int    value " + i);
            System.out.println("Byte   value " + b);
            System.out.println("Char   value \'" + c + "\'\n\n");
        } while( d != 0 );
    }
}
