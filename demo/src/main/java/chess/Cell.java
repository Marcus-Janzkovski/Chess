package chess;

public class Cell {

    private Celltype celltype ;

    private int celrow;
    private char celcol;

    public Cell(char inputCol,int inputRow ) {

        this.celltype = Celltype.EMPTY;

        setCelrow(inputRow);
        setCelcol(inputCol);

    }

    
    

    public Celltype getCelltype() {
        return celltype;
    }
    public void setCelltype(Celltype celltype) {
        this.celltype = celltype;
    }
    public int getCelrow() {
        return celrow;
    }
    public final void setCelrow(int celrow) {
        this.celrow = celrow;
    }
    public char getCelcol() {
        return this.celcol;
    }
    
    
    public final int setCelcol(char input) { // Retorna -1 em caso de input inválido
        
        if (input < 'A' || input > 'H' ){
            this.celcol = 'X';
            return -1;
        } else {
            this.celcol = input;
            return 1;
        }
    }
 

}
