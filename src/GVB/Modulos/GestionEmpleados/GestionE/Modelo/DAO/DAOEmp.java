package GVB.Modulos.GestionEmpleados.GestionE.Modelo.DAO;



import GVB.Modulos.GestionEmpleados.GestionE.Modelo.Classe.Empleado;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.EmpleadoFijo;
import GVB.Modulos.GestionEmpleados.GestionEH.Modelo.Classe.EmpleadoHoras;
import GVB.Modulos.GestionEmpleados.GestionET.Modelo.Classe.EmpleadoTemp;
import GVB.classes.Fechas;

public class DAOEmp {

    public static Empleado IntroEmp(int val, int valc, Empleado e, String nom, String dNI, String telf, float sueldof, Fechas fnac, Fechas fcontr, String email, String password, int estado, String tipo, String Avatar) {
        float sueldohoras = 0.0f, sueldoM = 0.0f;
        int antig = 0, horas = 0;
        Fechas Ffinal = null;
        

        if ((valc == 1) && (val == 1)) {
            ((EmpleadoFijo) e).setNombre(nom);
        }
        if ((valc == 1) && (val == 2)) {
            ((EmpleadoHoras) e).setNombre(nom);
        }
        if ((valc == 1) && (val == 3)) {
            ((EmpleadoTemp) e).setNombre(nom);
        }

        if ((valc == 1) && (val == 1)) {
            ((EmpleadoFijo) e).setdNi(dNI);
        }
        if ((valc == 1) && (val == 2)) {
            ((EmpleadoHoras) e).setdNi(dNI);
        }
        if ((valc == 1) && (val == 3)) {
            ((EmpleadoTemp) e).setdNi(dNI);
        }

        if ((valc == 1) && (val == 1)) {
            ((EmpleadoFijo) e).setTelef(telf);
        }
        if ((valc == 1) && (val == 2)) {
            ((EmpleadoHoras) e).setTelef(telf);
        }
        if ((valc == 1) && (val == 3)) {
            ((EmpleadoTemp) e).setTelef(telf);
        }

        if (valc == 1) {

            ((EmpleadoFijo) e).setSueldof(sueldof);
            ((EmpleadoFijo) e).setSueldoh(sueldof);
        }

																		// nacimiento
        if ((valc == 1) && (val == 1)) {
            ((EmpleadoFijo) e).setFnac(fnac);
        }
        if ((valc == 1) && (val == 2)) {
            ((EmpleadoHoras) e).setFnac(fnac);
        }
        if ((valc == 1) && (val == 3)) {
            ((EmpleadoTemp) e).setFnac(fnac);

        }

        if ((valc == 1) && (val == 1)) {
            antig = fcontr.restaFechasEdad();
            ((EmpleadoFijo) e).setFcontr(fcontr);
            ((EmpleadoFijo) e).setAntig(antig);
        }
        if ((valc == 1) && (val == 2)) {
            ((EmpleadoHoras) e).setFcontr(fcontr);
        }
        if ((valc == 1) && (val == 3)) {
            ((EmpleadoTemp) e).setFcontr(fcontr);
        }

        if ((valc == 1) && (val == 2)) {
            ((EmpleadoHoras) e).setSueldohoras(sueldohoras);
        }

        if ((valc == 1) && (val == 2)) {
            ((EmpleadoHoras) e).setHoras(horas);
        }

        if ((val == 3) && (valc == 1)) {
            ((EmpleadoTemp) e).setSueldoM(sueldoM);
        }

        if ((valc == 1) && (val == 3)) {
            ((EmpleadoTemp) e).setFfinal(Ffinal);
        }
if(val==1){
    ((EmpleadoFijo)e).setEmail(email);
    ((EmpleadoFijo)e).setPassword(password);
    ((EmpleadoFijo)e).setEstado(estado);
    ((EmpleadoFijo)e).setTipo(tipo);
    
    
}
        if ((val == 1) && (valc == 0)) {
            e = new EmpleadoFijo(nom, dNI, telf, fnac, fcontr, email, password, estado, tipo, Avatar, sueldof, antig);
        }
        if ((val == 2) && (valc == 0)) {
         //   e = new EmpleadoHoras(nom, dNI, telf, fnac, fcontr, sueldohoras, horas);
        }
        if ((val == 3) && (valc == 0)) {
          //  e = new EmpleadoTemp(nom, dNI, telf, fnac, fcontr, sueldoM, Ffinal);
        }

        return e;
    }

   /* public static void imprimir(ArrayList<? extends Empleado> l) {
        Empleado ef;
        String cad="";
        Iterator<Empleado> it = (Iterator<Empleado>) l.iterator();
        while (it.hasNext()) {
            ef = it.next();
            cad=cad+ef.toString()+"\n"+"\n";
            
        }
Vnt_Imprimir.Impresor.setText(cad);
    }*/
}
