package Basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColeccionArrayList {
	
	public static void main(String arg[]){
		//variables
		int num = 1;
		int suma = 0;
		boolean bandera = true;
		//objeto que nos permite leer el ingreso por teclado
		Scanner leer = new Scanner(System.in);
		//Un objeto list
		List<Integer> numeros = new ArrayList<Integer>();
		
		System.out.println("Ingrese numeros a sumar.");
		System.out.println("Para finalizar la suma presione 0");
		
		while(num != 0){
			System.out.print("Escriba el numero: ");
			num = leer.nextInt();
			suma += num;
			numeros.add(num);
		}
		System.out.println("Los numero ingresados fueron: ");
		for(Integer numero: numeros){
			System.out.println(numero);
		}
		System.out.println("La suma total es: "+suma);
	}
}
