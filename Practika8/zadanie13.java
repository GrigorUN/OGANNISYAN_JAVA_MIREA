package Practika8;

import java.util.Scanner;

public class zadanie13 {
    public static void main(String[] args) {
        printOddSequenceNumbers();
    }

    public static void printOddSequenceNumbers() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int position = 1;

        do {
            number = scanner.nextInt();
            if (number != 0 && position % 2 != 0) {
                System.out.println(number);
            }
            position++;
        } while (number != 0);

        scanner.close();
    }
}
