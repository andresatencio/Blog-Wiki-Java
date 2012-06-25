package Basico;

import javax.swing.JOptionPane;

public class ClaseString {
	
	public static void main(String a[]){
		
		String mensaje = null;							//aqui se puede ver como se instancia, sin usar new
		String mensaje1 = new String();					//con el operador new, sin parametros
		String mensaje2 = new String("hola mensaje 2");	//con el operador new, con parametros
		String mensaje3 = "Hola mensaje 3";				//aqui se puede ver como se instancia, sin usar new
		
		/**
		 * Se muestran las cadenas de caracteres creadas
		 * evidentemente las dos primeras no muestran nada
		 */
		JOptionPane.showMessageDialog(null, mensaje);
		JOptionPane.showMessageDialog(null, mensaje1);
		JOptionPane.showMessageDialog(null, mensaje2);
		JOptionPane.showMessageDialog(null, mensaje3);
	}
}
