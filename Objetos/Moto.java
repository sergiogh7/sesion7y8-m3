package Objetos;

import Super.Vehiculo;

public class Moto extends Vehiculo {
	
//	Atributos
	private Rueda delantera;
	private Rueda trasera;
	
//	Constructor
	public Moto () {
		super();
		this.delantera = creaRueda();
		this.trasera = creaRueda();
	}
	
//	Metodo toString
	public String toString() {
		return "Delantera: " + delantera + "\nTrasera: " + trasera + "\nMatricula: " + matricula + "\nMarca: " + marca
				+ "\nColor: " + color + "]";
	}

//	Getters y Setters
	public Rueda getDelantera() {
		return delantera;
	}
	public void setDelantera(Rueda delantera) {
		this.delantera = delantera;
	}
	public Rueda getTrasera() {
		return trasera;
	}
	public void setTrasera(Rueda trasera) {
		this.trasera = trasera;
	}
}