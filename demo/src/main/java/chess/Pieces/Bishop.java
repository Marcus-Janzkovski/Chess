package chess.Pieces;

import chess.Board;
import chess.Celltype;

public class Bishop extends Piece {

    //rembember: Piece have name and color

    public Bishop(Celltype name, Color color) {
        super(name, color);
        
    }

    
    @Override
    public boolean moveAllowed(String init, String target, Board board){

        
        //------------

        //matrix reference
        int celrow_init = 8 - (init.charAt(1) - '0') ; 
        int celcol_init = init.charAt(0) - 'A';

        int celrow_target = 8 - (target.charAt(1) - '0') ;
        int celcol_target = target.charAt(0)- 'A';

        //------------

        int delta_row = Math.abs(celrow_init - celrow_target);
        int delta_col = Math.abs(celcol_init - celcol_target);
    

        if (!(delta_row == delta_col)){// check the diagonal move eg: 00 -> 11
            return false;
        }


        if ( (celrow_init > celrow_target) && (celcol_init < celcol_target) ){ // check colision in diagonal /+ 

            for(int i=1; i < delta_row;i++){
                if (!board.getCells()[celrow_init-i][celcol_init+i].isEmpty()){
                    return false;
                };
            } 

        }

        if ( (celrow_init < celrow_target) && (celcol_init > celcol_target) ){ // check colision in diagonal /-

            for(int i=1; i < delta_row;i++){
                if (!board.getCells()[celrow_init+i][celcol_init-i].isEmpty()){
                    return false;
                };
            } 

        }

        if ( (celrow_init > celrow_target) && (celcol_init > celcol_target) ){ // check colision in diagonal \+

            for(int i=1; i < delta_row;i++){
                if (!board.getCells()[celrow_init-i][celcol_init-i].isEmpty()){
                    return false;
                };
            } 

        }

        if ( (celrow_init < celrow_target) && (celcol_init < celcol_target) ){ // check colision in diagonal \-

            for(int i=1; i < delta_row;i++){
                if (!board.getCells()[celrow_init+i][celcol_init+i].isEmpty()){
                    return false;
                };
            } 

        }

        if (board.getPieceAt(target) == null){ // check the color of target pos, if same color, not allowed
            return true;
        } else {
            return (board.getPieceAt(target).getColor() != this.getColor());
        }        

    }
    









}
