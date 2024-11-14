package chess.Pieces;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import chess.Board;

public class KingTest {

    @Test
    public void testMovedTrue() { // FALSE FOWARD

        King king = new King( Color.BLACK);

        king.setMoved();

        assertEquals(true, king.isMoved());

    }

    @Test
    public void testMovedFalse() { // FALSE FOWARD

        King king = new King( Color.BLACK);
        king.setMoved();

        assertEquals(true, king.isMoved());

    }

    @Test
    public void testMoveAllowed1() { // UP RIGHT

        King king = new King( Color.BLACK);

        Board board = new Board();

        assertEquals(true, king.moveAllowed("A1", "B2", board));


    }

    @Test
    public void testMoveAllowed2() { // UP LEFT

        King king = new King( Color.BLACK);

        Board board = new Board();

        assertEquals(true, king.moveAllowed("B1", "A2", board));


    }

    @Test
    public void testMoveAllowed3() { // Down RIGHT

        King king = new King( Color.BLACK);

        Board board = new Board();

        assertEquals(true, king.moveAllowed("C6", "D5", board));


    }

    @Test
    public void testMoveAllowed4() { // Down LEFT

        King king = new King( Color.BLACK);

        Board board = new Board();

        assertEquals(true, king.moveAllowed("C6", "B5", board));


    }


    @Test
    public void testMoveAllowed5() { // UP FOWARD

        King king = new King( Color.BLACK);

        Board board = new Board();

        assertEquals(true, king.moveAllowed("B1", "B2", board));


    }

    @Test
    public void testMoveAllowed6() { // DOWN FOWARD

        King king = new King( Color.BLACK);

        Board board = new Board();

        assertEquals(true, king.moveAllowed("D4", "D3", board));


    }

    @Test
    public void testMoveAllowed7() { // LEFT FOWARD

        King king = new King( Color.BLACK);

        Board board = new Board();

        assertEquals(true, king.moveAllowed("D7", "C7", board));


    }

    @Test
    public void testMoveAllowed8() { // RIGHT FOWARD

        King king = new King( Color.BLACK);

        Board board = new Board();

        assertEquals(true, king.moveAllowed("D7", "E7", board));


    }

    @Test
    public void testMoveAllowedFALSE1() { // FALSE FOWARD

        King king = new King( Color.BLACK);

        Board board = new Board();

        assertEquals(false, king.moveAllowed("D7", "F7", board));


    }

    @Test
    public void testMoveAllowedFALSE2() { // FALSE FOWARD

        King king = new King( Color.BLACK);

        Board board = new Board();

        assertEquals(false, king.moveAllowed("C7", "A1", board));


    }

    @Test
    public void testMoveAllowedFALSE3() { // FALSE FOWARD

        King king = new King( Color.BLACK);

        Board board = new Board();

        assertEquals(false, king.moveAllowed("F1", "D3", board));


    }

    @Test
    public void testMoveAllowedSameColor() { 

        King king = new King( Color.BLACK);

        Board board = new Board();

        board.setPieceAt(new Bishop(Color.BLACK), "F2");

        assertEquals(false, king.moveAllowed("F1", "F2", board));


    }

    @Test
    public void testMoveAllowedDiffColor() { 

        King king = new King( Color.BLACK);

        Board board = new Board();

        board.setPieceAt(new Bishop(Color.WHITE), "F2");

        assertEquals(true, king.moveAllowed("F1", "F2", board));


    }




}
