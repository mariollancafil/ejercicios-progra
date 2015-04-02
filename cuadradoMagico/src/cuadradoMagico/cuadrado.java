package cuadradoMagico;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class cuadrado extends JFrame implements ActionListener{

	JTextField c1;
	JPanel p1;
	JButton validacion,limpiar, cerrar;
	
	public cuadrado(){
		
		p1=new JPanel();
		p1.setLayout(new GridLayout(3, 3));
		
		
		for(int i=0;i<9;i++){
			c1=new JTextField();
			p1.add(c1);
		}
		
		add(p1, BorderLayout.CENTER);
		
		
		JPanel p11=new JPanel();
        p11.setLayout(new GridLayout(2,1));
        validacion=new JButton("Validacion");
        p11.add(validacion,BorderLayout.EAST);
        add(p11,BorderLayout.EAST);
        validacion.addActionListener(this);
		
		limpiar=new JButton("Limpiar");
		p11.add(limpiar,BorderLayout.EAST);
		add(p11, BorderLayout.EAST);
		limpiar.addActionListener(this);
		
		cerrar=new JButton("Cerrar");
		p11.add(cerrar,BorderLayout.EAST);
		add(p11, BorderLayout.EAST);
		cerrar.addActionListener(this);
			
	}
	
	public void operacion(){
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==cerrar){
			
			System.exit(0);
			
		}
		
		
		if(e.getSource()==limpiar){
			
			
				
			
		}
			
		
		
		try{
			if(e.getSource()==validacion){
				
				}
			}catch(Exception exception){
				JOptionPane.showMessageDialog(null, "No valido, solo números");
			}
		
	}
}
