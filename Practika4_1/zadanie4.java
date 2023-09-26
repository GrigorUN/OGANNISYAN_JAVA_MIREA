package Practika4_1;

public class zadanie4 {
    private double[][] data;
    private int rows;
    private int columns;

    public zadanie4(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        data = new double[rows][columns];
    }

    // Метод для заполнения матрицы случайными числами
    public void fillRandom() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = Math.random();
            }
        }
    }

    // Метод для сложения двух матриц
    public zadanie4 add(zadanie4 other) {
        if (this.rows != other.rows || this.columns != other.columns) {
            throw new IllegalArgumentException("Матрицы имеют разные размеры");
        }

        zadanie4 result = new zadanie4(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }

    // Метод для умножения матрицы на число
    public zadanie4 multiply(double scalar) {
        zadanie4 result = new zadanie4(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.data[i][j] = this.data[i][j] * scalar;
            }
        }
        return result;
    }

    // Метод для умножения двух матриц
    public zadanie4 multiply(zadanie4 other) {
        if (this.columns != other.rows) {
            throw new IllegalArgumentException("Нельзя умножить матрицы с данными размерами");
        }

        zadanie4 result = new zadanie4(this.rows, other.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                double sum = 0.0;
                for (int k = 0; k < this.columns; k++) {
                    sum += this.data[i][k] * other.data[k][j];
                }
                result.data[i][j] = sum;
            }
        }
        return result;
    }

    // Метод для вывода матрицы на печать
    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        zadanie4 matrix1 = new zadanie4(2, 3);
        zadanie4 matrix2 = new zadanie4(3, 2);

        matrix1.fillRandom();
        matrix2.fillRandom();

        System.out.println("Матрица 1:");
        matrix1.printMatrix();

        System.out.println("Матрица 2:");
        matrix2.printMatrix();

        zadanie4 transposedMatrix2 = new zadanie4(2, 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                transposedMatrix2.data[j][i] = matrix2.data[i][j];
            }
        }

        zadanie4 sum = matrix1.add(transposedMatrix2);
        System.out.println("Сумма матриц:");
        sum.printMatrix();

        double scalar = 2.0;
        zadanie4 scaled = matrix1.multiply(scalar);
        System.out.println("Умножение матрицы на число " + scalar + ":");
        scaled.printMatrix();

        zadanie4 product = matrix1.multiply(matrix2);
        System.out.println("Умножение матриц:");
        product.printMatrix();
    }
}
