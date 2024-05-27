package classwork_31.company.dao;
/*- добавить сотрудника addEmplyee
- удалить сотрудника removeEmployee
- найти сотрудника findEmployee
- кол-во сотрудников quantity
- ФОТ totalSalare
- средняя з/п averageSalary
- объем продаж totalSales
- напечатать список сотрудников printEmployees*/

import classwork_31.company.model.Employee;

public interface Company {

    // define abstract methods
    boolean addEmployee(Employee employee);
    Employee removeEmployee(int id);
    Employee findEmployee(int id);
    int quantity(); // quantity of employees
    double totalSalary();
    double avgSalary();
    double totalSales();
    void printEmployee();

    // list of employess "stachanovtzev"
    Employee[] findEmployeeHoursGreaterThen(int hours);

    // list of employess with the salary from....to....

    Employee[] findEmployeeSalaryRange(double min, double max);
}
