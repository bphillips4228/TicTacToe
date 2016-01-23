package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest {
	
	private TicTacToe ttt;
	
	@Before
	public void setup(){
		ttt = new TicTacToe();
		ttt.createBoard();
	}
	
	@Test
	public void testInitialBoardIsEmpty() {
		assertTrue(ttt.isBoardEmpty());
	}
	
	@Test
	public void testMarkXInUpperRightCorner() {
		ttt.markBoard(0,2);
		assertTrue(ttt.checkSpot(0,2) == "X");
	}
	
	@Test
	public void testMarkOInBottomLeftCorner() {
		ttt.markBoard(0,0);
		ttt.markBoard(2,0);
		assertTrue(ttt.checkSpot(2,0) == "O");
	}
	
	@Test
	public void testUnableToMarkOverExistingMark() {
		ttt.markBoard(0,0);
		ttt.markBoard(0,0);
		assertTrue(ttt.checkSpot(0,0) == "X");
	}
	
	@Test
	public void testGameIsNotOverAfterTheFirstMark() {
		ttt.markBoard(0,0);
		assertFalse(ttt.isGameOver());
	}
	
	@Test
	public void testGameIsWonByXHorizontallyAcrossTopRow() {
		ttt.markBoard(0,0);
		ttt.markBoard(1,0);
		ttt.markBoard(0,1);
		ttt.markBoard(1,1);
		ttt.markBoard(0,2);
		assertTrue(ttt.checkForWin(0,2));
	}
	
	@Test
	public void testGameIsOverByTieIfAllLocationsAreFilled() {
		ttt.markBoard(0,0);
		ttt.markBoard(1,1);
		ttt.markBoard(2,2);
		ttt.markBoard(2,0);
		ttt.markBoard(0,2);
		ttt.markBoard(0,1);
		ttt.markBoard(1,0);
		ttt.markBoard(1,2);
		ttt.markBoard(2,1);
		assertTrue(ttt.isGameOver(2,1));
	}	
}
