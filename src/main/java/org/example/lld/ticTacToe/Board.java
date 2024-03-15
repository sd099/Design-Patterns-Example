package org.example.lld.ticTacToe;

import java.util.Objects;

public class Board {
    private String[][] board = null;
    private Integer size;

    public Board(int size) {
        this.board = new String[size][size];
        this.size = size;
    }

    public void printBoard() {
        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j]);
                } else {
                    System.out.print(" ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public Boolean insertIntoCellSuccessfully(String[] val, String piece) {
        if (val.length != 2) {
            return false;
        }

        int row = Integer.parseInt(val[0]);
        int col = Integer.parseInt(val[1]);

        if (row >= size || col >= size) {
            return false;
        }

        if (board[row][col] != null) {
            return false;
        }

        board[row][col] = piece;

        return true;
    }

    public Boolean isThereAnyWinner(String[] val) {

        int row = Integer.parseInt(val[0]);
        int col = Integer.parseInt(val[1]);

        if (rowWiseWinner(row, col) || columnWiseWinner(row, col) || diagonal1WiseWinner(row, col) || diagonal2WiseWinner(row,col)) {
            return true;
        }

        return false;
    }

    private boolean diagonal1WiseWinner(int row, int col) {
        int count = 0;
        int tempRow = row;
        int tempCol = col;

        while(tempCol>=0 && tempRow>=0) {
            count++;
            if (!Objects.equals(board[row][col], board[tempRow][tempCol])) {
                return false;
            }
            tempRow--;
            tempCol--;
        }
        tempRow = row+1;
        tempCol = col+1;

        while(tempCol<size && tempRow<size) {
            count++;
            if (!Objects.equals(board[row][col], board[tempRow][tempCol])) {
                return false;
            }
            tempRow++;
            tempCol++;
        }

        if (count == size) {
            return true;
        }

        return false;
    }

    private boolean diagonal2WiseWinner(int row, int col) {
        int count = 0;
        int tempRow = row;
        int tempCol = col;

        while(tempCol<size && tempRow>=0) {
            count++;
            if (!Objects.equals(board[row][col], board[tempRow][tempCol])) {
                return false;
            }
            tempRow--;
            tempCol++;
        }
        tempRow = row+1;
        tempCol = col-1;

        while(tempCol>=0 && tempRow<size) {
            count++;
            if (!Objects.equals(board[row][col], board[tempRow][tempCol])) {
                return false;
            }
            tempRow++;
            tempCol--;
        }

        if (count == size) {
            return true;
        }

        return false;
    }

    private boolean columnWiseWinner(int row, int col) {
        for (int i=0; i<size; i++) {
            if (!Objects.equals(board[i][col], board[row][col])) {
                return false;
            }
        }
        return true;
    }

    private boolean rowWiseWinner(int row, int col) {
        for (int i=0; i<size; i++) {
            if (!Objects.equals(board[row][i], board[row][col])) {
                return false;
            }
        }
        return true;
    }

    public Boolean isTheGameDraw() {
        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++) {
                if (board[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }

}
