/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionPedidos.Modelo.Classe;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;

/**
 *
 * @author Vinche
 */
@XStreamAlias("Pedidos")
public class Pedidos implements Comparable<Pedidos>, Serializable{
 @XStreamAlias("ID")
    private int ID;
    @XStreamAlias("DNI")
    private String DNI;
    @XStreamAlias("Coste")
    private float Coste;
    @XStreamAlias("ID_P")
    private int ID_P;
@XStreamAlias("Nombre_P")
    private String Nombre_P;
     @XStreamAlias("Cantidad")
    private int Cantidad;
     
    public Pedidos(int ID, String DNI, float Coste, int ID_P, String Nombre_P, int Cantidad) {
        this.ID = ID;
        this.DNI = DNI;
        this.Coste = Coste;
        this.ID_P = ID_P;
        this.Nombre_P = Nombre_P;
        this.Cantidad = Cantidad;
    }
    public Pedidos( String DNI, float Coste, int ID_P, String Nombre_P, int Cantidad) {
       
        this.DNI = DNI;
        this.Coste = Coste;
        this.ID_P = ID_P;
        this.Nombre_P = Nombre_P;
        this.Cantidad = Cantidad;
    }
public Pedidos(int ID){
    this.ID=ID;
}
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public float getCoste() {
        return Coste;
    }

    public void setCoste(float Coste) {
        this.Coste = Coste;
    }

    public int getID_P() {
        return ID_P;
    }

    public void setID_P(int ID_P) {
        this.ID_P = ID_P;
    }

    public String getNombre_P() {
        return Nombre_P;
    }

    public void setNombre_P(String Nombre_P) {
        this.Nombre_P = Nombre_P;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
     
     
     
     
     
     
    @Override
    public int compareTo(Pedidos o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
