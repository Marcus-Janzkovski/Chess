package chess.Pieces;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import chess.Celltype;

public class KnightTest {
    @Test
    public void testMoveAllowedTrue() {

        Knight knight = new Knight(Celltype.KNIGHT,Color.BLACK);

        assertEquals(true, knight.moveAllowed("B1", "C3"));

    }

    @Test
    public void testMoveAllowedFalse() {

        Knight knight = new Knight(Celltype.KNIGHT,Color.BLACK);

        assertEquals(false, knight.moveAllowed("C7", "F5"));


    }
}
