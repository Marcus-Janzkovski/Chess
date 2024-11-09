package chess.Pieces;

import chess.Board;
import chess.Celltype;

public class Queen extends Piece{

    public Queen(Celltype name, Color color) {
        super(name, color);
       
    }

    @Override
    public boolean  moveAllowed(String init, String target,Board board) {
      
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

        int delta_row = Math.abs(celrow_init - celrow_target);
        int delta_col = Math.abs(celcol_int - celcol_target);


        System.out.println(celcol_target);

        if (delta_col  == delta_row) { // diagonal
            return true;
        }

        if ( (delta_row == 0 ) && (delta_col != 0)) { // move in same row 
            return true;
        }

        if ( (delta_col == 0) && (delta_row != 0)) { // move in same col 
            return true;
        }

        return false; // any other case




    }

    


}
