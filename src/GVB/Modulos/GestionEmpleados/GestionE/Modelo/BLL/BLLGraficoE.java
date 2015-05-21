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
/**public static void combo(){
    List<String> Llista = new ArrayList<String>();
        for (int i = 0; i < ArrayListEF.efi.size(); i++) {
            Llista.add(ArrayListEF.efi.get(i).getdNi());
        }
        StringSearchable searchable = new StringSearchable(Llista);
        Paginador.filtraCombo = new AutocompleteJComboBox(searchable);
}
 **/
 /*   public static void Selector() {

        Vnt_Empleados.TxtNom.setText(ArrayListEF.e.getNombre());
        Vnt_Empleados.TxtDNI.setText(ArrayListEF.e.getdNi());
        Vnt_Empleados.TxtTelef.setText(ArrayListEF.e.getTelef());
        if ((Vnt_Empleados.mod == 11) || (Vnt_Empleados.mod == 21)) {
            Vnt_Empleados.TxtSueldo.setText("" + ((EmpleadoFijo) ArrayListEF.e).getSueldof());
            Vnt_Empleados.TxtAntig.setText("" + ((EmpleadoFijo) ArrayListEF.e).getAntig());
        }
        Vnt_Empleados.TxtEdad.setText("" + ArrayListEF.e.getEdad());
        try {
            ((JTextFieldDateEditor) Vnt_Empleados.DCFnac.getDateEditor()).setText(ArrayListEF.e.getFnac().toString());
            ((JTextFieldDateEditor) Vnt_Empleados.DCFcontr.getDateEditor()).setText(ArrayListEF.e.getFcontr().toString());
        } catch (Exception e) {
            
        }
    }*/

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

 /*   public static void modif() {
        DAOGraficoE.modif();
    }*/

}
