package hackerrank_java;

import java.util.Scanner;

public class Erik37 {

    public static String getSmallestAndLargest( String s, int k ) {

        String smallest = "";
        String largest = "";

        java.util.List<String> a = new java.util.ArrayList<>();

        for ( int i = 0; i < s.length() - k + 1; i++ ) {

            a.add( s.substring( i, i + k ) );

        }

        java.util.Collections.sort( a );
        smallest = a.get( 0 );
        largest = a.get( a.size() - 1 );

        return smallest + "\n" + largest;
    }
    
}
