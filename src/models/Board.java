package models;

import java.util.ArrayList;

public class Board {
    private final ArrayList<Square> squares;

    public Board(ArrayList<Square> sqaures) {
        this.squares = sqaures;
    }

    public Square getSquare(Square oldLocation, int faceValueTotal) {
        int oldIndex = squares.indexOf(oldLocation);
        int newIndex = (oldIndex + faceValueTotal) % squares.size();
        return squares.get(newIndex);
    }
}

// 6510405865 Oanchana Changcharoen
