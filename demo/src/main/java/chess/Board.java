package chess;

public class Board {

    private Cell[][] Cells;

    


    public Board(){

        this.Cells = new Cell[8][8];

    
        for(int i = 0;i < 8;i++){
            for(int j = 0; j < 8;j++){

                this.Cells[i][j] = new Cell(j, i); 

            }     
        }
    }

    public Cell[][] getCells() {
        return Cells;
    }

    public void setCells(Cell[][] cells) {
        Cells = cells;
    }


    public int countPieces() {

        int res=0;
        
        for(int i = 0;i < 8;i++){
            for(int j = 0; j < 8;j++){

                if (!this.Cells[i][j].isEmpty()){
                    res++;
                } 

            }     
        }

        return res;
        
    }

    public int countPiecesWhite() {

        int res=0;
        
        for(int i = 0;i < 8;i++){
            for(int j = 0; j < 8;j++){


                if (!this.Cells[i][j].isEmpty()){
                    if (this.Cells[i][j].getPiece().getColor() == chess.Pieces.Color.WHITE){
                        res++;
                    } 
                } 


                

            }     
        }

        return res;
        
    }

    public int countPiecesBlack() {

        int res=0;
        
        for(int i = 0;i < 8;i++){
            for(int j = 0; j < 8;j++){

                if (!this.Cells[i][j].isEmpty()){ //if do not make this comparison, java will bug
                    if (this.Cells[i][j].getPiece().getColor() == chess.Pieces.Color.BLACK){
                        res++;
                    } 
                } 
            }     
        }

        return res;
        
    }





}
