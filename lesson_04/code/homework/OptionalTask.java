package homework;
// Jan 2024 = 23 working days * 2 journeys + 4 days off * 1,5 journeys = 52 journeys
// to calculate and round up the total number of journeys per month, average value of one journey.

public class OptionalTask {
    public static void main(String[] args) {

        double price = 49;
        double day = 23;
        double AmountofJourneys = quantityOfJourneys (day);

        System.out.printf("Quantity of journeys per month = %.0f \n", quantityOfJourneys(day));

        System.out.printf("Average price per journey = %.2f", averageofPrice(price,AmountofJourneys));

    } //end of main

    public static double averageofPrice (double a, double b){
        return a / b;

    }

    public static double quantityOfJourneys (double q){
        return q * 2 + 4 * 1.5;
}

} //end of class
