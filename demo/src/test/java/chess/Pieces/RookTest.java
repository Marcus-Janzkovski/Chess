package chess.Pieces;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import chess.Board;



public class RookTest {


    @Test
    public void testMoveAllowedTrue() {

        Rook rook = new Rook(Color.BLACK);

        Board board = new Board();

        assertEquals(true, rook.moveAllowed("B7", "B1", board));
    }

    @Test
    public void testMoveAllowedfalse() {

        Rook rook = new Rook(Color.BLACK);

        Board board = new Board();

        assertEquals(false, rook.moveAllowed("C7", "B1", board));
    }

    @Test
    public void testMoveBlockDown() { //row right +

        Rook rook = new Rook(Color.BLACK);

        Board board = new Board();

        board.setPieceAt(rook, "B5");

        board.setPieceAt(new Knight(Color.BLACK), "B1");
        

        assertEquals(false, rook.moveAllowed("B7", "B1", board));
    }

    @Test
    public void testMoveBlockUp() { //row right -

        Rook rook = new Rook(Color.BLACK);

        Board board = new Board();

        board.setPieceAt(rook, "B1");

        board.setPieceAt(new Knight(Color.BLACK), "B5");
        

        assertEquals(false, rook.moveAllowed("B1", "B7", board));
    }

    @Test
    public void testMoveBlockLeft() { //row right -

        Rook rook = new Rook(Color.BLACK);

        Board board = new Board();

        board.setPieceAt(rook, "C6");

        board.setPieceAt(new Knight(Color.BLACK), "B6");
        

        assertEquals(false, rook.moveAllowed("C6", "A6", board));
    }

    @Test
    public void testMoveBlockRight() { //row right -

        Rook rook = new Rook(Color.BLACK);

        Board board = new Board();

        board.setPieceAt(rook, "A6");

        board.setPieceAt(new Knight(Color.BLACK), "B6");
        

        assertEquals(false, rook.moveAllowed("A6", "C6", board));
    }

    @Test
    public void testMoveBlockSame() { //

        Rook rook = new Rook(Color.BLACK);

        Board board = new Board();

        board.setPieceAt(rook, "A6");

        board.setPieceAt(new Knight(Color.BLACK), "B6");
        

        assertEquals(false, rook.moveAllowed("A6", "B6", board));
    }

    @Test
    public void testMoveBlockDiff() { //

        Rook rook = new Rook(Color.BLACK);

        Board board = new Board();

        board.setPieceAt(rook, "A6");

        board.setPieceAt(new Knight(Color.WHITE), "B6");
        

        assertEquals(true, rook.moveAllowed("A6", "B6", board));
    }


}
