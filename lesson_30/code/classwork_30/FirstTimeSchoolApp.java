package classwork_30;

public class FirstTimeSchoolApp {
    public static void main(String[] args) {
        System.out.println(
                "Мальчик Петя пришел на урок впервые. " +
                        "Занятие началось и учитель поприветствовал класс"
        );
        System.out.println("and he says: ");

        Greeting speech = new Greeting () {
            @Override
            public void sayHello(){
                System.out.println("hi guys");
            }
            @Override
            public void sayGoodBye() {
                System.out.println("Chiao");
            }
        };

        speech.sayHello();
        speech.sayGoodBye();

        System.out.println("happy end");
    }
}