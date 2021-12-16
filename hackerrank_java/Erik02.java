package hackerrank_java;
import java.util.*;

public class Erik02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long sum = 0;
        long minimum = 1000000000;
        long maximum = 0;

        while (scan.hasNext()) {

            long n = scan.nextLong();
            sum = sum + n;

            if (minimum > n) {

                minimum = n;

            }

            if (maximum < n) {

                maximum = n;

            }
        }

        scan.close();

        System.out.println((sum - maximum) + " " + (sum - minimum));
        
    }
}