package GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe;

import java.util.Comparator;

public class OrdenaSueldof implements Comparator<EmpleadoFijo> {

	public int compare(EmpleadoFijo e1, EmpleadoFijo e2) {

		if (e1.getSueldof() > e2.getSueldof())
			return 1;
		if (e1.getSueldof() < e2.getSueldof())
			return -1;

		return 0;
	}
}
