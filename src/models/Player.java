package models;

public class Player {
    private String name;
    private final Piece piece;
    private final Board board;
    private final Die[] dice;

    public Player(String name, Piece piece, Board board, Die[] dice) {
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

        Square oldLocation = piece.getLocation();
        Square newLocation = board.getSquare(oldLocation, faceValueTotal);
        piece.setLocation(newLocation);
    }

    public String getName() {
        return name;
    }
}

// 6510405865 Oanchana Changcharoen