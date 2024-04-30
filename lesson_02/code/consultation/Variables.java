package consultation;

public class Variables {
    public static void main(String[] args) {
        long x = 999999999; // x <<10000
        short y= (short) x;
        // otbrosit chast dannyh dljya okruglenia
        //otbrosit chast dannyh dljya kogda vu znajete chto strogo
        // ogranischeno menschim diapozonom pamyati
        char c = 103;
        System.out.println((char) (c + 10));

        System.out.println(y);
    }

}
