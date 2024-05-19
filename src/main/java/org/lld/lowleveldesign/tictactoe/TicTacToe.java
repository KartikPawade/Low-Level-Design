package org.lld.lowleveldesign.tictactoe;

import java.util.LinkedList;
import java.util.Queue;

public class TicTacToe implements Game{
    Queue<Player> players;
    private Board board;


    @Override
    public void start() {
        initializeGame();
    }
    private void initializeGame(){
        players = new LinkedList<>();

        PlayingPiece crossPiece = new PlayingPieceX();
        Player kartik = new Player("kartik", crossPiece);

        PlayingPiece noughtPiece = new PlayingPieceO();
        Player anurag = new Player("anurag", noughtPiece);

        players.add(kartik);
        players.add(anurag);

        board= new Board(3);
    }

    @Override
    public void quit() {

    }
}
