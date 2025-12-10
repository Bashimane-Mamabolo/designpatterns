package com.bash;

public class Board {

    // Can also initialize inside constructor block
    public String[][] board = new String[][]
                    {       {" ", " ", " "},
                            {" ", " ", " "},
                            {" ", " ", " "}
                    };

    // Display the board
    public void displayBoard() {
        for (String[] strings : board) {
            for (String string : strings) {
                System.out.print("|");
                System.out.print(string);

            }
            System.out.println("|");
        }
    }

    // Make a move for a player using their symbol 'X' or '0'
    public boolean makeMove(int row, int col, String symbol) {

        // Can validate user input to make sure we're working with valid data. No need for validation here then.
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length) {
            System.out.println("Invalid row or column");
            return false;
        }
        if (!board[row][col].equals(" ")) {
            return false;
        }
        board[row][col] = symbol;
        return true;
    }

    // Check if the board is full, leads to a draw
    public boolean isBoardFull() {

        for (String[] strings : board) {
            for (String string : strings) {
                if (string.equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }

    // Check for a win. VERTICAL, HORIZONTAL or DIAGONAL(forward and back)
    public boolean checkForWin(String symbol) {
        return checkForWinHorizontal(symbol) || checkForWinVertical(symbol) || checkForWinDiagonal(symbol);
    }

    private boolean checkForWinVertical(String symbol) {
        int i = 0;
        for (int j = 0; j < board[i].length; j++) {
            if (symbol.equals(board[i][j]) && symbol.equals(board[i + 1][j]) && symbol.equals(board[i + 2][j])) {
                return true;
            }
        }
        return false;
    }

    private boolean checkForWinHorizontal(String symbol) {
        int j = 0;
        for (String[] strings : board) {
            if (symbol.equals(strings[j]) && symbol.equals(strings[j + 1]) && symbol.equals(strings[j + 2])) {
                return true;
            }
        }
        return false;
    }

    private boolean checkForWinDiagonal(String symbol) {
        int i = 0;
        if (symbol.equals(board[i][i]) && symbol.equals(board[i + 1][i + 1]) && symbol.equals(board[i + 2][i + 2])) {
            return true;
        } else  return symbol.equals(board[i + 2][i]) && symbol.equals(board[i + 1][i + 1]) && symbol.equals(board[i][i + 2]);
    }

}
