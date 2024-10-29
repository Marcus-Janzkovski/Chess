package chess.Pieces;

import chess.Celltype;

public class Rook extends Piece {


    @SuppressWarnings("unused")
    private boolean moved;

    public Rook(Celltype name, Color color) {
        super(name, color);

        this.moved = false;
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean moveAllowed(String init, String target) {
        
         

        //Chess board reference
        char chessrow_init = init.charAt(1);
        char chesscol_init = init.charAt(0);

        char chessrow_target = target.charAt(1);
        char chesscol_target = target.charAt(0);

        //------------

        //matrix reference
        int celrow_init = 8 - chessrow_init - '0' ; 
        int celcol_int = chesscol_init - 'A';

        int celrow_target = 8 - chessrow_target - '0' ;  ; 
        int celcol_target = chesscol_target - 'A';

        //------------


        return (celrow_init == celrow_target && celcol_int != celcol_target ) || (celrow_init != celrow_target && celcol_int == celcol_target);

    }

}
