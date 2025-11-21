import java.util.Scanner;

public class TicTacToe {
    //Create board outside main method
    static String [][] board = new String[3][3];
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //Game simulation happens here
        System.out.println("Welcome to Tic-Tac-Toe!");
    }

    //Helper methods go here
    private static void clearBoard(){
        for (int r = 0; r < board.length; r++){
            for (int c = 0; c < board[0].length; c++){
                board[r][c] = "-";
            }
        }
    }

    private static void displayBoard(){
        for (int r = 0; r < board.length; r++){
            for (int c = 0; c < board[0].length; c++) {
                System.out.printf("%-4s", board[r][c]);
            }
            System.out.println();
        }
    }

    private static boolean isValidMove(int row, int col){
        if (board[row][col].equals("-")) {
            return  true;
        }
        return false;
    }

    private static boolean isRowWin(String player){
        for (int row = 0; row < 3; row++) {
            if (board[row][0].equals(player) && board[row][1].equals(player) && board[row][2].equals(player)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isColWin(String player){
        for (int col = 0; col < 3; col++) {
            if (board[col][0].equals(player) && board[col][1].equals(player) && board[col][2].equals(player)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isDiagonalWin(String player){
        for (int dia = 0; dia < 3; dia++) {
            //Left dia
            if (board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)) {
                return true;
            }
            //Right dia
                if (board[2][0].equals(player) && board[1][1].equals(player) && board[0][2].equals(player)) {
                    return true;
                }
            }
        return false;
    }



}