package GVB.Modulos.GestionEmpleados.GestionE.Modelo.DAO;



import GVB.Modulos.GestionEmpleados.GestionE.Modelo.Classe.Empleado;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.EmpleadoFijo;

import GVB.classes.Fechas;

public class DAOEmp {

    public static Empleado IntroEmp(int val, int valc, Empleado e, String nom, String dNI, String telf, float sueldof, Fechas fnac, Fechas fcontr, String email, String password, int estado, String tipo, String Avatar) {

        int antig = 0;

        

        if ((valc == 1) && (val == 1)) {
            ((EmpleadoFijo) e).setNombre(nom);
        }
       

        if ((valc == 1) && (val == 1)) {
            ((EmpleadoFijo) e).setdNi(dNI);
        }
        

        if ((valc == 1) && (val == 1)&&(tipo.equals("cliente"))) {
            ((EmpleadoFijo) e).setTelef(telf);
        }
       

        if ((valc == 1)&&(tipo.equals("cliente"))) {

            ((EmpleadoFijo) e).setSueldof(sueldof);
            ((EmpleadoFijo) e).setSueldoh(sueldof);
        }


        if ((valc == 1) && (val == 1)) {
            ((EmpleadoFijo) e).setFnac(fnac);
        }
        

        if ((valc == 1) && (val == 1)) {
            antig = fcontr.restaFechasEdad();
            ((EmpleadoFijo) e).setFcontr(fcontr);
            ((EmpleadoFijo) e).setAntig(antig);
        }
        
if(val==1){
    ((EmpleadoFijo)e).setEmail(email);
    ((EmpleadoFijo)e).setPassword(password);
    ((EmpleadoFijo)e).setEstado(estado);
    ((EmpleadoFijo)e).setTipo(tipo);
    
    
}
        if ((val == 1) && (valc == 0)) {
           if(tipo.equals("cliente")) 
            e = new EmpleadoFijo(nom, dNI, telf, fnac, fcontr, email, password, estado, tipo, Avatar, sueldof, fcontr.restaFechasEdad(), 0);
        else
        e = new EmpleadoFijo(nom, dNI,  fnac, fcontr, email, password, estado, tipo, Avatar,  fcontr.restaFechasEdad());
        }
       

        return e;
    }


}
