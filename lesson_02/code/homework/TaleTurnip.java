package homework;


public class TaleTurnip {
    public static void main(String[] args) {
        System.out.println("Turnip Russian Tale");

        beginning();
        team();
        happyend();
        moral();

    }// end of main

    private static void beginning() {
        System.out.println("An old man planted a turnip and the turnip grew to be enormous\n"
                + "It was time to pull her out");
    }
    private static void team() {
        grandpa();
        grandma();
        granddaughter();
        dog();
        cat();
        mouse();
    }
    private static void grandpa() {
        System.out.println("The grandpa could not pull the turnip out and called over the grandma");
    }
    private static void grandma() {
        System.out.println("The grandma took hold of the grandpa");
    }
    private static void granddaughter() {
        System.out.println("The granddaughter took hold of the grandma");
    }
    private static void dog() {
        System.out.println("Zhuckha took hold of the granddaughter");
    }
    private static void cat() {
        System.out.println("The cat took hold of the dog");
    }
    private static void mouse() {
        System.out.println("The mouse took hold of the cat");
    }
    private static void happyend() {
        System.out.println("And finally they pulled out the turnip all together");
    }
    private static void moral() {
        System.out.println("Moral of the story: The power of unity and importance of teamwork");
    }

}
