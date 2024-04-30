package classwork.arguments;

public class ArgsApplExample {
    public static void main(String[] args) {
        // main - this is a method type void nichego ne vozvrachejet no chto-to delajet
        // v skobkah - eto argumentu
        // String [] - massiv strok, ego zovut args

        String str1 = args[0];
        int num1 = Integer.parseInt(str1);

        String str2 = args [1];
        int num2 = Integer.parseInt(str2);

        System.out.println(str1 + " * " + str2 + " = " + num1 * num2);


    }




}
