package Practika6;

import java.util.Scanner;

interface Convertable {
    double convert(double value);
}

class TemperatureConverter implements Convertable {
    @Override
    public double convert(double celsius) {
        double kelvin = celsius + 273.15; // Формула для перевода в Кельвины
        double fahrenheit = (celsius * 9/5) + 32; // Формула для перевода в Фаренгейты

        System.out.println(celsius + " градусов Цельсия равно " + kelvin + " Кельвинам.");
        System.out.println(celsius + " градусов Цельсия равно " + fahrenheit + " Фаренгейтам.");

        return kelvin; // Можете вернуть другое значение, если нужно
    }
}

public class zadanie11 {
    public static void main(String[] args) {
        Convertable converter = new TemperatureConverter();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsiusTemperature = scanner.nextDouble();

        converter.convert(celsiusTemperature);
        
        scanner.close();
    }
}
