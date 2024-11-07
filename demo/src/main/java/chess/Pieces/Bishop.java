package chess.Pieces;

import chess.Celltype;

public class Bishop extends Piece {

    //rembember: Piece have name and color

    public Bishop(Celltype name, Color color) {
        super(name, color);
        
    }

    
    @Override
    public boolean moveAllowed(String init, String target){

        int celrow_init = 8 - (init.charAt(1) - '0') ; 
        int celcol_int = init.charAt(0) - 'A';

        int celrow_target = 8 - (target.charAt(1) - '0') ;
        int celcol_target = target.charAt(0)- 'A';

        //------------

        int delta_row = Math.abs(celrow_init - celrow_target);
        int delta_col = Math.abs(celcol_int - celcol_target);
    
        

        return (delta_row == delta_col); // check the diagonal move eg: 00 -> 11

        

    }
    









}
