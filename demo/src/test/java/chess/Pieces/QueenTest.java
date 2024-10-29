package chess.Pieces;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import chess.Celltype;

public class QueenTest {
    @Test
    public void testMoveAllowedsameRow() {

        Queen queen = new Queen(Celltype.QUEEN,Color.BLACK);

        assertEquals(true, queen.moveAllowed("B2", "F2"));

    }

    @Test
    public void testMoveAllowedsameCol() {

        Queen queen = new Queen(Celltype.QUEEN,Color.BLACK);

        assertEquals(true, queen.moveAllowed("B1", "B5"));

    }


    @Test
    public void testMoveAllowedDiagonal() {

        Queen queen = new Queen(Celltype.QUEEN,Color.BLACK);

        assertEquals(true, queen.moveAllowed("A1", "B2"));

    }

    @Test
    public void testMoveAllowedFailure1() {

        Queen queen = new Queen(Celltype.QUEEN,Color.BLACK);

        assertEquals(false, queen.moveAllowed("A1", "C2"));

    }

    @Test
    public void testMoveAllowedFailure2() {

        Queen queen = new Queen(Celltype.QUEEN,Color.BLACK);

        assertEquals(false, queen.moveAllowed("C3", "E7"));

    }

}
