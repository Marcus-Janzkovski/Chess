package chess;


public class Board {

    private Cell[][] Cells;

    public Board(int maxRow, int maxCol){

        this.Cells = new Cell[maxRow][maxCol];

    
        for(int i = 0;i < maxRow;i++){
            for(int j = 0; j < maxCol;j++){

                this.Cells[i][j] = new Cell(i, j); 

            }     
        }
    }

    public Cell[][] getCells() {
        return Cells;
    }

    public void setCells(Cell[][] cells) {
        Cells = cells;
    }




}
