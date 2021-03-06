/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionProd.GestionProductos.Modelo.DAO;

import GVB.Modulos.GestionProd.GestionProductos.Controlador.BLLControllerVntPro;
import static GVB.Modulos.GestionProd.GestionProductos.Controlador.BLLControllerVntPro.VntPro;

import GVB.Modulos.GestionProd.GestionProductos.Modelo.Classe.ArrayListPro;


/**
 *
 * @author Vinche
 */
public class DAOGraficoP {
    public static void LimpiarPro() {
        
        VntPro.TxtStock.setText("");
        VntPro.TxtDescri.setText("");
        VntPro.TxtNombre.setText("");
        VntPro.TxtPrecio.setText("");
        
        
        VntPro.NoNombre.setVisible(false);
        VntPro.NoPrecio.setVisible(false);
        VntPro.NoDescri.setVisible(false);
        VntPro.NoStock.setVisible(false);
        
    }
      public static float introPrecio(){
       float precio=0.0f;
        if (VntPro.TxtPrecio.getText().isEmpty()) {
            VntPro.NoPrecio.setVisible(true);
        } else {
            try{
            precio = Float.parseFloat(VntPro.TxtPrecio.getText());
            }catch(Exception e){
                VntPro.NoPrecio.setVisible(true);
            }
            
            if (precio == 0.0f) {
                VntPro.NoPrecio.setVisible(true);
            }else{
                VntPro.NoPrecio.setVisible(false);
            }
        }
        return precio;
   } 
      
      
      public static void crearPro() {
        String nombre, descri, tipo, imagen;
        int stock ;
        float precio;
        

        BLLControllerVntPro.veri = false;

        
       
        nombre = introName(0);
        
        precio = DAOGraficoP.introPrecio();
        stock = introStock();
        

        
        descri = introDescri();
        tipo = VntPro.ComboTipo.getSelectedItem().toString();
        
        

//creaEmp
        if ((VntPro.NoNombre.isVisible() == false) && (VntPro.NoPrecio.isVisible() == false) && (VntPro.NoStock.isVisible() == false) ) {
            if (BLLControllerVntPro.mod == 1) {
                if(BLLControllerVntPro.Img.equals(""))
                    BLLControllerVntPro.Img="src/GVB/img/Prods/icon.jpg";
                
                ArrayListPro.p =  DAOPro.IntroPro(0, ArrayListPro.p, nombre, precio, stock, tipo,  descri,  BLLControllerVntPro.Img);
                BLLControllerVntPro.veri = true;

            }
            if (BLLControllerVntPro.mod == 11) {
                ArrayListPro.p = DAOPro.IntroPro(1, ArrayListPro.p, nombre, precio, stock, tipo,  descri,  BLLControllerVntPro.Img);
                BLLControllerVntPro.veri = true;
               

            }
            
        }

    }

    public static String introName(int val) {
        String nombre = "";
        if (VntPro.TxtNombre.getText().isEmpty()) {
            VntPro.NoNombre.setVisible(true);
        } else {
            nombre = VntPro.TxtNombre.getText();
            
                VntPro.NoNombre.setVisible(false);

                if (val == 1) {
                    VntPro.TxtPrecio.requestFocus();
                }
            
        }
        return nombre;
    }

     public static String introDescri() {
        String descri="";
        if (VntPro.TxtDescri.getText().isEmpty()) {
            VntPro.NoDescri.setVisible(true);
        } else {
            descri = VntPro.TxtDescri.getText();
            
                VntPro.NoDescri.setVisible(false);

                
            
        }
        return descri;
    }
    public static int introStock(){
       int stock=0;
        if (VntPro.TxtPrecio.getText().isEmpty()) {
            VntPro.NoStock.setVisible(true);
        } else {
            try{
            stock = Integer.parseInt(VntPro.TxtStock.getText());
            }catch(Exception e){
                VntPro.NoStock.setVisible(true);
            }
            if (stock == 0) {
                VntPro.NoStock.setVisible(true);
            }else{
                VntPro.NoStock.setVisible(false);
            }
        }
        return stock;
   }


   

    public static void modif() {
        VntPro.Guardar.setText("Guardar");
      
        VntPro.TxtNombre.setEditable(true);
        VntPro.TxtPrecio.setEditable(true);
        VntPro.TxtStock.setEditable(true);
        VntPro.TxtDescri.setEditable(true);
        BLLControllerVntPro.mod = 11;
    }
}
