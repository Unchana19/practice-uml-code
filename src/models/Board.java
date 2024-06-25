package models;

import java.util.ArrayList;

public class Board {
    private ArrayList<Sqaure> sqaures;

    public Board(ArrayList<Sqaure> sqaures) {
        this.sqaures = sqaures;
    }

    public Sqaure getSquare(Sqaure oldLocation, int faceValueTotal) {
        int oldIndex = sqaures.indexOf(oldLocation);
        int newIndex = (oldIndex + faceValueTotal) % sqaures.size();
        return sqaures.get(newIndex);
    }
}

// 6510405865 Oanchana Changcharoen
