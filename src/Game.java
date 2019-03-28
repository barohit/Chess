import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 1; /*
							 * used to determine whether or not White or Black is moving. Odd values are
							 * white, even values are black
							 */
		ChessBoard board = new ChessBoard();

		board.fillBoardWithSquares();
		board.standardizeBoardInAllSquares();
		board.fillSquaresWithPieces();
		// board.assignChessBoardColors();
		board.standardizeBoardAmongPieces();
		Scanner scan = new Scanner(System.in);
		String move = "";

		while (board.evaluateCheckmate(board.currentPlayer(counter), board) == false) {

			System.out.println("Select your move.");
			move = scan.next();

			board.play(move, counter);
			counter++;

		}

		scan.close();

	}

	public void printBoard(ChessBoard board) {

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (j != 7) {
					System.out.print(board.getChessBoardArray()[i][j].getPiece().identity + " "
							+ board.getChessBoardArray()[i][j].getPiece().getColor() + " ");
				} else {
					System.out.println(board.getChessBoardArray()[i][j].getPiece().identity + " "
							+ board.getChessBoardArray()[i][j].getPiece().getColor());
				}
			}
		}
	}

}
