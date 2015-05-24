/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionProd.GestionProductos.Modelo.BLL;

import GVB.Librerias.Funcions;
import GVB.Librerias.json;
import GVB.Librerias.txt;
import GVB.Librerias.xml;
import GVB.Modulos.GestionProd.GestionProductos.Modelo.Classe.ArrayListPro;
import GVB.Modulos.GestionProd.GestionProductos.Modelo.Classe.Productos;
import GVB.classes.Config;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinche
 */
public class BLL {
   
 

    public static void eliminar(int val) {
        

        

            if (ArrayListPro.pro.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay productos creados para borrar", "Aviso",
                        JOptionPane.QUESTION_MESSAGE);
           // }
           // if (BLLGraficoP.pos == -1) {
            //    JOptionPane.showMessageDialog(null, "El DNI no concuerda con ninguno de los empleados creados",
           //             "Aviso", JOptionPane.QUESTION_MESSAGE);
            } else {
                
                BLLBDProd.borrarProdBLL();
            }
        

        
    }

    public static Productos Obtener(int pos) {
        Productos p = null;
      
            if (!ArrayListPro.pro.isEmpty()) {
                if ((pos >= 0) && (pos <= ArrayListPro.pro.size() - 1)) {
                    p = ArrayListPro.pro.get(pos);
                }
            } else {
                Funcions.result("ERROR" + "\n" + "No existen datos");
            }

        
        return p;
    }

   

    

    public static void GuardarTodo() {
        BLLBDProd.listAllProdBLL();
        if (Config.getSaves() == 1) {
            json.generajsonProd();
            //json.generajsonEH();
           // json.generajsonET();
        }
        if (Config.getSaves() == 2) {
            xml.generaxmlProd();
           // xml.generaxmlEH();
            //xml.generaxmlET();
        }
        if (Config.getSaves() == 3) {
            txt.generatxtProd();
           // txt.generatxtEH();
           // txt.generatxtET();
        }
    } 
}
