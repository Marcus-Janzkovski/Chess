package chess;

import static org.junit.Assert.assertEquals;

import javax.swing.plaf.synth.ColorType;

import org.junit.Test;

import chess.Pieces.Color;

public class ChessGameNewGameTest {
    //-----------------------------

    @Test
    public void testKingWhite(){

        ChessGame game = new ChessGame();

        game.newGame();


        assertEquals(Celltype.KING,game.getBoard().getPieceAt("E8").getName());

    }

    @Test
    public void testKingBlack(){

        ChessGame game = new ChessGame();

        game.newGame();


        assertEquals(Celltype.KING,game.getBoard().getPieceAt("E1").getName());

    }

     //-----------------------------
    @Test
    public void testQueenWhite(){

        ChessGame game = new ChessGame();

        game.newGame();


        assertEquals(Celltype.QUEEN,game.getBoard().getPieceAt("D1").getName());

    }

    @Test
    public void testQueenBlack(){

        ChessGame game = new ChessGame();

        game.newGame();


        assertEquals(Celltype.QUEEN,game.getBoard().getPieceAt("D8").getName());

    }

     //-----------------------------
    @Test
    public void testBishop1White(){

        ChessGame game = new ChessGame();

        game.newGame();


        assertEquals(Celltype.BISHOP,game.getBoard().getPieceAt("C1").getName());

    }
    @Test
    public void testBishop2White(){

        ChessGame game = new ChessGame();

        game.newGame();


        assertEquals(Celltype.BISHOP,game.getBoard().getPieceAt("F1").getName());

    }
   
    @Test
    public void testBishop1Black(){

        ChessGame game = new ChessGame();

        game.newGame();


        assertEquals(Celltype.BISHOP,game.getBoard().getPieceAt("C8").getName());

    }
    @Test
    public void testBishop2Black(){

        ChessGame game = new ChessGame();

        game.newGame();


        assertEquals(Celltype.BISHOP,game.getBoard().getPieceAt("F8").getName());

    }

     //-----------------------------

     @Test
     public void testKnight1White(){
 
         ChessGame game = new ChessGame();
 
         game.newGame();
 
 
         assertEquals(Celltype.KNIGHT,game.getBoard().getPieceAt("B1").getName());
 
     }

     @Test
     public void testKnight2White(){
 
         ChessGame game = new ChessGame();
 
         game.newGame();
 
 
         assertEquals(Celltype.KNIGHT,game.getBoard().getPieceAt("G1").getName());
 
     }

     @Test
     public void testKnight1Black(){
 
         ChessGame game = new ChessGame();
 
         game.newGame();
 
 
         assertEquals(Celltype.KNIGHT,game.getBoard().getPieceAt("B8").getName());
 
     }

     @Test
     public void testKnight2Black(){
 
         ChessGame game = new ChessGame();
 
         game.newGame();
 
 
         assertEquals(Celltype.KNIGHT,game.getBoard().getPieceAt("G8").getName());
 
     }

        //--------------------------------

        @Test
        public void testRook1White(){
    
            ChessGame game = new ChessGame();
    
            game.newGame();
    
    
            assertEquals(Celltype.ROOK,game.getBoard().getPieceAt("A1").getName());
    
        }
   
        @Test
        public void testRook2White(){
    
            ChessGame game = new ChessGame();
    
            game.newGame();
    
    
            assertEquals(Celltype.ROOK,game.getBoard().getPieceAt("H1").getName());
    
        }

        @Test
        public void testRook1Black(){
    
            ChessGame game = new ChessGame();
    
            game.newGame();
    
    
            assertEquals(Celltype.ROOK,game.getBoard().getPieceAt("A8").getName());
    
        }
   
        @Test
        public void testRook2Black(){
    
            ChessGame game = new ChessGame();
    
            game.newGame();
    
    
            assertEquals(Celltype.ROOK,game.getBoard().getPieceAt("H8").getName());
    
        }

        //--------------


        @Test
        public void testPawn1White(){
    
            ChessGame game = new ChessGame();
    
            game.newGame();
   
            assertEquals(Celltype.PAWN,game.getBoard().getPieceAt("B2").getName());
    
        }

        @Test
        public void testPawn2White(){
    
            ChessGame game = new ChessGame();
    
            game.newGame();
   
            assertEquals(Color.WHITE,game.getBoard().getPieceAt("B2").getColor());
    
        }

        @Test
        public void testPawn1Black(){
    
            ChessGame game = new ChessGame();
    
            game.newGame();
    
    
            assertEquals(Celltype.PAWN,game.getBoard().getPieceAt("H7").getName());
    
        }

        @Test
        public void testPawn2Black(){
    
            ChessGame game = new ChessGame();
    
            game.newGame();
    
    
            assertEquals(Color.BLACK,game.getBoard().getPieceAt("H7").getColor());
    
        }

    

}
