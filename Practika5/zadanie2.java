package Practika5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

// Абстрактный класс Shape
abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        // Генерация случайного цвета
        Random random = new Random();
        color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }

    // Абстрактный метод для рисования фигуры
    public abstract void draw(Graphics g);
}

// Класс Rectangle, наследующийся от Shape
class RectangleShape extends Shape {
    private int width;
    private int height;

    public RectangleShape(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

// Класс Circle, наследующийся от Shape
class CircleShape extends Shape {
    private int radius;

    public CircleShape(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, 2 * radius, 2 * radius);
    }
}

public class zadanie2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Случайные фигуры");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Создание и отображение случайных фигур
                Random random = new Random();
                for (int i = 0; i < 20; i++) {
                    int x = random.nextInt(getWidth());
                    int y = random.nextInt(getHeight());
                    int widthOrRadius = random.nextInt(50) + 20; // случайная ширина/радиус
                    int height = random.nextInt(50) + 20; // случайная высота (только для прямоугольников)

                    if (random.nextBoolean()) {
                        Shape rect = new RectangleShape(x, y, widthOrRadius, height);
                        rect.draw(g);
                    } else {
                        Shape circle = new CircleShape(x, y, widthOrRadius);
                        circle.draw(g);
                    }
                }
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}

