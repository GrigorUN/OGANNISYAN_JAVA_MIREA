package Practika15;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    JFrame f;
    JTextField t;
    JButton buttons[];
    static double a=0,b=0,result=0;
    static int operator=0;
    public Calculator(){
        f=new JFrame("Calculator");
        t=new JTextField();
        t.setBounds(30,40,280,30);
        String[] Lables = new String[]{"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};
        buttons = new JButton[16];
        ActionListener ButtonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==buttons[8])
                    t.setText(t.getText().concat("1"));
                if(e.getSource()==buttons[9])
                    t.setText(t.getText().concat("2"));
                if(e.getSource()==buttons[10])
                    t.setText(t.getText().concat("3"));
                if(e.getSource()==buttons[4])
                    t.setText(t.getText().concat("4"));
                if(e.getSource()==buttons[5])
                    t.setText(t.getText().concat("5"));
                if(e.getSource()==buttons[6])
                    t.setText(t.getText().concat("6"));
                if(e.getSource()==buttons[0])
                    t.setText(t.getText().concat("7"));
                if(e.getSource()==buttons[1])
                    t.setText(t.getText().concat("8"));
                if(e.getSource()==buttons[2])
                    t.setText(t.getText().concat("9"));
                if(e.getSource()==buttons[12])
                    t.setText(t.getText().concat("0"));
                if(e.getSource()==buttons[13])
                    t.setText(t.getText().concat("."));
                if(e.getSource()==buttons[15])
                {
                    a=Double.parseDouble(t.getText());
                    operator=1;
                    t.setText("");
                }
                if(e.getSource()==buttons[11])
                {
                    a=Double.parseDouble(t.getText());
                    operator=2;
                    t.setText("");
                }
                if(e.getSource()==buttons[7])
                {
                    a=Double.parseDouble(t.getText());
                    operator=3;
                    t.setText("");
                }
                if(e.getSource()==buttons[3])
                {
                    a=Double.parseDouble(t.getText());
                    operator=4;
                    t.setText("");
                }
                if(e.getSource()==buttons[14]) {
                    b = Double.parseDouble(t.getText());
                    switch (operator) {
                        case 1:
                            result = a + b;
                            break;
                        case 2:
                            result = a - b;
                            break;
                        case 3:
                            result = a * b;
                            break;
                        case 4:
                            result = a / b;
                            break;
                        default:
                            result = 0;
                    }
                    t.setText("" + result);
                }
            }
        };
        for(int i = 0; i < 16; i++){
            buttons[i] = new JButton(Lables[i]);
            buttons[i].addActionListener(ButtonListener);
        }
        buttons[0].setBounds(40,100,50,40);
        buttons[1].setBounds(110,100,50,40);
        buttons[2].setBounds(180,100,50,40);
        buttons[3].setBounds(250,100,50,40);
        buttons[4].setBounds(40,170,50,40);
        buttons[5].setBounds(110,170,50,40);
        buttons[6].setBounds(180,170,50,40);
        buttons[7].setBounds(250,170,50,40);
        buttons[8].setBounds(40,240,50,40);
        buttons[9].setBounds(110,240,50,40);
        buttons[10].setBounds(180,240,50,40);
        buttons[11].setBounds(250,240,50,40);
        buttons[13].setBounds(40,310,50,40);
        buttons[12].setBounds(110,310,50,40);
        buttons[14].setBounds(180,310,50,40);
        buttons[15].setBounds(250,310,50,40);
        f.add(t);
        for(int i = 0; i < 16; i++){
            f.add(buttons[i]);
        }
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(350,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
    }
    public static void main(String[] args){
        Calculator myCalc = new Calculator();
    }
}
