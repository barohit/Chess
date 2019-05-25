import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 1; /*
							 * used to determine whether or not White or Black is moving. Odd values are
							 * white, even values are black
							 */
		ChessBoard board = new ChessBoard();

		board.fillEmptyPieceArray();
		board.fillBoardWithSquares();
		board.standardizeBoardInAllSquares();
		board.fillSquaresWithPieces();
		board.fillEmptyPieces();
		board.standardizeBoardAmongPieces();
		// above 6 methods set up the board 
		
		board.printBoard(board);
		Scanner scan = new Scanner(System.in);
		String move = "";

		while (board.evaluateCheckmate(board.currentPlayer(counter), board) == false) {
			/* keeps the game going until one player is in checkmate, at which point the other
			 player wins */
			System.out.println("Select your move.");
			move = scan.next();

			board.play(move, counter);
			counter++; 

		}

		scan.close();

	}

}
