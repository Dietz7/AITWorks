package consultation_14;

public class Main {
    public static void main(String[] args) {
        Car car1 = new KiaRio();
        Car car2 = new BMWM5();

        car1.go();
        car2.lightOn();
        car2.startEngine();
        car1.stopEngine();
        car2.go();
        car1.stop();
    }
}
