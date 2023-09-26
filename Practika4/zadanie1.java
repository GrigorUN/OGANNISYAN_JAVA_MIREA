package Practika4;

// Перечисление (enum) для марок компьютера
enum ComputerBrand {
    HP,
    Dell,
    Lenovo,
    Asus,
    Acer
}

// Класс, описывающий процессор
class Processor {
    private String model;
    private double clockSpeed; // в гигагерцах

    public Processor(String model, double clockSpeed) {
        this.model = model;
        this.clockSpeed = clockSpeed;
    }

    // Геттеры для получения информации о процессоре
    public String getModel() {
        return model;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }
}

// Класс, описывающий память
class Memory {
    private int size; // в гигабайтах
    private String type;

    public Memory(int size, String type) {
        this.size = size;
        this.type = type;
    }

    // Геттеры для получения информации о памяти
    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }
}

// Класс, описывающий монитор
class Monitor {
    private String model;
    private double screenSize; // в дюймах

    public Monitor(String model, double screenSize) {
        this.model = model;
        this.screenSize = screenSize;
    }

    // Геттеры для получения информации о мониторе
    public String getModel() {
        return model;
    }

    public double getScreenSize() {
        return screenSize;
    }
}

// Класс, описывающий компьютер
class Computer {
    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    // Метод для вывода информации о компьютере
    public void displayComputerInfo() {
        System.out.println("Марка компьютера: " + brand);
        System.out.println("Процессор: " + processor.getModel() + ", Частота: " + processor.getClockSpeed() + " ГГц");
        System.out.println("Память: " + memory.getSize() + " ГБ, Тип: " + memory.getType());
        System.out.println("Монитор: " + monitor.getModel() + ", Размер экрана: " + monitor.getScreenSize() + " дюймов");
    }
}

public class zadanie1 {
    public static void main(String[] args) {
        // Создаем компоненты компьютера
        Processor processor = new Processor("AMD RYZEN 3600", 3.62);
        Memory memory = new Memory(16, "DDR4");
        Monitor monitor = new Monitor("HUAWEI", 24.0);

        // Создаем компьютер и выводим информацию о нем
        Computer computer = new Computer(ComputerBrand.Asus, processor, memory, monitor);
        computer.displayComputerInfo();
    }
}
