package classwork;

public class Circus {
    public static void main(String[] args) {
        // proverit mozhno li iz odnogo metoda vuzvat drugoj, a iz togo dalche sleduichi...
      lightOn();
      entertainer();
      lightOff();
    }// end of main

    private static void lightOff() {
        System.out.println("Light OFF");
    }

    private static void entertainer() {
        jongler();
        clown();
        singer();
    }

    private static void singer() {
        System.out.println("I am singing in the rain");
    }

    private static void clown() {
        System.out.println("I am joking");
    }

    private static void jongler() {
        System.out.println("I am jongler, I am jongling");
    }

    private static void lightOn() {
        System.out.println("Light is ON");
    }


} //end of class
