package Basico;

import javax.swing.JOptionPane;

public class CondicionalIf {

	public static void main(String o[]){
		//se delaran variables
		String entrada = null;
		int n1, n2;
		
		/**
		 * cabe aclarar que en el ingreso de datos, en el caso de introducir una cadena
		 * de caracteres, esta accion generara una excepcion que no estamos capturando 
		 * lo que generaria el cierre automatico de la aplicacion ejemplo
		 */
		
		//primer cuadro de dialogo para el ingreso de un numero
		entrada = JOptionPane.showInputDialog(null, "Inregasar n° 1:");
		
		//se hace la conversion de un String a un int
		n1 = Integer.parseInt(entrada);
		
		//segundo cuadro de dialogo para el ingreso de un numero
		entrada = JOptionPane.showInputDialog(null, "Ingresar n°2:");
		
		//se hace la conversion de un String a un int
		n2 = Integer.parseInt(entrada);
		
		
		
		/**
		 * ejemplo de utilizacion del operador condicional "if"
		 */
		if( n1 > n2 ){
			JOptionPane.showMessageDialog(null,"el n° 1: "+n1+" es mayor al n°2: "+n2);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"el n° 2: "+n2+" es mayor al n°1: "+n1);
		}
	}
}
