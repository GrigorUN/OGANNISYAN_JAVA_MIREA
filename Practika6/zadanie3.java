package Practika6;

// Интерфейс Priceable
interface Priceable {
    double getPrice(); // Метод, возвращающий цену объекта
}

// Пример класса, реализующего интерфейс Priceable
class Product implements Priceable {
    private double price;

    public Product(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

// Пример класса, реализующего интерфейс Priceable
class Service implements Priceable {
    private double hourlyRate;

    public Service(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getPrice() {
        return hourlyRate;
    }
}

public class zadanie3 {
    public static void main(String[] args) {
        // Пример использования интерфейса Priceable
        Priceable product = new Product(1000.0);
        Priceable service = new Service(50.0);

        // Получение цен объектов и вывод на экран
        System.out.println("Product price: $" + product.getPrice());
        System.out.println("Service price per hour: $" + service.getPrice());
    }
}
