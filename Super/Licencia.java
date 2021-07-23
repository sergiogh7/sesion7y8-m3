package Super;

import javax.swing.JOptionPane;

public class Licencia {
	
	// Atributos
	private int id;
	private String tipoLicencia;
	private String nombre;
	private String fechaCaducidad;
	
	// Constructor
	public Licencia() {
		this.id = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la ID de la licencia."));
		this.tipoLicencia = JOptionPane.showInputDialog("Escriba el tipo de licencia.");
		this.nombre = JOptionPane.showInputDialog("Escriba el nombre.");
		this.fechaCaducidad = JOptionPane.showInputDialog("Escriba la fecha de caducidad [dd/mm/aaaa].");
	}

	// Getters setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipoLicencia;
	}
	public void setTipo(String tipo) {
		this.tipoLicencia = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCaducidad() {
		return fechaCaducidad;
	}
	public void setCaducidad(String caducidad) {
		this.fechaCaducidad = caducidad;
	}
}