package Practika16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class zadanie2 extends JFrame{
    JTextArea point;
    JMenuItem blue;
    JMenuItem black;
    JMenuItem red;
    JMenuItem TNR;
    JMenuItem MSSS;
    JMenuItem Courier;
    private class MenuAction extends AbstractAction{
        public MenuAction(String text){
            super(text);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == TNR){ point.setFont(new Font("Times New Roman", Font.PLAIN, 14));}
            if(e.getSource() == MSSS){ point.setFont(new Font("MS Sans Serif", Font.PLAIN, 14));}
            if(e.getSource() == Courier){ point.setFont(new Font("Courier New", Font.PLAIN, 14));}
            if(e.getSource() == blue){point.setForeground(Color.BLUE);};
            if(e.getSource() == red){point.setForeground(Color.RED);};
            if(e.getSource() == black){point.setForeground(Color.BLACK);};
        }
    }
    public zadanie2(){
        point = new JTextArea();
        add(point);
        JMenuBar menuBar = new JMenuBar();
        JMenu ColorMenu = new JMenu("цвет");
        JMenu FontMenu = new JMenu("Шрифт");
        red = new JMenuItem(new MenuAction("Красный"));
        blue = new JMenuItem(new MenuAction("Синий"));
        black = new JMenuItem(new MenuAction("Чёрный"));
        ColorMenu.add(red);
        ColorMenu.add(blue);
        ColorMenu.add(black);
        TNR = new JMenuItem(new MenuAction("Times New Roman"));
        MSSS = new JMenuItem(new MenuAction("MS Sans Serif"));
        Courier = new JMenuItem(new MenuAction("Courier New"));
        FontMenu.add(TNR);
        FontMenu.add(MSSS);
        FontMenu.add(Courier);
        menuBar.add(ColorMenu);
        menuBar.add(FontMenu);

        setJMenuBar(menuBar);


        setSize(360, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main( String[] args){
        zadanie2 myw = new zadanie2();
    }
}
