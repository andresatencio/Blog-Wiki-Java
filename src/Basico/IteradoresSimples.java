package Basico;

import javax.swing.JOptionPane;

public class IteradoresSimples {

	public static void main(String a[]){
		/**
		 * Esta estrutura nos permite iterar por una cantidad de veces conocidas
		 * en este caso serian 3
		 */
		for(int i = 1; i <= 3; i++){
			JOptionPane.showMessageDialog(null, "Ventana n°: "+i);
		}
		
		/**
		 * Esta estructura nos permite iterar n veces dependiendo que se cumpla o
		 * no, determinada condicion.
		 */
		int c = 1;
		while(c != 0){
			String entrada = JOptionPane.showInputDialog(null, "Ingresa algo... (*)Para salir presione cero:");
			//tener en cuenta que no se captura la excepcion en el caso que el String no se pueda convertir
			c = Integer.parseInt(entrada);
		}
	}
}
