package Basico;

import javax.swing.JOptionPane;

public class ConversionDeDatos {
	public static void main(String ar[]){
		
		int nEntero = 10;
		String cadena = "Caracteres";
		double nDecimal = 10.255;
		
		/*
		 * Esto genera un error porque no se puede transformar
		 * "Caracteres" en un numero, por eso se ejecuta dentro de
		 * un bloque try{} catch{}
		 */
		try{
			int numero = Integer.parseInt(cadena);
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "ERROR AL CONVERTIR: "+cadena+" EN UN NUMERO");
		}
		
		/*
		 * Convertir una cadena de caracteres "String" en un entero "int"
		 */
		String num = "100";
		int numero = Integer.parseInt(num);
		JOptionPane.showMessageDialog(null, "Se convirtio correctamente: "+numero);
		
		/*
		 * Convertir int/double a String
		 */
		double dou = 25.23;
		int numer = 300;
		String cad1 = String.valueOf(numer);
		String cad2 = String.valueOf(dou);
		JOptionPane.showMessageDialog(null, "Se convirtio correctamente: "+cad1+" ,"+cad2);
		
		/*
		 * Convertir String a double
		 */
		String nume = "100.36";
		double n = Double.parseDouble(nume);
		JOptionPane.showMessageDialog(null, "Se convirtio correctamente: "+n);
		
		/*
		 * Convertir int a double
		 */
		int n1 = 123;
		String cade = String.valueOf(n1);
		double n2 = Double.parseDouble(cade);
		JOptionPane.showMessageDialog(null, "Se convirtio correctamente: "+n2);
		
		JOptionPane.showMessageDialog(null, "Ya veremos cosas mas copadas");
	}
}
