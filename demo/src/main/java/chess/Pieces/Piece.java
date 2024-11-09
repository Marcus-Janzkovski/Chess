package chess.Pieces;

import chess.Board;
import chess.Celltype;

public abstract class Piece {

    private Celltype name;
    private Color color;

    public Piece (Celltype name, Color color) {
        this.name = name;
        this.color = color;
    }


    public abstract boolean moveAllowed(String init, String target, Board board); //Check the nature of movement

    
    public Celltype getName(){
        return this.name;
    }

    public Color getColor(){
        return this.color;
    }





}
