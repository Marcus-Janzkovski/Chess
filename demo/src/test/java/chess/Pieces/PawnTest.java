package chess.Pieces;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import chess.Board;




public class PawnTest {

    @Test
    public void testMoveAllowedTrue_B() {

        Pawn pawn = new Pawn(Color.BLACK);

        Board board = new Board();

        board.setPieceAt(pawn, "B2");

        assertEquals(true, pawn.moveAllowed("B2", "B1", board));

    }

    @Test
    public void testMoveAllowedTrue_W() {

        Pawn pawn = new Pawn(Color.WHITE);

        Board board = new Board();

        board.setPieceAt(pawn, "B1");

        assertEquals(true, pawn.moveAllowed("B1", "B2", board));

    }

    @Test
    public void testMoveAllowedFalse() {

        Pawn pawn = new Pawn(Color.BLACK);


        Board board = new Board();

        board.setPieceAt(pawn, "B1");

        assertEquals(false, pawn.moveAllowed("B1", "B2", board));


    }


    @Test
    public void testHyperjumpStartTrue() {

        Pawn pawn = new Pawn(Color.WHITE);

        Board board = new Board();

        board.setPieceAt(pawn, "C3");

        assertEquals(true, pawn.moveAllowed("C3", "C5", board));


    }

    @Test
    public void testHyperjumpStartFalse() {

        Pawn pawn = new Pawn(Color.BLACK);

        pawn.setMoved();

        Board board = new Board();

        board.setPieceAt(pawn, "C3");

        assertEquals(false, pawn.moveAllowed("C3", "C5", board));

    }

    @Test
    public void testCaptureDiagonalRightDiffColor() {

        Pawn pawn = new Pawn(Color.BLACK);

        Board board = new Board();

        board.setPieceAt(pawn, "C3");
        board.setPieceAt(new Bishop(Color.WHITE), "B2");

        assertEquals(true, pawn.moveAllowed("C3", "B2", board));

    }

    @Test
    public void testCaptureDiagonalRightSameColor() {

        Pawn pawn = new Pawn(Color.BLACK);

        Board board = new Board();

        board.setPieceAt(pawn, "C3");
        board.setPieceAt(new Bishop(Color.BLACK), "B2");

        assertEquals(false, pawn.moveAllowed("C3", "B2", board));

    }


}
