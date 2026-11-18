package SolidPrinciples.Implementation.LSP_LiskovSubstitutionPrinciple.voilation;

public abstract class Employee {

    protected final  int id ;

    protected Employee(int id){
        this.id = id ;

    }

    protected abstract double calculateSalary() ;

}
