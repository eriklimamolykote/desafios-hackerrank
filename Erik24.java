import java.util.Scanner;

// Java - End of file
// The challenge here is to read n lines of input until you reach EOF, then number 
// and print all N lines of content.
// Hint: Java's Scanner.hasNext() method is helpful for this problem.

public class Erik24 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int i = 1; scan.hasNext() == true; i++) {

            System.out.println(i + " " + scan.nextLine());

        }

    }
    
}