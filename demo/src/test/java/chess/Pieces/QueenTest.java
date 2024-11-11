package chess.Pieces;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import chess.Board;



public class QueenTest {
    @Test
    public void testMoveAllowedsameRow() {

        Queen queen = new Queen(Color.BLACK);

        Board board = new Board();

        assertEquals(true, queen.moveAllowed("B2", "F2", board));

    }

    @Test
    public void testMoveAllowedsameCol() {

        Queen queen = new Queen(Color.BLACK);

        Board board = new Board();

        assertEquals(true, queen.moveAllowed("B1", "B5", board));

    }


    @Test
    public void testMoveAllowedDiagonal() {

        Queen queen = new Queen(Color.BLACK);
        Board board = new Board();

        assertEquals(true, queen.moveAllowed("A1", "B2", board));

    }

    @Test
    public void testMoveAllowedFailure1() {

        Queen queen = new Queen(Color.BLACK);
        Board board = new Board();

        assertEquals(false, queen.moveAllowed("A1", "C2", board));

    }

    @Test
    public void testMoveAllowedFailure2() {

        Queen queen = new Queen(Color.BLACK);
        Board board = new Board();

        assertEquals(false, queen.moveAllowed("C3", "E7", board));

    }

    @Test
    public void testBlockRow1() {

        Queen queen = new Queen(Color.BLACK);
        Board board = new Board();

        board.setPieceAt(queen, "A1");
        board.setPieceAt(new Bishop(Color.BLACK), "A3");

        assertEquals(false, queen.moveAllowed("A1", "A7", board));

    }

    @Test
    public void testBlockRow2() {

        Queen queen = new Queen(Color.BLACK);
        Board board = new Board();

        board.setPieceAt(queen, "A7");
        board.setPieceAt(new Bishop(Color.BLACK), "A3");

        assertEquals(false, queen.moveAllowed("A7", "A1", board));

    }

}
