package Basico;

public class Array {

	

	public static void main(String a[])
	{
		/**
		 * Formas de declaracion e inicializacion de un arreglo que va a contener 
		 * tipos de datos basicos "int" 
		 */
		int arregloEntero [] = new int [3];
		float [] arregloConComa  = new float[50];
		
		/**
		 * Formas de declaracion e inicializacion de un arreglo que va a contener
		 * 3 referencias de tipo de datos "Personas" en este caso.
		 */
		Persona  grupoPersonas [] = new  Persona [3];
		Triatleta [] peloton  = new  Triatleta [3];
		
		/**
		 * Agregar un numero entero al arreglo
		 */
		arregloEntero[0] = 15;
		arregloEntero[1] = 1;
		arregloEntero[2] = 545;
		
		/**
		 * Agregar Persona al grupoPersonas
		 */
		grupoPersonas [0] = new  Persona("Claudio","ja",12);
		grupoPersonas [1] = new  Persona("Maria","ja",25);
		grupoPersonas [2] = new  Persona("Dominguez","ja",19);
		
		/**
		 * Esto genera un error
		 */
		try{
		arregloEntero[3] = 545;										//fuera de rango
		grupoPersonas [20] = new  Persona("Dominguez","ja",16);		//fuera de rango
		}catch(Exception e){
			System.err.println("ERROR POR INDICE FUERA DE RANGO");
		}
		
		
		/**
		 * Mostrar el arreglo a traves del "foreach" de java
		 */
		for(int numero: arregloEntero){
			System.out.println("ARREGLO ENTERO: "+numero);
		}
		for(Persona per: grupoPersonas){
			System.out.println("ARREGLO PERSONA: "+per);
		}
	}
	
}
