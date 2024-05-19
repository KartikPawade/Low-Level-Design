package org.lld.lowleveldesign.tictactoe;

public class Board {
    private int size;
    private PlayingPiece[][] board;

    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }
}
