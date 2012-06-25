package Basico;

import java.util.Scanner;

public class EntradaSalida {

	public static void main(String a[]){
		/**
		 * Metodo para mostrar informacion por consola, se le pasa como parametro
		 * "Inrgrese su nombre: "
		 */
		System.out.print("Ingrese su nombre: ");
		/**
		 * Se crea un objeto Scanner que permite leer el ingreso por teclado,
		 */
		Scanner leer = new Scanner(System.in);
		/**
		 * Se crea un objeto String (Estos se crean de forma implicita, sin el new)
		 */
		String nombre;					
		/**
		 * En esta linea se utliza un metodo del objeto Scanner (.nextLine())
		 * que lee todo hasta que sea presionada la tecla Enter
		 */
		nombre = leer.nextLine();
		/**
		 * Metodo para mostrar informacion por consola, ademas se le pasa como
		 * parametro el nombre que ingresamos
		 */
		System.out.println("Hola "+nombre);		
	}
}
