package org.example.ticTacToe;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GameController {
    private Queue<Player> players = new LinkedList<>();
    private Board board;

    public void startGame() {
        initializeGame();

        System.out.println("Game Started:");

        outerLoop: while(true) {
            Player player = players.peek();
            players.poll();
            players.add(player);

            Boolean isValidInputFromUser = false;

            while(!isValidInputFromUser) {
                System.out.println(player.getName() + ", please enter row and column number to add  "+ player.getPiece());
                Scanner scanner = new Scanner(System.in);
                String s = scanner.nextLine();
                String[] val = s.split(",");

                Boolean successfullyInserted = board.insertIntoCellSuccessfully(val, player.getPiece());
                if (!successfullyInserted) {
                    continue;
                } else {
                    board.printBoard();
                    isValidInputFromUser = true;
                }
                if (board.isThereAnyWinner(val)) {
                    System.out.println("Game Over. " + player.getName() + " is the winner");
                    break outerLoop;
                }
                if (board.isTheGameDraw()) {
                    System.out.println("Game Draw");
                    break outerLoop;
                }
            }
        }

    }

    private void initializeGame() {
        getPlayerDetails();
        getBoardDetails();
    }

    private void getBoardDetails() {
        System.out.println("Enter board size");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        board = new Board(Integer.parseInt(s));
    }

    private void getPlayerDetails() {
        System.out.println("Enter 1st player name and piece");
        Player player1 = getPlayer();
        players.add(player1);
        System.out.println("Enter 2nd player name and piece");
        Player player2 = getPlayer();
        players.add(player2);
    }

    private Player getPlayer() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] val = s.split(",");
        if (val.length != 2) {
            System.out.println("Invalid Input");
        }
        return new Player(val[0], val[1]);
    }
}
