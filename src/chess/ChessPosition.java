package chess;

import boardgame.Position;

public class ChessPosition {
<<<<<<< HEAD

=======
>>>>>>> 82f11110faf19134234a929a631315cc59afc11d
    private char column;
    private int row;

    public ChessPosition(char column, int row) {
<<<<<<< HEAD
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
=======
        if(column < 'a' || column > 'h' || row < 1 || row > 8){
>>>>>>> 82f11110faf19134234a929a631315cc59afc11d
            throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
        }
        this.column = column;
        this.row = row;
    }

<<<<<<< HEAD
=======
    protected Position toPosition(){
        return new Position(8 - row, column - 'a');
    }

    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
    }


>>>>>>> 82f11110faf19134234a929a631315cc59afc11d
    public char getColumn() {
        return column;
    }

<<<<<<< HEAD
=======
    public void setColumn(char column) {
        this.column = column;
    }

>>>>>>> 82f11110faf19134234a929a631315cc59afc11d
    public int getRow() {
        return row;
    }

<<<<<<< HEAD
    protected Position toPosition() {
        return new Position(8 - row, column - 'a');
    }

    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
=======
    public void setRow(int row) {
        this.row = row;
>>>>>>> 82f11110faf19134234a929a631315cc59afc11d
    }

    @Override
    public String toString() {
        return "" + column + row;
    }
}
