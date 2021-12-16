// Java - Date and time

package hackerrank_java;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /** 
     * Complete the 'findDay' function below.
     * 
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

     public static String findDay( int month, int day, int year ) {

        Calendar calendar = Calendar.getInstance();

        calendar.set( Calendar.MONTH, month - 1 );
        calendar.set( Calendar.DAY_OF_MONTH, day );
        calendar.set( Calendar.YEAR, year );

        String dayOfWeek = calendar.getDisplayName( Calendar.DAY_OF_WEEK, 
            Calendar.LONG, Locale.US ).toUpperCase();

        return dayOfWeek;    

     }
    
}

public class Erik33 {

    public static void main( String[] args ) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( 
            new InputStreamReader( System.in ) );

        BufferedWriter bufferedWriter = new BufferedWriter( 
            new FileWriter( System.getenv( "OUTPUT_PATH" ) ) );
            
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll(
            "\\s+$", "" ).split( " " );

        int month = Integer.parseInt( firstMultipleInput[ 0 ] );
        int day = Integer.parseInt( firstMultipleInput[ 1 ] );
        int year = Integer.parseInt( firstMultipleInput[ 2 ] );

        String res = Result.findDay( month, day, year );

        bufferedWriter.write( res );
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

    }    

}