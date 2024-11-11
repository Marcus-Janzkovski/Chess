package chess.Pieces;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import chess.Board;


public class KnightTest {
    

    @Test
    public void testMoveSameColor() {

        Knight knight = new Knight(Color.BLACK);

        Board board = new Board();

        board.setPieceAt(new Bishop(Color.BLACK), "B1");

        board.setPieceAt(new Bishop(Color.BLACK), "C3");

        assertEquals(false, knight.moveAllowed("B1", "C3", board));


    }

    @Test
    public void testMoveDiffColor() {

        Knight knight = new Knight(Color.BLACK);

        Board board = new Board();

        board.setPieceAt(new Bishop(Color.BLACK), "B1");

        board.setPieceAt(new Bishop(Color.WHITE), "C3");

        assertEquals(true, knight.moveAllowed("B1", "C3", board));


    }

    @Test
    public void testMoveTrueUpRight1() {

        Knight knight = new Knight(Color.BLACK);

        Board board = new Board();

        board.setPieceAt(new Bishop(Color.BLACK), "B1");

        assertEquals(true, knight.moveAllowed("B1", "C3", board));

    }

    @Test
    public void testMoveTrueUpRight2() {

        Knight knight = new Knight(Color.BLACK);

        Board board = new Board();

        board.setPieceAt(new Bishop(Color.BLACK), "B5");

        assertEquals(true, knight.moveAllowed("B5", "D6", board));

    }

    @Test
    public void testMoveTrueDownRight1() {

        Knight knight = new Knight(Color.BLACK);

        Board board = new Board();

        board.setPieceAt(new Bishop(Color.BLACK), "A8");

        assertEquals(true, knight.moveAllowed("A8", "C7", board));

    }

    @Test
    public void testMoveTrueDownRight2() {

        Knight knight = new Knight(Color.BLACK);

        Board board = new Board();

        board.setPieceAt(new Bishop(Color.BLACK), "A8");

        assertEquals(true, knight.moveAllowed("A8", "B6", board));

    }

    @Test
    public void testMoveAllowedFalse1() {

        Knight knight = new Knight(Color.BLACK);

        Board board = new Board();

        board.setPieceAt(new Bishop(Color.BLACK), "C7");

        assertEquals(false, knight.moveAllowed("C7", "F5", board));


    }

    @Test
    public void testMoveAllowedFalse2(){

        Knight knight = new Knight(Color.BLACK);

        Board board = new Board();

        board.setPieceAt(new Bishop(Color.BLACK), "C7");

        assertEquals(false, knight.moveAllowed("C5", "F5", board));


    }

    @Test
    public void testMoveAllowedFalse3(){

        Knight knight = new Knight(Color.BLACK);

        Board board = new Board();

        board.setPieceAt(new Bishop(Color.BLACK), "C7");

        assertEquals(false, knight.moveAllowed("C5", "A7", board));


    }



}
