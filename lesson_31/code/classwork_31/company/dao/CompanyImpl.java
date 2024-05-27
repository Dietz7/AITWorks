package classwork_31.company.dao;

import classwork_31.company.model.Employee;

public class CompanyImpl implements Company{

    //fields
    private Employee[] employees;
    private int size;

    // constructor
    public CompanyImpl(int capacity) {
        employees = new Employee[capacity]; // to analyze
    }



    @Override
    public boolean addEmployee(Employee employee) {
        if (employee == null || size == employees.length || findEmployee(employee.getId()) != null) {
            return false;
        }

        employees[size++] = employee;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i <size; i++) {
            if(employees[i].getId() == id){
               return employees[i];
            }
        }
        return null; //empty ssilka
    }


    @Override
    public int quantity() {
        return size;
    }

    @Override
    public double totalSalary() {
        return 0;
    }

    @Override
    public double avgSalary() {
        return 0;
    }

    @Override
    public double totalSales() {
        return 0;
    }

    @Override
    public void printEmployee() {

    }

    @Override
    public Employee[] findEmployeeHoursGreaterThen(int hours) {
        return new Employee[0];
    }

    @Override
    public Employee[] findEmployeeSalaryRange(double min, double max) {
        return new Employee[0];
    }
}
