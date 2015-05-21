package GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe;

import java.io.Serializable;

import GVB.Librerias.Format;
import GVB.Modulos.GestionEmpleados.GestionE.Modelo.Classe.Empleado;
import GVB.classes.Config;
import GVB.classes.Fechas;
import GVB.prpal;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("EmpleadoFijo")
public class EmpleadoFijo extends Empleado implements Serializable {

    @XStreamAlias("Sueldof")
    private float sueldof;
    @XStreamAlias("antig")
    private int antig;
    @XStreamAlias("sueldo")
    private float sueldo;

    public EmpleadoFijo(String nombre, String dNi, String telef, Fechas fnac, Fechas fcontr, String email, String password, int estado, String tipo, String Avatar, float sueldof, int antig) {
        super(nombre, dNi, telef, fnac, fcontr, email, password, estado, tipo, Avatar);

        this.sueldof = sueldof;
        this.antig = antig;
        this.sueldo = this.setSueldoh(sueldof);

    }

    public EmpleadoFijo(String dni) {
        super(dni);
    }
  public EmpleadoFijo (String mail, int i){
      super(mail, i);
  }

    @Override
    public String toString() {
        String cad = "";
        if (prpal.conf == null) {
            cad = "Empleado Fijo" + "\n" + "Nombre= " + super.getNombre() + "\n" + "DNI= " + super.getdNi() + "\n"
                    + "Telefono= " + super.getTelef() + "\n" + "Edad= " + super.getEdad() + "\n"
                    + "Fecha de nacimiento= " + super.getFnac() + "\n" + "Fecha de Contratacion= " + super.getFcontr()
                    + "\n" + "Sueldo basico= " + this.sueldof + "€" + "\n" + "Sueldo anual= "
                    + this.setSueldoh(sueldof) + "€" + "\n" + "Antig�edad= " + this.antig;
        }
        if (Config.getDecimal().equals("2")) {
            cad = "Empleado Fijo" + "\n" + "Nombre= " + super.getNombre() + "\n" + "DNI= " + super.getdNi() + "\n"
                    + "Telefono= " + super.getTelef() + "\n" + "Edad= " + super.getEdad() + "\n"
                    + "Fecha de nacimiento= " + super.getFnac().toString() + "\n" + "Fecha de Contratación= "
                    + super.getFcontr().toString() + "\n" + "Sueldo básico= " + Format.format2dec(this.sueldof)
                    + Config.getMoneda() + "\n" + "Sueldo anual= " + Format.format2dec(this.setSueldoh(sueldof))
                    + Config.getMoneda() + "\n" + "Antigüedad= " + this.antig;
        }
        if (Config.getDecimal().equals("1")) {
            cad = "Empleado Fijo" + "\n" + "Nombre= " + super.getNombre() + "\n" + "DNI= " + super.getdNi() + "\n"
                    + "Telefono= " + super.getTelef() + "\n" + "Edad= " + super.getEdad() + "\n"
                    + "Fecha de nacimiento= " + super.getFnac().toString() + "\n" + "Fecha de Contrataci�n= "
                    + super.getFcontr().toString() + "\n" + "Sueldo b�sico= " + Format.format1dec(this.sueldof)
                    + Config.getMoneda() + "\n" + "Sueldo anual= " + Format.format1dec(this.setSueldoh(sueldof))
                    + Config.getMoneda() + "\n" + "Antigüedad= " + this.antig;
        }
        if (Config.getDecimal().equals("3")) {
            cad = "Empleado Fijo" + "\n" + "Nombre= " + super.getNombre() + "\n" + "DNI= " + super.getdNi() + "\n"
                    + "Telefono= " + super.getTelef() + "\n" + "Edad= " + super.getEdad() + "\n"
                    + "Fecha de nacimiento= " + super.getFnac().toString() + "\n" + "Fecha de Contrataci�n= "
                    + super.getFcontr().toString() + "\n" + "Sueldo b�sico= " + Format.format3dec(this.sueldof)
                    + Config.getMoneda() + "\n" + "Sueldo anual= " + Format.format3dec(this.setSueldoh(sueldof))
                    + Config.getMoneda() + "\n" + "Antigüedad= " + this.antig;
        }
        return cad;
    }

    public float getSueldof() {
        return sueldof;
    }

    public void setSueldof(float sueldof) {
        this.sueldof = sueldof;
    }

    public int getAntig() {
        return antig;
    }

    public void setAntig(int antig) {
        this.antig = antig;
    }

    public float getSueldoh() {
        return sueldo;
    }

    public float setSueldoh(float sueldof) {
        sueldo = sueldof * 14;
        if ((this.getAntig() > 5) && (this.getAntig() < 10)) {
            sueldo = sueldo * 1.2f;
        }
        if (this.getAntig() > 10) {
            sueldo = sueldo * 1.4f;
        }
        return sueldo;
    }

}
