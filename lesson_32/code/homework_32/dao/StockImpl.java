package homework_32.dao;

import homework_32.model.Computer;

import static homework_32.model.Computer.BARCODE_LENGTH;


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
      if (computer == null || size == computers.length || findComputer(computer.getMsn()) != null) {
        return false;
      }
      computers[size] = computer;
      size++;
      return true;
    }

  @Override
  public Computer findComputer(long msn) {
    for (int i = 0; i < size; i++) {
      if (computers[i].getMsn() == msn) {
        return computers[i];
      }
    }
    return null;
  }

  // Method to find the first computer with a discount
  public Computer findComputerWithDiscount() {
    for (int i = 0; i < size; i++) {
      Computer computer = computers[i];
      if (computer.calcDiscount() < computer.getPrice()) {
        return computer;
      }
    }
    return null;  // Return null if no computer with a discount is found
  }

    @Override
    public Computer removeComputer(long msn) {
      for (int i = 0; i < size; i++) {
        if(computers[i].getMsn() == msn){
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
  public double calcDiscount() {
      double totalDiscount = 0.0;
    for (int i = 0; i < size; i++) {
      totalDiscount += computers[i].calcDiscount();
    }
    return totalDiscount;
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
