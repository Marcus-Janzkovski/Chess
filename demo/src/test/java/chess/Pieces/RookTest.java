package chess.Pieces;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class RookTest {


    @Test
    public void testMoveAllowedTrue() {

        Rook rook = new Rook(Color.BLACK);

        assertEquals(true, rook.moveAllowed("B7", "B1", null));
    }

    @Test
    public void testMoveAllowedfalse() {

        Rook rook = new Rook(Color.BLACK);

        assertEquals(false, rook.moveAllowed("C7", "B1", null));
    }



}
