package chess;

import java.util.ArrayList; 
import java.util.List;

import chess.Pieces.Bishop;
import chess.Pieces.Color;
import chess.Pieces.King;
import chess.Pieces.Knight;
import chess.Pieces.Pawn;
import chess.Pieces.Queen;
import chess.Pieces.Rook;

public class ChessGame{

    private Board board;

    public Board getBoard() {
        return board;
    }


    public void setBoard(Board board) {
        this.board = board;
    }


    public List<String> getHistory() {
        return history;
    }


    public void setHistory(List<String> history) {
        this.history = history;
    }

    private List<String> history;

    public ChessGame(){
        this.board = new Board();
        this.history = new ArrayList<>();
    }


    public boolean isCastlingAllowed(String init, String target,Board board){

        if ( (target == "A1") && (init == "E1") ){ //Castling White King Castling
            if(board.getPieceAt("A1")==null || board.getPieceAt("E1") == null){ //King or Tower is not there
                return false;
            } 
            if(board.getPieceAt("A1").isMoved() || board.getPieceAt("E1").isMoved()){ //They have already moved 
                return false;
            }
            return true;
        }

        if ( (target == "H1") && (init == "E1") ){ //Castling White Queen Castling
            if(board.getPieceAt("H1")==null || board.getPieceAt("E1") == null){ //King or Tower is not there
                return false;
            } 
            if(board.getPieceAt("H1").isMoved() || board.getPieceAt("E1").isMoved()){
                return false;
            }
            return true;
                
        }

        if ( (target == "A8") && (init == "E8") ){ //Castling Black Queen Castling
            if(board.getPieceAt("A8")==null || board.getPieceAt("E8") == null){ //King or Tower is not there
                return false;
            } 
            if(board.getPieceAt("A8").isMoved() || board.getPieceAt("E8").isMoved()){
                return false;
            }
            return true;
        }

        if ( (target == "H8") && (init == "E8") ){ //Castling Black King Castling
            if(board.getPieceAt("H8")==null || board.getPieceAt("E8") == null){ //King or Tower is not there
                return false;
            } 
            if(board.getPieceAt("H8").isMoved() || board.getPieceAt("E8").isMoved()){
                return false;
            }
            return true;
        }

        return false; // not any of 4 possible cases

        


    }
    
    public boolean isValidInput(String input){

        if(input.length() != 2){
            return false;
        } else {

            if(  !(input.charAt(0) >= 'A' && input.charAt(0) <= 'H') ){//Check Col range

                return false;
            } 

            if(  !(input.charAt(1) >= '1' && input.charAt(1) <= '8') ){//Check Row range

                return false;
            } 

            return true;
            
        }

    }

    public void newGame(){

        //Kings

        this.getBoard().setPieceAt(new King(Color.BLACK), "E8");
        this.getBoard().setPieceAt(new King(Color.WHITE), "E1");

        //Queen

        this.getBoard().setPieceAt(new Queen(Color.BLACK) , "D8");
        this.getBoard().setPieceAt(new Queen(Color.WHITE) , "D1");

        //Bishop

        this.getBoard().setPieceAt(new Bishop(Color.BLACK) , "C8");
        this.getBoard().setPieceAt(new Bishop(Color.BLACK) , "F8");

        this.getBoard().setPieceAt(new Bishop(Color.WHITE) , "C1");
        this.getBoard().setPieceAt(new Bishop(Color.WHITE) , "F1");
        
        //Knight

        this.getBoard().setPieceAt(new Knight(Color.BLACK) , "G8");
        this.getBoard().setPieceAt(new Knight(Color.BLACK) , "B8");
 
        this.getBoard().setPieceAt(new Knight(Color.WHITE) , "G1");
        this.getBoard().setPieceAt(new Knight(Color.WHITE) , "B1");
        
        //Rook
        this.getBoard().setPieceAt(new Rook(Color.BLACK) , "A8");
        this.getBoard().setPieceAt(new Rook(Color.BLACK) , "H8");
 
        this.getBoard().setPieceAt(new Rook(Color.WHITE) , "A1");
        this.getBoard().setPieceAt(new Rook(Color.WHITE) , "H1");

        // Pawn

        for(int i=0;i<8;i++){
            this.getBoard().getCells()[6][i].setPiece(new Pawn(Color.WHITE)); //Fill "2" Row
        }

        for(int i=0;i<8;i++){
            this.getBoard().getCells()[1][i].setPiece(new Pawn(Color.BLACK)); //Fill "7" Row
        }


    }


}



