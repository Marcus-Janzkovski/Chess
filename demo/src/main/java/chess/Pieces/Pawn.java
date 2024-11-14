package chess.Pieces;

import chess.Board;
import chess.Celltype;

public class Pawn extends Piece {

    public Pawn(Color color) {

        super(color);
        setName(Celltype.PAWN);
    }

    @Override
    public boolean moveAllowed(String init, String target,Board board) {

        
        //matrix reference
        int celrow_init = 8 - (init.charAt(1) - '0') ; 
        
        int celcol_init = init.charAt(0) - 'A';

        int celrow_target = 8 - (target.charAt(1) - '0') ;
        
        int celcol_target = target.charAt(0)- 'A';

        int difrow = celrow_target - celrow_init;
        int difcol = celcol_target - celcol_init;

        int delta_col = Math.abs(difcol);


        //------------


        if (difcol == 0){ //Move straightfoward, no diagonals check

            if (this.getColor() == Color.WHITE){ //White goes up

                if (difrow == -1){
                    return board.getPieceAt(target) == null;
                }
                if (difrow == -2){
                    if(this.isMoved()){
                        return false;
                    } else {
                        return ((board.getCells()[celrow_init-1][celcol_target].getPiece() == null) && (board.getPieceAt(target) == null));
                    }
                }
            }

            if (this.getColor() == Color.BLACK){ //BLACK goes down

                if (difrow == 1){
                    return board.getPieceAt(target) == null;
                }
                if (difrow == 2){
                    if(this.isMoved()){
                        return false;
                    } else {
                        return ((board.getCells()[celrow_init+1][celcol_target].getPiece() == null) && (board.getPieceAt(target) == null));
                    }
                }
               
            }

        } else { // now, must check if the target is invalid or if has a collision in diag

            
            if (this.getColor() == Color.WHITE) { 
                
                if( !(delta_col == 1 && difrow == -1) ){ //invalid diagonal
                    return false;
                } else {

                    if (board.getPieceAt(target) == null){ // diagonal must not be empty
                        return false;
                    }

                    return board.getPieceAt(target).getColor() == Color.BLACK; //Must be diff color
                }

            }

            if (this.getColor() == Color.BLACK) { 
                
                if( !(delta_col == 1 && difrow == 1) ){ //invalid diagonal
                    return false;
                } else {

                    if (board.getPieceAt(target) == null){ // diagonal must not be empty
                        return false;
                    }

                    return board.getPieceAt(target).getColor() == Color.WHITE; //Must be diff color
                }

            }
        
        }
        return false; // debug only -> if code get here, something went wrong      
    }
}
