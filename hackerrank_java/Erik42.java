package hackerrank_java;

import java.io.*;
import java.util.*;

public class Erik42 {

    public static void main( String[] args ) {

        /* Enter your code here. Read input from STDIN.
            Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner( System.in );
        
        while ( in.hasNext() ) {

            String IP = in.next();
            System.out.println( IP.matches( new MyRegex().pattern));
        }

    }

}

/* Code */
class MyRegex {

    String ip0to255 = "(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";
    
    public String pattern = ip0to255 + "\\." + ip0to255 + "\\." + ip0to255 + "\\." + ip0to255; 
    
}