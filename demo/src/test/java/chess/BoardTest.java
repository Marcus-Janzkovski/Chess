package chess;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BoardTest {

    @Test
    public void CheckBoardinit(){
        Board board = new Board(8,8);
        int countNonEmpty = 0;


        for(int i = 0;i > 7;i++){
            for(int j = 0; j>7;j++){
                 if (board.getCelltypebynum(i,j) != Celltype.EMPTY){
                    countNonEmpty++;
                 }
            }
        }

        assertEquals(0, countNonEmpty);
        
    }

    @Test
    public void TestfindCellCol(){
        Board board = new Board(8,8);
        
        Cell cellColected = board.findCell('A',2) ;
             

        assertEquals('A', cellColected.getCelcol());
    }

    public void TestfindCellRow(){
        Board board = new Board(8,8);
        
        Cell cellColected = board.findCell('A',2) ;
             

        assertEquals(2, cellColected.getCelrow());
    }





   /* @Test
    public void CheckSetPieceOnBoard(){
        Board board = new Board(8,8);
        


        assertEquals(board.getCelltypebypos('A',2), Celltype.PAWN);
    }


    @Test
    public void CheckAcessByAbstractPos(){

    }
*/ 

}
