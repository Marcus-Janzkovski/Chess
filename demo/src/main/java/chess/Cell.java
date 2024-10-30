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


    public int getChessrow() {
        return chessrow;
    }

    private void setChessrow(char chessrow) { //private, to avoid conflicts
        this.chessrow = chessrow;
    }

    public char getChesscol() {
        return chesscol;
    }

    private void setChesscol(char chesscol) { //private, to avoid conflicts
        this.chesscol = chesscol;
    }

    public int getCelrow() {
        return celrow;
    }

    public final void setCelrow(int celrow) { //Convert the matrix position to Chess abstract pos
        this.celrow = celrow;

        setChessrow(celrow + 1); //Board starts on 1 and matrix starts on 0

    }

    public int getCelcol() {
        return celcol;
    }

    public final void setCelcol(int celcol) { //Convert the matrix position to Chess abstract pos

        this.celcol = celcol;

        char equivalentChar = (char) (celcol + 65); //Convert matrix col into ASCII -> A = 65, B = 66 .....

        setChesscol(equivalentChar);

    }
   
}
