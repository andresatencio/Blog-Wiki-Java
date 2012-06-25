package Basico;

import java.util.Scanner;

public class Suma {
	public static void main(String arg[]){
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese el 1° numero: ");
		/**
		 * aca es donde cambia con respecto al ejemplo anterior
		 * ahora utilizamos el metodo .nextInt del objeto Scanner
		 * esto permite leer numeros enteros.
		 */
		int numero1 = leer.nextInt();
		System.out.println("");	//esto es un simple salto de linea
		System.out.print("Ingrese el 2° numero: ");
		/**
		 * aca es donde cambia con respecto al ejemplo anterior
		 * ahora utilizamos el metodo .nextInt del objeto Scanner
		 * esto permite leer numeros enteros.
		 */
		int numero2 = leer.nextInt();
		int resultado = numero1 + numero2;//aca se realiza la suma de los numeros
		System.out.println("");	//esto es un simple salto de linea
		System.out.println("La suma: "+numero1+" + "+numero2+" es: "+resultado);
	}
}
