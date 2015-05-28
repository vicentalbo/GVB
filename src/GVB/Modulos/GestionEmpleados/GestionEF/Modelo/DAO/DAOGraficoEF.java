/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionEmpleados.GestionEF.Modelo.DAO;

import static GVB.Modulos.GestionEmpleados.GestionE.Controlador.BLLControllerVntEmp.VntEmp;
import GVB.Modulos.GestionEmpleados.GestionE.Vista.Vnt_Empleados;
import com.toedter.calendar.JTextFieldDateEditor;

/**
 *
 * @author Vinche
 */
public class DAOGraficoEF {
    public static void LimpiarEF() {
        VntEmp.TxtDNI.setText("");
        
        VntEmp.TxtEdad.setText("");
        VntEmp.TxtNom.setText("");
        VntEmp.TxtSueldo.setText("");
        VntEmp.TxtTelef.setText("");
        VntEmp.NoDNI.setVisible(false);
        VntEmp.NoNom.setVisible(false);
        VntEmp.NoTelef.setVisible(false);
        VntEmp.NoSueldo.setVisible(false);
        VntEmp.NoFnac.setVisible(false);
        
        ((JTextFieldDateEditor) Vnt_Empleados.DCFnac.getDateEditor()).setText("");
        
        VntEmp.Password.setText("");
        VntEmp.TxtEmail.setText("");
    }
      public static float introSueldo(){
       float sueldo=0.0f;
        if (VntEmp.TxtSueldo.getText().isEmpty()) {
            VntEmp.NoSueldo.setVisible(true);
        } else {
            sueldo = Float.parseFloat(VntEmp.TxtSueldo.getText());
            if (sueldo == 0.0f) {
                VntEmp.NoSueldo.setVisible(true);
            }else{
                VntEmp.NoSueldo.setVisible(false);
            }
        }
        return sueldo;
   }
}
