package Practika11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
    Date Birthday;

    public Student(Date birthday) {
        Birthday = birthday;
    }

    @Override
    public String toString() {
        System.out.println("Выберите формат вывода дня рождения:\n" +
                "короткий(1)\nсредний(2)\nполный(3)");
        final int sc = new Scanner(System.in).nextInt();
        SimpleDateFormat df = new SimpleDateFormat();
        switch (sc){
            case 1:
                df= new SimpleDateFormat("E, y-M-d");
                break;
            case 2:
                df= new SimpleDateFormat("E yyyy.MM.dd");
                break;
            case 3:
                df= new SimpleDateFormat("EEEE, MMMM d, yyyy");
                break;
        }
        return df.format(Birthday);
    }
}
