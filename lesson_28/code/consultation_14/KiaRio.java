package consultation_14;

public class KiaRio implements Car {
    @Override
    public void startEngine() {
        System.out.println("Kia rio is starting engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Kia rio is stopping engine");
    }

    @Override
    public void go() {
        System.out.println("Kia rio is going");
    }

    @Override
    public void stop() {
        System.out.println("Kia rio is stopping");
    }

    @Override
    public void lightOn() {
        System.out.println("Kia rio turned on lights");
    }

    @Override
    public void lightOff() {
        System.out.println("Kia rio turned off lights");
    }
}