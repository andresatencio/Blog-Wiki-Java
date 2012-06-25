package Basico;

public class Metodos {

	/**
	 * la sintaxis de un metodo es:
	 * tipoDeAcceso tipoDeDatoDeRetorno nombreDelMetodo(tipoParametro param){
	 * cuerpo del metodo
	 * return dato(*)
	 * }
	 * 
	 * el return no es necesesario en el caso que el tipo de retorno sea void (vacio)
	 */
	
	public void mostrarSaludo(){
		System.out.println("Hola que tal?");
	}
	public void mostrarSaludo(String msj){
		System.out.println("Hola: "+msj);
	}
	public int suma(){
		return 1 + 2;
	}
	public int suma(int n1, int n2){
		int resultado = n1 + n2;
		return resultado;
	}
	
}
