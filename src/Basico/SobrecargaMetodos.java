package Basico;

import javax.swing.JOptionPane;

public class SobrecargaMetodos {

		
	/**
	 * este constructor el objeto, como lo haria la JVM
	 * (Java Virtual Machine), o sea por defecto. 
	 * En este caso seria lo mismo escribirlo o no
	 */
	public SobrecargaMetodos(){
		//nada
	}
	
	
	/**
	 * Metodos sobrecargados parametricamente
	 */
	void sumar(){
		JOptionPane.showMessageDialog(null, "No hay nada que sumar chabon!");	
	}
	void sumar (int a, int b){
		JOptionPane.showMessageDialog(null, "La suma es: "+ (a+b) );
	}
	int sumar(int a, int b, int c){
		return a + b + c;
	}
	
	//main
	public static void main(String arg[]){
		SobrecargaMetodos obj = new SobrecargaMetodos();
		/**
		 * invocando el mismo metodo del objeto 
		 * obj se ejecutan tareas distintas
		 */
		obj.sumar();
		obj.sumar(5, -9);
		int suma = obj.sumar(5, 5, -10);
		JOptionPane.showMessageDialog(null, suma);
	}
}
