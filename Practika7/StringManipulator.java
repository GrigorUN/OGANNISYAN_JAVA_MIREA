package Practika7;

public interface StringManipulator {
    // Метод для подсчета символов в строке
    int countCharacters(String s);
    
    // Метод для возвращения строки, состоящей из символов на нечетных позициях
    String oddPositionCharacters(String s);
    
    // Метод для инвертирования строки
    String reverseString(String s);
}