package chess.Pieces;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import chess.Celltype;

public class KingTest {
    @Test
    public void testMoveAllowed1() { // UP´RIGHT

        King king = new King(Celltype.KING, Color.BLACK);

        assertEquals(true, king.moveAllowed("A1", "B2"));


    }

    @Test
    public void testMoveAllowed2() { // UP LEFT

        King king = new King(Celltype.KING, Color.BLACK);

        assertEquals(true, king.moveAllowed("B1", "A2"));


    }

    @Test
    public void testMoveAllowed3() { // UP FOWARD

        King king = new King(Celltype.KING, Color.BLACK);

        assertEquals(true, king.moveAllowed("B1", "B2"));


    }

    @Test
    public void testMoveAllowed4() { // DOWN FOWARD

        King king = new King(Celltype.KING, Color.BLACK);

        assertEquals(true, king.moveAllowed("D4", "D3"));


    }

    @Test
    public void testMoveAllowed5() { // LEFT FOWARD

        King king = new King(Celltype.KING, Color.BLACK);

        assertEquals(true, king.moveAllowed("D7", "C7"));


    }

    @Test
    public void testMoveAllowed6() { // RIGHT FOWARD

        King king = new King(Celltype.KING, Color.BLACK);

        assertEquals(true, king.moveAllowed("D7", "E7"));


    }

    @Test
    public void testMoveAllowedFALSE1() { // FALSE FOWARD

        King king = new King(Celltype.KING, Color.BLACK);

        assertEquals(false, king.moveAllowed("D7", "F7"));


    }

    @Test
    public void testMoveAllowedFALSE2() { // FALSE FOWARD

        King king = new King(Celltype.KING, Color.BLACK);

        assertEquals(false, king.moveAllowed("C7", "A1"));


    }

    @Test
    public void testMoveAllowedFALSE3() { // FALSE FOWARD

        King king = new King(Celltype.KING, Color.BLACK);

        assertEquals(false, king.moveAllowed("F1", "D3"));


    }


}
