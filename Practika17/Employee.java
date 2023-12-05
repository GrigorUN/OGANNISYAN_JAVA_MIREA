package Practika17;

public class Employee {
    double salary;
    double salary_with_tax;
    double prize;
    double prize_with_tax;

    public double getPrize_with_tax() {
        return prize_with_tax;
    }

    public void setPrize_with_tax(double prize_with_tax) {
        this.prize_with_tax = prize_with_tax;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary_with_tax() {
        return salary_with_tax;
    }

    public void setSalary_with_tax(double salary_with_tax) {
        this.salary_with_tax = salary_with_tax;
    }
}
