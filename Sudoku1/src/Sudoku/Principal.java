package Sudoku;

import javax.swing.JFrame;

public class Principal {
	
	public static void main(String []args){
		
		Sudoku sudoku = new Sudoku();
		sudoku.setTitle("Sudoku");
	    sudoku.setDefaultCloseOperation(sudoku.EXIT_ON_CLOSE);
	    sudoku.getContentPane().add(new Sudoku().getPanel());
	    sudoku.pack();
	    sudoku.setLocationRelativeTo(null);
	    sudoku.setVisible(true);
	}

}
