package Basico;

import javax.swing.JOptionPane;

public class Constructor {
	
	/**
	 * propiedades de la clase Constructores
	 */
	private String nombre;
	private int edad;
	/**
	 * Constructor con dos parametros que setean
	 * las dos propiedades
	 */
	public Constructor(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	/**
	 * Constructor con un parametro que setea 
	 * el nombre y la edad la asigna automaticamente
	 * con 18
	 */
	public Constructor(String nombre){
		this.nombre = nombre;
		this.edad = 18;
	}
	/**
	 * Constructor con un parametro que setea
	 * la edad y el nombre lo asigna automaticamente
	 * con "juan perez"
	 */
	public Constructor(int edad){
		this.edad = edad;
		this.nombre = "Juan Perez";
	}
	/**
	 * Constructor que no admite parametros 
	 * y que deja las propiedades iniciadas 
	 * por defalut
	 */
	public Constructor(){
		
	}
	public String toString(){
		return this.nombre+ " " +this.edad;
		
	}
	
	
	public static void main(String a[]){
		/**
		 * Se crean 4 objetos constructor
		 * con distintas formas de iniciar 
		 * sus propiedades
		 */
		Constructor cons1 = new Constructor("Carlos Gomez",56);
		Constructor cons2 = new Constructor("Alistair Brownlee");
		Constructor cons3 = new Constructor(26);
		Constructor cons4 = new Constructor();
		/**
		 * Se muestran los 4 objetos Constructor
		 * y se ven las diferentes propiedades que 
		 * fueron tomando al instanciarse su clase
		 */
		JOptionPane.showMessageDialog(null, cons1.toString());
		JOptionPane.showMessageDialog(null, cons2.toString());
		JOptionPane.showMessageDialog(null, cons3.toString());
		//este ultimo mostrara null y 0
		JOptionPane.showMessageDialog(null, cons4.toString());
	}

}
