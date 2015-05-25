/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionEmpleados.GestionE.Modelo.BLL;

import GVB.Modulos.GestionEmpleados.GestionE.Controlador.BLLControllerVntEmp;
import GVB.Modulos.GestionEmpleados.GestionE.Modelo.BLL.BLL;
import GVB.Modulos.GestionEmpleados.GestionE.Modelo.DAO.DAOGraficoE;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.BLL.EFBLLBD;

import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.ArrayListEF;

import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.EmpleadoFijo;

import GVB.Utilities.Menus;
import GVB.classes.Config;
import com.toedter.calendar.JTextFieldDateEditor;


/**
 *
 * @author Vinche
 */
public class BLLGraficoE {

    public static int pos = 0;


    public static void modificar() {
        DAOGraficoE.crearEF();
        
    }

    public static void eliminar() {
        int opc;
        String[] boton = {"Sí", "Cancelar"};

        opc = Menus.menubasic("¿Está seguro de eliminar la información?", "Eliminar", boton);
        if (opc == 0) {
            BLL.eliminar(BLLControllerVntEmp.mod - 20);
            
        }
    }

    public static void eliminador() {
        BLLControllerVntEmp.mod = 21;
        BLLGraficoE.eliminar();

    }

    public static void Saves(int i) {
        Config.setSaves(i);
    }



}
