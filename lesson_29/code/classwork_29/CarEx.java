package classwork_29;

public class CarEx {
    private  String model = "bmw";
    private static int countOfWheels = 4;

    class Wheel {
        void printInfo (){
            System.out.println(CarEx.countOfWheels);
            System.out.println(CarEx.this.model);
        }


    }
    static class Driver {

        void printInfo() {
            System.out.println(CarEx.countOfWheels);

        }
    }
}
