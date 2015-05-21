package GVB.Modulos.GestionEmpleados.GestionEH.Modelo.Classe;

import java.util.Comparator;

public class OrdenaSueldohoras implements Comparator<EmpleadoHoras> {

	public int compare(EmpleadoHoras e1, EmpleadoHoras e2) {
		if (e1.getSueldohoras() > (e2.getSueldohoras()))
			return 1;
		if (e1.getSueldohoras() < (e2.getSueldohoras()))
			return -1;
		return 0;
	}

}
