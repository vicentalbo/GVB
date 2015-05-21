/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB;

import GVB.Librerias.Funcions;
import GVB.Modulos.GestionEmpleados.GestionE.Modelo.Classe.Empleado;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.BLL.EFBLLBD;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.ArrayListEF;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.EmpleadoFijo;
import GVB.classes.Fechas;


/**
 *
 * @author Vinche
 */
public class Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fechas f, fn, faux;
            
            int i=7;
             for (int j = 0; j <  i; j++) {
           f = Funcions.getFechaAleatoria();
            fn = Funcions.getFechaAleatoria();
            if (f.StringtoCalendar().before(fn.StringtoCalendar())) {
                faux = f;
                f = fn;
                fn = faux;
            }//String nombre, String dNi, String telef, Fechas fnac, Fechas fcontr, String email, String password, int estado, String tipo, String Avatar, float sueldof, int antig
            String email=Funcions.getCadenaAleatoria2(3)+"@"+Funcions.getCadenaAleatoria2(3)+".com";
            ArrayListEF.e = new EmpleadoFijo(Funcions.getCadenaAleatoria1(8), Funcions.getCadenaAleatoria2(9), Funcions.getCadenaAleatoria2(9), fn, f, email, "1234", 0, "user","src/GVB/img/Avatar/user-defec.png", 1200, f.restaFechasEdad());
            EFBLLBD.nuevoEFBLL();
            
            try {
                Thread.sleep(1); //1 milliseconds
            } catch (Exception e) {
                System.out.println(e);
            }
        
    }
    
    }
}
