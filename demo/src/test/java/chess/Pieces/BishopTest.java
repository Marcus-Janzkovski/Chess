package chess.Pieces;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import chess.Board;
import chess.Celltype;

public class BishopTest {
    @Test
    public void testCollisionDiffColor() { // test /+ Diff Color

    Bishop bishop = new Bishop(Celltype.BISHOP,Color.BLACK);

    Board board = new Board();

    board.setPieceAt(new Bishop(Celltype.BISHOP,Color.BLACK), "A4" );
    board.setPieceAt(new Bishop(Celltype.BISHOP,Color.WHITE), "B5" );
    

    assertEquals(true, bishop.moveAllowed("A4", "B5", board));

    }

    @Test
    public void testCollisionSameColor() { // test /+ Same Color

    Bishop bishop = new Bishop(Celltype.BISHOP,Color.BLACK);

    Board board = new Board();

    board.setPieceAt(new Bishop(Celltype.BISHOP,Color.BLACK), "A4" );
    board.setPieceAt(new Bishop(Celltype.BISHOP,Color.BLACK), "B5" );
    

    assertEquals(false, bishop.moveAllowed("A4", "B5", board));
    }
    
    @Test
    public void testCollisionUpRightBlock() { // test /+ path blocked

    Bishop bishop = new Bishop(Celltype.BISHOP,Color.BLACK);

    Board board = new Board();

    board.setPieceAt(new Bishop(Celltype.BISHOP,Color.BLACK), "A4" );
    board.setPieceAt(new Bishop(Celltype.BISHOP,Color.BLACK), "B5" );
    

    assertEquals(false, bishop.moveAllowed("A4", "C6", board));
    }

    @Test
    public void testCollisionUpRightClear() { // test /+ path clear

    Bishop bishop = new Bishop(Celltype.BISHOP,Color.BLACK);

    Board board = new Board();

    board.setPieceAt(new Bishop(Celltype.BISHOP,Color.BLACK), "A4" );
        

    assertEquals(true, bishop.moveAllowed("A4", "C6", board));
    }


    @Test
    public void testCollisionDownLeftClear() { // test /- path clear

    Bishop bishop = new Bishop(Celltype.BISHOP,Color.BLACK);

    Board board = new Board();

    board.setPieceAt(new Bishop(Celltype.BISHOP,Color.BLACK), "C6" );
        
    assertEquals(true, bishop.moveAllowed("C6", "A4", board));
    
    }


    @Test
    public void testCollisionDownLeftBlock() { // test /- path blocked

    Bishop bishop = new Bishop(Celltype.BISHOP,Color.BLACK);

    Board board = new Board();

    board.setPieceAt(new Bishop(Celltype.BISHOP,Color.BLACK), "C6" );
    board.setPieceAt(new Bishop(Celltype.BISHOP,Color.BLACK), "B5" );
    

    assertEquals(false, bishop.moveAllowed("C6", "A4", board));
    }


    @Test
    public void testCollisionUpLeftClear() { // test \+ path clear

    Bishop bishop = new Bishop(Celltype.BISHOP,Color.BLACK);

    Board board = new Board();

    board.setPieceAt(new Bishop(Celltype.BISHOP,Color.BLACK), "C4" );
        
    assertEquals(true, bishop.moveAllowed("C4", "A6", board));
    
    }


    @Test
    public void testCollisionUpLeftBlock() { // test \+ path blocked

    Bishop bishop = new Bishop(Celltype.BISHOP,Color.BLACK);

    Board board = new Board();

    board.setPieceAt(new Bishop(Celltype.BISHOP,Color.BLACK), "C4" );
    board.setPieceAt(new Bishop(Celltype.BISHOP,Color.BLACK), "B5" );
    

    assertEquals(false, bishop.moveAllowed("C4", "A6", board));
    }

    @Test
    public void testCollisionTrueDownRightClear() { // test \- path clear

    Bishop bishop = new Bishop(Celltype.BISHOP,Color.BLACK);

    Board board = new Board();

    board.setPieceAt(new Bishop(Celltype.BISHOP,Color.BLACK), "A6" );
        
    assertEquals(true, bishop.moveAllowed("A6", "C4", board));
    
    }


    @Test
    public void testCollisionTrueDownRightBlock() { // test \- path blocked

    Bishop bishop = new Bishop(Celltype.BISHOP,Color.BLACK);

    Board board = new Board();

    board.setPieceAt(new Bishop(Celltype.BISHOP,Color.BLACK), "A6" );
    board.setPieceAt(new Bishop(Celltype.BISHOP,Color.BLACK), "B5" );
    

    assertEquals(false, bishop.moveAllowed("A6", "C4", board));
    }






}
