import models.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Square> squares = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            squares.add(new Square("Square " + (i + 1)));
        }

        Board board = new Board(squares);

        Die die1 = new Die();
        Die die2 = new Die();
        Die die3 = new Die();
        Die die4 = new Die();
        Die[] dice1 = { die1, die2 };
        Die[] dice2 = { die3, die4 };

        Piece piece1 = new Piece(squares.get(0));
        piece1.setLocation(squares.get(0));

        Piece piece2 = new Piece(squares.get(0));
        piece2.setLocation(squares.get(0));

        Player player1 = new Player("Player1", piece1, board, dice1);
        Player player2 = new Player("Player2", piece2, board, dice2);

        ArrayList<Player> players = new ArrayList<>(Arrays.asList(player1, player2));
        MGame game = new MGame(dice1, board, players);

        game.playGame(5);
    }
}


// 6510405865 Oanchana Changcharoen