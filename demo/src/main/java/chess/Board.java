package chess;


public class Board {

    private Cell[][] Cells;

    final int ROW_COUNT, COL_COUNT;

    public Board(int maxRow, int maxCol){

        this.ROW_COUNT = maxRow;
        this.COL_COUNT = maxCol;
        this.Cells = new Cell[maxRow][maxCol];

        char aux = 'A';

        for(int i = 0;i < ROW_COUNT;i++){
            for(int j = 0; j < COL_COUNT;j++){

                this.Cells[i][j] = new Cell(aux, j+1); 

            }
            aux++;
        }
    }



    public Cell findCell(char col, int row ){

        Cell[][] cellMatrix = this.getCells();

        int transformedChar = col - 64;

        Cell findCell = cellMatrix[row-1][transformedChar];

        return findCell;

    }


    public Celltype getCelltypebypos(char a, int b){ //The reference is the abstract chess position (e.g A3 = first collumn, third row )

        int transformedChar = a - 64;

        return this.Cells[transformedChar][b-1].getCelltype();

    }

    public Celltype getCelltypebynum(int a, int b){ //The reference is the brute position in matrix

    
        return this.Cells[a][b].getCelltype();

    }

    public Cell[][] getCells() {
        return this.Cells;
    }

    public void setCells(Cell[][] Cells) {
        this.Cells = Cells;
    }
    



}
