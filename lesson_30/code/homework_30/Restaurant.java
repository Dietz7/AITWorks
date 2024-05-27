package homework_30;

public class Restaurant {
    public static void main(String[] args) {
        Cook cookingProcess = new Cook() {
            @Override
            public void startCooking() {
                System.out.println("The cooking just started");
            }
        };

        Kitchen kitchen = new Kitchen();
        kitchen.makeOrder(cookingProcess);
    }
}
