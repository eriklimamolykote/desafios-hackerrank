package hackerrank_java;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Erik47 {

    public static void main( String[] args ) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );
        String n = bufferedReader.readLine();
        bufferedReader.close();

        BigInteger bn = new BigInteger( n );

        if ( bn.isProbablePrime( 1 ) ) {

            System.out.println( "prime" );

        } else {

            System.out.println( "not prime" );

        }


    }
    
    
}
