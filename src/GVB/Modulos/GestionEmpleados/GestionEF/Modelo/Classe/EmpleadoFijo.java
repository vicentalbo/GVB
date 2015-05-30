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

    public EmpleadoFijo(String nombre, String dNi, String telef, Fechas fnac, Fechas fcontr, String email, String password, int estado, String tipo, String Avatar, float sueldof, int antig, float sueldo) {
        super(nombre, dNi, telef, fnac, fcontr, email, password, estado, tipo, Avatar);

        this.sueldof = sueldof;
        this.antig = antig;
        this.sueldo = sueldo;

    }
public EmpleadoFijo(String nombre, String dNi,  Fechas fnac, Fechas fcontr, String email, String password, int estado, String tipo, String Avatar, int antig) {
        super(nombre, dNi,  fnac, fcontr, email, password, estado, tipo, Avatar);

        
        this.antig = antig;
        

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

    public void setSueldoh(float sueldo) {
      
        this.sueldo=sueldo;
    }

}
