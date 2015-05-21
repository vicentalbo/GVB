package GVB.Modulos.GestionEmpleados.GestionE.Modelo.BLL;

import javax.swing.JOptionPane;

import GVB.Librerias.Funcions;
import GVB.Librerias.json;
import GVB.Librerias.txt;
import GVB.Librerias.xml;
import GVB.Modulos.GestionEmpleados.GestionE.Modelo.Classe.Empleado;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.BLL.EFBLLBD;

import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.ArrayListEF;
import GVB.Modulos.GestionEmpleados.GestionEH.Modelo.Classe.ArrayListEH;
import GVB.Modulos.GestionEmpleados.GestionET.Modelo.Classe.ArrayListET;

import GVB.classes.Config;

public class BLL {

    public static int buscar(Empleado ef, int val) {
        int aux = -1;
        if (val == 0) {
            for (int i = 0; i <= (ArrayListEF.efi.size() - 1); i++) {
                if ((ArrayListEF.efi.get(i)).equals(ef)) {
                    aux = i;
                }

                if ((ArrayListEH.eho.get(i)).equals(ef)) {
                    aux = i + 100;
                }

                if ((ArrayListET.ete.get(i)).equals(ef)) {
                    aux = i + 200;
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

        if (val == 2) {
            for (int i = 0; i <= (ArrayListEH.eho.size() - 1); i++) {
                if ((ArrayListEH.eho.get(i)).equals(ef)) {
                    aux = i;
                }
            }
        }

        if (val == 3) {
            for (int i = 0; i <= (ArrayListET.ete.size() - 1); i++) {
                if ((ArrayListET.ete.get(i)).equals(ef)) {
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

        if (val == 2) {

            if (ArrayListEH.eho.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay empleados creados para borrar", "Aviso",
                        JOptionPane.QUESTION_MESSAGE);
            }
            if (BLLGraficoE.pos == -1) {
                JOptionPane.showMessageDialog(null, "El DNI no concuerda con ninguno de los empleados creados",
                        "Aviso", JOptionPane.QUESTION_MESSAGE);
            } else {
               
                ArrayListEH.eho.remove(BLLGraficoE.pos);
            }
        }
        if (val == 3) {
            if (ArrayListET.ete.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay empleados creados para borrar", "Aviso",
                        JOptionPane.QUESTION_MESSAGE);
            }
            if (BLLGraficoE.pos == -1) {
                JOptionPane.showMessageDialog(null, "El DNI no concuerda con ninguno de los empleados creados",
                        "Aviso", JOptionPane.QUESTION_MESSAGE);
            } else {
               
                ArrayListET.ete.remove(BLLGraficoE.pos);
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
        if (val == 2) {
            if (!ArrayListEH.eho.isEmpty()) {
                if ((pos >= 0) && (pos <= ArrayListEH.eho.size() - 1)) {
                    e = (Empleado) ArrayListEH.eho.get(pos);
                }
            } else {
                Funcions.result("ERROR" + "\n" + "No existen datos");
            }
        }
        if (val == 3) {
            if (!ArrayListET.ete.isEmpty()) {
                if ((pos >= 0) && (pos <= ArrayListET.ete.size() - 1)) {
                    e = (Empleado) ArrayListET.ete.get(pos);
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
            //json.generajsonEH();
           // json.generajsonET();
        }
        if (Config.getSaves() == 2) {
            xml.generaxmlEF();
           // xml.generaxmlEH();
            //xml.generaxmlET();
        }
        if (Config.getSaves() == 3) {
            txt.generatxtEF();
           // txt.generatxtEH();
           // txt.generatxtET();
        }
    }

    
}
