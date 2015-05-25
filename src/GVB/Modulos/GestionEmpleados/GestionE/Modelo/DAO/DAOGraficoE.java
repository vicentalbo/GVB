 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionEmpleados.GestionE.Modelo.DAO;

import GVB.Modulos.GestionEmpleados.GestionE.Modelo.BLL.BLLGraficoE;
import GVB.Librerias.Funcions;
import GVB.Librerias.Validate;
import GVB.Modulos.GestionEmpleados.GestionE.Controlador.BLLControllerVntEmp;
import static GVB.Modulos.GestionEmpleados.GestionE.Controlador.BLLControllerVntEmp.VntEmp;
import GVB.Modulos.GestionEmpleados.GestionE.Modelo.BLL.BLL;
import GVB.Modulos.GestionEmpleados.GestionE.Modelo.DAO.DAO;
import GVB.Modulos.GestionEmpleados.GestionE.Modelo.DAO.DAOEmp;
import GVB.Modulos.GestionEmpleados.GestionE.Vista.Vnt_Empleados;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.BLL.EFBLLBD;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.ArrayListEF;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.EmpleadoFijo;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.DAO.DAOGraficoEF;
import GVB.Modulos.GestionLogin.Modelo.BLL.BLLLoginBD;
import GVB.classes.Config;
import GVB.classes.Fechas;
import GVB.classes.Mail;
import com.toedter.calendar.JTextFieldDateEditor;

/**
 *
 * @author Vinche
 */
public class DAOGraficoE {

    public static void crearEF() {
        String DNI, nombre, telef, email, password, tipo="user", Avatar = "src/GVB/img/Avatar/user-defec.png", encpassword;
        int estado = 0;
        float sueldo;
        Fechas f;
        Fechas fc;

        BLLControllerVntEmp.veri = false;

        DNI = introDNI(0);
        if (BLLControllerVntEmp.mod < 10) {

            ArrayListEF.e = new EmpleadoFijo(DNI);
            EFBLLBD.buscarPorDniBLL();
            try {
                if (ArrayListEF.e.getNombre().equals("")) {
                    VntEmp.NoDNI.setVisible(true);
                } else {
                    VntEmp.NoDNI.setVisible(false);
                }
            } catch (Exception e) {
                VntEmp.NoDNI.setVisible(false);
            }
        }
        nombre = introName(0);
        telef = introPhone(0);
        sueldo = DAOGraficoEF.introSueldo();
        email = introEmail();
        if (email.contains("@gmail.com")) {
            if (BLLControllerVntEmp.mod < 10) {
                ArrayListEF.e = new EmpleadoFijo(email, 0);
                BLLLoginBD.BuscarPorX(0);

                try {
                    if (ArrayListEF.e.getNombre().equals("")) {
                        VntEmp.NoEmail.setVisible(true);
                    } else {
                        VntEmp.NoEmail.setVisible(false);
                    }
                } catch (Exception e) {
                    VntEmp.NoEmail.setVisible(false);

                }
            }

        } else {
            VntEmp.NoEmail.setVisible(true);
        }
        password = VntEmp.Password.getText();
        encpassword = Funcions.encriptarTokenMD5(password);
        
        f = introFnac(0);
        fc = introFnac(1);

//creaEmp
        if ((VntEmp.NoDNI.isVisible() == false) && (VntEmp.NoNom.isVisible() == false) && (VntEmp.NoTelef.isVisible() == false) && (VntEmp.NoSueldo.isVisible() == false) && (VntEmp.NoFnac.isVisible() == false) && (VntEmp.NoFcontr.isVisible() == false) && (VntEmp.NoEmail.isVisible() == false) && (VntEmp.Password.getText().isEmpty() == false)) {
            if (BLLControllerVntEmp.mod == 1) {
                ArrayListEF.e = (EmpleadoFijo) DAOEmp.IntroEmp(1, 0, ArrayListEF.e, nombre, DNI, telef, sueldo, f, fc, email, encpassword, estado, tipo, Avatar);
                BLLControllerVntEmp.veri = true;

            }
            if (BLLControllerVntEmp.mod == 11) {
                ArrayListEF.e = (EmpleadoFijo) DAOEmp.IntroEmp(1, 1, ArrayListEF.e, nombre, DNI, telef, sueldo, f, fc, email, encpassword, ArrayListEF.e.getEstado(), ArrayListEF.e.getTipo(), ArrayListEF.e.getAvatar());
                BLLControllerVntEmp.veri = true;
                //VntEmp.TxtImpres.setText("Nombre= " + nombre + "\n" + "\n" + "DNI= " + DNI + "\n" + "\n" + "Telefono= " + telef + "\n" + "\n" + "Sueldo básico= " + sueldo + Config.getMoneda() + "\n" + "\n" + "Sueldo anual= " + (ArrayListEF.e).getSueldoh() + Config.getMoneda() + "\n" + "\n" + "Fecha de Nacimiento= " + ArrayListEF.e.getFnac().toString() + "\n" + "\n" + "Fecha de Contratación= " + ArrayListEF.e.getFcontr().toString() + "\n" + "\n" + "Edad= " + ArrayListEF.e.getEdad() + "\n" + "\n" + "Antigüedad= " + (ArrayListEF.e).getAntig()+"\n"+"\n"+"Email= "+ArrayListEF.e.getEmail()+"\n"+"\n"+"Usuario= "+ArrayListEF.e.getUsuario());

            }
            if ((BLLControllerVntEmp.mod == -1)) {

                ArrayListEF.e = (EmpleadoFijo) DAOEmp.IntroEmp(1, 0, ArrayListEF.e, nombre, DNI, telef, sueldo, f, fc, email, encpassword, estado, tipo, Avatar);
                String message = "Se ha registrado exitosamente en nuestra aplicación" + "\n" + "Usuario: " + ArrayListEF.e.getUsuario() + "\n" + "Contraseña: " + password + "\n" + "\n" + "Gracias por usar la aplicación";
                Mail correo = new Mail("1erdaw2015@gmail.com", "villadaw", email, nombre, message);
                String correoStr=correo.send();
                if(correoStr.equals("")){
                    Funcions.result("Se le ha enviado un email con los datos para verificar su cuenta");
                }
                BLLControllerVntEmp.veri = true;
            }
        }

    }

