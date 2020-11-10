package exercise7;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        for (int line = 1; line <= n; line++) {
            printLine(1, line);
            System.out.println();
        }

        // Print the bottom part of the triangle that is under the longest line
        for (int bottomLine = n - 1; bottomLine >= 1; bottomLine--) {
            printLine(1, bottomLine);
            if (bottomLine != 1) {
                System.out.println();
            }
        }
    }

    public static void printLine(int start, int end) {
        // Implement method
        for (int i = start; i <= end; i++) {
            if (i != end) {
                System.out.print(i + " ");
            } else {
            System.out.print(i);
            }
        }

    }
}
