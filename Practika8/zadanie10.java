package Practika8;

import java.util.Scanner;

public class zadanie10 {
    public static int reverse(int n) {
        if (n < 10) {
            return n; // Базовый случай: если число однозначное, то просто возвращаем его
        } else {
            int lastDigit = n % 10; // Получаем последнюю цифру числа
            int remainingDigits = n / 10; // Получаем оставшиеся цифры числа
            int reversedNumber = reverse(remainingDigits); // Рекурсивно разворачиваем оставшиеся цифры
            int orderOfMagnitude = (int) Math.pow(10, (int) Math.log10(n)); // Определяем порядок числа
            return lastDigit * orderOfMagnitude + reversedNumber; // Собираем развернутое число
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: " );
        int n = scanner.nextInt(); // Здесь введите ваше число
        int reversed = reverse(n);
        System.out.println("Разворот числа " + n + " равен " + reversed);

        scanner.close();
    }
}
