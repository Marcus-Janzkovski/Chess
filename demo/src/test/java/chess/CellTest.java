package chess;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

import chess.Pieces.Bishop;
import chess.Pieces.Color;


public class CellTest {

    @Test
    public void testGetCelcol() {
        Cell cell = new Cell(2,3);

        assertEquals(2,cell.getCelcol());

    }

    @Test
    public void testGetCelrow() {
        
        Cell cell = new Cell(2,3);

        assertEquals(3,cell.getCelrow());

    }

    @Test
    public void testGetChesscol() {

        Cell cell = new Cell(2,3);

        assertEquals('C',cell.getChesscol());
    }

    @Test
    public void testGetChessrow() {
        
        Cell cell = new Cell(2,3);

        assertEquals('5',cell.getChessrow());


    }

   

    @Test
    public void testSetCelcol() {

        Cell cell = new Cell(2,3);

        cell.setCelcol(5);

        assertEquals(5,cell.getCelcol());


    }

    @Test
    public void testSetCelrow() {
        
        Cell cell = new Cell(2,3);

        cell.setCelrow(5);

        assertEquals(5,cell.getCelrow());

    }

    @Test
    public void testSetChesscol() {
        Cell cell = new Cell(2,3);

        cell.setChesscol('A');

        assertEquals('A',cell.getChesscol());


    }

    @Test
    public void testSetChessrow() {

        Cell cell = new Cell(2,3);

        cell.setChessrow('1');

        assertEquals('1',cell.getChessrow());
        
    }

       @Test

        public void testSetandGetPiece() {

        Cell cell = new Cell(2,3);
        Bishop bishop = new Bishop( Color.BLACK);
        cell.setPiece(bishop);

        assertEquals(Celltype.BISHOP, cell.getPiece().getName());

    }

    @Test
    public void testIsEmpty1() {

        Cell cell = new Cell(2,3);
        Bishop bishop = new Bishop( Color.BLACK);
        cell.setPiece(bishop);

        assertEquals(false, cell.isEmpty());

    }

    @Test
    public void testIsEmpty2() {

        Cell cell = new Cell(2,3);

        assertEquals(true, cell.isEmpty());

    }

    @Test
    public void getpos1(){

        Cell cell = new Cell(0, 0);

        assertEquals("A8", cell.getpos());

    }

    @Test
    public void testdeletePiece(){
        Cell cell = new Cell(0, 0);

        cell.setPiece(new Bishop( Color.WHITE));
        
        cell.clear();

        assertEquals(true, cell.isEmpty());

    }

    @Test 

    public void testsetPos(){

        Cell cell = new Cell(0, 0);

        cell.setpos("A3");

        assertEquals("A3", cell.getpos());


    }


}
