package chess.Pieces;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class QueenTest {
    @Test
    public void testMoveAllowedsameRow() {

        Queen queen = new Queen(Color.BLACK);

        assertEquals(true, queen.moveAllowed("B2", "F2", null));

    }

    @Test
    public void testMoveAllowedsameCol() {

        Queen queen = new Queen(Color.BLACK);

        assertEquals(true, queen.moveAllowed("B1", "B5", null));

    }


    @Test
    public void testMoveAllowedDiagonal() {

        Queen queen = new Queen(Color.BLACK);

        assertEquals(true, queen.moveAllowed("A1", "B2", null));

    }

    @Test
    public void testMoveAllowedFailure1() {

        Queen queen = new Queen(Color.BLACK);

        assertEquals(false, queen.moveAllowed("A1", "C2", null));

    }

    @Test
    public void testMoveAllowedFailure2() {

        Queen queen = new Queen(Color.BLACK);

        assertEquals(false, queen.moveAllowed("C3", "E7", null));

    }

}
