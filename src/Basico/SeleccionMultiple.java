package Basico;

import javax.swing.JOptionPane;

public class SeleccionMultiple {

	public static void main(String cualquierCosa[]){
		//ingreso de dato
		String entra = JOptionPane.showInputDialog(null, "Ingresa un numero de un digito: ");
		// se convierte el dato a un int
		int numero = Integer.parseInt(entra);
		/**
		 * El operador switch permite la comparacion multiple
		 */
		switch (numero){
			case 1:
				JOptionPane.showMessageDialog(null, "Ingreso numero IMPAR");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Ingreso numero PAR");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Ingreso numero IMPAR");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Ingreso numero PAR");
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Ingreso numero IMPAR");
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "Ingreso numero PAR");
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "Ingreso numero IMPAR");
				break;
			case 8:
				JOptionPane.showMessageDialog(null, "Ingreso numero PAR");
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Ingreso numero IMPAR");
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Dato incorrecto");
			}
	}
}
