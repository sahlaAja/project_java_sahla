package id.ac.polban.employee.main;

import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.*;

public class Main {
    public static void main(String[] args) {
        Department it = new Department("IT");
        EmploymentType fulltime = new EmploymentType("Full Time");
        Employee emp1 = new Employee("Sahla Fadhilah", it, fulltime, 5500000);
        Employee emp2 = new Employee("Nurul Salmahat", it, fulltime, 4500000);

        EmployeeService service = new EmployeeService();
        service.addEmployee(emp1);
        service.addEmployee(emp2);

        System.out.println("Employee : ");
        System.out.println("ID - NAMA - DEPARTMENT - TYPE - SALARY");
        System.out.println(emp1.getId() + " - " + emp1.getName() + " - " + emp1.getDepartment() + " - " + emp1.getType() + " - " + emp1.getSalary());
        System.out.println(emp2.getId() + " - " + emp2.getName() + " - " + emp2.getDepartment() + " - " + emp2.getType() + " - " + emp2.getSalary());
        System.out.println("Total Employee : " + Employee.getTotalEmployee());
    }
}
