package Super;

import javax.swing.JOptionPane;

public abstract class Persona {
	
//	Atributos
	protected String nombre;
	protected String apellido;
	protected String nacimiento;
	protected Licencia licencia;
	
//	Constructor
	public Persona() {
		this.nombre = JOptionPane.showInputDialog("Escriba su nombre");
		this.apellido = JOptionPane.showInputDialog("Escriba su apellido");
		this.nacimiento = JOptionPane.showInputDialog("Escriba la fecha de nacimiento [dd/mm/aaaa]");
		this.licencia = new Licencia();
	}
	
//	Metodos
//	Retorna el tipo de licencia
	public String getTipoDeLicencia() {
		return licencia.getTipo();
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}

	public Licencia getLicencia() {
		return licencia;
	}

	public void setLicencia(Licencia licencia) {
		this.licencia = licencia;
	}	
}