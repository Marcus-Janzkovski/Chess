package chess;

import chess.Pieces.Piece;

public class Cell {


    //Piece related
    protected Piece piece;

    //Board related Matrix reference
    private int celrow;
    private int celcol;

    //Board related Chess reference
    private char chessrow;
    private char chesscol;

    public Cell(int inputCol,int inputRow ) {
        
        setCelcol(inputCol);
        setCelrow(inputRow);
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }


    //input matrix or chess parameters does not matter

    public int getCelrow() {
        return celrow;
    }


    public void setCelrow(int celrow) { 
        this.celrow = celrow;

        int aux = (8 - celrow);

        this.chessrow = (char) ( 48 + aux) ;// Matrix to Chess 

    }

    public int getCelcol() {
        return celcol;
    }

    public void setCelcol(int celcol) {
        this.celcol = celcol;

        this.chesscol = (char) (celcol + 65); // Matrix to Chess 

    }

 
    public char getChessrow() {
        return chessrow;
    }


    public void setChessrow(char chessrow) { 
        this.chessrow = chessrow;

        this.celrow = 8 - ('A' - chessrow) ; //chess to Matrix

    }

    public char getChesscol() {
        return chesscol;
    }

    public void setChesscol(char chesscol) {
        this.chesscol = chesscol;

        this.celcol = 65 - (int) chesscol;

    }

    public boolean isEmpty() {
        return this.getPiece() == null;
    }

   
}
