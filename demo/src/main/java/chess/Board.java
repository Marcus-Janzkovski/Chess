package chess;


public class Board {

    private Cell[][] Cells;

    final int ROW_COUNT, COL_COUNT;

    public Board(int maxRow, int maxCol){


        this.ROW_COUNT = maxRow;
        this.COL_COUNT = maxCol;
        this.Cells = new Cell[maxRow][maxCol];

    
        for(int i = 0;i < ROW_COUNT;i++){
            for(int j = 0; j < COL_COUNT;j++){

                this.Cells[i][j] = new Cell(i, j); 

            }     
        }
    }




}
