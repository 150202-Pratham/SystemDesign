package SolidPrinciples.Implementation.LSP_LiskovSubstitutionPrinciple.voilation;

public class FullTimeEmployee extends Employee {

    protected FullTimeEmployee(int id) {
        super(id);
    }

    @Override
    protected double calculateSalary() {
        System.out.println("Calculating Full Time Employee Salary");
        return 0;
    }
}
