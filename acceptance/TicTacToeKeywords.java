import edu.jsu.mcis.*;

public class TicTacToeKeywords {
	
	private TicTacToeGame ttt;
	
	public void startNewGame() {
		ttt = new TicTacToeGame();
	}
	
	public void markLocation(int row, int col) {
		ttt.model.markBoard(row, col);
	}
	
	public String getMark(int row, int col) {
		return ttt.model.checkSpot(row, col);
	}
    
	public String getWinner() {
		return ttt.model.declareWin();
	}
}
