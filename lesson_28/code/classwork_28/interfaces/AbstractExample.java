package classwork_28.interfaces;

public class AbstractExample {

}

abstract class Animal {
    abstract void makeSound ();
}

abstract class Creature {
    abstract void walk ();
}

class Cat extends Animal {
    @Override
    void makeSound () {
        System.out.println("meow");
    }
}
