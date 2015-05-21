package GVB.Modulos.GestionEmpleados.GestionET.Modelo.Classe;

import java.util.Comparator;

public class OrdenaSueldoM implements Comparator<EmpleadoTemp> {

	public int compare(EmpleadoTemp e1, EmpleadoTemp e2) {
		if (e1.getSueldoM() > (e2.getSueldoM()))
			return 1;
		if (e1.getSueldoM() < (e2.getSueldoM()))
			return -1;
		return 0;
	}

}
