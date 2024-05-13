package classwork_28.interfaces.gadgets;

public interface RemoteController {
    void on();
    void off();
    void plus();
    void minus();
    default void reset() {
        this.off();
    }
}
