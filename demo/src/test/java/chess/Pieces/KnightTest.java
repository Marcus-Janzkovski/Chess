package chess.Pieces;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import chess.Board;
import chess.Celltype;

public class KnightTest {
    

    @Test
    public void testMoveAllowedFalse() {

        Knight knight = new Knight(Celltype.KNIGHT,Color.BLACK);

        Board board = new Board();

        board.setPieceAt(new Bishop(Celltype.BISHOP,Color.BLACK), "C7");

        assertEquals(false, knight.moveAllowed("C7", "F5", board));


    }

    @Test
    public void testMoveSameColor() {

        Knight knight = new Knight(Celltype.KNIGHT,Color.BLACK);

        Board board = new Board();

        board.setPieceAt(new Bishop(Celltype.BISHOP,Color.BLACK), "B1");

        board.setPieceAt(new Bishop(Celltype.BISHOP,Color.BLACK), "C3");

        assertEquals(false, knight.moveAllowed("B1", "C3", board));


    }

    @Test
    public void testMoveDiffColor() {

        Knight knight = new Knight(Celltype.KNIGHT,Color.BLACK);

        Board board = new Board();

        board.setPieceAt(new Bishop(Celltype.BISHOP,Color.BLACK), "B1");

        board.setPieceAt(new Bishop(Celltype.BISHOP,Color.WHITE), "C3");

        assertEquals(true, knight.moveAllowed("B1", "C3", board));


    }

    @Test
    public void testMoveTrueUpRight1() {

        Knight knight = new Knight(Celltype.KNIGHT,Color.BLACK);

        Board board = new Board();

        board.setPieceAt(new Bishop(Celltype.BISHOP,Color.BLACK), "B1");

        assertEquals(true, knight.moveAllowed("B1", "C3", board));

    }

    @Test
    public void testMoveTrueUpRight2() {

        Knight knight = new Knight(Celltype.KNIGHT,Color.BLACK);

        Board board = new Board();

        board.setPieceAt(new Bishop(Celltype.BISHOP,Color.BLACK), "B5");

        assertEquals(true, knight.moveAllowed("B5", "D6", board));

    }




}
