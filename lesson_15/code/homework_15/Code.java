package homework_15;

public class Code {
    // Method for defining (returning) the length of the barcode.
    public static int lengthCode(String code) {
        return String.valueOf(code).length();
    }

    // Method for calculating (returning) the sum of all digits of the barcode
    public static int controlSum(String code) {
        int sum = 0;
        for (int i = 0; i < code.length(); i++) {
            char digitChar = code.charAt(i);
            if (Character.isDigit(digitChar)) {
                sum += Character.getNumericValue(digitChar);
            }
        }
        return sum;
    }

    // Method for checking the correct number of digits
    public static boolean isValid(String code) {
        int length = lengthCode(code);
        return length == 8 || length == 13;
    }

    public static void main(String[] args) {
        String barcode = "1234567891111"; // we are using String because long cannot accept 13 or more numbers
        System.out.println("Length of our barcode: " + lengthCode(barcode));
        System.out.println("Control sum of barcode: " + controlSum(barcode));
        System.out.println("Is barcode valid: " + isValid(barcode));
    }
}