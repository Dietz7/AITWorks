package classwork_30.lambda_button;

public class App {
    public static void main(String[] args) {
        Action action = ()-> {
                System.out.println("the world is getting better, wait a bit...");
                System.out.println("the world has become better");
        };

        
        Button button = new Button("make world better", action);

        button.click();
    }
}
