package consultation;

// pishem klass
// opisuvajet cheloveka
// imya, vozrast, zvet glas, rost

import com.sun.jdi.PathSearchingVirtualMachine;

public class Person {
    public String name;
    public int age;
    public String eyesColor;
    public int high;

    public static int count = 0;
    public void sayHello (){
        System.out.println("Hi, my name is: " + this.name);

    }

        public Person (String personName, int age) {
        this.name = name;
        this.age = age;

        }
}

class Main {
    public static void main(String[] args) {
        Person person1 = new Person ("Karl", 99);
        person1.count+= 1;
        person1.name = "Karl";
        person1.age= 99;
        person1.eyesColor = "brown";
        person1.high = 3;


        Person  person2 = new Person ("Max", 150);
        person1.count+= 1;
        person2.name = "Max";
        person2.age = 150;
        person2.eyesColor = "blue";
        person2.high = 5;


        person1.sayHello();
        person2.sayHello();
        System.out.println();

        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.eyesColor);
        System.out.println("Count: " + Person.count);



    }


}



