package ecuacion;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import java.io.*;

@WebServlet("/Ecuacion")
public class Ecuacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Ecuacion() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String c = request.getParameter("c");
		try{
		int n1=Integer.parseInt(request.getParameter("a"));
		int n2=Integer.parseInt(request.getParameter("b"));
		int n3=Integer.parseInt(request.getParameter("c"));
		double x1=0;
		double x2=0;
		
		double d = (n2*n2)-(4*n1*n3);
		out.println(d);
		if(d>=0){
			if(n1==0){
				out.println("Division por 0");
			}else{
				x1=Math.rint(((-n2+Math.sqrt(d))/(2*n1))*100)/100;
				x2=Math.rint(((-n2-Math.sqrt(d))/(2*n1))*100)/100;
				out.println(" Las soluciones de la ecuacion son: x1 = " + x1 + " y  x2 = " + x2);
				}
			}else{
				out.println("La ecuacion es imaginaria");
				}
		}catch(Exception exception){
			out.println("Los datos solo tienen que ser numeros");
		}
	}

}
