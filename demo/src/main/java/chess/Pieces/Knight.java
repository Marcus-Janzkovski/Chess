package chess.Pieces;

import chess.Board;
import chess.Celltype;

public class Knight extends Piece {

    //rembember: Piece have name and color
  
    public Knight(Celltype name, Color color) {
        super(name, color);

    }

    @Override
    public boolean moveAllowed(String init, String target,Board board){

        

        //matrix reference
        int celrow_init = 8 - (init.charAt(1) - '0') ; 
        int celcol_init = init.charAt(0) - 'A';

        int celrow_target = 8 - (target.charAt(1) - '0') ;
        int celcol_target = target.charAt(0)- 'A';


        //------------

        int delta_row = Math.abs(celrow_init - celrow_target);
        int delta_col = Math.abs(celcol_init - celcol_target);
    

        if (!((delta_row == 2 && delta_col == 1) || (delta_row == 1 && delta_col == 2))){// check the "L" move for 8 possibilites, but otimized
            
            return false;

        } 


        if (board.getPieceAt(target) == null){ // check the color of target pos, if same color, not allowed
            return true;
        } else {
            return (board.getPieceAt(target).getColor() != this.getColor());
        }        


    }

}
