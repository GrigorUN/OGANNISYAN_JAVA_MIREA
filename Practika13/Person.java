package Practika13;

public class Person {
    private  String FirstName;
    private  String LastName;
    private String Patronymic;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getPatronymic() {
        return Patronymic;
    }

    public void setPatronymic(String patronymic) {
        Patronymic = patronymic;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public Person(String firstName, String lastName, String patronymic){
        FirstName = firstName;
        LastName = lastName;
        Patronymic = patronymic;
    }
    public StringBuffer getFullName(){
        StringBuffer buff = new StringBuffer().append(LastName).append(" ");
        if(!FirstName.equals("-")){
            buff.append(FirstName.charAt(0)).append(".");
        }
        if(!Patronymic.equals("-")){
            buff.append(FirstName.charAt(0)).append(".");
        }
        return buff;
    }
}
