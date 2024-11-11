package chess.Pieces;

import chess.Board;
import chess.Celltype;

public class Pawn extends Piece {

    private boolean moved;


    public boolean isMoved() {
        return moved;
    }

    public void setMoved() {
        this.moved = true;
    }

    public Pawn(Color color) {
        super(color);
        this.moved = false;
        setName(Celltype.PAWN);
    }

    @Override
    public boolean moveAllowed(String init, String target,Board board) {
        
        //Chess board reference
        char chessrow_init = init.charAt(1);
        //char chesscol_init = init.charAt(0); 

        char chessrow_target = target.charAt(1);
        //char chesscol_target = target.charAt(0);

        //------------

        //matrix reference
        int celrow_init = 8 - (chessrow_init - '0') ; 
        //int celcol_int = chesscol_init - 'A';

        int celrow_target = 8 - (chessrow_target - '0') ; 
        //int celcol_target = chesscol_target - 'A';

        //------------


        if (this.getColor() == Color.WHITE){ //White goes up

            if(this.moved){

                return (celrow_target - celrow_init == -1);

            } else {

                return (celrow_target - celrow_init == -1) || (celrow_target - celrow_init == -2);
 
                
            } 
        }

        if (this.getColor() == Color.BLACK){ //Black goes down

            if(this.moved){

                return (celrow_target - celrow_init == 1);

            } else {

                return (celrow_target - celrow_init == 1) || (celrow_target - celrow_init == 2); 

            }
            
        }
        return false; //for debug and exceptions
    }





}
