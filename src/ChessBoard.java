public class ChessBoard {

	Square[][] chessBoard = new Square[8][8];

	Pawn whitePawn1 = new Pawn("white");
	Pawn whitePawn2 = new Pawn("white");
	Pawn whitePawn3 = new Pawn("white");
	Pawn whitePawn4 = new Pawn("white");
	Pawn whitePawn5 = new Pawn("white");
	Pawn whitePawn6 = new Pawn("white");
	Pawn whitePawn7 = new Pawn("white");
	Pawn whitePawn8 = new Pawn("white");
	Pawn blackPawn1 = new Pawn("black");
	Pawn blackPawn2 = new Pawn("black");
	Pawn blackPawn3 = new Pawn("black");
	Pawn blackPawn4 = new Pawn("black");
	Pawn blackPawn5 = new Pawn("black");
	Pawn blackPawn6 = new Pawn("black");
	Pawn blackPawn7 = new Pawn("black");
	Pawn blackPawn8 = new Pawn("black");
	Rook whiteRook = new Rook("white");
	Rook blackRook = new Rook("black");
	Bishop whiteBishop = new Bishop("white");
	Bishop blackBishop = new Bishop("black");
	Knight whiteKnight = new Knight("white");
	Knight blackKnight = new Knight("black");
	Queen whiteQueen = new Queen("white");
	Queen blackQueen = new Queen("black");
	King whiteKing = new King("white");
	King blackKing = new King("black");
	Rook whiteRook2 = new Rook("white");
	Rook blackRook2 = new Rook("black");
	Bishop whiteBishop2 = new Bishop("white");
	Bishop blackBishop2 = new Bishop("black");
	Knight whiteKnight2 = new Knight("white");
	Knight blackKnight2 = new Knight("black");
	/*
	 * EmptyPiece emptyPiecea1 = new EmptyPiece(); EmptyPiece emptyPiecea2 = new
	 * EmptyPiece(); EmptyPiece emptyPiecea3 = new EmptyPiece(); EmptyPiece
	 * emptyPiecea4 = new EmptyPiece(); EmptyPiece emptyPiecea5 = new EmptyPiece();
	 * EmptyPiece emptyPiecea6 = new EmptyPiece(); EmptyPiece emptyPiecea7 = new
	 * EmptyPiece(); EmptyPiece emptyPiecea8 = new EmptyPiece(); EmptyPiece
	 * emptyPieceb1 = new EmptyPiece(); EmptyPiece emptyPieceb2 = new EmptyPiece();
	 * EmptyPiece emptyPieceb3 = new EmptyPiece(); EmptyPiece emptyPieceb4 = new
	 * EmptyPiece(); EmptyPiece emptyPieceb5 = new EmptyPiece(); EmptyPiece
	 * emptyPieceb6 = new EmptyPiece(); EmptyPiece emptyPieceb7 = new EmptyPiece();
	 * EmptyPiece emptyPieceb8 = new EmptyPiece(); EmptyPiece emptyPiecec1 = new
	 * EmptyPiece(); EmptyPiece emptyPiecec2 = new EmptyPiece(); EmptyPiece
	 * emptyPiecec3 = new EmptyPiece(); EmptyPiece emptyPiecec4 = new EmptyPiece();
	 * EmptyPiece emptyPiecec5 = new EmptyPiece(); EmptyPiece emptyPiecec6 = new
	 * EmptyPiece(); EmptyPiece emptyPiecec7 = new EmptyPiece(); EmptyPiece
	 * emptyPiecec8 = new EmptyPiece(); EmptyPiece emptyPieced1 = new EmptyPiece();
	 * EmptyPiece emptyPieced2 = new EmptyPiece(); EmptyPiece emptyPieced3 = new
	 * EmptyPiece(); EmptyPiece emptyPieced4 = new EmptyPiece(); EmptyPiece
	 * emptyPieced5 = new EmptyPiece(); EmptyPiece emptyPieced6 = new EmptyPiece();
	 * EmptyPiece emptyPieced7 = new EmptyPiece(); EmptyPiece emptyPieced8 = new
	 * EmptyPiece(); EmptyPiece emptyPiecee1 = new EmptyPiece(); EmptyPiece
	 * emptyPiecee2 = new EmptyPiece(); EmptyPiece emptyPiecee3 = new EmptyPiece();
	 * EmptyPiece emptyPiecee4 = new EmptyPiece(); EmptyPiece emptyPiecee5 = new
	 * EmptyPiece(); EmptyPiece emptyPiecee6 = new EmptyPiece(); EmptyPiece
	 * emptyPiecee7 = new EmptyPiece(); EmptyPiece emptyPiecee8 = new EmptyPiece();
	 * EmptyPiece emptyPiecef1 = new EmptyPiece(); EmptyPiece emptyPiecef2 = new
	 * EmptyPiece(); EmptyPiece emptyPiecef3 = new EmptyPiece(); EmptyPiece
	 * emptyPiecef4 = new EmptyPiece(); EmptyPiece emptyPiecef5 = new EmptyPiece();
	 * EmptyPiece emptyPiecef6 = new EmptyPiece(); EmptyPiece emptyPiecef7 = new
	 * EmptyPiece(); EmptyPiece emptyPiecef8 = new EmptyPiece(); EmptyPiece
	 * emptyPieceg1 = new EmptyPiece(); EmptyPiece emptyPieceg2 = new EmptyPiece();
	 * EmptyPiece emptyPieceg3 = new EmptyPiece(); EmptyPiece emptyPieceg4 = new
	 * EmptyPiece(); EmptyPiece emptyPieceg5 = new EmptyPiece(); EmptyPiece
	 * emptyPieceg6 = new EmptyPiece(); EmptyPiece emptyPieceg7 = new EmptyPiece();
	 * EmptyPiece emptyPieceg8 = new EmptyPiece(); EmptyPiece emptyPieceh1 = new
	 * EmptyPiece(); EmptyPiece emptyPieceh2 = new EmptyPiece(); EmptyPiece
	 * emptyPieceh3 = new EmptyPiece(); EmptyPiece emptyPieceh4 = new EmptyPiece();
	 * EmptyPiece emptyPieceh5 = new EmptyPiece(); EmptyPiece emptyPieceh6 = new
	 * EmptyPiece(); EmptyPiece emptyPieceh7 = new EmptyPiece(); EmptyPiece
	 * emptyPieceh8 = new EmptyPiece();
	 */

	// assigns rows, columns to every square

	protected Square[][] getChessBoardArray() {
		return chessBoard;
	}

	protected void play(String s, int count) {
		switch (s.length()) {
		case 2:
			char a = s.charAt(0);
			int b = Character.getNumericValue(s.charAt(1));
			outerloop: for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if (chessBoard[i][j].getPiece() != null) {
						if (chessBoard[i][j].getPiece().getIdentity().equals("Pawn")
								&& chessBoard[i][j].getPiece().canMove(getSquare(b, a))) {
							if (count % 2 == 1) {
								if (chessBoard[i][j].getPiece().getColor().equals("white")) {
									chessBoard[i][j].getPiece().move(getSquare(b, a));
									break outerloop;
								}
							}

							else if (count % 2 == 0) {
								if (chessBoard[i][j].getPiece().getColor().equals("black")) {
									chessBoard[i][j].getPiece().move(getSquare(b, a));
									break outerloop;
								}
							}
						}
					}
				}
			}
			break;

		case 3:
			char x = s.charAt(0);
			char y = s.charAt(1);
			int z = Character.getNumericValue(s.charAt(2));
			switch (x) {
			case 'K':
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						if (chessBoard[i][j].getPiece() != null) {
							if (chessBoard[i][j].getPiece().getIdentity().equals("King")
									&& chessBoard[i][j].getPiece().canMove(getSquare(z, y))) {
								if (count % 2 == 1) {
									if (chessBoard[i][j].getPiece().getColor().equals("white")) {
										chessBoard[i][j].getPiece().move(getSquare(z, y));
									}
								}

								if (count % 2 == 0) {
									if (chessBoard[i][j].getPiece().getColor().equals("black")) {
										chessBoard[i][j].getPiece().move(getSquare(z, y));
									}
								}
							}
						}
					}
				}
				break;
			case 'Q':
				outerloop: for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						if (chessBoard[i][j].getPiece() != null) {
							if (chessBoard[i][j].getPiece().getIdentity().equals("Queen")
									&& chessBoard[i][j].getPiece().canMove(getSquare(z, y))) {
								if (count % 2 == 1) {
									if (chessBoard[i][j].getPiece().getColor().equals("white")) {
										chessBoard[i][j].getPiece().move(getSquare(z, y));
										break outerloop;
									}
								}

								else if (count % 2 == 0) {
									if (chessBoard[i][j].getPiece().getColor().equals("black")) {
										chessBoard[i][j].getPiece().move(getSquare(z, y));
										break outerloop;
									}
								}
							}
						}
					}
				}
				break;
			case 'B':
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						if (chessBoard[i][j].getPiece() != null) {
							if (chessBoard[i][j].getPiece().getIdentity().equals("Bishop")
									&& chessBoard[i][j].getPiece().canMove(getSquare(z, y))) {
								if (count % 2 == 1) {
									if (chessBoard[i][j].getPiece().getColor().equals("white")) {
										chessBoard[i][j].getPiece().move(getSquare(z, y));
									}
								}

								if (count % 2 == 0) {
									if (chessBoard[i][j].getPiece().getColor().equals("black")) {
										chessBoard[i][j].getPiece().move(getSquare(z, y));
									}
								}
							}
						}
					}
				}
				break;
			case 'R':
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						if (chessBoard[i][j].getPiece() != null) {
							if (chessBoard[i][j].getPiece().getIdentity().equals("Rook")
									&& chessBoard[i][j].getPiece().canMove(getSquare(z, y))) {
								if (count % 2 == 1) {
									if (chessBoard[i][j].getPiece().getColor().equals("white")) {
										chessBoard[i][j].getPiece().move(getSquare(z, y));
									}
								}

								if (count % 2 == 0) {
									if (chessBoard[i][j].getPiece().getColor().equals("black")) {
										chessBoard[i][j].getPiece().move(getSquare(z, y));
									}
								}
							}
						}
					}
				}
				break;
			case 'N':
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						if (chessBoard[i][j].getPiece() != null) {
							if (chessBoard[i][j].getPiece().getIdentity().equals("Knight")
									&& chessBoard[i][j].getPiece().canMove(getSquare(z, y))) {
								if (count % 2 == 1) {
									if (chessBoard[i][j].getPiece().getColor().equals("white")) {
										chessBoard[i][j].getPiece().move(getSquare(z, y));
									}
								}

								else if (count % 2 == 0) {
									if (chessBoard[i][j].getPiece().getColor().equals("black")) {
										chessBoard[i][j].getPiece().move(getSquare(z, y));
									}
								}
							} else
								System.out.println("Sorry, you entered an invalid move.");

						}
					}
				}
				break;
			default:
				System.out.println("Sorry, you entered an invalid move");
			}
			break;
		case 4:
			char first = s.charAt(0);
			char second = s.charAt(1);
			char third = s.charAt(2);
			int fourth = Character.getNumericValue(s.charAt(3));
			if (second == 'x') {
				if (Character.isLowerCase(first) == true) {
					for (int i = 0; i < 8; i++) {
						for (int j = 0; j < 8; j++) {
							if (chessBoard[i][j].getPiece() != null) {
								if (chessBoard[i][j].getPiece().getIdentity().equals("Pawn")
										&& chessBoard[i][j].getPiece().canCapture(getSquare(fourth, third))) {
									if (count % 2 == 1) {
										if (chessBoard[i][j].getPiece().getColor().equals("white")) {
											chessBoard[i][j].getPiece().move(getSquare(fourth, third));
										}
									}

									if (count % 2 == 0) {
										if (chessBoard[i][j].getPiece().getColor().equals("black")) {
											chessBoard[i][j].getPiece().move(getSquare(fourth, third));
										}
									}
								}
							}
						}
					}
				} else {
					switch (first) {
					case 'K':
						for (int i = 0; i < 8; i++) {
							for (int j = 0; j < 8; j++) {
								if (chessBoard[i][j].getPiece() != null) {
									if (chessBoard[i][j].getPiece().getIdentity().equals("King")
											&& chessBoard[i][j].getPiece().canMove(getSquare(fourth, third))) {
										if (count % 2 == 1) {
											if (chessBoard[i][j].getPiece().getColor().equals("white")) {
												chessBoard[i][j].getPiece().move(getSquare(fourth, third));
											}
										}

										if (count % 2 == 0) {
											if (chessBoard[i][j].getPiece().getColor().equals("black")) {
												chessBoard[i][j].getPiece().move(getSquare(fourth, third));
											}
										}
									}
								}
							}
						}
						break;
					case 'Q':
						for (int i = 0; i < 8; i++) {
							for (int j = 0; j < 8; j++) {
								if (chessBoard[i][j].getPiece() != null) {
									if (chessBoard[i][j].getPiece().getIdentity().equals("Queen")
											&& chessBoard[i][j].getPiece().canMove(getSquare(fourth, third))) {
										if (count % 2 == 1) {
											if (chessBoard[i][j].getPiece().getColor().equals("white")) {
												chessBoard[i][j].getPiece().move(getSquare(fourth, third));
											}
										}

										if (count % 2 == 0) {
											if (chessBoard[i][j].getPiece().getColor().equals("black")) {
												chessBoard[i][j].getPiece().move(getSquare(fourth, third));
											}
										}
									}
								}
							}
						}
						break;
					case 'B':
						for (int i = 0; i < 8; i++) {
							for (int j = 0; j < 8; j++) {
								if (chessBoard[i][j].getPiece() != null) {
									if (chessBoard[i][j].getPiece().getIdentity().equals("Bishop")
											&& chessBoard[i][j].getPiece().canMove(getSquare(fourth, third))) {
										if (count % 2 == 1) {
											if (chessBoard[i][j].getPiece().getColor().equals("white")) {
												chessBoard[i][j].getPiece().move(getSquare(fourth, third));
											}
										}

										if (count % 2 == 0) {
											if (chessBoard[i][j].getPiece().getColor().equals("black")) {
												chessBoard[i][j].getPiece().move(getSquare(fourth, third));
											}
										}
									}
								}
							}
						}
						break;
					case 'R':
						for (int i = 0; i < 8; i++) {
							for (int j = 0; j < 8; j++) {
								if (chessBoard[i][j].getPiece() != null) {
									if (chessBoard[i][j].getPiece().getIdentity().equals("Rook")
											&& chessBoard[i][j].getPiece().canMove(getSquare(fourth, third))) {
										if (count % 2 == 1) {
											if (chessBoard[i][j].getPiece().getColor().equals("white")) {
												chessBoard[i][j].getPiece().move(getSquare(fourth, third));
											}
										}

										if (count % 2 == 0) {
											if (chessBoard[i][j].getPiece().getColor().equals("black")) {
												chessBoard[i][j].getPiece().move(getSquare(fourth, third));
											}
										}
									}
								}
							}
						}
						break;
					case 'N':
						for (int i = 0; i < 8; i++) {
							for (int j = 0; j < 8; j++) {
								if (chessBoard[i][j].getPiece() != null) {
									if (chessBoard[i][j].getPiece().getIdentity().equals("Knight")
											&& chessBoard[i][j].getPiece().canMove(getSquare(fourth, third))) {
										if (count % 2 == 1) {
											if (chessBoard[i][j].getPiece().getColor().equals("white")) {
												chessBoard[i][j].getPiece().move(getSquare(fourth, third));
											}
										}

										else if (count % 2 == 0) {
											if (chessBoard[i][j].getPiece().getColor().equals("black")) {
												chessBoard[i][j].getPiece().move(getSquare(fourth, third));
											}
										}
									} else
										System.out.println("Sorry, you entered an invalid move.");

								}
							}
						}
						break;
					default:
						System.out.println("Sorry, you entered an invalid move");

					}
				}
			} else {
				if (second != 'x') {

					switch (first) {

					case 'R':
						for (int i = 0; i < 8; i++) {
							for (int j = 0; j < 8; j++) {
								if (chessBoard[i][j].getPiece() != null) {
									if (chessBoard[i][j].getPiece().getIdentity().equals("Rook")
											&& (chessBoard[i][j].getPiece().getCurrentPosition().getColumn() == second
													|| chessBoard[i][j].getPiece().getCurrentPosition()
															.getRow() == second)
											&& chessBoard[i][j].getPiece().canMove(getSquare(fourth, third))) {
										if (count % 2 == 1) {
											if (chessBoard[i][j].getPiece().getColor().equals("white")) {
												chessBoard[i][j].getPiece().move(getSquare(fourth, third));
											}
										}

										if (count % 2 == 0) {
											if (chessBoard[i][j].getPiece().getColor().equals("black")) {
												chessBoard[i][j].getPiece().move(getSquare(fourth, third));
											}
										}
									}
								}
							}
						}
						break;
					case 'N':
						for (int i = 0; i < 8; i++) {
							for (int j = 0; j < 8; j++) {
								if (chessBoard[i][j].getPiece() != null) {
									if (chessBoard[i][j].getPiece().getIdentity().equals("Knight")
											&& (chessBoard[i][j].getPiece().getCurrentPosition().getColumn() == second
													|| chessBoard[i][j].getPiece().getCurrentPosition()
															.getRow() == second)
											&& chessBoard[i][j].getPiece().canMove(getSquare(fourth, third))) {
										if (count % 2 == 1) {
											if (chessBoard[i][j].getPiece().getColor().equals("white")) {
												chessBoard[i][j].getPiece().move(getSquare(fourth, third));
											}
										}

										else if (count % 2 == 0) {
											if (chessBoard[i][j].getPiece().getColor().equals("black")) {
												chessBoard[i][j].getPiece().move(getSquare(fourth, third));
											}
										}
									} else {
										System.out.println("Sorry, you entered an invalid move.");

									}
								}
							}
						}
						break;
					default:
						System.out.println("Sorry, you entered an invalid move");
					}
				}
			}

		case 5:
			char un = s.charAt(0);
			char dd = s.charAt(1);
			char quatr = s.charAt(3);
			int cinc = Character.getNumericValue(s.charAt(4));
			switch (un) {

			case 'R':
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						if (chessBoard[i][j].getPiece() != null) {
							if (chessBoard[i][j].getPiece().getIdentity().equals("Rook")
									&& (chessBoard[i][j].getPiece().getCurrentPosition().getColumn() == dd
											|| chessBoard[i][j].getPiece().getCurrentPosition().getRow() == dd)
									&& chessBoard[i][j].getPiece().canMove(getSquare(cinc, quatr))) {
								if (count % 2 == 1) {
									if (chessBoard[i][j].getPiece().getColor().equals("white")) {
										chessBoard[i][j].getPiece().move(getSquare(cinc, quatr));
									}
								}

								if (count % 2 == 0) {
									if (chessBoard[i][j].getPiece().getColor().equals("black")) {
										chessBoard[i][j].getPiece().move(getSquare(cinc, quatr));
									}
								}
							}
						}
					}
				}
				break;
			case 'N':
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						if (chessBoard[i][j].getPiece() != null) {
							if (chessBoard[i][j].getPiece().getIdentity().equals("Knight")
									&& (chessBoard[i][j].getPiece().getCurrentPosition().getColumn() == dd
											|| chessBoard[i][j].getPiece().getCurrentPosition().getRow() == dd)
									&& chessBoard[i][j].getPiece().canMove(getSquare(cinc, quatr))) {
								if (count % 2 == 1) {
									if (chessBoard[i][j].getPiece().getColor().equals("white")) {
										chessBoard[i][j].getPiece().move(getSquare(cinc, quatr));
									}
								}

								else if (count % 2 == 0) {
									if (chessBoard[i][j].getPiece().getColor().equals("black")) {
										chessBoard[i][j].getPiece().move(getSquare(cinc, quatr));
									}
								}
							} else {
								System.out.println("Sorry, you entered an invalid move.");

							}
						}
					}
				}
				break;
			default:
				System.out.println("Sorry, invalid move.");
			}
		}

	}

	protected Square getSquare(int row, char column) {
		Square converter = new Square();
		return chessBoard[converter.getRowValueFromRow(row)][converter.getColumnValueFromColumn(column)];
	}

	protected void fillBoardWithSquares() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				chessBoard[i][j] = new Square();
				chessBoard[i][j].setRowValue(i);
				chessBoard[i][j].setColumnValue(j);
			}
		}
	}

	protected void standardizeBoardInAllSquares() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				chessBoard[i][j].setChessBoard(this);
			}
		}
	}

	protected void standardizeBoardAmongPieces() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (chessBoard[i][j].getPiece() != null) {
					chessBoard[i][j].getPiece().setChessBoard(this);
				}
			}
		}

	}

	protected void assignChessBoardCoordinates() {

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				chessBoard[i][j].row = j + 1;
				chessBoard[i][j].rowValue = j;
				switch (i) {

				case 0:
					chessBoard[i][j].column = 'a';
					chessBoard[i][j].columnValue = 0;
					break;

				case 1:
					chessBoard[i][j].column = 'b';
					chessBoard[i][j].columnValue = 1;
					break;

				case 2:
					chessBoard[i][j].column = 'c';
					chessBoard[i][j].columnValue = 2;
					break;

				case 3:
					chessBoard[i][j].column = 'd';
					chessBoard[i][j].columnValue = 3;
					break;

				case 4:
					chessBoard[i][j].column = 'e';
					chessBoard[i][j].columnValue = 4;
					break;

				case 5:
					chessBoard[i][j].column = 'f';
					chessBoard[i][j].columnValue = 5;
					break;

				case 6:
					chessBoard[i][j].column = 'g';
					chessBoard[i][j].columnValue = 6;
					break;

				case 7:
					chessBoard[i][j].column = 'h';
					chessBoard[i][j].columnValue = 7;
					break;

				default:
					break;

				}
			}
		}
	}

	// assigns alternating colors to every square.
	public void assignChessBoardColors() {

		chessBoard[0][0].setColor("dark");

		for (int i1 = 0; i1 < 8; i1++) {
			for (int j = 1; j < 8; j++) {
				if (chessBoard[i1][j - 1].squareColor.equals("dark")) {
					chessBoard[i1][j].setColor("light");
				}

				else {
					if (chessBoard[i1][j - 1].squareColor.equals("light")) {
						chessBoard[i1][j].setColor("dark");
					}
				}

			}

			if (chessBoard[i1][0].squareColor.equals("dark") && i1 != 7) {
				chessBoard[i1 + 1][0].setColor("light");
			}

			else {
				if (chessBoard[i1][0].squareColor.equals("light") && i1 != 7) {
					chessBoard[i1 + 1][0].setColor("dark");
				}
			}

		}
	}

	protected void fillSquaresWithPieces() { // fills the chessboard with pieces at the start of the game
		chessBoard[1][0].setPiece(whitePawn1);
		chessBoard[1][1].setPiece(whitePawn2);
		chessBoard[1][2].setPiece(whitePawn3);
		chessBoard[1][3].setPiece(whitePawn4);
		chessBoard[1][4].setPiece(whitePawn5);
		chessBoard[1][5].setPiece(whitePawn6);
		chessBoard[1][6].setPiece(whitePawn7);
		chessBoard[1][7].setPiece(whitePawn8);
		chessBoard[6][0].setPiece(blackPawn1);
		chessBoard[6][1].setPiece(blackPawn2);
		chessBoard[6][2].setPiece(blackPawn3);
		chessBoard[6][3].setPiece(blackPawn4);
		chessBoard[6][4].setPiece(blackPawn5);
		chessBoard[6][5].setPiece(blackPawn6);
		chessBoard[6][6].setPiece(blackPawn7);
		chessBoard[6][7].setPiece(blackPawn8);
		chessBoard[0][0].setPiece(whiteRook);
		chessBoard[0][7].setPiece(whiteRook2);
		chessBoard[7][0].setPiece(blackRook);
		chessBoard[7][7].setPiece(blackRook2);
		chessBoard[0][1].setPiece(whiteKnight);
		chessBoard[0][6].setPiece(whiteKnight2);
		chessBoard[7][1].setPiece(blackKnight);
		chessBoard[7][6].setPiece(blackKnight2);
		chessBoard[0][2].setPiece(whiteBishop);
		chessBoard[0][5].setPiece(whiteBishop2);
		chessBoard[7][2].setPiece(blackBishop);
		chessBoard[7][5].setPiece(blackBishop2);
		chessBoard[0][3].setPiece(whiteQueen);
		chessBoard[7][3].setPiece(blackQueen);
		chessBoard[0][4].setPiece(whiteKing);
		chessBoard[7][4].setPiece(blackKing);
		/*
		 * chessBoard[2][0].setPiece(emptyPiecea3);
		 * chessBoard[2][1].setPiece(emptyPieceb3);
		 * chessBoard[2][2].setPiece(emptyPiecec3);
		 * chessBoard[2][3].setPiece(emptyPieced3);
		 * chessBoard[2][4].setPiece(emptyPiecee3);
		 * chessBoard[2][5].setPiece(emptyPiecef3);
		 * chessBoard[2][6].setPiece(emptyPieceg3);
		 * chessBoard[2][7].setPiece(emptyPieceh3);
		 * chessBoard[3][0].setPiece(emptyPiecea4);
		 * chessBoard[3][1].setPiece(emptyPieceb4);
		 * chessBoard[3][2].setPiece(emptyPiecec4);
		 * chessBoard[3][3].setPiece(emptyPieced4);
		 * chessBoard[3][4].setPiece(emptyPiecee4);
		 * chessBoard[3][5].setPiece(emptyPiecef4);
		 * chessBoard[3][6].setPiece(emptyPieceg4);
		 * chessBoard[3][7].setPiece(emptyPieceh4);
		 * chessBoard[4][0].setPiece(emptyPiecea5);
		 * chessBoard[4][1].setPiece(emptyPieceb5);
		 * chessBoard[4][2].setPiece(emptyPiecec5);
		 * chessBoard[4][3].setPiece(emptyPieced5);
		 * chessBoard[4][4].setPiece(emptyPiecee5);
		 * chessBoard[4][5].setPiece(emptyPiecef5);
		 * chessBoard[4][6].setPiece(emptyPieceg5);
		 * chessBoard[4][7].setPiece(emptyPieceh5);
		 * chessBoard[5][0].setPiece(emptyPiecea6);
		 * chessBoard[5][1].setPiece(emptyPieceb6);
		 * chessBoard[5][2].setPiece(emptyPiecec6);
		 * chessBoard[5][3].setPiece(emptyPieced6);
		 * chessBoard[5][4].setPiece(emptyPiecee6);
		 * chessBoard[5][5].setPiece(emptyPiecef6);
		 * chessBoard[5][6].setPiece(emptyPieceg6);
		 * chessBoard[5][7].setPiece(emptyPieceh6);
		 */
	}

	protected Square getKing(String kingColor) {
		Square kingPosition = null;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if ((chessBoard[i][j].getPiece() != null)) {

					if ((chessBoard[i][j].getPiece().equals(whiteKing) || chessBoard[i][j].getPiece().equals(blackKing))
							&& chessBoard[i][j].getPiece().getColor().equals(kingColor)) {
						kingPosition = chessBoard[i][j];
					}
				}
			}
		}
		return kingPosition;
	}

	protected boolean oppositeColor(Piece piece1, Piece piece2) {
		boolean result = true;
		if (!(piece1 == null || piece2 == null)) {
			if (piece1.getColor() == piece2.getColor()) {
				result = false;
			}
		}
		return result;
	}

	protected boolean kingInCheck(String color, ChessBoard board) {
		boolean result = false;
		Square targetSquare = getKing(color);
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (chessBoard[i][j].getPiece() != null) {
					if (chessBoard[i][j].getPiece().canCapture(targetSquare) == true) {
						result = true;
					}
				}
			}
		}
		return result;
	}

	public String currentPlayer(int counter) {
		String currentPlayer = "";
		if (counter % 2 == 1) {
			currentPlayer = "white";
		}
		if (counter % 2 == 0) {
			currentPlayer = "black";
		}
		return currentPlayer;
	}

	protected boolean evaluateCheckmate(String color, ChessBoard board) {
		boolean result = false;
		if (kingInCheck(color, board) == true) {
			result = true;
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if (chessBoard[i][j].getPiece().getColor().equals(color)) {
						for (int a = 0; a < 8; a++) {
							for (int b = 0; b < 8; b++) {

								if (chessBoard[i][j].getPiece().canMove(chessBoard[a][b]) == true) {
									ChessBoard temp = new ChessBoard();
									Piece tempPiece = chessBoard[i][j].getPiece();
									Square tempPosition = chessBoard[i][j];
									tempPiece.move(temp.getChessBoardArray()[a][b]);
									temp.getChessBoardArray()[tempPosition.getRowValue()][tempPosition.getColumnValue()]
											.setPiece(null);
									if (kingInCheck(color, temp) == false)
										result = false;
								}
							}
						}
					}
				}
			}
		}
		if (result == true) {
			System.out.println("Checkmate!");
		}
		return result;
	}
}
