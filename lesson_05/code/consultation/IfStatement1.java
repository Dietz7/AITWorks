package consultation;

public class IfStatement1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        if(2+2==4){
            System.out.println("My name is Karl");
        }
        System.out.println("Bye");
    }

}


class IfStatement2 {
    public static void main(String[] args) {
        System.out.println("Hello");
        if(2+2==4){
            System.out.println("My name is Karl");
        } else {
            System.out.println("He is 99 y.o.");
        }
        System.out.println("Bye");
    }

}

class IfStatement3 {
    public static void main(String[] args) {
        System.out.println("Hello");
        // esli 2+2=4
        if(2+2==4){
            // to vupolnit etot kod
            System.out.println("My name is Karl");
            // inache esli 5-3=2
        } else  if (5 - 2 ==3){
            // vupolnit etot kod
            System.out.println("He is 99 y.o.");
        } else {
            System.out.println("I am cat");
        }
        System.out.println("Bye");
    }




}