package br.com.leomelzer.chess.pieces;

import br.com.leomelzer.boardgame.Board;
import br.com.leomelzer.chess.ChessPiece;
import br.com.leomelzer.chess.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "R";
    }
}
