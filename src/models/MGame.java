package models;

import java.util.ArrayList;
import java.util.List;

public class MGame {
    private int roundCount;
    private List<Die> dice;
    private Board board;
    private ArrayList<Player> players;

    public MGame(int roundCount, List<Die> dice, Board board, ArrayList<Player> players) {
        this.roundCount = roundCount;
        this.dice = dice;
        this.board = board;
        this.players = players;
    }

    public void playGame(int round) {
        while(getRoundCount() < round) {
            playRound();
        }
    }

    private void playRound() {
        setRoundCount(getRoundCount() + 1);
        for (Player player : players) {
            player.takeTurn();
        }
    }

    public int getRoundCount() {
        return roundCount;
    }

    public void setRoundCount(int roundCount) {
        this.roundCount = roundCount;
    }
}

// 6510405865 Oanchana Changcharoen