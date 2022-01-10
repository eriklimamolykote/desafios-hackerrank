package hackerrank_java;

import java.io.*;
import java.util.*;

public class Erik38 {

    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in );
        String A = sc.next();

        System.out.println( A.equals( new StringBuilder( A ).reverse().toString()) ? "Yes" : "No" );
    }
    
}
