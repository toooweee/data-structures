package gpt;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private int Salary;

    public Employee(String name, int salary) {
        this.name = name;
        Salary = salary;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> Employees = new ArrayList<>();
        Employees.add(new Employee("John", 2000));
        Employees.add(new Employee("Islam", 10000));
        Employees.add(new Employee("Artyom", 8000));
        Employees.add(new Employee("Lera", 9000));


        Employees.forEach(employee -> {
            employee.setSalary(employee.getSalary() * 10);
            System.out.println(employee);
        });


    }
}
