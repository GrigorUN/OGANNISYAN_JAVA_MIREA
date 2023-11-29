package Practika11;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;
public class Test {
    public static void main(String[] args) throws ParseException{
        long start_time = System.currentTimeMillis();
        Calendar cal = Calendar.getInstance();
        Date Date1 = new Date(2023, 11, 27, 22,12,0);
        SimpleDateFormat df= new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a");
        cal.set(Calendar.YEAR, 2023);
        cal.set(Calendar.MONTH, Calendar.OCTOBER);
        cal.set(Calendar.DAY_OF_MONTH, 12);
        cal.set(Calendar.HOUR, 4);
        cal.set(Calendar.MINUTE, 27);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.AM_PM, Calendar.PM);

        System.out.println("Время выполнения работы: " + df.format(cal.getTime()));
        Date Date2 = new Date(System.currentTimeMillis());
        System.out.println("Время защиты работы: " + df.format(Date2));

        if(Date1.compareTo(Date2) > 0){
            System.out.println("Текущая дата больше");
        }else if(Date1.compareTo(Date2) < 0){
            System.out.println("Текущая дата меньше");
        }else{
            System.out.println("Даты равны");
        }
        Scanner scanner = new Scanner(System.in);
        String[] str = {"год", "месяц", "день", "час", "минуту", "секунду"};
        String date = "";
        String buff;
        Calendar newCal = Calendar.getInstance();
        for(int i=0; i<6; i++) {
            System.out.println("Введите " + str[i] + ": ");
            buff = scanner.next();
            date = date + buff + ".";
        }
        Date pd = null;
        df= new SimpleDateFormat("yyyy.MM.dd.hh.mm");
        try {
            pd = df.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        newCal.setTimeInMillis(pd.getTime());
        df= new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss");
        System.out.println(df.format(pd));
        System.out.println(df.format(newCal.getTime()));
        long end_time = System.currentTimeMillis();
        System.out.println("время работы программы: " + (end_time - start_time) + " Миллисекунд");
    }
}
