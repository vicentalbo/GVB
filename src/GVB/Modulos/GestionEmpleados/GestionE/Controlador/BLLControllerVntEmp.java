/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionEmpleados.GestionE.Controlador;

import GVB.Librerias.Funcions;
import GVB.Modulos.GestionEmpleados.GestionE.Modelo.BLL.BLL;

import GVB.Modulos.GestionEmpleados.GestionE.Modelo.BLL.BLLGraficoE;

import GVB.Modulos.GestionEmpleados.GestionE.Vista.Vnt_Empleados;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.ArrayListEF;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.BLL.BLLGraficoEF;
import GVB.Modulos.GestionEmpleados.Pager.Controlador.BLLControllerPaginador;

import GVB.Modulos.GestionEmpleados.Pager.Vista.Paginador;
import GVB.Modulos.GestionLogin.Controlador.BLLControllerLogin;
import GVB.Modulos.GestionLogin.Vista.Login;
import GVB.Modulos.Menu.Controlador.BLLControllerAbout;
import GVB.Modulos.Menu.Controlador.BLLControllerPpal;
import static GVB.Modulos.Menu.Controlador.BLLControllerPpal.Ppal;
import GVB.Modulos.Menu.Vista.About;
import GVB.Modulos.Menu.Vista.Ventana_ppal;
import GVB.classes.Config;
import GVB.classes.Files_Usuario;
import com.toedter.calendar.JTextFieldDateEditor;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 *
 * @author Vinche
 */
public class BLLControllerVntEmp implements ActionListener, KeyListener, MouseListener {

    public static int mod = 0;

    public static Vnt_Empleados VntEmp = new Vnt_Empleados();
    public static boolean veri = false;

