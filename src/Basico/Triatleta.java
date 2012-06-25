package Basico;

import javax.swing.JOptionPane;

public class Triatleta {

	/**
	 * lo mas recomendable es hacer los atributos privados
	 * y tener el control de cuales son las formas de poder accederlos
	 * para ello se emplea el modificador de acceso private y metodos
	 * getter y setters
	 * Ahora lo haremos de la forma mas sencilla
	 */
	public String nombre;
	public int numero;
	public int edad;
	
	Triatleta(String nombre, int numero, int edad){
		this.nombre = nombre;
		this.numero = numero;
		this.edad = edad;
	}
	/**
	 * metodo que permite al triatleta realizar 
	 * las tres disciplinas
	 */
	public void nada(){
		JOptionPane.showMessageDialog(null,"El trialeta esta nadando");
	}
	public void pedalea(){
		JOptionPane.showMessageDialog(null,"El trialeta esta pedaleando");
	}
	public void corre(){
		JOptionPane.showMessageDialog(null,"El trialeta esta corriendo");
	}
	
	public static void main(String g[]){
		/**
		 * Se crea la variable macca del tipo de referencia Triatleta
		 * o de otro modo, se crea una instancia de la clase Triatleta.
		 * Sintaxis:
		 * 
		 * tipoDeReferencia nombreVariable = new tipoDeReferencia(parametros*);
		 * o dicho de otro modo:
		 * clase nombreVariable = new clase(parametros*)
		 * 
		 * 		*en el caso de ser necesario
		 */
		Triatleta macca = new Triatleta("Chris McCormack",35,1);
		/**
		 * Se utiliza la variable macca para poder acceder al atributo nombre
		 */
		JOptionPane.showMessageDialog(null, "El nombre del triatleta es: "+macca.nombre);
		/**
		 * Se utiliza la variable macca para acceder a sus metodos
		 */
		macca.nada();
		macca.pedalea();
		macca.corre();
		
	}
}
