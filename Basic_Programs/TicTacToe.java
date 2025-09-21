package Basic_Programs;

import java.util.Scanner;

public class TicTacToe {
    static char[][] board = new char[3][3];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean play = true;
        while (play) {
            resetBoard();
            char player = 'X';
            boolean gameOver = false;
            while (!gameOver) {
                printBoard();
                System.out.println("Player " + player + " turn:");
                int r = sc.nextInt();
                int c = sc.nextInt();
                if (r < 0 || r > 2 || c < 0 || c > 2 || board[r][c] != ' ') {
                    System.out.println("Invalid move, try again");
                    continue;
                }
                board[r][c] = player;
                if (checkWin(player)) {
                    printBoard();
                    System.out.println("Player " + player + " wins!");
                    gameOver = true;
                } else if (isDraw()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameOver = true;
                } else {
                    player = (player == 'X') ? 'O' : 'X';
                }
            }
            System.out.println("Play again? (y/n)");
            char ans = sc.next().charAt(0);
            if (ans != 'y' && ans != 'Y') play = false;
        }
    }

    static void resetBoard() {
        for (int i = 0; i < 3; i++) 
            for (int j = 0; j < 3; j++) 
                board[i][j] = ' ';
    }

    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("-----");
        }
    }

    static boolean checkWin(char p) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == p && board[i][1] == p && board[i][2] == p) return true;
            if (board[0][i] == p && board[1][i] == p && board[2][i] == p) return true;
        }
        if (board[0][0] == p && board[1][1] == p && board[2][2] == p) return true;
        if (board[0][2] == p && board[1][1] == p && board[2][0] == p) return true;
        return false;
    }

    static boolean isDraw() {
        for (int i = 0; i < 3; i++) 
            for (int j = 0; j < 3; j++) 
                if (board[i][j] == ' ') return false;
        return true;
    }
}
