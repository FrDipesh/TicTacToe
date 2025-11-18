import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] board = new String[3][3];
        boolean clearBoard = false;
        String userInput = "";

        if (userInput.equalsIgnoreCase("y")) {
            for (int r = 0; r < board.length; r++) {
                for (int c = 0; c < board[0].length; c++) {
                    board[r][c] = "-";
                }
                for (r = 0; r < board.length; r++) {
                    for (int c = 0; c < board[0].length; c++) {
                        System.out.printf("%-4d", board[r][c]);
                    }
                    System.out.println();
                }

            }
        }
    }
}
