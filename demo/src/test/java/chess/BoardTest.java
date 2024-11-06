package chess;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import chess.Pieces.Bishop;
import chess.Pieces.Color;
import chess.Pieces.Knight;

public class BoardTest {


    @Test
    public void CheckCellsGenerations1(){

        Board board = new Board();

        
        
        assertEquals("H1", board.getCells()[7][7].getpos());
    }

    public void CheckCellsGenerations2(){

        Board board = new Board();

        
        
        assertEquals("A8", board.getCells()[0][0].getpos());
    }

    @Test
    public void testCountPieces(){

        Board board = new Board();

        board.getCells()[0][0].setPiece(new Bishop(Celltype.BISHOP,Color.WHITE));

        board.getCells()[3][5].setPiece(new Knight(Celltype.KNIGHT,Color.WHITE));

        board.getCells()[7][7].setPiece(new Knight(Celltype.KNIGHT,Color.WHITE));

        assertEquals(3, board.countPieces());

    }

    @Test
    public void testCountPiecesWhite(){

        Board board = new Board();

        board.getCells()[0][0].setPiece(new Bishop(Celltype.BISHOP,Color.WHITE));

        board.getCells()[3][5].setPiece(new Knight(Celltype.KNIGHT,Color.BLACK));

        board.getCells()[7][7].setPiece(new Knight(Celltype.KNIGHT,Color.WHITE));

        assertEquals(2, board.countPiecesWhite());

    }

    @Test
    public void testCountPiecesBlack(){

        Board board = new Board();

        board.getCells()[0][0].setPiece(new Bishop(Celltype.BISHOP,Color.WHITE));

        board.getCells()[3][5].setPiece(new Knight(Celltype.KNIGHT,Color.BLACK));

        board.getCells()[7][7].setPiece(new Knight(Celltype.KNIGHT,Color.WHITE));

        assertEquals(1, board.countPiecesBlack());

    }

    


}
