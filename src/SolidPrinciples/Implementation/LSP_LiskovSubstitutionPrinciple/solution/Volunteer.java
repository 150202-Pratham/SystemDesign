package SolidPrinciples.Implementation.LSP_LiskovSubstitutionPrinciple.voilation;

public class Volunteer extends Employee{

    protected Volunteer(int id) {
        super(id);
    }

    @Override
    protected double calculateSalary() {
        throw new UnsupportedOperationException("Not supported yet.");

    }
}
