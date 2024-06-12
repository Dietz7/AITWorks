package homework_32.dao;

import homework_32.model.Computer;

public interface Stock {
    boolean addComputer(Computer computer);
    Computer findComputer(long msn);
    Computer findComputerWithDiscount();
    Computer removeComputer(long msn);
    double calcDiscount();
    // TO DO Computer updateComputer(String brand);

    int quantity();
    void printComputer();

}
