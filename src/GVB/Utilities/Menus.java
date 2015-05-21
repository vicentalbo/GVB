package GVB.Utilities;

import javax.swing.JOptionPane;

import GVB.Librerias.json;
import GVB.Librerias.txt;
import GVB.Librerias.xml;
import GVB.classes.Config;

public class Menus {

	public static int menubasic(String msgB, String menu, String[] boton) { // Funcion
		// de
		// menu basic

		int opcion = JOptionPane.showOptionDialog(null, msgB, menu, JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, boton, boton[0]);

		return opcion;
	}

	public static int menu(String[] op, String mensg) { // funcion del menu
		int confirmado = JOptionPane.showOptionDialog(null, mensg, "Menu", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, op, op[0]);

		return confirmado;
	}

	public static int menu2(String continop, String[] eleccion) { // Funcion de
		// continuar

		int opcion = JOptionPane.showOptionDialog(null, continop, "Menu", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, eleccion, eleccion[0]);

		return opcion;
	}

	public static String Combobox(Object[] o, String s) {

		Object opc = JOptionPane.showInputDialog(null, s, "Seleccion", JOptionPane.QUESTION_MESSAGE, null, o, o[0]);

		return opc.toString();
	}

	public static String ConfiFecha() {
		String opcion = "";

		Object opc = JOptionPane.showInputDialog(null, "selecciona el formato de fecha que desea utilizar", "Formato",
				JOptionPane.QUESTION_MESSAGE, null, new Object[] { "dd/mm/AAAA", "AAAA/mmm/dd", "mm/dd/AAAA",
						"dd-mm-AAAA", "AAAA-mmm-dd", "mm-dd-AAAA" }, "dd/mm/AAAA");

		if (opc == null)
			JOptionPane.showMessageDialog(null, "Saliendo de la aplicaci�n", "Saliendo ...",
					JOptionPane.INFORMATION_MESSAGE);

		else {

			if (opc.equals("dd/mm/AAAA"))
				opcion = "1";

			if (opc.equals("AAAA/mm/dd"))
				opcion = "2";

			if (opc.equals("mm/dd/AAAA"))
				opcion = "3";

			if (opc.equals("dd-mm-AAAA"))
				opcion = "4";

			if (opc.equals("AAAA-mm-dd"))
				opcion = "5";

			if (opc.equals("mm-dd-AAAA"))
				opcion = "6";
		}
		return opcion;
	}

	public static String ConfiDec() {
		String opc[] = { "1 Decimal", "2 Decimales", "3 Decimales" };
		String cad = "";

		int opcion = JOptionPane.showOptionDialog(null, "Elige el numero de decimales con los que desea trabajar",
				"Config", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opc, opc[1]);

		cad = "" + (opcion + 1);
		return cad;

	}

	public static char ConfiMoneda() {
		String opc[] = { "Euro �", "Dolar $", "Libra �" };
		char moneda = ' ';

		int opcion = JOptionPane.showOptionDialog(null, "Elige la moneda con la que desea trabajar", "Config",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opc, opc[0]);

		if (opcion == 0) {
			moneda = '�';
		}
		if (opcion == 1) {
			moneda = '$';
		}
		if (opcion == 2) {
			moneda = '�';// �==Alt+156
		}
		return moneda;

	}

	
}
