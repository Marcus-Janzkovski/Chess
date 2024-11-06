package chess.Pieces;

import chess.Celltype;

public class Bishop extends Piece {

    //rembember: Piece have name and color

    public Bishop(Celltype name, Color color) {
        super(name, color);
        
    }

    
    @Override
    public boolean moveAllowed(String init, String target){

        

        //Chess board reference
        char chessrow_init = init.charAt(1);
        char chesscol_init = init.charAt(0);

        char chessrow_target = target.charAt(1);
        char chesscol_target = target.charAt(0);

        //------------

        //matrix reference
        int celrow_init = 8 - (chessrow_init - '0') ; 
        int celcol_int = chesscol_init - 'A';

        int celrow_target = 8 - (chessrow_target - '0') ;
        int celcol_target = chesscol_target - 'A';

        //------------

        int delta_row = Math.abs(celrow_init - celrow_target);
        int delta_col = Math.abs(celcol_int - celcol_target);
    
        

        return (delta_row == delta_col); // check the diagonal move eg: 00 -> 11

    }
    

}
