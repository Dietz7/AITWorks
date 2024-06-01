package classwork_32.company.dao;

import classwork_32.company.model.Employee;
import classwork_32.company.model.SalesManager;

public class CompanyImpl implements Company {

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
        for (int i = 0; i < size; i++) {
            if(employees[i].getId() == id){
                Employee victim = employees[i];
                employees [i] = employees[size--];
                employees[size] = null;
                return victim;
            }

        }
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
        double res = 0;
        for (int i = 0; i < size; i++) {
         res += employees[i].calcSalary();
        }
        return res;
    }

    @Override
    public double avgSalary() {
        return totalSalary()/size;
    }

    @Override
    public double totalSales() {
        double res = 0;
        for (int i = 0; i <size ; i++) {
            if(employees[i] instanceof SalesManager) {
                SalesManager salesManager = (SalesManager)  employees[i]; //analyze!!!
                res+=salesManager.getSalesRevenue();
            }
        }
        return res;
    }

    @Override
    public void printEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    @Override
    public Employee[] findEmployeeHoursGreaterThen(int hours) {
        //count quantity
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(employees[i].getHours() > hours){
                count++;
            }
        }
        // fill array
        Employee [] res = new Employee[count];
        for (int i = 0, j = 0 ; i < size; i++) {
            if(employees[i].getHours() > hours){
                res[j++] = employees[i];
            }
        }
        return res;
    }

    @Override
    public Employee[] findEmployeeSalaryRange(double min, double max) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(employees[i].calcSalary() > min && employees[i].calcSalary() < max) {
               count++;
            }
        }
        Employee [] res = new Employee[count];
        for (int i = 0, j = 0; i < size; i++) {
            if(employees[i].calcSalary() >= min && employees[i].calcSalary() <= max){
                res [j++] = employees[i];
            }
        }
        return res;
    }

    @Override
    public Employee updateEmployee(int id, String secondName) {
        // TODO
        // find by id

        // then we take the person we found and use setter for him

        return null; // here must be the object of employee type
    }
}
