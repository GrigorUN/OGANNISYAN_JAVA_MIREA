package Practika16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class zadanie1 extends JFrame {
    JLabel label;
    JTextArea TextArea;
    JButton button;
    int point;
    int n;
    public zadanie1(){
        n = 3;
        point = new Random().nextInt(20) + 1;
        System.out.println(point);
        ActionListener ButtonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(n > 1) {
                    try {
                        if (Integer.parseInt(TextArea.getText()) == point) {
                            label.setText("В самую точку");
                        } else if (Integer.parseInt(TextArea.getText()) < point) {
                            n--;
                            label.setText("Загаданое число больше, у вас осталось " + n + " попыток");
                        } else if (Integer.parseInt(TextArea.getText()) > point) {
                            n--;
                            label.setText("Загаданое число меньше, у вас осталось " + n + " попыток");
                        }
                    } catch (Exception ex) {
                        label.setText("Некоректый ввод, конец работы программы");
                    }
                }
                else if (Integer.parseInt(TextArea.getText()) == point) {
                    label.setText("В самую точку");}
                else{
                    label.setText("Вы исчерпали все попытки");
                }
            }
        };
        label = new JLabel("Угадайте число в диапазоне от 0 до 20, у вас есть " + n + " попытки");
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        GridBagConstraints constraints = new GridBagConstraints();
        setLayout(new GridBagLayout());
        constraints.gridx = 0;
        constraints.gridy = 0;
        p1.add(label);
        add(p1, constraints);
        TextArea = new JTextArea();
        constraints.gridy = 1;
        p2.add(TextArea);
        add(p2, constraints);
        button = new JButton("Проверить");
        button.addActionListener(ButtonListener);
        constraints.gridy = 2;
        p3.add(button);
        add(p3, constraints);
        setSize(540, 360);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        zadanie1 myw = new zadanie1();
    }
}
