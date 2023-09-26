package Practika4_1;

public class zadanie2 {
    private String number;
    private String model;
    private double weight;

    // Конструктор с тремя параметрами
    public zadanie2(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Конструктор с двумя параметрами (вызывает конструктор с тремя параметрами)
    public zadanie2(String number, String model) {
        this(number, model, 0.0); // По умолчанию устанавливаем вес в 0.0
    }

    // Конструктор без параметров (вызывает конструктор с двумя параметрами)
    public zadanie2() {
        this("Unknown", "Unknown");
    }

    // Метод receiveCall с одним параметром (имя звонящего)
    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    // Перегруженный метод receiveCall с двумя параметрами (имя звонящего и номер телефона)
    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + " (" + callerNumber + ")");
    }

    // Метод getNumber возвращает номер телефона
    public String getNumber() {
        return number;
    }

    // Метод sendMessage с аргументами переменной длины (номера телефонов)
    public void sendMessage(String... phoneNumbers) {
        System.out.println("Отправить сообщение на следующие номера:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }

    // Метод для вывода информации о телефоне
    public void displayPhoneInfo() {
        System.out.println("Номер: " + number);
        System.out.println("Модель: " + model);
        System.out.println("Вес: " + weight + " грамм");
    }

    public static void main(String[] args) {
        zadanie2 phone1 = new zadanie2("123-456-789", "iPhone 15", 162.3);
        zadanie2 phone2 = new zadanie2("987-654-321", "Samsung Galaxy S23", 182.3);
        zadanie2 phone3 = new zadanie2("111-222-333", "NothingPhone", 177.3);

        phone1.displayPhoneInfo();
        phone2.displayPhoneInfo();
        phone3.displayPhoneInfo();

        phone1.receiveCall("Анна");
        phone2.receiveCall("Петр", "555-777-999");
        phone3.receiveCall("Неизвестный");

        phone1.sendMessage("111-222-333", "444-555-666");
    }
}
