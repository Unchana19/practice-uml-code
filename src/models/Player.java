package models;

import java.util.List;

public class Player {
    private String name;
    private Piece piece;
    private Board board;
    private List<Die> dice;

    public Player(String name, Piece piece, Board board, List<Die> dice) {
        this.name = name;
        this.piece = piece;
        this.board = board;
        this.dice = dice;
    }

    public void takeTurn() {
        int faceValueTotal = 0;
        for (Die die : dice) {
            die.roll();
            faceValueTotal += die.getFaceValue();
        }

        Sqaure oldLocation = piece.getLocation();
        Sqaure newLocation = board.getSquare(oldLocation, faceValueTotal);
        piece.setLocation(newLocation);
    }

    public String getName() {
        return name;
    }
}

// 6510405865 Oanchana Changcharoen