package chess;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import chess.Pieces.Color;
import chess.Pieces.Knight;
import chess.Pieces.Pawn;

public class BoardMoveTest {

    @Test
    public void testMoveEmpty1(){ //target is empty 
        Board board = new Board();

        board.setPieceAt(new Pawn(Color.BLACK),"B2");
    
        board.move("B2","C5");

        assertEquals(Celltype.PAWN, board.getPieceAt("C5").getName());


    }

    @Test
    public void testMoveEmpty2(){ //target is empty

        Board board = new Board();

        board.setPieceAt(new Pawn(Color.BLACK),"B2");
    
        board.move("B2","C5");

        assertEquals(null, board.getPieceAt("B2"));


    }

    @Test
    public void testMoveKillPiece1(){ //target have a piece

        Board board = new Board();

        board.setPieceAt(new Pawn(Color.BLACK),"B2");

        board.setPieceAt(new Knight(Color.WHITE),"C5");
    
        board.move("B2","C5");

        assertEquals(Celltype.PAWN, board.getPieceAt("C5").getName());


    }
    
    @Test
    public void testMoveKillPiece2(){ //target have a piece

        Board board = new Board();

        board.setPieceAt(new Pawn(Color.BLACK),"B2");

        board.setPieceAt(new Knight(Color.WHITE),"C5");
    
        board.move("B2","C5");

        assertEquals(0, board.countPiecesWhite());

    }


}
