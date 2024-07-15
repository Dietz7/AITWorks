package homework_20.shop.controller;

import homework_20.shop.model.Computer;

import java.math.BigInteger;


public class Stock {

    // fields
    // arrays for computers
    private Computer[] computers;
    // number of computers in stock;

    private int size;

    // constructor


    public Stock(int capacity) {
        computers = new Computer[capacity];
        this.size = 0;
    }

    // methods
    // addComputer
    public boolean addComputer (Computer computer){
        //it is necessary to add element to an array
        //foresee that null and duplicate will not be added, the capacity of the stock will not be exceeded
        if (computer == null || size == computers.length || findComputer (computer.getMsn()) != null) {
          return false;
        }
        computers [size] = computer;
        size++;
        return true;
    }

   public Computer findComputer(BigInteger msn) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getMsn ()== msn) { //were computers instead of Objects, I CHANGED ONE WORD
                return computers[i];
            }
        }
        return null;
    }
    // print computers

    public void printComputers () {
        for (int i = 0; i < size; i++) {
            System.out.println(computers[i]);
        }
        System.out.println("=============================");
    }
    //getting the number of computers in the library
    public int getSize (){
        return size;
    }
    public Computer removeComputer(BigInteger msn) {
        //we must find the computer we want to remove
        Computer victim = null;
        //SEARCH THE COMPUTER BY MSN
        for (int i = 0; i < size; i++) {
           if(computers[i].getMsn().equals(msn)){
               victim = computers [i];
               computers[i] = computers [size - 1]; // on the place of the computer[i] we put the last computer,
               computers [size - 1] = null;
               size--;
               break;
           }
        }
        // na ee mesto postavim poslednjuu knigu iz imejuchixcya v massive
        // size --
        // return udalyaemuju knigu
        return victim;
    }

}





