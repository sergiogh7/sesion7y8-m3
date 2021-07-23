package Objetos;

import java.util.Arrays;

import Super.Vehiculo;

public class Camion extends Vehiculo {

//	Atributos
	private Rueda[] delantera = new Rueda[4];
	private Rueda[] trasera = new Rueda[8];
	
//	Constructor
	public Camion () {
		super();
		this.delantera[0] = creaRueda();
		this.delantera[1] = delantera[0];
		this.delantera[2] = delantera[0];
		this.delantera[3] = delantera[0];
		this.trasera[0] = creaRueda();
		this.trasera[1] = trasera[0];
		this.trasera[2] = trasera[0];
		this.trasera[3] = trasera[0];
		this.trasera[4] = trasera[0];
		this.trasera[5] = trasera[0];
		this.trasera[6] = trasera[0];
		this.trasera[7] = trasera[0];
	}
	
//	Metodo toString
	public String toString() {
		return "Delantera: " + Arrays.toString(delantera) + "\nTrasera: " + Arrays.toString(trasera)
				+ "\nMatricula: " + matricula + "\nMarca: " + marca + "\nColor: " + color;
	}

	// Getters setters
	public Rueda[] getDelantera() {
		return delantera;
	}
	public void setDelantera(Rueda[] delantera) {
		this.delantera = delantera;
	}
	public Rueda[] getTrasera() {
		return trasera;
	}
	public void setTrasera(Rueda[] trasera) {
		this.trasera = trasera;
	}
}