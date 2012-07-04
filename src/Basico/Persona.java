package Basico;

public class Persona {

	/**
	 * Atributos que puede tener una persona
	 */
	String nombre;
	String apellido;
	int dni;
	/**
	 * Constructor que inicia los atributos
	 */
	public Persona(String nombre,String apellido,int dni){
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	/**
	 * Metodo que la persona tiene
	 * en este caso es sencillo. Solo puede presentarse.
	 */
	public void mePresento(){
		System.out.println("Mi nombre es: "+this.nombre);
		System.out.println("Mi apellido es: "+this.apellido);
		System.out.println("Mi dni es: "+this.dni);
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido
				+ ", dni=" + dni + "]";
	}
	/**
	 * Dentro del metodo main se Instancia el Objeto Persona
	 * Se le pasa los parametro requeridos por el constructor
	 * y a continuacion se utiliza el metodo .mePresento()
	 */
	public static void main(String a[]){
		Persona unaPersona = new Persona("Juan","Perez",123456);
		unaPersona.mePresento();
	}
}
