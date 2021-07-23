package VehiculosApp;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Objetos.Moto;
import Objetos.Camion;
import Objetos.Coche;
import Objetos.Conductor;
import Objetos.Titular;

public class vehiculosApp {

	public static void main(String[] args) {
		
//		Modifica el main per tenir la llista de persones i vehicles.
		ArrayList<Titular> titular = new ArrayList<>();
		ArrayList<Coche> coche = new ArrayList<>();
		ArrayList<Moto> moto = new ArrayList<>();
		ArrayList<Camion> camion = new ArrayList<>();
		
//		Constantes
		final String COCHE = "coche";
		final String MOTO = "moto";
		final String CAMION = "camion";
		final String LICENCIA_COCHE = "B";
		final String LICENCIA_MOTO = "A";
		final String LICENCIA_CAMION = "C";
		
		String licencia = "";
		String tVehiculo = "";
		
		
		do {
			
			Titular titularAnyadir = new Titular();
			
			String vehiculo = JOptionPane.showInputDialog("Escriba que vehiculo quiere crear:\n[coche / moto / camion]").toLowerCase();
			
//			Pasa los datos para comrpobar si la licencia es correcta.
			if (comprobarLicencia(vehiculo, titularAnyadir, COCHE, LICENCIA_COCHE)) {
				coche.add(new Coche());
				licencia = LICENCIA_COCHE;
				tVehiculo = COCHE;
				System.out.println(coche.toString());
				
			}else if (comprobarLicencia(vehiculo, titularAnyadir, MOTO, LICENCIA_MOTO)) {
				moto.add(new Moto());
				licencia = LICENCIA_MOTO;
				tVehiculo = MOTO;
				System.out.println(moto.toString());
				
			}else if (comprobarLicencia(vehiculo, titularAnyadir, CAMION, LICENCIA_CAMION)) {
				camion.add(new Camion());
				licencia = LICENCIA_CAMION;
				tVehiculo = CAMION;
				System.out.println(camion.toString());
				
			}else {
				System.out.println("Usted no tiene la licencia correcta!");
			}
			
//			Lo añade a la lista de titulares.
			titular.add(titularAnyadir);
			
//			Pregunta si el titular sera el conductor y pasa a lower case.
			if (JOptionPane.showInputDialog("El titular es el conductor?\n[si / no]").toLowerCase().equals("no")) {
				Conductor conductor1 = new Conductor();
				
//				Comprueba la licencia
				if (comprobarLicencia(vehiculo, conductor1, tVehiculo, licencia)) {
					System.out.println("Correcto.");
					
				}else {
					System.out.println("No tiene la licencia adecuada");
					
				}
			}
		} while (Boolean.parseBoolean(JOptionPane.showInputDialog("¿Quiere crear mas?\n[true / false]")));
	}
	
//	Metodos
//	Funciones para comprobar las licencias.
	public static boolean comprobarLicencia(String vehiculo, Titular titular1, String tipo, String licencia) {
		return vehiculo.equals(tipo) && titular1.getTipoDeLicencia().equals(licencia);
		
	}
	public static boolean comprobarLicencia(String vehiculo, Conductor conductor1, String tipo, String licencia) {
		return vehiculo.equals(tipo) && conductor1.getTipoDeLicencia().equals(licencia);
		
	}
}