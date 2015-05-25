/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionProd.GestionProductos.Controlador;

import GVB.Modulos.GestionLogin.Vista.Login;
import GVB.Modulos.GestionProd.GestionProductos.Modelo.BLL.BLL;
import GVB.Modulos.GestionProd.GestionProductos.Modelo.BLL.BLLGraficoP;
import GVB.Modulos.GestionProd.GestionProductos.Modelo.Classe.ArrayListPro;
import GVB.Modulos.GestionProd.GestionProductos.Vista.Vnt_Productos;
import GVB.Modulos.GestionProd.Pager.Controlador.BLLControllerPaginador;
import GVB.Modulos.GestionProd.Pager.Vista.Paginador;
import GVB.Modulos.Menu.Controlador.BLLControllerAbout;
import GVB.Modulos.Menu.Vista.About;
import GVB.classes.Config;
import GVB.classes.Files_Usuario;
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
public class BLLControllerVntPro implements ActionListener, KeyListener, MouseListener {
    
    public static int mod = 0;
public static String Img = "";
    public static Vnt_Productos VntPro = new Vnt_Productos();
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
        
        Txt_Precio,
        Txt_Stock,
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
        _TIPO, 
        IMAGEN

    }

    public BLLControllerVntPro(JFrame C_Productos) {

        VntPro = (Vnt_Productos) C_Productos;

    }

    public void iniciar() {
        this.VntPro.setTitle("Productos");
        this.VntPro.setLocationRelativeTo(null);
        this.VntPro.setVisible(true);
        this.VntPro.setResizable(false);
        Image icono = Toolkit.getDefaultToolkit().getImage("src/GVB/img/V.jpg");
        this.VntPro.setIconImage(icono);

        this.VntPro.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        
        this.VntPro.NoNombre.setVisible(false);
        this.VntPro.NoPrecio.setVisible(false);
        this.VntPro.NoStock.setVisible(false);
        this.VntPro.NoDescri.setVisible(false);
        
        
        if (mod >10) {
            try {
                Files_Usuario.pintar_Pro(VntPro.Imagen);
            } catch (Exception e) {

            }
        }
        if (mod > 10) {
           
           
            this.VntPro.TxtNombre.setEditable(true);
            this.VntPro.TxtPrecio.setEditable(true);
            this.VntPro.TxtStock.setEditable(true);
            
            this.VntPro.TxtNombre.setText(ArrayListPro.p.getNombre());
            this.VntPro.TxtPrecio.setText(ArrayListPro.p.getPrecio()+"");
            this.VntPro.TxtStock.setText("" + (ArrayListPro.p.getStock()));
            this.VntPro.TxtDescri.setText("" + ArrayListPro.p.getDescripcion());
            
            
            
        }
        this.VntPro.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                JOptionPane.showMessageDialog(null, "Saliendo de la aplicación");
                VntPro.dispose();
                System.exit(0);
            }
        });
        this.VntPro.Guardar.setActionCommand("btn_Guardar");
        this.VntPro.Guardar.addActionListener(this);

        this.VntPro.Limpiar.setActionCommand("btn_Limpiar");
        this.VntPro.Limpiar.addActionListener(this);

        this.VntPro.TxtNombre.setActionCommand("Txt_Nom");
        this.VntPro.TxtNombre.addActionListener(this);
        this.VntPro.TxtNombre.addKeyListener(this);

     

        this.VntPro.TxtPrecio.setActionCommand("Txt_Precio");
        this.VntPro.TxtPrecio.addActionListener(this);
        this.VntPro.TxtPrecio.addKeyListener(this);

        this.VntPro.TxtStock.setActionCommand("Txt_Stock");
        this.VntPro.TxtStock.addActionListener(this);
        this.VntPro.TxtStock.addKeyListener(this);

        

        this.VntPro.Volver.setActionCommand("_VOLVER");
        this.VntPro.Volver.addActionListener(this);

        this.VntPro.MenuGuardar.setActionCommand("Menu_Guardar");
        this.VntPro.MenuGuardar.addActionListener(this);

        this.VntPro.ABOUT.setActionCommand("_ABOUT");
        this.VntPro.ABOUT.addActionListener(this);

        this.VntPro.FormaJson.setActionCommand("Forma_Json");
        this.VntPro.FormaJson.addActionListener(this);

        this.VntPro.FormaXml.setActionCommand("Forma_Xml");
        this.VntPro.FormaXml.addActionListener(this);

        this.VntPro.FormaTxt.setActionCommand("Forma_Txt");
        this.VntPro.FormaTxt.addActionListener(this);

        this.VntPro.CONF_MONEDA_EURO.setActionCommand("_CONF_MONEDA_EURO");
        this.VntPro.CONF_MONEDA_EURO.addActionListener(this);

        this.VntPro.CONF_MONEDA_DOLAR.setActionCommand("_CONF_MONEDA_DOLAR");
        this.VntPro.CONF_MONEDA_DOLAR.addActionListener(this);

        this.VntPro.CONF_MONEDA_LIBRA.setActionCommand("_CONF_MONEDA_LIBRA");
        this.VntPro.CONF_MONEDA_LIBRA.addActionListener(this);

        this.VntPro.CONF_FECHA_1.setActionCommand("_CONF_FECHA_1");
        this.VntPro.CONF_FECHA_1.addActionListener(this);

        this.VntPro.CONF_FECHA_2.setActionCommand("_CONF_FECHA_2");
        this.VntPro.CONF_FECHA_2.addActionListener(this);

        this.VntPro.CONF_FECHA_3.setActionCommand("_CONF_FECHA_3");
        this.VntPro.CONF_FECHA_3.addActionListener(this);

        this.VntPro.CONF_FECHA_4.setActionCommand("_CONF_FECHA_4");
        this.VntPro.CONF_FECHA_4.addActionListener(this);

        this.VntPro.CONF_FECHA_5.setActionCommand("_CONF_FECHA_5");
        this.VntPro.CONF_FECHA_5.addActionListener(this);

        this.VntPro.CONF_FECHA_6.setActionCommand("_CONF_FECHA_6");
        this.VntPro.CONF_FECHA_6.addActionListener(this);

        

        
        this.VntPro.Imagen.setName("IMAGEN");
        this.VntPro.Imagen.addMouseListener(this);

    }
    @Override
 public void mouseClicked(MouseEvent e) {
        switch (BLLControllerVntPro.Accion.valueOf(e.getComponent().getName())) {
            
                
                case IMAGEN:
                    String path;
                    
                    Img=Files_Usuario.pintar_String(VntPro.Imagen, 60, 60);
                   
                    break;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        switch (BLLControllerVntPro.Accion.valueOf(e.getComponent().getName())) {
            case Txt_Nom:
                BLLGraficoP.introName(0);
                break;

          
            case Txt_Precio:
                BLLGraficoP.introPrecio(0);
                break;

            case Txt_Stock:
                BLLGraficoP.introStock();

                break;
            
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (BLLControllerVntPro.Accion.valueOf(e.getActionCommand())) {

            case btn_Guardar:
                BLLGraficoEF.crearEF();
                if ((mod == -1) && (veri = true)) {
                    ArrayListEF.us = ArrayListEF.e;
                    VntEmp.dispose();
                    new BLLControllerLogin(new Login()).iniciar();
                }
                break;

            case btn_Limpiar:
                BLLGraficoP.Limpiar();
                break;

            case Txt_Nom:
                BLLGraficoP.introName(1);
                break;


            case Txt_Precio:
                BLLGraficoP.introPrecio(1);
                break;

            case Txt_Stock:
                BLLGraficoP.introStock();
                break;

            case _VOLVER:
               
                    VntPro.dispose();
                    new BLLControllerPaginador(new Paginador()).Iniciar();
                
                break;

            case Menu_Guardar:
                BLL.GuardarTodo();
                break;

            case _ABOUT:

                VntPro.dispose();
                new BLLControllerAbout(new About()).iniciar();
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


            case _TIPO:

                break;
        }
    }
}
