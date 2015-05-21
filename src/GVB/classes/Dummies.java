package GVB.classes;

import GVB.Librerias.Funcions;
import GVB.Modulos.GestionEmpleados.GestionE.Modelo.Classe.Empleado;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.ArrayListEF;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.EmpleadoFijo;

public class Dummies {

	
        public static void generarDummies(int i){
            Fechas f, fn, faux;
            Empleado em;
             for (int j = 0; j <  i; j++) {
           f = Funcions.getFechaAleatoria();
            fn = Funcions.getFechaAleatoria();
            if (f.StringtoCalendar().before(fn.StringtoCalendar())) {
                faux = f;
                f = fn;
                fn = faux;
            }
         //   em = new EmpleadoFijo(Funcions.getCadenaAleatoria1(8), Funcions.getCadenaAleatoria2(9), Funcions.getCadenaAleatoria2(9), fn, f, 1200, f.restaFechasEdad());
         //   ArrayListEF.efi.add((EmpleadoFijo)em);
            
            try {
                Thread.sleep(1); //1 milliseconds
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        }
}
