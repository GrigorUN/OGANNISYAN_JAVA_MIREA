package Practika10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class SortingStudentsByGPA implements Comparator<Student>{
    public ArrayList<Student> IDnumber;
    private int sort;
    private void setArray(){
        System.out.println("Введите количество студентов: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String buff;
        double GPA;
        int Ibuff;
        Student instbuff;
        IDnumber = new ArrayList<Student>();
        for(int i = 0; i < num; i++){
            instbuff = new Student();
            System.out.println("Введите имя Студента: ");
            buff = sc.nextLine();
            instbuff.setName(buff);
            System.out.println("Введите фамилию Студента: ");
            buff = sc.nextLine();
            instbuff.setLastName(buff);
            System.out.println("Введите специальность Студента: ");
            buff = sc.nextLine();
            instbuff.setSpecialty(buff);
            System.out.println("Введите курс Студента: ");
            Ibuff = sc.nextInt();
            instbuff.setCourse(Ibuff);
            System.out.println("Введите группу Студента: ");
            buff = sc.nextLine();
            instbuff.setGroup(buff);
            System.out.println("Введите оценку Студента: ");
            GPA = sc.nextDouble();
            instbuff.setStudentGPA(GPA);
            IDnumber.add(instbuff);
        }
        System.out.println("Сортровать студентов по курсу (1) или по оценке (2): ");
        sort = sc.nextInt();
    }
    @Override
        public int compare(Student o1, Student o2) {
        double n1 = 0, n2 = 0;
        switch (sort){
            case 1:
                n1 = o1.getCourse();
                n2 = o2.getCourse();
                break;
            case 2:
                n1 = o1.getStudentGPA();
                n2 = o2.getStudentGPA();
                break;
        }
        if (n1 > n2){
            return 1;
        } else if (n1 < n2) {
            return -1;
        }
        return 0;
    }
    public ArrayList<Student> quickSort(ArrayList<Student> IDnumber, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student pivot = IDnumber.get((leftMarker + rightMarker) / 2);
        do {
            //элемент больше pivot
            while (compare(IDnumber.get(leftMarker), pivot) > 0) {
                leftMarker++;
            }
            //элемент меньше pivot
            while (compare(IDnumber.get(rightMarker), pivot) < 0) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Student tmp = IDnumber.get(leftMarker);
                    IDnumber.set(leftMarker,IDnumber.get(rightMarker));
                    IDnumber.set(rightMarker, tmp);
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSort(IDnumber, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(IDnumber, leftBorder, rightMarker);
        }
        return IDnumber;
    }
    public ArrayList<Student> quickSort(){
        return quickSort(IDnumber, 0, IDnumber.size() - 1);
    }
    public ArrayList<Student> mergeSort(ArrayList<Student> IDnumber, int left, int right) {
        int delimiter = left + ((right - left) / 2) + 1;
        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(IDnumber, left, delimiter - 1);
            mergeSort(IDnumber, delimiter, right);
        }
        Student[] buffer = new Student[right - left + 1];
        int border = left;
        for (int i = 0; i < buffer.length; i++) {
            if (delimiter > right || compare(IDnumber.get(border), IDnumber.get(delimiter)) > 0) {
                buffer[i] = IDnumber.get(border);
                border++;
            } else {
                buffer[i] = IDnumber.get(delimiter);
                delimiter++;
            }
        }
        return IDnumber;
    }
    public ArrayList<Student> mergeSort(){
        return mergeSort(IDnumber, 0, IDnumber.size() - 1);
    }
    public void outArray(){
        for(int i = 0; i < IDnumber.size(); i++){
            System.out.println(IDnumber.get(i).toString());
        }
    }
    public static void main(String[] args){
        SortingStudentsByGPA inst1 = new SortingStudentsByGPA();
        SortingStudentsByGPA inst2 = new SortingStudentsByGPA();
        inst1.setArray();
        inst2.setArray();
        inst1.IDnumber.addAll(inst2.IDnumber);
        inst1.quickSort();
    }
}
