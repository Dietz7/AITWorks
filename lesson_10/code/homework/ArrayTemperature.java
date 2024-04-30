package homework;
/*Collect data on daytime temperatures in your city and the past week into an array.
// Print the temperature that was on Tuesday and then on Thursday.
Find the average temperature for the past week. */

public class ArrayTemperature {
    public static void main(String[] args) {
        int [] dataOfTemperatures = {9, 12, 10, 11, 9, 8, 9};
        int sumTemp = 0;
        double averageTemp = 0;
        System.out.println("The temperature on Tuesday was : " + dataOfTemperatures [1]);
        System.out.println("The temperature on Thursday was : " + dataOfTemperatures [3]);

        for (int i = 0; i < dataOfTemperatures.length; i++) {
            sumTemp += dataOfTemperatures [i];
        }
        averageTemp = (double) sumTemp / dataOfTemperatures.length;
        System.out.println("The average temperature was : " + averageTemp + " celsius");
        System.out.printf("The average temperature was : = %.2f", averageTemp);
    }
}
