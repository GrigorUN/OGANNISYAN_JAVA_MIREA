package Practika6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Перечисление для марок компьютеров
enum Brand {
    HP, Dell, Lenovo, Asus, Acer
}

// Класс для описания компьютера
class Computer {
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    // Геттеры для свойств компьютера
    public Brand getBrand() {
        return brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand=" + brand +
                ", processor=" + processor +
                ", memory=" + memory +
                ", monitor=" + monitor +
                '}';
    }
}

// Классы для компонентов компьютера
class Processor {
    private String model;

    public Processor(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "model='" + model + '\'' +
                '}';
    }
}

class Memory {
    private int sizeGB;

    public Memory(int sizeGB) {
        this.sizeGB = sizeGB;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "sizeGB=" + sizeGB +
                '}';
    }
}

class Monitor {
    private double sizeInches;

    public Monitor(double sizeInches) {
        this.sizeInches = sizeInches;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "sizeInches=" + sizeInches +
                '}';
    }
}

// Класс магазина
class Shop {
    private List<Computer> computers = new ArrayList<>();

    // Метод для добавления компьютера в магазин
    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    // Метод для удаления компьютера из магазина
    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    // Метод для поиска компьютера по марке
    public List<Computer> findComputersByBrand(Brand brand) {
        List<Computer> result = new ArrayList<>();
        for (Computer computer : computers) {
            if (computer.getBrand() == brand) {
                result.add(computer);
            }
        }
        return result;
    }

    // Метод для вывода всех компьютеров в магазине
    public void displayAllComputers() {
        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }
}

// Интерфейс для взаимодействия с пользователем
interface UserInput {
    Computer getComputerFromUserInput();
}

public class zadanie10 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Найти компьютер по марке");
            System.out.println("4. Показать все компьютеры");
            System.out.println("5. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Computer computer = getUserInputComputer(scanner);
                    shop.addComputer(computer);
                    System.out.println("Компьютер добавлен в магазин.");
                    break;
                case 2:
                    System.out.println("Введите марку компьютера для удаления: ");
                    String brandName = scanner.nextLine();
                    try {
                        Brand brand = Brand.valueOf(brandName);
                        List<Computer> computersToRemove = shop.findComputersByBrand(brand);
                        for (Computer computerToRemove : computersToRemove) {
                            shop.removeComputer(computerToRemove);
                        }
                        System.out.println("Компьютеры удалены.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Марка компьютера не найдена.");
                    }
                    break;
                case 3:
                    System.out.println("Введите марку компьютера для поиска: ");
                    brandName = scanner.nextLine();
                    try {
                        Brand brand = Brand.valueOf(brandName);
                        List<Computer> foundComputers = shop.findComputersByBrand(brand);
                        if (foundComputers.isEmpty()) {
                            System.out.println("Компьютеры не найдены.");
                        } else {
                            System.out.println("Найденные компьютеры:");
                            for (Computer foundComputer : foundComputers) {
                                System.out.println(foundComputer);
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Марка компьютера не найдена.");
                    }
                    break;
                case 4:
                    System.out.println("Список всех компьютеров в магазине:");
                    shop.displayAllComputers();
                    break;
                case 5:
                    System.out.println("Завершение программы.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите действие от 1 до 5.");
                    break;
            }
        }
    }

    private static Computer getUserInputComputer(Scanner scanner) {
        System.out.print("Введите марку компьютера (HP, Dell, Lenovo, Asus, Acer): ");
        String brandName = scanner.nextLine();
        Brand brand = Brand.valueOf(brandName);

        System.out.print("Введите модель процессора: ");
        String processorModel = scanner.nextLine();
        Processor processor = new Processor(processorModel);

        System.out.print("Введите объем памяти (в ГБ): ");
        int memorySizeGB = scanner.nextInt();
        Memory memory = new Memory(memorySizeGB);

        System.out.print("Введите размер монитора (в дюймах): ");
        double monitorSizeInches = scanner.nextDouble();
        Monitor monitor = new Monitor(monitorSizeInches);

        return new Computer(brand, processor, memory, monitor);
    }
}
