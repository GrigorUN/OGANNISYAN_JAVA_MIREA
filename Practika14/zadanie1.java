package Practika14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class zadanie1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку для разбивки:");
        String inputString = scanner.nextLine();

        System.out.println("Введите регулярное выражение:");
        String regex = scanner.nextLine();

        разбитьСтроку(inputString, regex);

        scanner.close();
    }

    private static void разбитьСтроку(String строка, String регулярноеВыражение) {
        Pattern pattern = Pattern.compile(регулярноеВыражение);
        Matcher matcher = pattern.matcher(строка);

        System.out.println("Элементы строки:");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
