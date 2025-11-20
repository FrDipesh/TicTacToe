import java.util.Scanner;

public class TicTacToe {
    //Create board outside main method
    static String [][] board = new String[3][3];
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //Game simulation happens here
        System.out.println("Welcome to Tic-Tac-Toe!");
        clearBoard();
        displayBoard();
        isValidMove();
    }

    //Helper methods go here
    private static void clearBoard(){
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++){
                board[r][c] = "-";
            }
        }
    }

    private static void displayBoard(){
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                System.out.printf("%-4s", board[r][c]);
            }
            System.out.println();
        }
    }

    private static boolean isValidMove(int row, int col){
        String blankSpace = "-";
        if (board[row][col].equals("-")) {
            return  true;
            else{
                return false;
            }
        }

    }

}