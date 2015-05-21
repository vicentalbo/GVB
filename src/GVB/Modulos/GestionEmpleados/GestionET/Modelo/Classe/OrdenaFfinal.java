package GVB.Modulos.GestionEmpleados.GestionET.Modelo.Classe;

import java.util.Comparator;

public class OrdenaFfinal implements Comparator<EmpleadoTemp> {

	public int compare(EmpleadoTemp e1, EmpleadoTemp e2) {
		if (e1.getFfinal().comparaFechas(e2.getFfinal()) > 0)
			return 1;
		if (e1.getFfinal().comparaFechas(e2.getFfinal()) < 0)
			return -1;
		return 0;
	}

}
