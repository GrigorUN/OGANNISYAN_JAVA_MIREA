package Practika17;

public class MVCPatternDemo {
    public static void main(String[] args){
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
    }
    static Student retriveStudentFromDatabase(){
        Student ex = new Student();
        ex.setRollNo("1");
        ex.setName("Andrew");
        return ex;
    }
}
