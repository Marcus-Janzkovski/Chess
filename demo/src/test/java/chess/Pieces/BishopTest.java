package chess.Pieces;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import chess.Celltype;

public class BishopTest {
    @Test
    public void testMoveAllowedTrue() {

        Bishop bishop = new Bishop(Celltype.BISHOP,Color.BLACK);

        assertEquals(true, bishop.moveAllowed("C8", "F5"));

    }

    @Test
    public void testMoveAllowedFalse() {

        Bishop bishop = new Bishop(Celltype.BISHOP,Color.BLACK);

        assertEquals(false, bishop.moveAllowed("C7", "F5"));


    }
}
