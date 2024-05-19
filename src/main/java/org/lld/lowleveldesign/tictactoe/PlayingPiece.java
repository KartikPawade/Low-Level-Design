package org.lld.lowleveldesign.tictactoe;

abstract class PlayingPiece {
    PlayingPieceType playingPieceType;

    PlayingPiece(PlayingPieceType playingPieceType) {
        this.playingPieceType = playingPieceType;
    }
}
