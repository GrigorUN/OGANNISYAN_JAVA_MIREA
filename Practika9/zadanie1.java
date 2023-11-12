package Practika9;

public class zadanie1 {
    public static void main(String[] args) {
        // Создаем массив студентов
        Student[] students = {
            new Student(103, "Иванов"),
            new Student(101, "Петров"),
            new Student(105, "Сидоров"),
            new Student(102, "Алексеев"),
            // Добавьте больше студентов по необходимости
        };

        // Выводим массив до сортировки
        System.out.println("Массив до сортировки:");
        printStudents(students);

        // Сортируем массив по iDNumber методом сортировки вставками
        insertionSort(students);

        // Выводим отсортированный массив
        System.out.println("\nМассив после сортировки по iDNumber:");
        printStudents(students);
    }

    // Метод для сортировки массива студентов методом вставки
    private static void insertionSort(Student[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            Student key = arr[i];
            int j = i - 1;

            // Сдвигаем элементы массива, которые больше key
            while (j >= 0 && arr[j].getIDNumber() > key.getIDNumber()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Метод для вывода массива студентов
    private static void printStudents(Student[] arr) {
        for (Student student : arr) {
            System.out.println(student);
        }
    }
}

// Класс Student
// Класс Student
class Student {
    private int iDNumber;
    private String name;

    public Student(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", name='" + name + '\'' +
                '}';
    }
}

