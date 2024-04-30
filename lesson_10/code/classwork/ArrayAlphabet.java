package classwork;
//Создайте массив и заполните его символами латинского алфавита от A до Z.
//Раcпечатайте полученный массив.


public class ArrayAlphabet {
    public static void main(String[] args) {
       // from 1 to 20
        int [] arrayNum = new int[20]; // opredilili massiv
        // zapolnyaem massiv dannymi
        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum [i] = i + 1;
        }
          //pechatajem massiv
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print(arrayNum [i] + " | ");
        }

        System.out.println();

        char [] alphabet = new char[26]; // opredilili massiv po umolchaniju zapolnen /0
        for (int i = 0; i < alphabet.length; i++) {
            alphabet [i] = (char) (65 + i);
            System.out.print(alphabet[i] + " | ");
        }

        System.out.println();
        System.out.println(alphabet);
    }
}
