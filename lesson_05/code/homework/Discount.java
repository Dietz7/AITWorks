package homework;

public class Discount {
    public static void main(String[] args) {
        double priceA = 10.0; //
        double discountA = 20.0;

        double priceB = 15.0;
        double discountB = 15.0;

        int quantityA = 5;
        int quantityB = 3;

        double totalCost = calculateOfTotalPrice(priceA, discountA, quantityA, priceB, discountB, quantityB);
        System.out.println("Total cost before discount : " + totalCost + " Euro");
        double discountAmount = calculateDiscount(priceA, discountA, quantityA, priceB, discountB, quantityB);
        System.out.println("Discount : " + discountAmount + " Euro");
    }

    public static double calculateOfTotalPrice(double priceA,
                                               double discountA,
                                               int quantityA,
                                               double priceB,
                                               double discountB,
                                               int quantityB) {
        return (priceA * quantityA) + (priceB * quantityB);
    }

    public static double calculateDiscount(double priceA,
                                           double discountA,
                                           int quantityA,
                                           double priceB,
                                           double discountB,
                                           int quantityB) {
        double totalCost = (priceA * quantityA) + (priceB * quantityB);
        double discountAmount = (priceA * quantityA * (discountA / 100.0)) + (priceB * quantityB * (discountB / 100.0));
        if (totalCost > 100) {
            discountAmount += totalCost * 0.05;
        }

        return discountAmount;
    }
}