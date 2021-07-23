package Objetos;

import java.util.Arrays;

import Super.Vehiculo;

public class Coche extends Vehiculo{
	
//	Atributos
	private Rueda[] delanteras = new Rueda[2];
	private Rueda[] traseras = new Rueda[2];

//	Constructor
	public Coche () {
		this.delanteras[0] = creaRueda();
		this.delanteras[1] = delanteras[0]; // Asigno el anterior para no llamar al metodo.
		this.traseras[0] = creaRueda();
		this.traseras[1] = traseras[0]; // Asigno el anterior para no llamar al metodo.
	}

//	Metodo to String
	public String toString() {
		return "Delantera: " + Arrays.toString(delanteras) + "\nTrasera: " + Arrays.toString(traseras) + "\nMatricula: "
				+ matricula + "\nMarca: " + marca + "\nColor: " + color + "]";
	}
	
	// Getters setters
	public Rueda[] getDelantera() {
		return delanteras;
	}
	public void setDelantera(Rueda[] delantera) {
		this.delanteras = delantera;
	}
	public Rueda[] getTrasera() {
		return traseras;
	}
	public void setTrasera(Rueda[] trasera) {
		this.traseras = trasera;
	}
}