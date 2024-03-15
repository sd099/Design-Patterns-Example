package org.example.lld.snakeAndLadder;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GameController {
    private Board board = new Board();
    private Queue<Player> players = new LinkedList<>();
    private Dice dice = new Dice();

    private void init() {
        board.init();
        initPlayers();
    }

    private void initPlayers() {
        System.out.println("Enter total number of players");
        Scanner scanner = new Scanner(System.in);
        int playersNo = scanner.nextInt();
        int i=1;
        while(playersNo>0) {
            System.out.println("Enter name for player "+i);
            Scanner scanner1 = new Scanner(System.in);
            String name = scanner1.nextLine();
            players.add(new Player(name, 0));
            playersNo--;
            i++;
        }
    }

    public void startGame() {
        init();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            Player currPlayer = players.poll();

            System.out.println(currPlayer.getName() +"'s turn. press any switch to roll the dice");
            String s = scanner.nextLine();
            if (!s.isEmpty()) {
                int num = dice.roll();
                System.out.println("Dice number: " + num);
                if (currPlayer.getPos() + num > 99) {
                    System.out.println("Out of board. try next time");
                } else if (currPlayer.getPos() + num == 99) {
                    System.out.println("Winner!!! "+ currPlayer.getName() + " is winner");
                    break;
                } else {
                    int st = 0;

                    for(JumpPoints snake : board.getSnakes()) {
                        if (snake.getStart() == currPlayer.getPos() + num) {
                            currPlayer.setPos(snake.getEnd());
                            System.out.println("Bitten by snake");
                            st = 1;
                        }
                    }
                    if (st == 0) {
                        for(JumpPoints ladder : board.getSnakes()) {
                            if (ladder.getStart() == currPlayer.getPos() + num) {
                                currPlayer.setPos(ladder.getEnd());
                                System.out.println("Climbing ladder");
                                st = 1;
                            }
                        }
                    }
                    if (st == 0) {
                        currPlayer.setPos(currPlayer.getPos() + num);
                    }

                    System.out.println(currPlayer.getName() + "'s current position: "+ currPlayer.getPos());
                }
            }

            players.add(currPlayer);

        }
    }


}
