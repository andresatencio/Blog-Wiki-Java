package Basico;

/**
 * Se debe importar la clase JOptionPane
 * Tambien se puede importar todo el paquete,
 * pero no es lo mas recomendable, la forma seria la siguiente:
 * import javax.swing.*;
 */
import javax.swing.JOptionPane;

public class VentanaDialogo {
	
	
	public static void main(String a[]){
		/**
		 * Muestra un mensaje simple
		 */
		JOptionPane.showMessageDialog(null, "Aqui va el mensaje");
		/**
		 * Muestra un mensaje acompañado de una caja de texto
		 * en el cual se le pueden ingresar datos alfanumericos
		 * y los mismo los retorna como una cadena de texto alfanumerico
		 * (String)
		 */
		String mensaje = JOptionPane.showInputDialog("Escriba algo: ");
		/**
		 * Se ultiliza el mismo metodo del principio, pero 
		 * se le pasa el mensaje tomado en el cuadro de dialogo anterior
		 */
		 JOptionPane.showMessageDialog(null, mensaje);
	}
}
