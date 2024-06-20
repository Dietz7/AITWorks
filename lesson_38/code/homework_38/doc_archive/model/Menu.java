package homework_38.doc_archive.model;

public enum Menu {
    ADD(1, "Add document"), LIST(2, "List of documents"), QUANTITY(3, "Quantity"),
    EXIT (4, "Exit");
    private int menuItem;
    private String action;

    Menu(int menuItem, String action) {
        this.menuItem = menuItem;
        this.action = action;
    }

    public static void printMenu(){
        Menu[] menu = Menu.values();
        for (int i = 0; i < menu.length; i++) {
            System.out.println((menu[i].menuItem) + " - " + menu[i].action + " | ");
        }
        System.out.println();
    }
}
