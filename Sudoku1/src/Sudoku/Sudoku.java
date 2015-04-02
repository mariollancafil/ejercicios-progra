package Sudoku;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
 
public class Sudoku extends JFrame implements ActionListener{
  Dimension FIELD_SIZE = new Dimension(40, 40);
  int BORDER_WIDTH = 3;
  float FONT_POINTS = 30;
  private JPanel panel = new JPanel();
  private JPanel[][] cuadros = new JPanel[3][3];
  private JTextField[][] cuadroP = new JTextField[9][9];
  private JButton cerrar,limpiar,validar;
   
 
  public Sudoku()
  {
    panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, BORDER_WIDTH));
    panel.setLayout(new GridLayout(3, 3));
   
    for (int i = 0; i < cuadros.length; i++)
    {
      for (int j = 0; j < cuadros[i].length; j++)
      {
        cuadros[i][j] = new JPanel(new GridLayout(3, 3));
        cuadros[i][j].setBorder(
          BorderFactory.createLineBorder(Color.BLACK, BORDER_WIDTH));
        panel.add(cuadros[i][j]);
      }
    }
    for (int i = 0; i < cuadroP.length; i++){
      for (int j = 0; j < cuadroP[i].length; j++){
    	  
        cuadroP[i][j] = new JTextField();
        cuadroP[i][j].setPreferredSize(FIELD_SIZE);
        Font font = cuadroP[i][j].getFont().deriveFont(Font.BOLD, FONT_POINTS);
        cuadroP[i][j].setFont(font);
        cuadroP[i][j].setHorizontalAlignment(SwingConstants.CENTER);
        cuadros[i/3][j/3].add(cuadroP[i][j]);
        
      }
    }
    
    JPanel panel1=new JPanel();
    panel1.setLayout(new GridLayout(3,1));
    validar=new JButton("Validacion");
    panel1.add(validar,BorderLayout.EAST);
    add(panel1,BorderLayout.EAST);
    validar.addActionListener(this);
	
	limpiar=new JButton("Limpiar");
	panel1.add(limpiar,BorderLayout.EAST);
	add(panel1, BorderLayout.EAST);
	limpiar.addActionListener(this);
	
	cerrar=new JButton("Cerrar");
	panel1.add(cerrar,BorderLayout.EAST);
	add(panel1, BorderLayout.EAST);
	cerrar.addActionListener(this);
  }
 
  public JComponent getPanel()
  {
    return panel;
  }

public void actionPerformed(ActionEvent e) {
	
	if(e.getSource()==cerrar){
		System.exit(0);
	}
	if(e.getSource()==limpiar){
		
		cuadroP[9][9].getText();
		 
	}
	}
}

	

	