    public static String introName(int val) {
        String nombre = "";
        if (VntEmp.TxtNom.getText().isEmpty()) {
            VntEmp.NoNom.setVisible(true);
        } else {
            nombre = DAO.introNombre(VntEmp.TxtNom.getText());
            if (nombre.equals("-1")) {
                VntEmp.NoNom.setVisible(true);
            } else {
                VntEmp.NoNom.setVisible(false);

                if (val == 1) {
                    VntEmp.TxtDNI.requestFocus();
                }
            }
        }
        return nombre;
    }

    public static String introEmail() {
        String email = "";

        if (VntEmp.TxtEmail.getText().isEmpty()) {
            VntEmp.NoEmail.setVisible(true);
        } else {
            email = VntEmp.TxtEmail.getText();
            if (Validate.validaEmail(email) == false) {
                VntEmp.NoEmail.setVisible(true);
            } else {
                VntEmp.NoEmail.setVisible(false);
            }
        }

        return email;
    }

    public static String introDNI(int val) {
        String DNI = "";

        if (VntEmp.TxtDNI.getText().isEmpty()) {
            VntEmp.NoDNI.setVisible(true);
        } else {
            DNI = (VntEmp.TxtDNI.getText());
            if (DNI.equals("-1")) {
                VntEmp.NoDNI.setVisible(true);
            } else {

                VntEmp.NoDNI.setVisible(false);
                if (val == 1) {
                    VntEmp.TxtTelef.requestFocus();
                }
            }
        }
        return DNI;
    }

    public static String introPhone(int val) {
        String telef = "";
        if (VntEmp.TxtTelef.getText().isEmpty()) {
            VntEmp.NoTelef.setVisible(true);
        } else {
            telef = (VntEmp.TxtTelef.getText());
            if (telef.equals("-1")) {
                VntEmp.NoTelef.setVisible(true);
            } else {
                VntEmp.NoTelef.setVisible(false);
                if (val == 1) {
                    VntEmp.TxtSueldo.requestFocus();
                }
            }
        }
        return telef;
    }

    public static Fechas introFnac(int val) {
        String fnac, fcontr;
        Fechas f = null, fc = null;

        fnac = ((JTextFieldDateEditor) Vnt_Empleados.DCFnac.getDateEditor()).getText();
        fcontr = ((JTextFieldDateEditor) Vnt_Empleados.DCFcontr.getDateEditor()).getText();

        if (fnac.equals("")) {
            VntEmp.NoFnac.setVisible(true);
        } else {
            if (DAO.sacaFecha(fcontr).restaFechasEdad() - DAO.sacaFecha(fnac).restaFechasEdad() < 16) {
                VntEmp.NoFnac.setVisible(false);
                VntEmp.NoFcontr.setVisible(false);
                f = DAO.sacaFecha(fnac);
                fc = DAO.sacaFecha(fcontr);

                VntEmp.NoFnac.setVisible(false);
                VntEmp.TxtEdad.setText("" + f.restaFechasEdad());
                VntEmp.TxtAntig.setText("" + fc.restaFechasEdad());

            } else {
                VntEmp.NoFnac.setVisible(true);
            }
        }
        if (val == 1) {
            return fc;
        }
        return f;
    }

    public static void modif() {
        VntEmp.btnGuardar.setText("Guardar");
        Vnt_Empleados.PanelCrearEF.setVisible(true);

        VntEmp.TxtDNI.setEditable(false);

        VntEmp.TxtNom.setEditable(true);
        VntEmp.TxtSueldo.setEditable(true);
        VntEmp.TxtTelef.setEditable(true);
        BLLControllerVntEmp.mod = 11;
    }

}
