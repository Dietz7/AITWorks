package classwork_28.interfaces;

public interface MakeSound {
    int a = 1;
    void makeSound ();
}

interface Walk {
    void walk ();
}
class Cat2 implements MakeSound, Walk {
    @Override
    public void makeSound () {
        System.out.println("meow");

    }

    @Override
    public void walk() {
        System.out.println("cat is walking");
    }
}
