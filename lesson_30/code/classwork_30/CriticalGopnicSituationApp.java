package classwork_30;

public class CriticalGopnicSituationApp {
    public static void main(String[] args) {
        System.out.println(
                "Человек идет по улице и встречает " +
                        "группу моргинальных личностей"
        );

        System.out.println("and he says:");

        Greeting speech = new Greeting() {
           @Override
            public void sayHello() {
               System.out.println("hi guys");

           }
           @Override
            public void sayGoodBye() {
               System.out.println("BYE");

           }
        };

        speech.sayHello();
        speech.sayGoodBye();

        System.out.println("happy end");
    }
}
