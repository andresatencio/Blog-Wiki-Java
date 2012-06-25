package Basico;

/**
 * la sintaxis de un metodo es:
 * tipoDeAcceso tipoDeDatoDeRetorno nombreDelMetodo(tipoParametro param){
 * cuerpo del metodo
 * return dato(*)
 * }
 * 
 * el return no es necesesario en el caso que el tipo de retorno sea void (vacio)
 * la palabra clave "return" hace referencia al valor que va a devolver al 
 * ejecutarse el metodo
 */
public class MetodoSinParametro {
	
	//este metodo muestra un mensaje por pantalla
	public void mostrarSaludo(){
		System.out.println("Hola que tal?");
	}
	
	//este metodo suma 1 + 2
	public int suma(){
		return 1 + 2;
	}
	
	public static void main(String a[]){
		/**
		 * Se hace una instacia de la clase "MetodoSinParametro"
		 * o como quieras llamarlo, ya que tambien se puede decir
		 * que se crea un objeto "MetodoSinParametro"
		 */
		MetodoSinParametro m = new MetodoSinParametro();
		/**
		 * Ahora que tenemos un objeto "MetodoSinParametro" llamado "m"
		 * lo que hacemos a continuacion es acceder a sus metodos
		 */
		//"m" ejecuta el metodo .mostrarSaludo()
		m.mostrarSaludo();
		//"m" ejecuta el metodo .suma() el cual devuelve o retorna la suma de dos numeros
		int resultadoSuma = m.suma();
		//se muestra por pantalla la suma de los numeros
		System.out.println("La suma es: "+resultadoSuma);
	}
}
