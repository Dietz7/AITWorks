package homework_34;

public enum MenuAction {
    ADD_NOTE(1, "Add a note"), SEE_ALL_NOTES(2, "See all notes"),
    DELETE_NOTE(3, "Delete the note by number"), EDIT_NOTE(4, "Edit the note"),
    EXIT(5, "Exit");
    private int number;
    private String description;

    MenuAction(int number, String description) {
        this.number = number;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public static void printMenu(){
        for (MenuAction action : MenuAction.values()) {
            System.out.println(action.getNumber() + ". " + action.getDescription() );
        }
    }
}
