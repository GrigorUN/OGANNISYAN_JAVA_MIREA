package Practika14;

import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String input1 = "abcdefghijklmnopqrstuv18340";
        String input2 = "abcdefghijklmnoasdfasdpqrstuv18340";

        String regex = "abcdefghijklmnopqrstuv18340";

        // Проверка первой строки
        if (Pattern.matches(regex, input1)) {
            System.out.println("Строка '" + input1 + "' соответствует шаблону.");
        } else {
            System.out.println("Строка '" + input1 + "' не соответствует шаблону.");
        }

        // Проверка второй строки
        if (Pattern.matches(regex, input2)) {
            System.out.println("Строка '" + input2 + "' соответствует шаблону.");
        } else {
            System.out.println("Строка '" + input2 + "' не соответствует шаблону.");
        }
    }
}
