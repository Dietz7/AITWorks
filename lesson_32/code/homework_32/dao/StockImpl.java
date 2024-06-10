package homework_32.dao;

import homework_32.model.Computer;

import java.math.BigInteger;

public class StockImpl implements Stock {
  // our fields
    private Computer [] computers;
    private int size;

    public StockImpl(int capacity){
      computers = new Computer[capacity];
      size = 0;
    }

    @Override
    public boolean addComputer(Computer computer) {
      if (computer == null || size == computers.length || findComputer(computer.getSerialNumber()) != null) {
        return false;
      }
      computers[size] = computer;
      size++;
      return true;
    }

    @Override
    public Computer findComputer(long serialNumber) {
      for (int i = 0; i < size; i++) {
        if (computers[i].getSerialNumber() == serialNumber) {
          return computers[i];
        }
      }
      return null;
    }

    @Override
    public Computer findWithDiscount(long serialNumber) {
      for (int i = 0; i < size; i++) {
        if(computers[i].getSerialNumber() == serialNumber && computers[i].hasDiscount()){
              return computers[i];
        }
      }  
      return null;
    }

    @Override
    public Computer removeComputer(long serialNumber) {
      for (int i = 0; i < size; i++) {
        if(computers[i].getSerialNumber() == serialNumber){
          Computer removedComputer = computers[i];
          for (int j = i; j < size - 1; j++) {
            computers[j] = computers[j + 1];
          }
          computers[size - 1] = null;
          size--;
          return removedComputer;
        }
      }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printComputer() {
      for (int i = 0; i < size; i++) {
        System.out.println(computers[i]);
      }
    }
}
