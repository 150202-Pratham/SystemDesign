package SolidPrinciples.Implementation.LSP_LiskovSubstitutionPrinciple.voilation;

public class InternEmployee extends Employee{

    protected InternEmployee(int id){

        super(id) ;

    }

    protected double calculateSalary(){
        System.out.println("Salary of Intern Employee");
        return 0 ;

    }
}
