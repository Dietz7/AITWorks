package classwork_28.interfaces.gadgets;

public class TV implements RemoteController{

    @Override
    public void on() {
        System.out.println("TV is on");
    }
    @Override
    public void off () {
        System.out.println("TV is off");
    }

    @Override
    public void minus () {
        System.out.println("TV makes minus");
    }

    @Override
    public void plus () {
        System.out.println("TV makes plus");
    }
}
