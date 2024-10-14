package chess;


import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class CellTest {

    @Test
    public void constructorTestrow(){
        Cell cell = new Cell('A', 1);

        assertEquals(1, cell.getCelrow());

    }

    @Test
    public void constructorTestcol(){
        Cell cell = new Cell('A', 1);

        assertEquals(cell.getCelcol(), 'A');

    }

    @Test
    public void constructorTestWrongCol(){
        Cell cell = new Cell('v', 1);

        assertEquals(cell.getCelcol(), 'X');

    }



}
