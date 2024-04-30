package consultation;

public class TernaryOperator {
    public static void main(String[] args) {
        String x;

        if (2 > 1) {
            x = "znachenie1";
        } else {
            x = "znachenie2";
        }
        System.out.println(x);
    }
}


class TernaryOperator2 {
    public static void main(String[] args) {
        String x;

        if (2 > 1) {
            x = "znachenie1";
        } else {
            x = "znachenie2";
        }
        x = 2 >1 ? "znachenie1" : "znachenie2";

        System.out.println(x);
    }
}