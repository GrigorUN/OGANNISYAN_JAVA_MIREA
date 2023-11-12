package Practika12;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class zadanie3 extends JFrame {
    private int currentFrame = 0;
    private int totalFrames = 0; // Общее количество кадров
    private Timer timer;
    private Image[] frames; // Массив изображений (кадров)

    public zadanie3() {
        setTitle("Анимация");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(310, 501);

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFolder = fileChooser.getSelectedFile();
            File[] imageFiles = selectedFolder.listFiles(pathname -> {
                String name = pathname.getName().toLowerCase();
                return name.endsWith(".png"); // Загружаем только PNG-изображения
            });

            if (imageFiles != null) {
                totalFrames = imageFiles.length;
                frames = new Image[totalFrames];
                for (int i = 0; i < totalFrames; i++) {
                    frames[i] = new ImageIcon(imageFiles[i].getAbsolutePath()).getImage();
                }
            }

            int delay = 100; // Задержка между кадрами (в миллисекундах)
            timer = new Timer(delay, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    currentFrame = (currentFrame + 1) % totalFrames; // Переключение на следующий кадр
                    repaint(); // Перерисовка окна
                }
            });
            timer.start(); // Запуск таймера
        } else {
            System.exit(0); // Выход, если не выбрана папка
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Отображение текущего кадра
        if (frames != null && frames.length > 0) {
            g.drawImage(frames[currentFrame], 0, 0, null);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                zadanie3 window = new zadanie3();
                window.setVisible(true);
            }
        });
    }
}
