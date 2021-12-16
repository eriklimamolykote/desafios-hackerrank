package hackerrank_java;
// Java - Inheritance II

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Write your code here
class Arithmetic {

    int add( int number1, int number2 ) {

        return number1 + number2;

    }

}

class Adder extends Arithmetic {}

public class Erik31 {

    public static void main( String[] args ) {

        // Create a new Adder object
        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println( "My superclass is: " + 
            a.getClass().getSuperclass().getName() );

        // Print the result of 3 call to Adder's 'add (int, int)' method as 
        // 3 space-separated integers:
        System.out.println( a.add( 10, 32 ) + " " + 
            a.add( 10, 3 ) + " " + a.add( 10, 10 ) + "\n" );

    }
    
}