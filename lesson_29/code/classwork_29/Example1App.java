package classwork_29;

public class Example1App {
    public static void main(String[] args) {
        // create object of type StaticNestedCLASS
        OuterClass.StaticNestedClass staticNestedClassObject;
        staticNestedClassObject = new OuterClass.StaticNestedClass();
        // call method display
        staticNestedClassObject.display();

        System.out.println("-----------------");

        OuterClass outerClassObject = new OuterClass();
        OuterClass.InnerClass innerClassObject = outerClassObject.new InnerClass();
        innerClassObject.display();
    }
}
