package edu.jsu.mcis;

public class TicTacToe {
	
	private String [][] board;
	private boolean isXTurn;
	private boolean xIsWinner;
	private int turnNumber;
	
	public TicTacToe(){
		board = new String[3][3];
		isXTurn = false;
		xIsWinner = false;
		turnNumber = 0;
	}
	
	public void createBoard(){
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				board[i][j] = " ";
	}
	
	public void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++){
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

	
	public void markBoard(int row, int column){
		if(checkForValidSpot(row, column)){
			isXTurn = !isXTurn;
			turnNumber++;
			checkForWin(row, column);
			if(isXTurn)
				board[row][column] = "X";
			else
				board[row][column] = "O";
		}
	}
	
	public boolean checkForValidSpot(int row, int column){
		if(board[row][column] == "X" || board[row][column] == "O")
			return false;
		else
			return true;
	}
	
	public String checkSpot(int row, int column){
		if(board[row][column] == "X")
			return "X";
		else if(board[row][column] == "O")
			return "O";
		else
			return "EMPTY";
	}
	
	public boolean isBoardEmpty(){
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				if(board[i][j] != " ")
					return false;
		return true;
	}
	
	public boolean isGameOver(){
		return !(turnNumber < 9);
	}
	
	public boolean isGameOver(int row, int column){
		if(turnNumber < 9)
			return checkForWin(row, column);
		else
			return true;
	}
	
	public boolean checkForWin(int row, int column){
		boolean horizontalWin = true; boolean verticalWin = true; boolean diagonalWin = true; boolean diagonalWin1 = true;
		String player;
		if(isXTurn)
			player = "X";
		else
			player = "O";
		
		for(int i = 0; i < 3; i++){
			if(board[row][i] != player)
				horizontalWin = false;
			if(board[i][column] != player)
				verticalWin = false;
		}
		
		if(board[0][0] != player && board[1][1] != player && board[2][2] != player)
			diagonalWin = false;
		if(board[0][2] != player && board[1][1] != player && board[2][0] != player)
			diagonalWin1 = false;
		
		if((horizontalWin || verticalWin || diagonalWin || diagonalWin1) && player == "X")
			xIsWinner = true;
		else
			xIsWinner = false;
		
		return (horizontalWin || verticalWin || diagonalWin || diagonalWin1);
	}
	
	public String declareWin(){
		if(isGameOver())
			return "TIE";
		else if(xIsWinner)
			return "X";
		else
			return "O";
	}
	
	
}

public class TicTacToe {
	
	private String [][] board;
	private boolean isXTurn;
	private boolean xIsWinner;
	private int turnNumber;
	
	public TicTacToe(){
		board = new String[3][3];
		isXTurn = false;
		xIsWinner = false;
		turnNumber = 0;
	}
	
	public void createBoard(){
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				board[i][j] = " ";
	}
	
	public void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++){
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

	
	public void markBoard(int row, int column){
		if(checkForValidSpot(row, column)){
			isXTurn = !isXTurn;
			turnNumber++;
			checkForWin(row, column);
			if(isXTurn)
				board[row][column] = "X";
			else
				board[row][column] = "O";
		}
	}
	
	public boolean checkForValidSpot(int row, int column){
		if(board[row][column] == "X" || board[row][column] == "O")
			return false;
		else
			return true;
	}
	
	public String checkSpot(int row, int column){
		if(board[row][column] == "X")
			return "X";
		else if(board[row][column] == "O")
			return "O";
		else
			return "EMPTY";
	}
	
	public boolean isBoardEmpty(){
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				if(board[i][j] != " ")
					return false;
		return true;
	}
	
	public boolean isGameOver(){
		return !(turnNumber < 9);
	}
	
	public boolean isGameOver(int row, int column){
		if(turnNumber < 9)
			return checkForWin(row, column);
		else
			return true;
	}
	
	public boolean checkForWin(int row, int column){
		boolean horizontalWin = true; boolean verticalWin = true; boolean diagonalWin = true; boolean diagonalWin1 = true;
		String player;
		if(isXTurn)
			player = "X";
		else
			player = "O";
		
		for(int i = 0; i < 3; i++){
			if(board[row][i] != player)
				horizontalWin = false;
			if(board[i][column] != player)
				verticalWin = false;
		}
		
		if(board[0][0] != player && board[1][1] != player && board[2][2] != player)
			diagonalWin = false;
		if(board[0][2] != player && board[1][1] != player && board[2][0] != player)
			diagonalWin1 = false;
		
		if((horizontalWin || verticalWin || diagonalWin || diagonalWin1) && player == "X")
			xIsWinner = true;
		else
			xIsWinner = false;
		
		return (horizontalWin || verticalWin || diagonalWin || diagonalWin1);
	}
	
	public String declareWin(){
		if(isGameOver())
			return "TIE";
		else if(xIsWinner)
			return "X";
		else
			return "O";
	}
	
	
}