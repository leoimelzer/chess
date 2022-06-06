package br.com.leomelzer.chess;

import br.com.leomelzer.boardgame.Board;
import br.com.leomelzer.boardgame.Piece;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
