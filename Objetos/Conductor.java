package Objetos;

import javax.swing.JOptionPane;

import Super.Persona;

public class Conductor extends Persona {
	
//	Atributos
	private boolean garaje;
	private boolean seguro;
	
//	Constructor
	public Conductor () {
		super();
		this.garaje = Boolean.parseBoolean(JOptionPane.showInputDialog("¿Tiene garaje?\n[true / false]"));
		this.seguro = Boolean.parseBoolean(JOptionPane.showInputDialog("¿Tiene seguro?\n[true / false]"));
	}

//	Getters y Setters
	public boolean getGaraje() {
		return garaje;
	}
	public void setGaraje(boolean garaje) {
		this.garaje = garaje;
	}
	public boolean getSeguro() {
		return seguro;
	}
	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}
}