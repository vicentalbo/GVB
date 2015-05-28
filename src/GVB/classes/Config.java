package GVB.classes;

import java.util.ArrayList;


import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.ArrayListEF;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.EmpleadoFijo;

import GVB.Modulos.GestionProd.GestionProductos.Modelo.Classe.ArrayListPro;
import GVB.Modulos.GestionProd.GestionProductos.Modelo.Classe.Productos;

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
		ArrayListPro.pro=new ArrayList<Productos>();
		
		
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
