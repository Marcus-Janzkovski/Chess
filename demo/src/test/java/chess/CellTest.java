package chess;


import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class CellTest {


//Check Contruct class

    @Test   
    public void checkChessCol1(){
        Cell cell = new Cell(0,0);

        assertEquals('A', cell.getChesscol());

    }

    @Test   
    public void checkChessCol2(){
        Cell cell = new Cell(1,0);

        assertEquals('B', cell.getChesscol());

    }

    @Test
    public void checkChessRow1(){
        Cell cell = new Cell(0,0);

        assertEquals(1, cell.getChessrow());

    }

    @Test
    public void checkChessRow2(){
        Cell cell = new Cell(0,3);

        assertEquals(4, cell.getChessrow());

    }



}
