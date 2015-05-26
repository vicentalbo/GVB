/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionProd.GestionProductos.Modelo.DAO;

import GVB.Modulos.GestionProd.GestionProductos.Modelo.Classe.Productos;

/**
 *
 * @author Vinche
 */
public class DAOPro {
    public static Productos IntroPro(int valc, Productos pr, String nom, Float precio, int stock, String tipo, String descri, String imagen) {
        
        
  
        

        if (valc == 1) {
            pr.setNombre(nom);
            pr.setPrecio(precio);
            pr.setStock(stock);
            pr.setTipo(tipo);
            pr.setDescripcion(descri);
            pr.setImagen(imagen);
            
        }
        																// nacimiento


        if ((valc == 0)) {
            pr = new Productos(nom,  precio, stock,tipo, descri, imagen);
        }
       

        return pr;
    }
}
