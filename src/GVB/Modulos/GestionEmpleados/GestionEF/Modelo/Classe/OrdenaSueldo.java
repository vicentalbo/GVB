package GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe;

import java.util.Comparator;

public class OrdenaSueldo implements Comparator<EmpleadoFijo> {

	public int compare(EmpleadoFijo e1, EmpleadoFijo e2) {
		if (e1.getSueldoh() > e2.getSueldoh())
			return 1;
		if (e1.getSueldoh() < e2.getSueldoh())
			return -1;
		return 0;
	}
}
