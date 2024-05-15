package classwork_29;

public class OuterClass {
    private static String staticField = "Static field";

    private static InnerClass innerClassObject;
    private String field = "Nonstatic field";

    private StaticNestedClass staticNestedClassObject;

    static class StaticNestedClass {
        private static String nestedStaticField = "Included static field";
        private String nestedField = "Included field";

        void display() {
            System.out.println(staticField);
            // Статический вложенный класс
// Обращение к статическому полю внешнего класса
// Обращение к нестатическому полю внего класса
            // System.out.println(field); // ошибка, т.к. нельзя

            // Обращение к полям самого StaticNestedClass
            // происходит обычном образом
            System.out.println(nestedStaticField);
            System.out.println(nestedField);

            System.out.println(InnerClass.innerField);

        }
    }
    class InnerClass {
        private static String innerField = "Inner field";

        //private String innerField = "Inner static field"; // not possible
        void display() {
            // Обращение к статическому полю внешнего класса
            System.out.println(staticField);
// Обращение к нестатическому полю внего класса
            System.out.println(field);

            // Обращение к neстатическому полю ekzemplyra inner класса v polnoj forme
            System.out.println(this.innerField);

            System.out.println(OuterClass.staticField);

            System.out.println(OuterClass.this.field);

            System.out.println(StaticNestedClass.nestedStaticField);

            System.out.println(OuterClass.this.staticNestedClassObject.nestedField);
        }
    }
}
