package Basico;

import java.util.Scanner;

public class MetodoConParametro {
	/**
	 * Este metodo toma como parametro una cadena de caracteres,
	 * en este caso el nombre que luego utiliza para saludar
	 */
	public void saludar(String nombre){
		System.out.println("Hola: "+nombre);
	}
	/**
	 * Este metodo suma dos numero que se le pasan como parametro
	 * y luego retorna o decuelve (como mas te guste) la suma de ambos
	 */
	public int suma(int n1,int n2){
		int suma = n1 + n2;
		return suma;
	}
	/**
	 * Este metodo toma una pregunta, la muestra en pantalla, obtiene
	 * la respuesta y la devuelve como una cadena de caracteres 
	 */
	public String responder(String pregunta){
		System.out.println(pregunta);
		Scanner leer = new Scanner(System.in);
		String respuesta = leer.nextLine();
		return respuesta;
	}
	
	public static void main(String a[]){
		//Se crea un objeto "MetodoConParametro"
		MetodoConParametro m = new MetodoConParametro();
		/**
		 * A partir de aqui se van utilizando los distintos 
		 * metodos que tiene el objeto "m" que pertenece a MetodoConParametro
		 */
		m.saludar("Chabonn!");
		int resultadoSuma = m.suma(256, 320);
		System.out.println("La suma es: "+resultadoSuma);
		String respuesta = m.responder("Cuantos años tenes? ");
		System.out.println(respuesta);
	}
}
