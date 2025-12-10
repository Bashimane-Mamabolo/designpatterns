package com.bash;

import java.util.Scanner;

public class TicTacToe {
    // Initialize the gate state and players.
    public Player currentPlayer;
    public Player player1;
    public Player player2;
    Board board;

    public TicTacToe() {
        player1 = new Player("Shimmy", "X");
        player2 = new Player("Simon", "0");

        board = new Board();

        this.currentPlayer = player1;
    }

    public void switchPlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else  {
            currentPlayer = player1;
        }
    }

    Scanner scanner;
    public void play() {
        while (true) {
            board.displayBoard();
            System.out.println();
            System.out.println(currentPlayer.getName() + "'s turn to play.");
            System.out.print("Enter row [0, 1, 2]: ");
            scanner = new Scanner(System.in);
            int rowInt = scanner.nextInt();
            System.out.print("Enter column [0, 1, 2]: ");
            int columnInt = scanner.nextInt();

            if (board.makeMove(rowInt, columnInt, currentPlayer.getSymbol())) {
                if (board.checkForWin(currentPlayer.getSymbol())) {
                    board.displayBoard();
                    System.out.println(currentPlayer.getName() + " is a winner.CONGRATULATIONS!");
                    break;
                } else if (board.isBoardFull()) {
                    board.displayBoard();
                    System.out.println("There is no winner!. DRAW");
                    break;
                }
                this.switchPlayer();
            } else  {
                System.out.println("Invalid move try again.");
            }
        }
    }



}
