package GVB.Modulos.GestionEmpleados.GestionE.Modelo.Classe;

import java.io.Serializable;

import GVB.classes.Fechas;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Empleado")
public class Empleado implements Comparable<Empleado>, Serializable {

    @XStreamAlias("nombre")
    private String nombre;
    @XStreamAlias("dNi")
    private String dNi;
    @XStreamAlias("telef")
    private String telef;
    @XStreamAlias("edad")
    private int edad;
    @XStreamAlias("Fnac")
    private Fechas Fnac;
    @XStreamAlias("Fcontr")
    private Fechas Fcontr;
    @XStreamAlias("email")
    private String email;
    @XStreamAlias("usuario")
    private String usuario;
    @XStreamAlias("password")
    private String password;
    @XStreamAlias("estado")
    private int estado;
    @XStreamAlias("tipo")
    private String tipo;
      @XStreamAlias("Avatar")
    private String Avatar;

    public Empleado(String nombre, String dNi, String telef, Fechas fnac, Fechas fcontr, String email, String password, int estado, String tipo, String Avatar) {

        this.nombre = nombre;
        this.dNi = dNi;
        this.telef = telef;
        this.setEdad(fnac.restaFechasEdad());
        this.Fnac = fnac;
        this.Fcontr = fcontr;
        this.email = email;
        this.usuario = this.setUsuario(email);//split email[@] (0)
        this.password = password;
        this.estado = estado;
        this.tipo = tipo;
        this.Avatar=Avatar;
    }
 public Empleado(String nombre, String dNi,  Fechas fnac, Fechas fcontr, String email, String password, int estado, String tipo, String Avatar) {

        this.nombre = nombre;
        this.dNi = dNi;
        
        this.setEdad(fnac.restaFechasEdad());
        this.Fnac = fnac;
        this.Fcontr = fcontr;
        this.email = email;
        this.usuario = this.setUsuario(email);//split email[@] (0)
        this.password = password;
        this.estado = estado;
        this.tipo = tipo;
        this.Avatar=Avatar;
    }
    public Empleado(String dni) {
        this.dNi = dni;
    }
public Empleado(String mail, int i){
    if(i==0){
    this.email=mail;
    }
    if(i==1)
        this.usuario=mail;
    
}
    @Override
    public String toString() {
        return "EmpleadoFijo [nombre=" + nombre + ", dNi=" + dNi + ", telef=" + telef + ", Fnac=" + Fnac + ", Fcontr="
                + Fcontr;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getdNi() {
        return dNi;
    }

    public void setdNi(String dNi) {
        this.dNi = dNi;
    }

    public String getTelef() {
        return telef;
    }

    public void setTelef(String telef) {
        this.telef = telef;
    }

    public Fechas getFnac() {
        return Fnac;
    }

    public void setFnac(Fechas fnac) {
        Fnac = fnac;
    }

    public Fechas getFcontr() {
        return Fcontr;
    }

    public void setFcontr(Fechas fcontr) {
        Fcontr = fcontr;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;

    }

    public int calculaEdad(Fechas fnac) {
        this.setEdad(fnac.restaFechasEdad());
        return this.getEdad();
    }

    public int compareTo(Empleado emp) {// para ordenar los empleados
        if (this.getdNi().compareTo(emp.getdNi()) > 0) {
            return 1;
        }
        if (this.getdNi().compareTo(emp.getdNi()) < 0) {
            return -1;
        }
        return 0;
    }

    public boolean equals(Object e) {
        return getdNi().equals(((Empleado) e).getdNi());
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public String setUsuario(String email) {
        String[] us;
        us = email.split("@");
        return usuario = us[0];
    }
    public String getAvatar(){
        return Avatar;
    }
    public void setAvatar(String Avatar){
        this.Avatar=Avatar;
    }
}
