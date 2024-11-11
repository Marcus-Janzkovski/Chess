package chess.Pieces;

import chess.Board;
import chess.Celltype;

public class Rook extends Piece {



    private boolean moved;


    public boolean isMoved() {
        return moved;
    }

    public void setMoved(boolean moved) {
        this.moved = moved;
    }



    public Rook(Color color) {
        super(color);

        this.moved = false;
        
        setName(Celltype.ROOK);
    }

    @Override
    public boolean moveAllowed(String init, String target,Board board) {
        
         

        //Chess board reference
        char chessrow_init = init.charAt(1);
        char chesscol_init = init.charAt(0);

        char chessrow_target = target.charAt(1);
        char chesscol_target = target.charAt(0);

        //------------

        //matrix reference
        int celrow_init = 8 - (chessrow_init - '0') ; 
        int celcol_int = chesscol_init - 'A';

        int celrow_target = 8 - (chessrow_target - '0');
        int celcol_target = chesscol_target - 'A';

        //------------


        return (celrow_init == celrow_target && celcol_int != celcol_target ) || (celrow_init != celrow_target && celcol_int == celcol_target);

    }

}
