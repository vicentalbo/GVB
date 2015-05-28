/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.Menu.Controlador;

import GVB.Modulos.GestionEmpleados.GestionE.Controlador.BLLControllerVntEmp;
import GVB.Modulos.GestionEmpleados.GestionE.Vista.Vnt_Empleados;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.ArrayListEF;
import GVB.Modulos.GestionEmpleados.Pager.Controlador.BLLControllerPaginador;
import GVB.Modulos.GestionEmpleados.Pager.Vista.Paginador;
import GVB.Modulos.GestionLogin.Controlador.BLLControllerLogin;
import GVB.Modulos.GestionLogin.Vista.Login;
import GVB.Modulos.GestionProd.GestionProductos.Modelo.BLL.BLL;
import GVB.Modulos.GestionProd.GestionProductos.Modelo.BLL.BLLGraficoP;
import static GVB.Modulos.GestionProd.Pager.Controlador.BLLControllerPaginador.Pag;
import GVB.Modulos.Menu.Vista.About;
import GVB.Modulos.Menu.Vista.Ventana_Us;
import GVB.Modulos.Menu.Vista.Ventana_ppal;
import GVB.classes.Config;
import GVB.classes.Files_Usuario;
import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author Vinche
 */
public class BLLControllerPpal implements ActionListener, MouseListener {

    public static Ventana_Us Us = new Ventana_Us();
    public static Ventana_ppal Ppal = new Ventana_ppal();
public static About Ab = new About();
    public enum Accion {

