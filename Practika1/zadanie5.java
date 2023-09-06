public class zadanie5 {
    public static void main(String[] args) {
        System.out.println("Аргументы командной строки:");

        // Используем цикл for для перебора аргументов командной строки.
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
        }
    }

}
