package GVB.Librerias;

import GVB.classes.Fechas;
import java.util.Random;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;
public class Funcions {


    
    public static String encriptarTokenMD5(String name){
            String cadena_encriptada = DigestUtils.md5Hex(name);
            return cadena_encriptada;
	}
	
	public static boolean validarTokenMD5(String cadenaAleatoria, String cadena_encriptada){
		if(encriptarTokenMD5(cadenaAleatoria).equals(cadena_encriptada))
			return true;
		return false;
	}
  

    public static String getCadenaAleatoria1(int longitud) {
        String cadenaAleatoria = "";
        long milis = new java.util.GregorianCalendar().getTimeInMillis();
        Random r = new Random(milis);
        int i = 0;
        while (i < longitud) {
            char c = (char) r.nextInt(255);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                cadenaAleatoria += c;
                i++;
            }
        }
        return cadenaAleatoria;
    }

    public static String getCadenaAleatoria2(int longitud) {
        String cadenaAleatoria = "";
        long milis = new java.util.GregorianCalendar().getTimeInMillis();
        Random r = new Random(milis);
        int i = 0;
        while (i < longitud) {
            char c = (char) r.nextInt(255);
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
                cadenaAleatoria += c;
                i++;
            }
        }
        return cadenaAleatoria;
    }

    public static Fechas getFechaAleatoria() {
//by Vicent Albert
        String cad;
        int d = 0, m = 0, y = 0, i = 0;
        Random r = new Random();
        while (i < 3) {
            if (i == 0) {
                d = r.nextInt(28);
                if ((d > 0) && (d < 29)) {
                    i++;
                }
            }
            if (i == 1) {
                m = r.nextInt(12);
                if ((m > 0) && (m < 13)) {
                    i++;
                }
            }
            if (i == 2) {
                y = r.nextInt(2015);
                if ((y > 1950) && (y < 2016)) {
                    i++;
                }
            }
        }
        cad = +d + "-" + m + "-" + y;
        Fechas f = new Fechas(cad, d, m, y);
        
        return f;
    }

  

    public static String introstring(String msgString) {

        String dato = "";
        boolean interr = false;
        do {

            try {

                dato = JOptionPane.showInputDialog(null, msgString, "Introduccion", JOptionPane.QUESTION_MESSAGE);

                if (dato == null) {
                    JOptionPane.showMessageDialog(null, "Cerrando aplicacion");
                    System.exit(0);
                } else {

                    interr = true;

                }

            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
                JOptionPane.showMessageDialog(null, "introduce una string valida");
                interr = false;
            }

        } while (interr == false);
        return dato;
    }

    /**
     * Funcion de showmessagedialog generica
     *
     * @param metodo Aqu� entra la cadena de texto que se mostrar� en la ventana
     */
    public static void result(String metodo) { // funcion de salida de datos
        // (resultado)
        JOptionPane.showMessageDialog(null, metodo);
    }

    /**
     * Funcion de entrada de float
     *
     * @return Devuelve el numero float introducido ya comprobado.
     */
    public static float introfloat(String msgfloat) { // funcion de peticion de
        // float
        float num = 0.0f;
        String dato = "";
        boolean interr = false;
        do {

            try {

                dato = JOptionPane.showInputDialog(null, msgfloat, "Introduccion", JOptionPane.QUESTION_MESSAGE);

                if (dato == null) {
                    JOptionPane.showMessageDialog(null, "Cerrando aplicacion");
                    System.exit(0);
                } else {
                    num = Float.parseFloat(dato);

                    interr = true;

                }

            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
                JOptionPane.showMessageDialog(null, "introduce un numero valido");
                interr = false;
            }

        } while (interr == false);
        return num;
    }

    /**
     * Funcion de entrada de char
     *
     * @return Devuelve la letra char ya comprobada.
     */
    public static char introchar() { // funcion de peticion de char
        char letra = ' ';
        String dato = "";
        boolean interr = false;
        do {

            try {

                dato = JOptionPane.showInputDialog(null, "Introduce una letra", "Introduccion",
                        JOptionPane.QUESTION_MESSAGE);

                if (dato == null) {
                    JOptionPane.showMessageDialog(null, "Cerrando aplicacion");
                    System.exit(0);
                } else {
                    letra = dato.charAt(0);

                    interr = true;

                }

            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
                JOptionPane.showMessageDialog(null, "introduce un numero valido");
                interr = false;
            }

        } while (interr == false);
        return letra;
    }

    /**
     * Funcion de salida del programa
     */
    public static void salir() { // funcion de salida del programa
        JOptionPane.showMessageDialog(null, "Gracias por usar esta aplicaci�n");
        System.exit(0);
    }

    /**
     * Funcion de entrada de int
     *
     * @param msgint Aqu� entra la cadena de texto a mostrar en la ventana.
     * @return Devuelve el numero int introducido ya comprobado.
     */
    public static int introint(String msgint) { // funcion de peticion de int
        int num = 0;
        String dato = "";
        boolean interr = false;
        do {

            try {

                dato = JOptionPane.showInputDialog(null, msgint, "Introduccion", JOptionPane.QUESTION_MESSAGE);

                if (dato == null) {
                    JOptionPane.showMessageDialog(null, "Cerrando aplicacion");
                    System.exit(0);
                } else {
                    num = Integer.parseInt(dato);

                    interr = true;

                }

            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
                JOptionPane.showMessageDialog(null, "introduce un numero valido");
                interr = false;
            }

        } while (interr == false);
        return num;
    }

}
