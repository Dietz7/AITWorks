package homework_39.sprint;

public enum Menu {

    ADD(1, "Adding participants"), LIST(2, "Display protocol"), EXIT(3, "Exit");
    int item;
    String action;

    Menu(int item, String action) {
        this.item = item;
        this.action = action;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
