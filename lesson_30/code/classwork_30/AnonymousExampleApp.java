package classwork_30;

public class AnonymousExampleApp {
    public static void main(String[] args) {

        Greeting myObject = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from anonymous class");
            }

            @Override
            public void sayGoodBye() {
                System.out.println("Good bye from my ");

            }

        };

        myObject.sayHello();
        myObject.sayGoodBye();
    }
}