    @Override
    public void keyTyped(KeyEvent e) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //To change body of generated methods, choose Tools | Templates.
    }

  
   

    @Override
    public void mousePressed(MouseEvent e) {
//0
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//0
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//0
    }

    @Override
    public void mouseExited(MouseEvent e) {
//0
    }

    public enum Accion {

        btn_Guardar,
        btn_Limpiar,
        Txt_Nom,
        Txt_DNI,
        Txt_Telef,
        Txt_Sueldo,
        _VOLVER,
        Menu_Guardar,
        _ABOUT,
        Forma_Json,
        Forma_Xml,
        Forma_Txt,
        _CONF_MONEDA_EURO,
        _CONF_MONEDA_DOLAR,
        _CONF_MONEDA_LIBRA,
        _CONF_DEC_1,
        _CONF_DEC_2,
        _CONF_DEC_3,
        _CONF_FECHA_1,
        _CONF_FECHA_2,
        _CONF_FECHA_3,
        _CONF_FECHA_4,
        _CONF_FECHA_5,
        _CONF_FECHA_6,
        _PASSWORD,
        _EMAIL,
        _TIPO, 
        USUARIO,
        IMAGEN

    }

    public BLLControllerVntEmp(JFrame C_Empleados) {

        VntEmp = (Vnt_Empleados) C_Empleados;

    }

    public void iniciar() {
        this.VntEmp.setTitle("Empleados");
        this.VntEmp.setLocationRelativeTo(null);
        this.VntEmp.setVisible(true);
        this.VntEmp.setResizable(false);
        Image icono = Toolkit.getDefaultToolkit().getImage("src/GVB/img/V.jpg");
        this.VntEmp.setIconImage(icono);

        this.VntEmp.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
VntEmp.UsOk.setVisible(false);
        this.VntEmp.NoDNI.setVisible(false);
        this.VntEmp.NoNom.setVisible(false);
        this.VntEmp.NoSueldo.setVisible(false);
        this.VntEmp.NoTelef.setVisible(false);
        this.VntEmp.NoFnac.setVisible(false);
        this.VntEmp.NoFcontr.setVisible(false);
        this.VntEmp.NoEmail.setVisible(false);
        if(mod==1){
            this.VntEmp.Imagen.setVisible(false);
        }
        if (mod == -1) {
            this.VntEmp.setTitle("Registrar");
            this.VntEmp.Imagen.setVisible(false);
        }
        if (mod >1) {
            try {
                Files_Usuario.pintar(VntEmp.Imagen, VntEmp.Usuario);
            } catch (Exception e) {

            }
        }
        if (mod > 10) {
           
            this.VntEmp.TxtDNI.setEditable(false);
            this.VntEmp.TxtNom.setEditable(true);
            this.VntEmp.TxtSueldo.setEditable(true);
            this.VntEmp.TxtTelef.setEditable(true);
            this.VntEmp.TxtDNI.setText(ArrayListEF.e.getdNi());
            this.VntEmp.TxtNom.setText(ArrayListEF.e.getNombre());
            this.VntEmp.TxtTelef.setText(ArrayListEF.e.getTelef());
            this.VntEmp.TxtSueldo.setText("" + (ArrayListEF.e.getSueldof()));
            this.VntEmp.TxtAntig.setText("" + ArrayListEF.e.getAntig());
            this.VntEmp.TxtEdad.setText("" + ArrayListEF.e.getEdad());
            
            try {

                ((JTextFieldDateEditor) Vnt_Empleados.DCFnac.getDateEditor()).setText(ArrayListEF.e.getFnac().toString());
                ((JTextFieldDateEditor) Vnt_Empleados.DCFcontr.getDateEditor()).setText(ArrayListEF.e.getFcontr().toString());
            } catch (Exception e) {
                this.VntEmp.DCFnac.setCalendar(ArrayListEF.e.getFnac().StringtoCalendar());
                this.VntEmp.DCFcontr.setCalendar(ArrayListEF.e.getFcontr().StringtoCalendar());
            }
            this.VntEmp.Password.setText("");
            this.VntEmp.TxtEmail.setText(ArrayListEF.e.getEmail());

        }
        this.VntEmp.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                JOptionPane.showMessageDialog(null, "Saliendo de la aplicación");
                VntEmp.dispose();
                System.exit(0);
            }
        });
        this.VntEmp.btnGuardar.setActionCommand("btn_Guardar");
        this.VntEmp.btnGuardar.addActionListener(this);

        this.VntEmp.btnLimpiar.setActionCommand("btn_Limpiar");
        this.VntEmp.btnLimpiar.addActionListener(this);

        this.VntEmp.TxtNom.setActionCommand("Txt_Nom");
        this.VntEmp.TxtNom.addActionListener(this);
        this.VntEmp.TxtNom.addKeyListener(this);

        this.VntEmp.TxtDNI.setActionCommand("Txt_DNI");
        this.VntEmp.TxtDNI.addActionListener(this);
        this.VntEmp.TxtDNI.addKeyListener(this);

        this.VntEmp.TxtTelef.setActionCommand("Txt_Telef");
        this.VntEmp.TxtTelef.addActionListener(this);
        this.VntEmp.TxtTelef.addKeyListener(this);

        this.VntEmp.TxtSueldo.setActionCommand("Txt_Sueldo");
        this.VntEmp.TxtSueldo.addActionListener(this);
        this.VntEmp.TxtSueldo.addKeyListener(this);

        this.VntEmp.TxtEdad.setActionCommand("Txt_Edad");
        this.VntEmp.TxtEdad.addActionListener(this);

        this.VntEmp.TxtAntig.setActionCommand("Txt_Antig");
        this.VntEmp.TxtAntig.addActionListener(this);

        this.VntEmp.VOLVER.setActionCommand("_VOLVER");
        this.VntEmp.VOLVER.addActionListener(this);

        this.VntEmp.MenuGuardar.setActionCommand("Menu_Guardar");
        this.VntEmp.MenuGuardar.addActionListener(this);

        this.VntEmp.ABOUT.setActionCommand("_ABOUT");
        this.VntEmp.ABOUT.addActionListener(this);

        this.VntEmp.FormaJson.setActionCommand("Forma_Json");
        this.VntEmp.FormaJson.addActionListener(this);

        this.VntEmp.FormaXml.setActionCommand("Forma_Xml");
        this.VntEmp.FormaXml.addActionListener(this);

        this.VntEmp.FormaTxt.setActionCommand("Forma_Txt");
        this.VntEmp.FormaTxt.addActionListener(this);

        this.VntEmp.CONF_MONEDA_EURO.setActionCommand("_CONF_MONEDA_EURO");
        this.VntEmp.CONF_MONEDA_EURO.addActionListener(this);

        this.VntEmp.CONF_MONEDA_DOLAR.setActionCommand("_CONF_MONEDA_DOLAR");
        this.VntEmp.CONF_MONEDA_DOLAR.addActionListener(this);

        this.VntEmp.CONF_MONEDA_LIBRA.setActionCommand("_CONF_MONEDA_LIBRA");
        this.VntEmp.CONF_MONEDA_LIBRA.addActionListener(this);

        this.VntEmp.CONF_FECHA_1.setActionCommand("_CONF_FECHA_1");
        this.VntEmp.CONF_FECHA_1.addActionListener(this);

        this.VntEmp.CONF_FECHA_2.setActionCommand("_CONF_FECHA_2");
        this.VntEmp.CONF_FECHA_2.addActionListener(this);

        this.VntEmp.CONF_FECHA_3.setActionCommand("_CONF_FECHA_3");
        this.VntEmp.CONF_FECHA_3.addActionListener(this);

        this.VntEmp.CONF_FECHA_4.setActionCommand("_CONF_FECHA_4");
        this.VntEmp.CONF_FECHA_4.addActionListener(this);

        this.VntEmp.CONF_FECHA_5.setActionCommand("_CONF_FECHA_5");
        this.VntEmp.CONF_FECHA_5.addActionListener(this);

        this.VntEmp.CONF_FECHA_6.setActionCommand("_CONF_FECHA_6");
        this.VntEmp.CONF_FECHA_6.addActionListener(this);

        this.VntEmp.Password.setActionCommand("_PASSWORD");
        this.VntEmp.Password.addActionListener(this);
        //this.VntEmp.Password.addKeyListener(this);

        this.VntEmp.TxtEmail.setActionCommand("_EMAIL");
        this.VntEmp.TxtEmail.setName("_EMAIL");
        this.VntEmp.TxtEmail.addActionListener(this);
        this.VntEmp.TxtEmail.addKeyListener(this);
        
        this.VntEmp.Usuario.setName("USUARIO");
        this.VntEmp.Usuario.addMouseListener(this);
        
        this.VntEmp.Imagen.setName("IMAGEN");
        this.VntEmp.Imagen.addMouseListener(this);

    }
    @Override
 public void mouseClicked(MouseEvent e) {
        switch (BLLControllerVntEmp.Accion.valueOf(e.getComponent().getName())) {
            case USUARIO:
                ArrayListEF.e = ArrayListEF.us;
                BLLControllerVntEmp.mod = 11;
                VntEmp.dispose();
                new BLLControllerVntEmp(new Vnt_Empleados()).iniciar();
                break;
                
                case IMAGEN:
                    String avatar;
                    if(mod>0)
                    Files_Usuario.pintar_guardar_imag(VntEmp.Imagen, 60, 60, 1);
                    else{
                        
                        try{
                            ArrayListEF.e.getdNi();
                            Files_Usuario.pintar_guardar_imag(VntEmp.Imagen, 60, 60, 1);
                            
                        }catch(Exception err){
                            Funcions.result("Debe guardar primero el perfil completo");
                        }
                    }
                    break;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        switch (BLLControllerVntEmp.Accion.valueOf(e.getComponent().getName())) {
            case Txt_DNI:
                BLLGraficoEF.introDNI(0);
                break;

            case Txt_Nom:
                BLLGraficoEF.introName(0);
                break;

            case Txt_Telef:
                BLLGraficoEF.introPhone(0);
                break;

            case Txt_Sueldo:
                BLLGraficoEF.introSueldo();

                break;
            case _EMAIL:
                BLLGraficoEF.introEmail();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (BLLControllerVntEmp.Accion.valueOf(e.getActionCommand())) {

            case btn_Guardar:
                BLLGraficoEF.crearEF();
                if ((mod == -1) && (veri = true)) {
                    ArrayListEF.us = ArrayListEF.e;
                    VntEmp.dispose();
                    new BLLControllerLogin(new Login()).iniciar();
                }
                break;

            case btn_Limpiar:
                BLLGraficoEF.Limpiar();
                break;

            case Txt_Nom:
                BLLGraficoEF.introName(1);
                break;

            case Txt_DNI:
                BLLGraficoEF.introDNI(1);
                break;

            case Txt_Telef:
                BLLGraficoEF.introPhone(1);
                break;

            case Txt_Sueldo:
                BLLGraficoEF.introSueldo();
                break;

            case _VOLVER:
                if (mod > 0) {
                    VntEmp.dispose();
                    new BLLControllerPaginador(new Paginador()).Iniciar();
                } else {
                    VntEmp.dispose();
                    new BLLControllerLogin(new Login()).iniciar();
                }
                break;

            case Menu_Guardar:
                BLL.GuardarTodo();
                break;

            case _ABOUT:

                VntEmp.dispose();
                new BLLControllerAbout(new About()).iniciar();
                break;

            case Forma_Json:
                BLLGraficoE.Saves(1);
                break;

            case Forma_Xml:
                BLLGraficoE.Saves(2);
                break;

            case Forma_Txt:
                BLLGraficoE.Saves(3);
                break;

            case _CONF_MONEDA_EURO:
                Config.setMoneda('€');
                break;

            case _CONF_MONEDA_DOLAR:
                Config.setMoneda('$');
                break;

            case _CONF_MONEDA_LIBRA:
                Config.setMoneda('£');
                break;

            case _CONF_DEC_1:
                Config.setDecimal("1");
                break;

            case _CONF_DEC_2:
                Config.setDecimal("2");
                break;

            case _CONF_DEC_3:
                Config.setDecimal("3");
                break;

            case _CONF_FECHA_1:
                Config.setFormaFecha("1");
                break;

            case _CONF_FECHA_2:
                Config.setFormaFecha("2");
                break;

            case _CONF_FECHA_3:
                Config.setFormaFecha("3");
                break;

            case _CONF_FECHA_4:
                Config.setFormaFecha("4");
                break;

            case _CONF_FECHA_5:
                Config.setFormaFecha("5");
                break;

            case _CONF_FECHA_6:
                Config.setFormaFecha("6");
                break;

            case _PASSWORD:

                break;

            case _EMAIL:

                break;

            case _TIPO:

                break;
        }
    }
}
