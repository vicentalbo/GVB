package GVB.classes;

import java.util.ArrayList;

import GVB.Modulos.GestionEmpleados.GestionE.Modelo.BLL.BLL;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.ArrayListEF;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.EmpleadoFijo;
import GVB.Modulos.GestionEmpleados.GestionEH.Modelo.Classe.ArrayListEH;
import GVB.Modulos.GestionEmpleados.GestionEH.Modelo.Classe.EmpleadoHoras;
import GVB.Modulos.GestionEmpleados.GestionET.Modelo.Classe.ArrayListET;
import GVB.Modulos.GestionEmpleados.GestionET.Modelo.Classe.EmpleadoTemp;

public class Config {

	private static String decimal;
	private static char moneda;
	private static String formaFecha;
	private static int saves;

	public Config() {

		decimal = "2";
		moneda = '€';
		formaFecha = "1";
		saves = 1; // 1==Json, 2==Xml, 3==Txt

		ArrayListEF.efi = new ArrayList<EmpleadoFijo>();
		ArrayListEH.eho = new ArrayList<EmpleadoHoras>();
		ArrayListET.ete = new ArrayList<EmpleadoTemp>();
		// Dummies.generarDummies(7);
		
	}

	public static String getDecimal() {
		return decimal;
	}

	public static void setDecimal(String decimal) {
		Config.decimal = decimal;
	}

	public static char getMoneda() {
		return moneda;
	}

	public static void setMoneda(char moneda) {
		Config.moneda = moneda;
	}

	public static String getFormaFecha() {
		return formaFecha;
	}

	public static void setFormaFecha(String formaFecha) {
		Config.formaFecha = formaFecha;
	}

	@Override
	public String toString() {
		return "Configuraci�n" + "\n" + " decimal=" + decimal + "\n" + ", moneda=" + moneda + "\n" + ", formaFecha="
				+ formaFecha + "\n";
	}

	public static void setSaves(int saves) {
		Config.saves = saves;
	}

	public static int getSaves() {
		return saves;
	}
}
