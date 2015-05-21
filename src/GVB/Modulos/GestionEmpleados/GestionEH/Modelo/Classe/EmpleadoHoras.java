package GVB.Modulos.GestionEmpleados.GestionEH.Modelo.Classe;

import java.io.Serializable;

import GVB.Librerias.Format;
import GVB.Modulos.GestionEmpleados.GestionE.Modelo.Classe.Empleado;
import GVB.classes.Config;
import GVB.classes.Fechas;
import GVB.prpal;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("EmpleadoHoras")
public class EmpleadoHoras extends Empleado implements Serializable {
	@XStreamAlias("sueldohoras")
	private float sueldohoras;
	@XStreamAlias("horas")
	private int horas;

	public EmpleadoHoras(String nombre, String dNi, String telef, Fechas fnac, Fechas fcontr, float sueldohoras,
			int horas,  String email, String password, int estado, String tipo, String Avatar) {
		super(nombre, dNi, telef, fnac, fcontr, email, password, estado, tipo, Avatar);
		this.sueldohoras = sueldohoras;
		this.horas = horas;

	}

	public EmpleadoHoras(String dni) {
		super(dni);
	}

	@Override
	public String toString() {
		String cad = "";
		if (prpal.conf == null)
			cad = "Empleado por Horas" + "\n" + "Nombre= " + super.getNombre() + "\n" + "DNI= " + super.getdNi() + "\n"
					+ "Telefono= " + super.getTelef() + "\n" + "Fecha de nacimiento= " + super.getFnac().toString()
					+ "\n" + "Edad= " + super.getEdad() + "\n" + "Fecha de Contrataci�n= "
					+ super.getFcontr().toString() + "\n" + "Sueldo por hora= " + this.sueldohoras + "�" + "\n"
					+ "Horas trabajadas= " + this.horas + "\n" + "Sueldo total= " + (this.horas * this.sueldohoras)
					+ "�";
		if (Config.getDecimal().equals("2")) {
			cad = "Empleado por Horas" + "\n" + "Nombre= " + super.getNombre() + "\n" + "DNI= " + super.getdNi() + "\n"
					+ "Telefono= " + super.getTelef() + "\n" + "Fecha de nacimiento= " + super.getFnac().toString()
					+ "\n" + "Edad= " + super.getEdad() + "\n" + "Fecha de Contrataci�n= "
					+ super.getFcontr().toString() + "\n" + "Sueldo por hora= " + Format.format2dec(this.sueldohoras)
					+ Config.getMoneda() + "\n" + "Horas trabajadas= " + this.horas + "\n" + "Sueldo total= "
					+ Format.format2dec((this.horas * this.sueldohoras)) + Config.getMoneda();
		}
		if (Config.getDecimal().equals("1")) {
			cad = "Empleado por Horas" + "\n" + "Nombre= " + super.getNombre() + "\n" + "DNI= " + super.getdNi() + "\n"
					+ "Telefono= " + super.getTelef() + "\n" + "Fecha de nacimiento= " + super.getFnac().toString()
					+ "\n" + "Edad= " + super.getEdad() + "\n" + "Fecha de Contrataci�n= "
					+ super.getFcontr().toString() + "\n" + "Sueldo por hora= " + Format.format1dec(this.sueldohoras)
					+ Config.getMoneda() + "\n" + "Horas trabajadas= " + this.horas + "\n" + "Sueldo total= "
					+ Format.format1dec((this.horas * this.sueldohoras)) + Config.getMoneda();
		}
		if (Config.getDecimal().equals("3")) {
			cad = "Empleado por Horas" + "\n" + "Nombre= " + super.getNombre() + "\n" + "DNI= " + super.getdNi() + "\n"
					+ "Telefono= " + super.getTelef() + "\n" + "Fecha de nacimiento= " + super.getFnac().toString()
					+ "\n" + "Edad= " + super.getEdad() + "\n" + "Fecha de Contrataci�n= "
					+ super.getFcontr().toString() + "\n" + "Sueldo por hora= " + Format.format3dec(this.sueldohoras)
					+ Config.getMoneda() + "\n" + "Horas trabajadas= " + this.horas + "\n" + "Sueldo total= "
					+ Format.format3dec((this.horas * this.sueldohoras)) + Config.getMoneda();
		}

		return cad;
	}

	public float getSueldohoras() {
		return sueldohoras;
	}

	public void setSueldohoras(float sueldohoras) {
		this.sueldohoras = sueldohoras;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

}
