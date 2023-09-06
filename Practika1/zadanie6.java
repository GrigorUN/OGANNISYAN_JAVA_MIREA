public class zadanie6{
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда:");

        for (int i = 1; i <= 10; i++) {
            double harmonicNumber = 1.0 / i; // Рассчитываем очередное число гармонического ряда.
            System.out.printf("Число %d: %.4f%n", i, harmonicNumber);
        }
    }
}
