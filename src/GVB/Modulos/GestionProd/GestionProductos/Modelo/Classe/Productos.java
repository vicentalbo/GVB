/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionProd.GestionProductos.Modelo.Classe;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;

/**
 *
 * @author Vinche
 */
@XStreamAlias("Productos")
public class Productos implements Comparable<Productos>, Serializable {

    @XStreamAlias("ID")
    private int ID;
    @XStreamAlias("Nombre")
    private String Nombre;
    @XStreamAlias("Tipo")
    private String Tipo;
    @XStreamAlias("Precio")
    private float Precio;
    @XStreamAlias("Stock")
    private int Stock;
    @XStreamAlias("Descripcion")
    private String Descripcion;
    @XStreamAlias("Imagen")
    private String Imagen;

    public Productos(int ID, String Nombre, String Tipo, float Precio, int Stock, String Descripcion, String Imagen) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Precio = Precio;
        this.Stock = Stock;
        this.Descripcion = Descripcion;
        this.Imagen = Imagen;
    }

    public Productos(String Nombre, String Tipo, float Precio, int Stock, String Descripcion, String Imagen) {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Precio = Precio;
        this.Stock = Stock;
        this.Descripcion = Descripcion;
        this.Imagen = Imagen;
    }

    public Productos(int ID){
        this.ID=ID;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }

    @Override
    public int compareTo(Productos o) {
        int i = 0;

        if (this.getID() > o.getID()) {
            i = -1;
        }
        if (this.getID() < o.getID()) {
            i = 1;
        }
        return i;
    }

}
