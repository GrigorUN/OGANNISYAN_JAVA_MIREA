import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Введите элемент массива:");
        int sum = 0;
        for (int i = 0; i < size; i++){
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
    }
}