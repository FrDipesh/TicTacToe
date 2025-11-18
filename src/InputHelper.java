import java.util.Scanner;
import javax.swing.*;
import java.util.SortedMap;

public class InputHelper {
    static String [][] board = new String[3][3];
    Scanner scanner = new Scanner(System.in);

    private static String clearBoard(Scanner scan, String prompt){
        boolean clearBoard = false;
        String userInput = "";

        System.out.println(prompt);
        do {
            if (scan.hasNextLine()) {
                userInput = scan.nextLine();
                if (userInput.equalsIgnoreCase("y")) {
                    for (int r = 0; r < board.length; r++) {
                        for (int c = 0; c < board[0].length; c++){
                            board[r][c] = "-";
                        }
                        for (r = 0; r < board.length; r++) {
                            for (int c = 0; c < board[0].length; c++) {
                                System.out.printf("%-4d", board[r][c]);
                            }
                            System.out.println();
                        }

                    }
                    clearBoard = true;
                } else if (userInput.equalsIgnoreCase("n")) {
                    clearBoard = true;
                } else {
                    System.out.println("Invalid Please pick [Y] or [N]");
                }
            }
        } while (!clearBoard);
        return userInput;

    }

    public static String getNonZeroLenString(Scanner scan, String prompt) {
        boolean valid = false;
        String userInput;

        System.out.println(prompt);
        do {
            userInput = scan.nextLine();
            if (userInput.length() > 0) {
                valid = true;
            }
            else{
                System.out.println("Error - must enter string of non-zero length");
            }
        } while (!valid);
        return userInput;
    }



}
