package classwork_30;



class MyBestClass implements Greeting{
    @Override
    public void sayHello(){
        System.out.println("Hello from my BestClass"); // this is how we did before
    }

    @Override
    public void sayGoodBye() {
        System.out.println("Good bye from my best class");
    }

}

public class Main {
    public static void main(String[] args) {
MyBestClass myObject = new MyBestClass();
myObject.sayHello();

Greeting myObject2 = new MyBestClass();
myObject2.sayHello();
myObject2.sayGoodBye();

    }
}
