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

}
