import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Инициализируем переменные для суммы, минимума и максимума.
        int sum = 0;
        int min = numbers[0]; // Предполагаем, что первый элемент - минимум.
        int max = numbers[0]; // Предполагаем, что первый элемент - максимум.

        // Используем цикл do-while для вычисления суммы.
        int i = 0;
        do {
            sum += numbers[i];
            i++;
        } while (i < size);

        // Используем цикл while для поиска минимума и максимума.
        i = 1; // Начинаем сравнение с элемента с индексом 1.
        while (i < size) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
            i++;
        }

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " + max);

        scanner.close();
    }
}
