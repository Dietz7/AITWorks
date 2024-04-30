package classwork;

public class Introduction {
    public static void main(String[] args) {

        // troje banditov predstavljajutsa polizzi, soobchajut kak ich zovut
        intro();
        System.out.println("Juliko Bandito");
        intro();
        System.out.println("De La Vorro Gangsterito");
        intro();
        System.out.println("Tuz Pik");


    } // end of main

    //DRY - don`t repeat yourself
    public static void intro () {

        System.out.println("Let me introduce myself");
    }

} // end of class
