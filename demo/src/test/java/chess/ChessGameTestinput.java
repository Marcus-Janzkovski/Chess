package chess;

import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class ChessGameTestinput {

    @Test
    public void testInputTrue1(){

        ChessGame game = new ChessGame();


        assertEquals(true, game.isValidInput("A2"));


    }

    @Test
    public void testInputTrue2(){

        ChessGame game = new ChessGame();


        assertEquals(true, game.isValidInput("C6"));


    }

    @Test
    public void testInputBigString(){

        ChessGame game = new ChessGame();


        assertEquals(false, game.isValidInput("C62341"));


    }

    @Test
    public void testInputBigString2(){

        ChessGame game = new ChessGame();


        assertEquals(false, game.isValidInput("C62"));


    }

    @Test
    public void testInputSmallString1(){

        ChessGame game = new ChessGame();


        assertEquals(false, game.isValidInput("C"));


    }

    @Test
    public void testInputSmallString2(){

        ChessGame game = new ChessGame();


        assertEquals(false, game.isValidInput("2"));


    }

    @Test
    public void testRowRangelowTrue(){

        ChessGame game = new ChessGame();


        assertEquals(true, game.isValidInput("A1"));


    }

    @Test
    public void testRowRangelowFalse(){

        ChessGame game = new ChessGame();


        assertEquals(false, game.isValidInput("A0"));


    }

    @Test
    public void testColRangelowTrue(){

        ChessGame game = new ChessGame();


        assertEquals(true, game.isValidInput("A1"));


    }

    @Test
    public void testColRangelowFalse(){

        ChessGame game = new ChessGame();


        assertEquals(false, game.isValidInput("@1"));


    }


    @Test
    public void testRowRangeHighTrue(){

        ChessGame game = new ChessGame();


        assertEquals(true, game.isValidInput("A8"));


    }

    @Test
    public void testRowRangeHighFalse(){

        ChessGame game = new ChessGame();


        assertEquals(false, game.isValidInput("A9"));


    }

    @Test
    public void testColRangeHighTrue(){

        ChessGame game = new ChessGame();


        assertEquals(true, game.isValidInput("H5"));


    }

    @Test
    public void testColRangeHighFalse(){

        ChessGame game = new ChessGame();


        assertEquals(false, game.isValidInput("I5"));


    }

    
}
