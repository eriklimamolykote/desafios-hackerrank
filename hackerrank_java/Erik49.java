package hackerrank_java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Erik49 {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        String number1 = scan.next();
        String number2 = scan.next();
        BigInteger numberA = new BigInteger( number1 );
        BigInteger numberC = new BigInteger( number2 );

        System.out.println( numberA.add( numberC ) );
        System.out.println( numberA.multiply( numberC ) );
        
    }

}
