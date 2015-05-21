package GVB.Modulos.GestionEmpleados.GestionE.Modelo.DAO;


import GVB.Librerias.Validate;
import GVB.classes.Fechas;

public class DAO {

    public static int dia(String fecha) {
        int dia = 0;

        String[] fecha1;
        try {
            fecha1 = fecha.split("-");

            dia = Integer.parseInt(fecha1[0]);
        } catch (Exception e) {
            fecha1 = fecha.split("/");
            dia = Integer.parseInt(fecha1[0]);
        }
        return dia;
    }

    public static int mes(String fecha) {
        int mes = 0;
        String[] fecha1;

        
        try {
            fecha1 = fecha.split("-");
            mes = Integer.parseInt(fecha1[1]);
        } catch (Exception e) {
            fecha1 = fecha.split("/");
            mes = Integer.parseInt(fecha1[1]);
        }
        return mes;
    }

    public static int anno(String fecha) {
        int anno = 0;
        String[] fecha1;
        try {
            fecha1 = fecha.split("-");
            anno = Integer.parseInt(fecha1[2]);
        } catch (Exception e) {
            fecha1 = fecha.split("/");
            anno = Integer.parseInt(fecha1[2]);
        }
        return anno;
    }

    public static GVB.classes.Fechas sacaFecha(String fecha) {
        int dia, mes, anno;
        Fechas f;

        dia = DAO.dia(fecha);
        mes = DAO.mes(fecha);
        anno = DAO.anno(fecha);

        f = new Fechas(fecha, dia, mes, anno);
        return f;
    }

    public static String introNombre(String nom) {

        boolean interr;

        interr = Validate.validaNombre(nom);

        if (interr == false) {
            nom = "-1";
        }

        return nom;

    }

    public static String introDNI(String DNI) {

        boolean interr = false;

        interr = Validate.validaDNI(DNI);
        if (interr == false) {

            DNI = "-1";
        }

        return DNI;
    }

    public static String introTelef(String telf) {

        boolean interr = false;

        interr = Validate.validaTelf(telf);
        if (interr == false) {
            telf = "-1";
        }

        return telf;
    }

}
