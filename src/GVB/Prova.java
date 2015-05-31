/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB;

import GVB.Modulos.GestionPedidos.Controlador.BLLControllerPedidos;
import GVB.Modulos.GestionPedidos.Vista.Paginador;
import GVB.Modulos.GestionProd.GestionProductos.Controlador.BLLControllerVntPro;
import GVB.Modulos.GestionProd.GestionProductos.Vista.Vnt_Productos;
import GVB.Modulos.Menu.Controlador.BLLControllerPpal;
import GVB.Modulos.Menu.Vista.About;










/**
 *
 * @author Vinche
 */
public class Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new BLLControllerPpal(new About(),1).iniciar(1);
}
}
