package classwork_30.lambda_button;

public class Button {
    private String title;
    private Action action;

    public Button(String title, Action action) {
        this.title = title;
        this.action = action;
    }

    @Override
    public String toString() {
        return "Button{" +
                "title='" + title + '\'' +
                ", action=" + action +
                '}';
    }

    public void click(){
        System.out.println("put button " + this.title);
        this.action.perform();
    }
}
