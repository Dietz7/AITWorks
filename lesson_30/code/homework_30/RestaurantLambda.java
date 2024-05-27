package homework_30;

public class RestaurantLambda {
    public static void main(String[] args) {
      Cook cookingProcess = () -> {
          System.out.println("started to cook");
          System.out.println("finished to cook");
      };
      Kitchen kitchen = new Kitchen();
      kitchen.makeOrder(cookingProcess);
    }
}
