import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class TicTacToe {
    //Create board outside main method
    static String [][] board = new String[3][3];
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //Game simulation happens here

    }


    //Helper methods go here
    private static void clearBoard(Scanner scan, String prompt){
        boolean cleanBoard;
        String userInput;

        System.out.println(prompt);
        do {
            userInput = scan.nextLine();
            if (userInput = scan.nextLine()) {
                cleanBoard = true;
            } else {
                System.out.println();
            }
        } while (!cleanBoard);
        return; userInput;

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
