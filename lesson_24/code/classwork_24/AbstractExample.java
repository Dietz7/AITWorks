package classwork_24;

abstract class Animal {
    abstract void makeSound();

    void breathe() {
    System.out.println("Animal is breathing");
    }
}

class Cow extends Animal {

    @Override
    void makeSound() {
        System.out.println("muuuuu");
    }
}

class Dog extends Animal {
@Override
    void makeSound() {
        System.out.println("woof");
    }
    void swim() {
        System.out.println("Dog is swimming");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("meow");
    }
}

abstract class AnimalInSky  extends Animal {
    void fly () {
        System.out.println("Animal is skying");
    }
}

class Bird extends AnimalInSky {

    @Override
    void makeSound() {
        System.out.println("chirik-chirik");
    }
}


class AbstractExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat ();
        //Animal animal = new Animal ();
        Cow cow = new Cow ();
        Bird bird = new Bird ();
        dog.makeSound();
        cat.makeSound();
        dog.breathe();
        dog.breathe();
        cow.makeSound();
        System.out.println("-----------------------");
        Animal[] animals ={new Dog(), new Cat (), new Cow (), new Bird ()};
        for (Animal animal: animals) {
            animal.makeSound();
        }
    }
}

