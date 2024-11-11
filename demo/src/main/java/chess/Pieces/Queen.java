package chess.Pieces;

import chess.Board;
import chess.Celltype;

public class Queen extends Piece{

    public Queen(Color color) {
        super(color);

        setName(Celltype.QUEEN);
       
    }

    @Override
    public boolean  moveAllowed(String init, String target,Board board) {
      
       //matrix reference
       int celrow_init = 8 - (init.charAt(1) - '0') ; 
       int celcol_init = init.charAt(0) - 'A';

       int celrow_target = 8 - (target.charAt(1) - '0') ;
       int celcol_target = target.charAt(0)- 'A';

       //------------

       int delta_row = Math.abs(celrow_init - celrow_target);
       int delta_col = Math.abs(celcol_init - celcol_target);



        if (delta_col  == delta_row) { // check diagonal movement

            Bishop bishop = new Bishop(this.getColor());

            return bishop.moveAllowed(init, target, board); //Diagonal movement and collision verification is already implemented by bishop class

        } else {

            Rook rook = new Rook(this.getColor());

            return rook.moveAllowed(init, target, board); //Other movement and collision (even ilegal ones) verification is covered by rook method

        }

    }



}
