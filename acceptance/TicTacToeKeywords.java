import edu.jsu.mcis.*;

public class TicTacToeKeywords {
	
	private TicTacToe ttt;
	
	public void startNewGame() {
		ttt = new TicTacToe();
	}
	
	public void markLocation(int row, int col) {
		ttt.markBoard(row, col);
	}
	
	public String getMark(int row, int col) {
		return ttt.checkSpot(row, col);
	}
    
	public String getWinner() {
		return ttt.declareWin();
	}
}
