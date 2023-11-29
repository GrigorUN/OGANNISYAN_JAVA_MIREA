package Practika13;
import java.lang.StringBuffer;
public class TEST {
    private void task1(String TestStr){
        System.out.println(TestStr.charAt(TestStr.length() - 1));
        if(TestStr.endsWith("!!!")){
            System.out.println("Строка кончается на подстроку: !!!");
        }
        if(TestStr.startsWith("I like")){
            System.out.println("Строка начинаестя на подстроку: I like");
        }
        if(TestStr.contains("Java")){
            System.out.println("Строка содержит подстроку: Java");
        }
        StringBuffer TestStrBuff = new StringBuffer(TestStr);
        System.out.println("C " + TestStr.indexOf("Java") + " до "
                + (TestStr.length() - TestStrBuff.reverse().indexOf("avaJ") - 1));
        System.out.println(TestStr.replaceAll("a", "o"));
        System.out.println(TestStr.toUpperCase());
        System.out.println(TestStr.toLowerCase());
        System.out.println(TestStr.substring(7,11));

    }
    public static void main(String[] args){
        TEST TestInst = new TEST();
        TestInst.task1("I like Java!!!");
        Person TestPerson = new Person("Anita", "Borov", "-");
        System.out.println(TestPerson.getFullName());
        address MyAdress= new address("USA;Maryland;NewHampshireAve;824;1;69");
        System.out.println(MyAdress.toString());
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black TShirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt[] ShirtList = new Shirt[11];
        for (int i = 0; i < shirts.length; i++){
            ShirtList[i] = new Shirt(shirts[i]);
            System.out.println(ShirtList[i].toString());
        }
        Phone MyPhone = new Phone( "89175655655");
        System.out.println(MyPhone.toString());
    }
}
