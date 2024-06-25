package models;

import java.util.ArrayList;

public class MGame {
    private int roundCount;
    private final Die[] dice;
    private final Board board;
    private final ArrayList<Player> players;

    public MGame(Die[] dice, Board board, ArrayList<Player> players) {
        setRoundCount(0);
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