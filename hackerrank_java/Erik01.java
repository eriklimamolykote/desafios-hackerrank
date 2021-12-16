package hackerrank_java;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Erik01 {
    public static void main(String args[]) {
        // Scan the number a user inputs
        Scanner scan = new Scanner(System.in);
        // This counts overall amount of numbers
        int numberCount = Integer.parseInt(scan.nextLine());
        // Creates an array for the numbers entered
        int arr[] = new int[numberCount];
        
        // Array iteration
        for (int i = 0; i < numberCount; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();

        // Amount of positive numbers
        double positiveCount = 0;
        // Amount of negative numbers
        double negativeCount = 0;
        // Amount of zeros
        double zeroCount = 0;

        // These steps verify either a number is positive, negative or zero 
        // and increment each counter by 1
        for (int i = 0; i < numberCount; i++) {
            if (arr[i] > 0) {
                positiveCount = positiveCount + 1;
            }

            else if (arr[i] < 0) {
                negativeCount = negativeCount + 1;
            }

            else {
                zeroCount = zeroCount + 1;
            }
        }

        // These steps print the results for the amount of positive numbers, 
        // the amount of negative numbers and the amount of zeros
        DecimalFormat decimalFormat = new DecimalFormat("#.000");
        System.out.println(decimalFormat.format(positiveCount / numberCount));
        System.out.println(decimalFormat.format(negativeCount / numberCount));
        System.out.println(decimalFormat.format(zeroCount / numberCount));
    }
}