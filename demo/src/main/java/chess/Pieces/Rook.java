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
        
         

        //matrix reference
        int celrow_init = 8 - (init.charAt(1) - '0') ; 
        int celcol_init = init.charAt(0) - 'A';
 
        int celrow_target = 8 - (target.charAt(1) - '0') ;
        int celcol_target = target.charAt(0)- 'A';
 
         //------------
 
        int delta_row = Math.abs(celrow_init - celrow_target);
        int delta_col = Math.abs(celcol_init - celcol_target);

        int difrow = celrow_target - celrow_init;
        int difcol = celcol_target - celcol_init;


        //------------

        if(! ((celrow_init == celrow_target && celcol_init != celcol_target ) || (celrow_init != celrow_target && celcol_init == celcol_target)) ){ //check if the movement is not illegal (Orthogonal)
            return false;
        }   

        if(difrow > 0){ // movement is Down

            for(int i=1; i < delta_row;i++){
                if (!board.getCells()[celrow_init+i][celcol_target].isEmpty()){
                    return false;
                };
            } 

        }

        if(difrow < 0){ // movement is UP

            for(int i=1; i < delta_row;i++){
                if (!board.getCells()[celrow_init-i][celcol_target].isEmpty()){
                    return false;
                };
            } 

        }

        if(difcol > 0){ // movement is Right

            for(int i=1; i < delta_col;i++){
                if (!board.getCells()[celrow_target][celcol_init+1].isEmpty()){
                    return false;
                };
            } 

        }

        if(difcol < 0){ // movement is Left

            for(int i=1; i < delta_col;i++){
                if (!board.getCells()[celrow_target][celcol_init-1].isEmpty()){
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
