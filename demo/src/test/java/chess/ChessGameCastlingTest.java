package chess;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import chess.Pieces.King;
import chess.Pieces.Rook;
import chess.Pieces.Color;

public class ChessGameCastlingTest {

    @Test
    public void testCastlingWhiteKing(){

        ChessGame game = new ChessGame();

        game.getBoard().setPieceAt(new King(Color.WHITE),"E1") ;

        game.getBoard().setPieceAt(new Rook(Color.WHITE),"H1") ;

        assertEquals(true, game.isCastlingAllowed("E1", "H1", game.getBoard() ));

    }

    @Test
    public void testCastlingWhiteQueen(){

        ChessGame game = new ChessGame();

        game.getBoard().setPieceAt(new King(Color.WHITE),"E1") ;

        game.getBoard().setPieceAt(new Rook(Color.WHITE),"A1") ;

        assertEquals(true, game.isCastlingAllowed("E1", "A1", game.getBoard() ));

    }

    @Test
    public void testCastlingBlackKing(){

        ChessGame game = new ChessGame();

        game.getBoard().setPieceAt(new King(Color.BLACK),"E8") ;

        game.getBoard().setPieceAt(new Rook(Color.BLACK),"H8") ;

        assertEquals(true, game.isCastlingAllowed("E8", "H8", game.getBoard() ));

    }

    @Test
    public void testCastlingBlackQueen(){

        ChessGame game = new ChessGame();

        game.getBoard().setPieceAt(new King(Color.BLACK),"E8") ;

        game.getBoard().setPieceAt(new Rook(Color.BLACK),"A8") ;

        assertEquals(true, game.isCastlingAllowed("E8", "A8", game.getBoard() ));

    }


    @Test
    public void testCastlingWhiteKingFalse(){

        ChessGame game = new ChessGame();

        game.getBoard().setPieceAt(new King(Color.WHITE),"E1") ;

        game.getBoard().setPieceAt(new Rook(Color.WHITE),"H1") ;

        game.getBoard().getPieceAt("E1").setMoved();

        assertEquals(false, game.isCastlingAllowed("E1", "H1", game.getBoard() ));

    }

    @Test
    public void testCastlingWhiteQueenFalse(){

        ChessGame game = new ChessGame();

        game.getBoard().setPieceAt(new King(Color.WHITE),"E1") ;

        game.getBoard().setPieceAt(new Rook(Color.WHITE),"A1") ;

        game.getBoard().getPieceAt("E1").setMoved();

        assertEquals(false, game.isCastlingAllowed("E1", "A1", game.getBoard() ));

    }

    @Test
    public void testCastlingBlackKingFalse(){

        ChessGame game = new ChessGame();

        game.getBoard().setPieceAt(new King(Color.BLACK),"E8") ;

        game.getBoard().setPieceAt(new Rook(Color.BLACK),"H8") ;

        game.getBoard().getPieceAt("E8").setMoved();

        assertEquals(false, game.isCastlingAllowed("E8", "H8", game.getBoard() ));

    }

    @Test
    public void testCastlingBlackQueenFalse(){

        ChessGame game = new ChessGame();

        game.getBoard().setPieceAt(new King(Color.BLACK),"E8") ;

        game.getBoard().setPieceAt(new Rook(Color.BLACK),"A8") ;

        game.getBoard().getPieceAt("E8").setMoved();

        assertEquals(false, game.isCastlingAllowed("E8", "A8", game.getBoard() ));

    }

}
