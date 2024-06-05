package guilherme.javaoneforall.javacore.introductionmethods.tests;

import guilherme.javaoneforall.javacore.introductionmethods.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name = "Guilherme";
        employee.age = 20;
        employee.salaries = new double[]{1200, 1500, 1600};

        employee.print();
    }
}
