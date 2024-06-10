package homework_32.dao;

import homework_32.model.Computer;

public interface Stock {
    boolean addComputer(Computer computer);
    Computer findComputer(long serialNumber);
    Computer findWithDiscount(long serialNumber);
    Computer removeComputer(long serialNumber);

    // TO DO Computer updateComputer(String brand);

    int quantity();
    void printComputer();

}
