package edu.jsu.mcis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TicTacToeGame extends JPanel implements ActionListener{
	
	private TicTacToe model;
	private JButton[][] button;

	public TicTacToeGame(){
		model = new TicTacToe();
		button = new JButton[3][3];
		setLayout(new GridLayout(3,3));
		for(int i = 0;i < button.length;i++){
			for(int j = 0;j < button.length;j++){
				button[i][j] = new JButton();
				button[i][j].setPreferredSize(new Dimension(100,100));
				button[i][j].addActionListener(this);
				button[i][j].setName("Location" + i + "" + j);
				add(button[i][j]);
			}
		}
		
	}
	
	public void checkForWin(){
		if(!model.isGameOver()){
			String message;
			if(model.declareWin() == "X")
				message = "X";
			else if(model.declareWin() == "O")
				message = "O";
			else if(model.declareWin() == "TIE")
				message = "TIE";
			else
				message = "";
			
			if(message.length() > 0){
				//MyDialog dialog = new MyDialog("The Winner is " + message);
				JOptionPane.showMessageDialog(null, "The Winner is " + message, "Game Over",JOptionPane.INFORMATION_MESSAGE);
				Thread t = new Thread();
				t.start();
			}
		}
	}
	
	public void actionPerformed(ActionEvent event){
		JButton button = (JButton)event.getSource();
		String location = button.getName().substring(8);
		int row = Integer.parseInt(location.substring(0,1));
		int column = Integer.parseInt(location.substring(1,2));
		model.markBoard(row,column);
		button.setText(model.checkSpot(row,column));
		checkForWin();
	}
	
	public static void main (String[] args){
		JFrame game = new JFrame("Tic Tac Toe");
		game.add(new TicTacToeGame());
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.pack();
		game.setVisible(true);
	}
}

