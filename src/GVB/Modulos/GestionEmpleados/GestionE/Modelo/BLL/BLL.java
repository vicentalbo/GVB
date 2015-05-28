package GVB.Modulos.GestionEmpleados.GestionE.Modelo.BLL;

import javax.swing.JOptionPane;

import GVB.Librerias.Funcions;
import GVB.Librerias.json;
import GVB.Librerias.txt;
import GVB.Librerias.xml;
import GVB.Modulos.GestionEmpleados.GestionE.Modelo.Classe.Empleado;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.BLL.EFBLLBD;

import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.ArrayListEF;


import GVB.classes.Config;

public class BLL {

    public static int buscar(Empleado ef, int val) {
        int aux = -1;
        if (val == 0) {
            for (int i = 0; i <= (ArrayListEF.efi.size() - 1); i++) {
                if ((ArrayListEF.efi.get(i)).equals(ef)) {
                    aux = i;
                }

               
            }
        }
        if (val == 1) {
            for (int i = 0; i <= (ArrayListEF.efi.size() - 1); i++) {
                if ((ArrayListEF.efi.get(i)).equals(ef)) {
                    aux = i;
                }
            }
        }

        
        return aux;
    }

 

    public static void eliminar(int val) {
        

        if (val == 1) {

            if (ArrayListEF.efi.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay empleados creados para borrar", "Aviso",
                        JOptionPane.QUESTION_MESSAGE);
            }
            if (BLLGraficoE.pos == -1) {
                JOptionPane.showMessageDialog(null, "El DNI no concuerda con ninguno de los empleados creados",
                        "Aviso", JOptionPane.QUESTION_MESSAGE);
            } else {
                
                EFBLLBD.borrarEFBLL();
            }
        }

       
    }

    public static Empleado Obtener(int pos, int val) {
        Empleado e = null;
        if (val == 1) {
            if (!ArrayListEF.efi.isEmpty()) {
                if ((pos >= 0) && (pos <= ArrayListEF.efi.size() - 1)) {
                    e = (Empleado) ArrayListEF.efi.get(pos);
                }
            } else {
                Funcions.result("ERROR" + "\n" + "No existen datos");
            }

        }
       
        return e;
    }

   

    

    public static void GuardarTodo() {
        EFBLLBD.listAllEFBLL();
        if (Config.getSaves() == 1) {
            json.generajsonEF();
         
        }
        if (Config.getSaves() == 2) {
            xml.generaxmlEF();
        
        }
        if (Config.getSaves() == 3) {
            txt.generatxtEF();
     
        }
    }

    
}
