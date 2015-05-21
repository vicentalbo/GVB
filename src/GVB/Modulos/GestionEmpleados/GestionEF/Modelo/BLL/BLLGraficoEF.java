/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionEmpleados.GestionEF.Modelo.BLL;


import GVB.Modulos.GestionEmpleados.GestionE.Controlador.BLLControllerVntEmp;
import static GVB.Modulos.GestionEmpleados.GestionE.Controlador.BLLControllerVntEmp.VntEmp;
import GVB.Modulos.GestionEmpleados.GestionE.Modelo.BLL.BLLGraficoE;
import GVB.Modulos.GestionEmpleados.GestionE.Modelo.DAO.DAOGraficoE;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.ArrayListEF;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.DAO.DAOGraficoEF;




/**
 *
 * @author Vinche
 */
public class BLLGraficoEF {
public static void Limpiar(){
    DAOGraficoEF.LimpiarEF();
}
public static void introName(int i){
    DAOGraficoE.introName(i);
}
public static void introDNI(int i){
    DAOGraficoE.introDNI(i);
}
public static void introPhone(int i){
    DAOGraficoE.introPhone(i);
}
public static void introSueldo(){
    DAOGraficoEF.introSueldo();
}
public static void introEmail(){
    DAOGraficoE.introEmail();
}
public static void crearEF() {
        
        
        if (BLLControllerVntEmp.mod < 10) {
             DAOGraficoE.crearEF();
            if (BLLControllerVntEmp.veri == true){
            EFBLLBD.nuevoEFBLL();
            VntEmp.UsOk.setVisible(true);
            }
        }
        if (BLLControllerVntEmp.mod > 10) {
            BLLGraficoE.modificar();
            if(BLLControllerVntEmp.veri==true)
           EFBLLBD.modificarEFBLL();
             VntEmp.UsOk.setVisible(true);
        }
       
        if(BLLControllerVntEmp.veri==true){
        EFBLLBD.listAllEFBLL();
       
     
        }
    }
}
