package chess.Pieces;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import chess.Celltype;


public class PawnTest {

    @Test
    public void testMoveAllowedTrue_B() {

        Pawn pawn = new Pawn(Celltype.PAWN,Color.BLACK);

        assertEquals(true, pawn.moveAllowed("B2", "B1"));

    }

    @Test
    public void testMoveAllowedTrue_W() {

        Pawn pawn = new Pawn(Celltype.PAWN,Color.WHITE);

        assertEquals(true, pawn.moveAllowed("B1", "B2"));

    }

    @Test
    public void testMoveAllowedFalse() {

        Pawn pawn = new Pawn(Celltype.PAWN,Color.BLACK);

        assertEquals(false, pawn.moveAllowed("B1", "B2"));


    }


    @Test
    public void testHyperjumpStartTrue() {

        Pawn pawn = new Pawn(Celltype.PAWN,Color.WHITE);

        assertEquals(true, pawn.moveAllowed("C3", "C5"));


    }

    @Test
    public void testHyperjumpStartFalse() {

        Pawn pawn = new Pawn(Celltype.PAWN,Color.BLACK);

        pawn.setMoved();

        assertEquals(false, pawn.moveAllowed("C3", "C5"));

    }



}