        EMPLEADOS,
        PRODUCTOS,
        RESERVAS,
        PEDIDOS,
        Perf,
        Prods,
        Logout,
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
        USUARIO,
        IMAGEN
    }
public BLLControllerPpal(JFrame Ppal1, int i) {
if((i==0)){
    if(ArrayListEF.us.getTipo().equals("admin"))
        Ppal = (Ventana_ppal) Ppal1;
    else
        Us=(Ventana_Us) Ppal1;
}
if(i==1)
    Ab = (About) Ppal1;
    }

    
    public void iniciar(int val) {
        if((ArrayListEF.us.getTipo().equals("admin"))&&(val==0)){
        Ppal.setTitle("Inicio");
        Ppal.setLocationRelativeTo(null);
        Ppal.setVisible(true);
        Ppal.setSize(480, 320);//ancho x alto
        Ppal.setResizable(false);
        Image icono = Toolkit.getDefaultToolkit().getImage("src/GVB/img/IconFast.jpg");
        Ppal.setIconImage(icono);

     
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
             

                Ppal.dispose();
System.exit(0);
            }
        });
        Ppal.btnEmpleados.setActionCommand("EMPLEADOS");
        Ppal.btnEmpleados.addActionListener(this);
        Ppal.btnEmpleados.setName("EMPLEADOS");
        Ppal.btnEmpleados.addMouseListener(this);

        Ppal.btnProductos.setActionCommand("PRODUCTOS");
        Ppal.btnProductos.addActionListener(this);

        Ppal.btnPedidos.setActionCommand("PEDIDOS");
        Ppal.btnPedidos.addActionListener(this);

        Ppal.btnReservas.setActionCommand("RESERVAS");
        Ppal.btnReservas.addActionListener(this);
        }
        if(val==1){
            Ab.setTitle("About");
        Ab.setLocationRelativeTo(null);
        Ab.setResizable(true);
        Ab.setVisible(true);
        Image icono = Toolkit.getDefaultToolkit().getImage("src/GVB/img/IconFast.jpg");
        Ab.setIconImage(icono);
       

        Ab.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if(BLLControllerVntEmp.mod==-1){
                    Ab.dispose();
                    new BLLControllerLogin(new Login()).iniciar();
                }else{
                
               Ab.dispose();
                new BLLControllerPaginador(new Paginador()).Iniciar();
                }
            }

            
        });
          rellenador();
        }if((ArrayListEF.us.getTipo().equals("user")||ArrayListEF.us.getTipo().equals("cliente"))&&(val==0)){
            
            Us.setTitle("Inicio");
        Us.setLocationRelativeTo(null);
        Us.setVisible(true);
       
        Us.setResizable(false);
        Image icono = Toolkit.getDefaultToolkit().getImage("src/GVB/img/FastBurger.jpg");
        Us.setIconImage(icono);

       try{
    Files_Usuario.pintar(Us.Imagen, Us.Usuario);
}catch(Exception e){
    
}
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
             

                Us.dispose();
System.exit(0);
            }
        });
        
        Us.btnPerf.setActionCommand("Perf");
        Us.btnPerf.addActionListener(this);
        
        Us.bntProd.setActionCommand("Prods");
        Us.bntProd.addActionListener(this);
        
        Us.LogOut.setActionCommand("Logout");
        Us.LogOut.addActionListener(this);
        
        Us.Usuario.setName("USUARIO");
        Us.Usuario.addMouseListener(this);
        
        Us.Imagen.setName("IMAGEN");
        Us.Imagen.addMouseListener(this);
        
        this.Us.MenuGuardar.setActionCommand("Menu_Guardar");
        this.Us.MenuGuardar.addActionListener(this);

        this.Us.ABOUT.setActionCommand("_ABOUT");
        this.Us.ABOUT.addActionListener(this);

        this.Us.FormaJson.setActionCommand("Forma_Json");
        this.Us.FormaJson.addActionListener(this);

        this.Us.FormaXml.setActionCommand("Forma_Xml");
        this.Us.FormaXml.addActionListener(this);

        this.Us.FormaTxt.setActionCommand("Forma_Txt");
        this.Us.FormaTxt.addActionListener(this);

        this.Us.CONF_MONEDA_EURO.setActionCommand("_CONF_MONEDA_EURO");
        this.Us.CONF_MONEDA_EURO.addActionListener(this);

        this.Us.CONF_MONEDA_DOLAR.setActionCommand("_CONF_MONEDA_DOLAR");
        this.Us.CONF_MONEDA_DOLAR.addActionListener(this);

        this.Us.CONF_MONEDA_LIBRA.setActionCommand("_CONF_MONEDA_LIBRA");
        this.Us.CONF_MONEDA_LIBRA.addActionListener(this);

        this.Us.CONF_FECHA_1.setActionCommand("_CONF_FECHA_1");
        this.Us.CONF_FECHA_1.addActionListener(this);

        this.Us.CONF_FECHA_2.setActionCommand("_CONF_FECHA_2");
        this.Us.CONF_FECHA_2.addActionListener(this);

        this.Us.CONF_FECHA_3.setActionCommand("_CONF_FECHA_3");
        this.Us.CONF_FECHA_3.addActionListener(this);

        this.Us.CONF_FECHA_4.setActionCommand("_CONF_FECHA_4");
        this.Us.CONF_FECHA_4.addActionListener(this);

        this.Us.CONF_FECHA_5.setActionCommand("_CONF_FECHA_5");
        this.Us.CONF_FECHA_5.addActionListener(this);

        this.Us.CONF_FECHA_6.setActionCommand("_CONF_FECHA_6");
        this.Us.CONF_FECHA_6.addActionListener(this);
        }
    }
 public static void rellenador(){
    Ab.jTextPane1.setText("Creado por"+"\n"+"Vicent Albert Borrell"+"\n"+"\n"+"Versión 1.0.0");
 }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (BLLControllerPpal.Accion.valueOf(e.getActionCommand())) {
            case EMPLEADOS:
                Ppal.dispose();
                new GVB.Modulos.GestionEmpleados.Pager.Controlador.BLLControllerPaginador(new Paginador()).Iniciar();
                break;

            case PRODUCTOS:
        Ppal.dispose();
        new GVB.Modulos.GestionProd.Pager.Controlador.BLLControllerPaginador(new GVB.Modulos.GestionProd.Pager.Vista.Paginador()).Iniciar();
                break;

            case Perf:
 ArrayListEF.e = ArrayListEF.us;
                BLLControllerVntEmp.mod = 11;
                Us.dispose();
                new BLLControllerVntEmp(new Vnt_Empleados()).iniciar();
                break;

            case Prods:
Us.dispose();
        new GVB.Modulos.GestionProd.Pager.Controlador.BLLControllerPaginador(new GVB.Modulos.GestionProd.Pager.Vista.Paginador()).Iniciar();
                break;
                
            case Logout:
                 ArrayListEF.us=null;
                    Us.dispose();
                    new BLLControllerLogin(new Login()).iniciar();
                break;
                  case Menu_Guardar:
                BLL.GuardarTodo();
                break;

            case _ABOUT:
                
                Us.dispose();
                new BLLControllerPpal(new About(),1).iniciar(1);
                break;

            case Forma_Json:
                BLLGraficoP.Saves(1);
                break;

            case Forma_Xml:
                BLLGraficoP.Saves(2);
                break;

            case Forma_Txt:
                BLLGraficoP.Saves(3);
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

        }
    }
    @Override
     public void mouseEntered(MouseEvent e) {
        switch (BLLControllerPpal.Accion.valueOf(e.getComponent().getName())) {
            case EMPLEADOS:
                this.Ppal.btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/MaletinSS.jpg")));
                break;
        }
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
     public void mouseExited(MouseEvent e) {
       switch (BLLControllerPpal.Accion.valueOf(e.getComponent().getName())) {
            case EMPLEADOS:
                this.Ppal.btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/maletin.png")));
                break;
        }
        }
    @Override
     public void mouseClicked(MouseEvent e) {
         switch (BLLControllerPpal.Accion.valueOf(e.getComponent().getName())) {
              case USUARIO:
                ArrayListEF.e = ArrayListEF.us;
                BLLControllerVntEmp.mod = 11;
                Us.dispose();
                new BLLControllerVntEmp(new Vnt_Empleados()).iniciar();
                break;
                    
                case IMAGEN:
                    Files_Usuario.pintar_guardar_imag(Pag.Imagen, 60, 60, 0);
                    break;
         }
         }
     }

