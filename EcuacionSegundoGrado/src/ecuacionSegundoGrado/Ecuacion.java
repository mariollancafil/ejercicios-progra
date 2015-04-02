package ecuacionSegundoGrado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ecuacion extends JFrame implements ActionListener {

	JTextField ingresarA,ingresarB,ingresarC,resultX1,resultX2;
	JLabel num1,num2,num3,x1,x2;
	JButton soluciones,limpiar;
	
	public Ecuacion(){
	
		setLayout(null);
		num1=new JLabel("a");
		num1.setBounds(60, 40, 100, 30);
		add(num1);
		ingresarA=new JTextField();
		ingresarA.setBounds(160, 40, 100, 30);
		add(ingresarA);
		num2=new JLabel("b");
		num2.setBounds(60, 90, 100, 30);
		add(num2);
		ingresarB=new JTextField();
		ingresarB.setBounds(160, 90, 100, 30);
		add(ingresarB);
		num3=new JLabel("c");
		num3.setBounds(60, 140, 100, 30);
		add(num3);
		ingresarC=new JTextField();
		ingresarC.setBounds(160, 140, 100, 30);
		add(ingresarC);
		x1=new JLabel("x1");
		x1.setBounds(40, 240, 100, 30);
		add(x1);
		resultX1=new JTextField();
		resultX1.setBounds(70, 240, 70, 30);
		add(resultX1);
		x2=new JLabel("x2");
		x2.setBounds(180, 240, 100, 30);
		add(x2);
		resultX2=new JTextField();
		resultX2.setBounds(210, 240, 70, 30);
		add(resultX2);
		soluciones=new JButton("Soluciones");
		soluciones.setBounds(40, 190, 100, 30);
		add(soluciones);
		soluciones.addActionListener(this);
		limpiar=new JButton("Limpiar");
		limpiar.setBounds(200, 190, 100, 30);
		add(limpiar);
		limpiar.addActionListener(this);
		
	}
	
	void operacion(int b, int a, int c){
	
		double d=(b*b)-(4*a*c);
		if(d>=0){
			if(a==0){
				JOptionPane.showMessageDialog(null, "Division por 0");
			}else{
				double x1=Math.rint(((-b+Math.sqrt(d))/(2*a))*100)/100;
				double x2=Math.rint(((-b-Math.sqrt(d))/(2*a))*100)/100;
				resultX1.setText(String.valueOf(x1));
				resultX2.setText(String.valueOf(x2));
				}
			}else{
				JOptionPane.showMessageDialog(null, "La ecuacion es imaginaria");
				}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		try{
		if(e.getSource()==soluciones){
		
			
			String cad1=ingresarA.getText();
			String cad2=ingresarB.getText();
			String cad3=ingresarC.getText();
			int a=Integer.parseInt(cad1);
			int b=Integer.parseInt(cad2);
			int c=Integer.parseInt(cad3);
			
			operacion(b, a, c);
			
			}
		}catch(Exception exception){
			JOptionPane.showMessageDialog(null, "No valido, solo números");
		}
		
		if(e.getSource()==limpiar){
			ingresarA.setText(null);
			ingresarB.setText(null);
			ingresarC.setText(null);
			resultX1.setText(null);
			resultX2.setText(null);
		}
		}
}
