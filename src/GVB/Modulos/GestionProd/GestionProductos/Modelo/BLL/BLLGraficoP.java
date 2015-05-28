/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionProd.GestionProductos.Modelo.BLL;

import GVB.Modulos.GestionProd.GestionProductos.Controlador.BLLControllerVntPro;
import GVB.Modulos.GestionProd.GestionProductos.Modelo.DAO.DAOGraficoP;
import GVB.Librerias.Menus;
import GVB.classes.Config;

/**
 *
 * @author Vinche
 */
public class BLLGraficoP {
        public static int pos = 0;


    public static void modificar() {
        DAOGraficoP.crearPro();
        
    }

    public static void eliminar() {
        int opc;
        String[] boton = {"Sí", "Cancelar"};

        opc = Menus.menubasic("¿Está seguro de eliminar la información?", "Eliminar", boton);
        if (opc == 0) {
            BLL.eliminar(BLLControllerVntPro.mod - 20);
            
        }
    }

    public static void eliminador() {
        BLLControllerVntPro.mod = 21;
        BLLGraficoP.eliminar();

    }

    public static void Saves(int i) {
        Config.setSaves(i);
    }

public static void Limpiar(){
    DAOGraficoP.LimpiarPro();
}
public static void introName(int i){
    DAOGraficoP.introName(i);
}

public static void introPrecio(int i){
    DAOGraficoP.introPrecio();
}
public static void introStock(){
    DAOGraficoP.introStock();
}
public static void introDescripcion(){
    DAOGraficoP.introDescri();
}
public static void crearPro() {
        
        
        if (BLLControllerVntPro.mod < 10) {
             DAOGraficoP.crearPro();
            if (BLLControllerVntPro.veri == true){
            BLLBDProd.nuevoProdBLL();
            
            }
        }
        if (BLLControllerVntPro.mod > 10) {
            BLLGraficoP.modificar();
            if(BLLControllerVntPro.veri==true)
           BLLBDProd.modificarProdBLL();
            
        }
       
        if(BLLControllerVntPro.veri==true){
        BLLBDProd.listAllProdBLL();
       
     
        }
    }
}
