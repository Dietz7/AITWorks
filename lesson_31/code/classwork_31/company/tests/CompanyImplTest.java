package classwork_31.company.tests;

import classwork_31.company.dao.Company;
import classwork_31.company.dao.CompanyImpl;
import classwork_31.company.model.Employee;
import classwork_31.company.model.Manager;
import classwork_31.company.model.SalesManager;
import classwork_31.company.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {

    Company company;
    Employee[] e;


    @BeforeEach
    void setUp() {
        company = new CompanyImpl(5);
        e = new Employee[4];
        e[0] = new Manager(101,"John", "Smith", 45, 160,
                5000, 5);
        e[1] = new SalesManager(102,"Anna", "Black", 36, 160, 25000, 0.1);
        e[2] = new SalesManager(103,"Thomas", "White", 28, 160, 30000, 0.1);
        e[3] = new Worker(104, "Hans", "Bauer", 30, 80, 5);

        // important to add elements of array into object Company
        for (int i = 0; i < e.length ; i++) {
            company.addEmployee(e[i]);

        }


    }

    @Test
    void addEmployee() {
        // it is not allowed to add null
        assertFalse(company.addEmployee(null));
        // it is not allowed to add an existed employee second time
        assertFalse(company.addEmployee(e[1]));
        //now we are adding an employee
        Employee employee = new Manager(105, "Ivan", "Dubinin", 55, 160, 600, 6);
        assertTrue(company.addEmployee(employee));
        // check quantity after adding the new employee
        assertEquals(5, company.quantity());
        // not allowed to exceed capacity of the company
        Employee employeeOneMore = new Worker(106, "Leon", "Kruger", 45, 80, 5);
        assertFalse(company.addEmployee(employeeOneMore));
        company.printEmployee();
    }


    @Test
    void removeEmployee() {
    }

    @Test
    void findEmployee() {
    }

    @Test
    void quantity() {
    }

    @Test
    void totalSalary() {
    }

    @Test
    void avgSalary() {
    }

    @Test
    void totalSales() {
    }

    @Test
    void printEmployee() {
    }

    @Test
    void findEmployeeHoursGreaterThen() {
    }

    @Test
    void findEmployeeSalaryRange() {
    }
}