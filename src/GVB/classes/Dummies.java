package GVB.classes;

import GVB.Librerias.Funcions;
import GVB.Modulos.GestionEmpleados.GestionE.Modelo.Classe.Empleado;


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
           
            try {
                Thread.sleep(1); //1 milliseconds
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        }
}
