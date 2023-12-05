package Practika17;

public class EmployeeController {
    Employee model;
    EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view){
        this.model = model;
        this.view = view;
    }
    public void setStudentSalary(double salary){
        model.setSalary(salary);
        model.setSalary_with_tax(salary - (salary* 0.13));
    }
    public double getStudentSalary(){
        return model.getSalary();
    }
    public void setStudentPrize(double prize){
        model.setPrize(prize);
        model.setPrize_with_tax(prize - ((model.getSalary() + prize)* 0.13));
    }
    public double getStudentPrize(){
        return model.getPrize();
    }
    public void updateView(){
        view.printEmployeeDetails(model.getPrize(), model.getPrize_with_tax(), model.getSalary(), model.getSalary_with_tax());
    }
}
