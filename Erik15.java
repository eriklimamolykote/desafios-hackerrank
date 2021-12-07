import java.util.Scanner;

// Java - Loops II
// You are given q queries in the form a, b and n. For each query, print the
// series corresponding to the given a, b and n values as a single line of n
// space-separated integers.

public class Erik15 {

    public static void main(String[] argh) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int c = a;

            for (int j = 0; j < n; j++) {
                c += Math.pow(2, j) * b;
                System.out.printf("%s ", c);
            }

            System.out.println();
        }

        in.close();
    }   
}