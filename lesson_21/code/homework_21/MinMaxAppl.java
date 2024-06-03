package homework;

public class MinMaxAppl {

    public static void main(String[] args) {
        if (args.length == 0) {
            printMinMaxValues(new String[]{"byte", "short", "char", "int", "long", "float", "double"});
        } else {
            printMinMaxValues(args);

        }
    }

    public static void printMinMaxValues(String[] args) {
        for (int i = 0; i < args.length ; i++) {
            switch (args[i]) {
                case "byte" -> {
                    System.out.println("byte Min: " + Byte.MIN_VALUE);
                    System.out.println("byte Max: " + Byte.MAX_VALUE);
                }
                case "short" -> {
                    System.out.println("short Min: " + Short.MIN_VALUE);
                    System.out.println("short Max" + Short.MAX_VALUE);
                }
                case "char" -> {
                    System.out.println("char Min: " + (int) Character.MIN_VALUE);
                    System.out.println("char Max: " + (int) Character.MAX_VALUE);
                }
                case "int" -> {
                    System.out.println("int Min: " + Integer.MIN_VALUE);
                    System.out.println("short Max: " + Integer.MAX_VALUE);
                }
                case "long" -> {
                    System.out.println("long Min: " + Long.MIN_VALUE);
                    System.out.println("long Max: " + Long.MAX_VALUE);
                }
                case "float" -> {
                    System.out.println("float Min: " + Float.MIN_VALUE);
                    System.out.println("float Max: " + Float.MAX_VALUE);
                }
                case "double" -> {
                    System.out.println("double Min: " + Double.MIN_VALUE);
                    System.out.println("double Max: " + Double.MAX_VALUE);
                }
                default -> {
                    System.out.println(args[i] + "error type");
                }
            }
        }
    }
}

