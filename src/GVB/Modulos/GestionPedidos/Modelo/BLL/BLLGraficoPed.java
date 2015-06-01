/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionPedidos.Modelo.BLL;

import GVB.Librerias.json;
import GVB.Librerias.txt;
import GVB.Librerias.xml;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.ArrayListEF;
import GVB.Modulos.GestionPedidos.Modelo.Classe.ArrayListPedidos;
import GVB.Modulos.GestionPedidos.Modelo.DAO.DAOGraficoPed;
import GVB.Modulos.GestionProd.GestionProductos.Modelo.Classe.ArrayListPro;
import GVB.classes.Config;

/**
 *
 * @author Vinche
 */
public class BLLGraficoPed {
    public static void Saves(int i) {
        Config.setSaves(i);
    }
    public static void GuardarTodo() {
        BLLBDPed.listAllPedBLL();
        if (Config.getSaves() == 1) {
            json.generajsonPed();
            
        }
        if (Config.getSaves() == 2) {
            xml.generaxmlPed();
           
        }
        if (Config.getSaves() == 3) {
            txt.generatxtPed();
           
        }
    } 
    public static int Comprar(int cant){
        int err;
        if(cant>0 && cant<ArrayListPro.p.getStock()){
        if(ArrayListEF.us.getSueldof()>= ArrayListPro.p.getPrecio()*cant){
        DAOGraficoPed.Comprar(cant);
        try{
        err=BLLBDPed.nuevoPedBLL();
        }catch(Exception e){
            err=-111;
        }
        }else{
            err=-11;
        }
        
        return err;
        }
        return 0;
    }
    public static void Factura(){
        DAOGraficoPed.Factura();
        
    }
    public static void aviso(){
        if(ArrayListPro.p.getStock()<5)
        DAOGraficoPed.aviso();
    }
}
