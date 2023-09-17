package Practika3;

import java.util.Arrays;
import java.util.Random;

public class zadanie1 {
    public static void main(String[] args) {
        int arraySize = 10; // Размер массива
        double[] randomArray1 = new double[arraySize];
        double[] randomArray2 = new double[arraySize];

        // Генерация случайных чисел с использованием метода random() класса Math
        for (int i = 0; i < arraySize; i++) {
            randomArray1[i] = Math.random();
        }

        // Генерация случайных чисел с использованием класса Random
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            randomArray2[i] = random.nextDouble();
        }

        // Вывод исходных массивов на экран
        System.out.println("Исходный массив (Math.random()): " + Arrays.toString(randomArray1));
        System.out.println("Исходный массив (Random): " + Arrays.toString(randomArray2));

        // Сортировка массивов
        Arrays.sort(randomArray1);
        Arrays.sort(randomArray2);

        // Вывод отсортированных массивов на экран
        System.out.println("Отсортированный массив (Math.random()): " + Arrays.toString(randomArray1));
        System.out.println("Отсортированный массив (Random): " + Arrays.toString(randomArray2));
    }
}

