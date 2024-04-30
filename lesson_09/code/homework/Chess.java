package homework;

public class Chess {
    public static void main(String[] args) {
        int size = 8; //  the size of the chessboard, which is an 8x8 grid.
        int i = 0; // this variable iterates (goes through again) over the ROWS of the chessboard.

        // Use a while loop for rows
        while (i < size) {
            int j = 0; // this variable iterates (goes through again) over the COLUMNS of the chessboard.

            // Use a while loop for columns
            while (j < size) {
                int cellValue = (i + j) % 2; // Вычисляем значение текущей ячейки на основе шаблона
                // (чередование 0 и 1).
                //вычисляем остаток при делении суммы i и j на 2.

                // Print the cell value
                System.out.print(cellValue + " ");

                // Move to the next column
                j++;
            }

            // Move to the next line after completing a row
            System.out.println();

            // Move to the next row
            i++;
        }
    }
}
