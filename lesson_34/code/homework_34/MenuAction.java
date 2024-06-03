package homework_34;

public enum MenuAction {
    ADD_NOTE(1, "Add a note"), SEE_ALL_NOTES(2, "See all notes"),
    DELETE_NOTE_EXIT(3, "Delete note"), EXIT(4, "Exit");
    private int number;
    private String description;

    MenuAction(int number, String description) {
        this.number = number;
        this.description = description;
    }

    public static void printMenu() {
        for (MenuAction action : values()) {
            System.out.println(action.number + ". " + action.description);
        }
    }

}
