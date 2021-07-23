package Objetos;

public class Rueda {
	
//	Atributos
	private String marca;
	private double diametro;
	
//	Constructor
	public Rueda(String marca, double diametro) {
		super();
		this.marca = marca;
		this.diametro = diametro;
	}
	
//	Metodo toString
	public String toString() {
		return "Marca: " + marca + "\nDiametro: " + diametro;
	}
	
//	Getters y Setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
}