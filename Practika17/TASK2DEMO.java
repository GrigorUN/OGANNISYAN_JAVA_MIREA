package Practika17;

public class TASK2DEMO {
    public static void main(String[] args){
        Employee model = retriveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
    }
    static Employee retriveEmployeeFromDatabase(){
        Employee ex = new Employee();
        ex.setSalary(30000);
        ex.setSalary_with_tax(30000 - (30000 * 0.13));
        ex.setPrize(5000);
        ex.setPrize_with_tax(10000 - (40000 * 0.13));
        return ex;
    }
}
