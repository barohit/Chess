
public class Square {

	String squareColor;
	Piece currentPiece;
	char column = 'a';
	int columnValue = 0; // refers to columns using a numerical value for simplicity.
	int row = 1;
	int rowValue = 0;
	ChessBoard chessBoard = new ChessBoard();

	protected ChessBoard getChessBoard() {
		return chessBoard;
	}

	protected void setChessBoard(ChessBoard board) {
		chessBoard = board;
	}

	protected Piece getPiece() {
		return this.currentPiece;
	}

	protected void setPiece(Piece piece) {
		if (piece != null) {
			piece.setCurrentPosition(this);

			currentPiece = piece;
		}

	}

	protected char getColumn() {
		return column;
	}

	protected void setColumn(char c) {
		column = c;
	}

	protected int getRow() {
		return row;
	}

	protected void setRow(int roww) {
		row = roww;
	}

	protected int getColumnValue() {
		return columnValue;
	}

	protected void setColumnValue(int i) {
		columnValue = i;
		switch (i) {
		case 0:
			column = 'a';
			break;

		case 1:
			column = 'b';
			break;

		case 2:
			column = 'c';
			break;

		case 3:
			column = 'd';
			break;

		case 4:
			column = 'e';
			break;

		case 5:
			column = 'f';
			break;

		case 6:
			column = 'g';
			break;

		case 7:
			column = 'h';
			break;

		default:
			break;
		}
	}

	protected int getRowValue() {
		return rowValue;
	}

	protected void setRowValue(int i) {
		rowValue = i;
		convertRowValuetoRow(i);
	}

	protected void setColor(String color) {
		squareColor = color;
	}

	protected void convertRowtoRowValue(int roww) {
		rowValue = roww - 1;
	}

	protected void convertRowValuetoRow(int rowwValue) {
		row = rowwValue + 1;
	}

	protected int getRowFromRowValue(int rowwValue) {
		return rowwValue + 1;
	}

	protected int getRowValueFromRow(int roww) {
		return row - 1;
	}

	protected void convertColumnValueToColumn(Square square) {
		switch (square.getColumnValue()) {

		case 0:
			square.column = 'a';
			break;

		case 1:
			square.column = 'b';
			break;

		case 2:
			square.column = 'c';
			break;

		case 3:
			square.column = 'd';
			break;

		case 4:
			square.column = 'e';
			break;

		case 5:
			square.column = 'f';
			break;

		case 6:
			square.column = 'g';
			break;

		case 7:
			square.column = 'h';
			break;

		default:
			break;

		}
	}

	protected void convertColumnToColumnValue(Square square) {
		switch (square.getColumnValue()) {

		case 'a':
			square.columnValue = 0;
			break;

		case 'b':
			square.columnValue = 1;
			break;

		case 'c':
			square.columnValue = 2;
			break;

		case 'd':
			square.columnValue = 3;
			break;

		case 'e':
			square.columnValue = 4;
			break;

		case 'f':
			square.columnValue = 5;
			break;

		case 'g':
			square.columnValue = '6';
			break;

		case 'h':
			square.columnValue = '7';
			break;

		default:
			break;

		}
	}

	protected char getColumnFromColumnValue(int columnValue) {

		char result = 'u';

		switch (columnValue) {

		case 0:
			result = 'a';
			break;

		case 1:
			result = 'b';
			break;

		case 2:
			result = 'c';
			break;

		case 3:
			result = 'd';
			break;

		case 4:
			result = 'e';
			break;

		case 5:
			result = 'f';
			break;

		case 6:
			result = 'g';
			break;

		case 7:
			result = 'h';
			break;

		default:
			break;

		}

		return result;

	}

	protected int getColumnValueFromColumn(char column) {

		int result = '0';

		switch (column) {

		case 'a':
			result = 0;
			break;

		case 'b':
			result = 1;
			break;

		case 'c':
			result = 2;
			break;

		case 'd':
			result = 4;
			break;

		case 'e':
			result = 5;
			break;

		case 'f':
			result = 6;
			break;

		case 'g':
			result = 7;
			break;

		case '8':
			result = 8;
			break;

		default:
			break;

		}

		return result;

	}
}
