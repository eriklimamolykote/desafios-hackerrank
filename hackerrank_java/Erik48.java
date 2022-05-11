package hackerrank_java;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Erik48 {

    public static void main( String[] args ) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );
        List<List<Integer>> arr = new ArrayList<>();

        for ( int i = 0; i < 6; i++ ) {

            String[] arrRowTempItems = bufferedReader.readLine().replaceAll( "\s+$", "" ).split( " " );
            List<Integer> arrRowsItems = new ArrayList<>();

            for ( int j = 0; j < 6; j++ ) {

                int arrItem = Integer.parseInt( arrRowTempItems[ j ] );
                arrRowItems.add( arrItem );

            }

            arr.add( arrRowItems );

        }

        // find the max value
        int max = Integer.MIN_VALUE;

        for ( int k = 0; k < 4; k++ ) {

            for ( int l = 0; l < 4; l++ ) {

                int current = 0;

                for ( int m = 0; m < 3; m++ ) {

                    for ( int n = 0; n < 3; n++ ) {

                        if ( !( m == 1 && n%2 == 0 ) ) {

                            current += arr.get( k + m ).get( l + n );

                        }

                    }

                }

                if ( current > max ) {

                    max = current;

                }

            }

        }

        System.out.println( max );

        bufferedReader.close();

    }
    
}
