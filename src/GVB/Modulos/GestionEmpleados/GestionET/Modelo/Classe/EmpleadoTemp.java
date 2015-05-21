package GVB.Modulos.GestionEmpleados.GestionET.Modelo.Classe;

import java.io.Serializable;

import GVB.Librerias.Format;
import GVB.Modulos.GestionEmpleados.GestionE.Modelo.Classe.Empleado;
import GVB.classes.Config;
import GVB.classes.Fechas;
import GVB.prpal;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("EmpleadoTemp")
public class EmpleadoTemp extends Empleado implements Serializable {
	@XStreamAlias("sueldoM")
	private float sueldoM;
	@XStreamAlias("Ffinal")
	private Fechas Ffinal;

	public EmpleadoTemp(String nombre, String dNi, String telef, Fechas fnac, Fechas fcontr, float sueldoM,
			Fechas ffinal,  String email, String password, int estado, String tipo, String Avatar) {
		super(nombre, dNi, telef, fnac, fcontr, email, password, estado, tipo, Avatar);
		this.sueldoM = sueldoM;
		this.Ffinal = ffinal;

	}

	public EmpleadoTemp(String dni) {
		super(dni);
	}

	@Override
	public String toString() {
		String cad = "";
		if (prpal.conf == null)
			cad = "Empleado Temporal" + "\n" + "Nombre= " + super.getNombre() + "\n" + "DNI= " + super.getdNi() + "\n"
					+ "Telefono= " + super.getTelef() + "\n" + "Edad= " + super.getEdad() + "\n"
					+ "Fecha de nacimiento= " + super.getFnac().toString() + "\n" + "Fecha de Contrataci�n= "
					+ super.getFcontr().toString() + "\n" + "Fecha de Finalizaci�n de contrato= "
					+ this.Ffinal.toString() + "\n" + "Sueldo mensual= " + this.sueldoM + "�";
		if ((Config.getDecimal().equals("2"))) {
			cad = "Empleado Temporal" + "\n" + "Nombre= " + super.getNombre() + "\n" + "DNI= " + super.getdNi() + "\n"
					+ "Telefono= " + super.getTelef() + "\n" + "Edad= " + super.getEdad() + "\n"
					+ "Fecha de nacimiento= " + super.getFnac().toString() + "\n" + "Fecha de Contrataci�n= "
					+ super.getFcontr().toString() + "\n" + "Fecha de Finalizaci�n de contrato= "
					+ this.Ffinal.toString() + "\n" + "Sueldo mensual= " + Format.format2dec(this.sueldoM)
					+ Config.getMoneda();
		}
		if (Config.getDecimal().equals("1")) {
			cad = "Empleado Temporal" + "\n" + "Nombre= " + super.getNombre() + "\n" + "DNI= " + super.getdNi() + "\n"
					+ "Telefono= " + super.getTelef() + "\n" + "Edad= " + super.getEdad() + "\n"
					+ "Fecha de nacimiento= " + super.getFnac().toString() + "\n" + "Fecha de Contrataci�n= "
					+ super.getFcontr().toString() + "\n" + "Fecha de Finalizaci�n de contrato= "
					+ this.Ffinal.toString() + "\n" + "Sueldo mensual= " + Format.format1dec(this.sueldoM)
					+ Config.getMoneda();
		}
		if (Config.getDecimal().equals("3")) {
			cad = "Empleado Temporal" + "\n" + "Nombre= " + super.getNombre() + "\n" + "DNI= " + super.getdNi() + "\n"
					+ "Telefono= " + super.getTelef() + "\n" + "Edad= " + super.getEdad() + "\n"
					+ "Fecha de nacimiento= " + super.getFnac().toString() + "\n" + "Fecha de Contrataci�n= "
					+ super.getFcontr().toString() + "\n" + "Fecha de Finalizaci�n de contrato= "
					+ this.Ffinal.toString() + "\n" + "Sueldo mensual= " + Format.format3dec(this.sueldoM)
					+ Config.getMoneda();
		}

		return cad;
	}

	public float getSueldoM() {
		return sueldoM;
	}

	public void setSueldoM(float sueldoM) {
		this.sueldoM = sueldoM;
	}

	public Fechas getFfinal() {
		return Ffinal;
	}

	public void setFfinal(Fechas ffinal) {
		this.Ffinal = ffinal;
	}

}
