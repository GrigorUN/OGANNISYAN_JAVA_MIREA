package Practika10;

public class Student {
    private String Name;
    private String LastName;
    private String Specialty;
    private int Course;
    private String Group;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String group) {
        this.Group = group;
    }

    public int getCourse() {
        return Course;
    }

    public void setCourse(int course) {
        this.Course = course;
    }

    public String getSpecialty() {
        return Specialty;
    }

    public void setSpecialty(String specialty) {
        Specialty = specialty;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Student(String name, String lastName, String specialty, String group, int course) {
        Name = name;
        LastName = lastName;
        Specialty = specialty;
        Group = group;
        Course = course;
    }
    private double studentGPA;

    public double getStudentGPA() {
        return studentGPA;
    }

    public void setStudentGPA(double studentGPA) {
        this.studentGPA = studentGPA;
    }
    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Specialty='" + Specialty + '\'' +
                ", Course=" + Course +
                ", Group='" + Group + '\'' +
                ", studentGPA=" + studentGPA +
                '}';
    }
}
