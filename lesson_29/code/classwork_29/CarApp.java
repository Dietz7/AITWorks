package classwork_29;

public class CarApp {
    public static void main(String[] args) {
        Transport bmw = new Transport("bmw", "personal", 6);
        System.out.println(bmw);


        bmw.go();
        bmw.handleAnimalOnWay();

    }
}


