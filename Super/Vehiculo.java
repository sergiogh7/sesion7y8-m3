package Super;

import javax.swing.JOptionPane;

import Objetos.Rueda;

public abstract class Vehiculo {
	
//	Atributos
	protected String marca;
	protected String matricula;
	protected String color;
	
//	Constructor
	public Vehiculo () {
		this.matricula = matricula();
		this.marca = marca();
		this.color = color();
	}
	
//	Metodos
//	Funcion que comprueba que la matricula es correcta y añade las letras.
	private String matricula() {
		String inputMatricula =""; 
		int tamanyo;
		String inputLetras = "";
		
		do {
			inputMatricula = JOptionPane.showInputDialog("Introduzca la numeracion de la matricula.");
			tamanyo = Integer.parseInt(inputMatricula);
			
		} while (tamanyo / 1000 <= 0 || tamanyo / 1000 > 10);
		
		do {
			inputLetras = JOptionPane.showInputDialog("Introduzca las letras de la matricula").toUpperCase();
			
		} while (inputLetras.length() != 2 && inputLetras.length() != 3);
		
		inputMatricula += inputLetras;
		
		return matricula;
	}
	
	// Funcion que crea una rueda y la retorna.
	public Rueda creaRueda() {
		
		double diametro=0;
		
		String marca = JOptionPane.showInputDialog("¿Cual es la marca de la rueda?");
		
		do {
            String diametro_usuario = JOptionPane.showInputDialog("Introduzca el diametro de la rueda");
//            parsea
            diametro=Double.parseDouble(diametro_usuario);
            
        } while(diametro < 0.4 || diametro > 4);
		
//		Crea la rueda
		Rueda rueda = new Rueda (marca, diametro);
		
		return rueda;
	}
	
//	Pide la marca
	private String marca() {
		return JOptionPane.showInputDialog("Escriba marca");
	}
	
//	Pide el color
	private String color() {
		return JOptionPane.showInputDialog("Escriba color");
	}
	
//	Getters y Setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getmatricula() {
		return matricula;
	}
	public void setmatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}