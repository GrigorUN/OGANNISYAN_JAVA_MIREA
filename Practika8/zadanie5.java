package Practika8;

import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int number = scanner.nextInt();
        int sum = calculateSumOfDigits(number);
        System.out.println("Сумма цифр числа " + number + " равна " + sum);

        // Закрываем Scanner после использования.
        scanner.close();
    }

    public static int calculateSumOfDigits(int n) {
        if (n < 10) {
            return n; // Базовый случай: если число однозначное, то сумма равна самому числу.
        } else {
            int lastDigit = n % 10; // Получаем последнюю цифру числа.
            int remainingDigits = n / 10; // Получаем все остальные цифры числа.
            return lastDigit + calculateSumOfDigits(remainingDigits); // Рекурсивно вызываем функцию для остальных цифр.
        }
    }
}
