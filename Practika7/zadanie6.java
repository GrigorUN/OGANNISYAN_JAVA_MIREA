package Practika7;

public class zadanie5 {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulatorImpl();
        String inputString = "Я УСТАЛ ЖИТЬ";
        System.out.println("Начальная строка: " + inputString);

        int characterCount = manipulator.countCharacters(inputString);
        System.out.println("Количество символов: " + characterCount);

        String oddPositionChars = manipulator.oddPositionCharacters(inputString);
        System.out.println("Символы на нечетных позициях: " + oddPositionChars);

        String reversedString = manipulator.reverseString(inputString);
        System.out.println("Инвертированная строка: " + reversedString);
    }
}
