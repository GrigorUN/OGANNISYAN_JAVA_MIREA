package Practika3;

import java.util.Random;

public class zadanie2 {
    public static void main(String[] args) {
        int[] randomArray = new int[2]; // Создаем массив из 4 элементов

        // Генерируем случайные целые числа от 10 до 99 и заполняем массив
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(90) + 10; // Генерируем от 10 до 99
        }

        // Выводим массив на экран
        System.out.print("Массив: ");
        for (int number : randomArray) {
            System.out.print(number + " ");
        }
        System.out.println(); // Переходим на новую строку

        // Проверяем, является ли массив строго возрастающей последовательностью
        boolean isIncreasing = true;
        for (int i = 1; i < randomArray.length; i++) {
            if (randomArray[i] <= randomArray[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        // Выводим результат
        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}
