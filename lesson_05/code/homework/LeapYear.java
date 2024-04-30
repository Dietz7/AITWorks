package homework;

public class LeapYear {
    public static void main(String[] args) {
        int year = 1700;

        if( year % 4 == 0 ){
            System.out.println("This is leap year.");
        } else {
            System.out.println("This is NOT leap year.");
        }
    }
}
