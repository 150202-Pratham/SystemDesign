package SolidPrinciples.Implementation.LSP_LiskovSubstitutionPrinciple.voilation;

import java.util.List;

public class SalaryDisperser {
    public void salaryDisperser(List<Employee> employees){

        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);

            if(employee instanceof Volunteer)
                continue;

            employee.calculateSalary();
        }
    }
}
