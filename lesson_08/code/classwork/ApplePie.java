package classwork;

public class ApplePie {
    public static void main(String[] args) {
        int apples = 30;
        int counter = 0;
        int applesInBasket = apples;

        while (applesInBasket > 0) {
            // cycle body
            System.out.println("take one apple from basket");
            applesInBasket = applesInBasket - 1;
            System.out.println("We have apples " + applesInBasket + "now");
            counter++;
        }
        System.out.println("The job is done.total apples " + counter + " added in pie");
    }
}
