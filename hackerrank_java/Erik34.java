// Java - Currency formatter
// Given a double-precision number, payment, denoting an amount of money, use
// the NumberFormat class' getCurrencyInstance method to convert payment into
// the USA, Indian, Chinese and French currency formats. Then print the 
// formatted values as follows:

// US: formattedPayment
// India: formattedPayment
// China: formattedPayment
// France: formattedPayment

// where formattedPayment is payment formatted according to the appropriate 
// Locale's currency.

package hackerrank_java;

import java.util.*;
import java.text.*;

public class Erik34 {

    public static void main( String[] args ) {

        Scanner scanner = new Scanner( System.in );

        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here

        Locale INDIA = new Locale( "en", "IN" );

        String us = NumberFormat.getCurrencyInstance( Locale.US ).format( payment );
        String india = NumberFormat.getCurrencyInstance( INDIA ).format( payment );
        String china = NumberFormat.getCurrencyInstance( Locale.CHINA ).format( payment );
        String france = NumberFormat.getCurrencyInstance( Locale.FRANCE ).format( payment );

        System.out.println( "US: " + us );
        System.out.println( "India: " + india );
        System.out.println( "China: " + china );
        System.out.println( "France: " + france );

    }
    
}