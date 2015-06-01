/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionProd.Pager.Controlador;

import GVB.Librerias.Funcions;
import GVB.Modulos.GestionEmpleados.GestionE.Controlador.BLLControllerVntEmp;
import GVB.Modulos.GestionEmpleados.GestionE.Vista.Vnt_Empleados;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.ArrayListEF;
import static GVB.Modulos.GestionProd.Pager.Vista.Paginador.MuestraSelected;
import static GVB.Modulos.GestionProd.Pager.Vista.Paginador.MuestraSelected2;
import GVB.Modulos.GestionLogin.Controlador.BLLControllerLogin;
import GVB.Modulos.GestionLogin.Vista.Login;
import GVB.Modulos.GestionProd.GestionProductos.Controlador.BLLControllerVntPro;
import GVB.Modulos.GestionProd.GestionProductos.Modelo.BLL.BLL;
import GVB.Modulos.GestionProd.GestionProductos.Modelo.BLL.BLLBDProd;
import GVB.Modulos.GestionProd.GestionProductos.Modelo.BLL.BLLGraficoP;
import GVB.Modulos.GestionProd.GestionProductos.Modelo.Classe.ArrayListPro;
import GVB.Modulos.GestionProd.GestionProductos.Modelo.Classe.Productos;
import GVB.Modulos.GestionProd.GestionProductos.Modelo.Classe.SimpleTableModel_P;
import GVB.Modulos.GestionProd.GestionProductos.Vista.Vnt_Productos;
import GVB.Modulos.GestionProd.Pager.Modelo.pagina;
import GVB.Modulos.GestionProd.Pager.Vista.Paginador;

import GVB.Modulos.Menu.Controlador.BLLControllerPpal;
import GVB.Modulos.Menu.Vista.About;

import GVB.Modulos.Menu.Vista.Ventana_ppal;

import GVB.Librerias.Menus;
import GVB.Modulos.GestionPedidos.Modelo.BLL.BLLGraficoPed;
import GVB.Modulos.Menu.Vista.Ventana_Us;
import GVB.classes.Config;
import GVB.classes.Files_Usuario;
import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.Color;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.event.ChangeListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Vinche
 */
public class BLLControllerPaginador implements ActionListener, KeyListener, MouseListener {

    public static ArrayList<Productos> datos = new ArrayList();
    public static ArrayList<Productos> datosaux = new ArrayList();

    public static Paginador Pag = new Paginador();

    public enum Accion {

        _ANTERIOR,
        _SIGUIENTE,
        _PRIMERO,
        _ULTIMO,
        _VOLVER,
        _MUESTRA,
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
        _TABLA,
        _CREAR,
        _MODIFICAR,
        _ELIMINAR,
        _BUSCADOR,
        _REFRESH,
        _PROCEDS,
        _XML,
        _JSON,
        _TXT,
        USUARIO,
        IMAGEN,
        LOGOUT,
        carrito

    }

    public BLLControllerPaginador(JFrame Pagin) {

        Pag = (Paginador) Pagin;

    }

    public static TableRowSorter<TableModel> sorter = new TableRowSorter<>(new SimpleTableModel_P());

    public void Iniciar() {

        Pag.setTitle("Paginador");
        Pag.setLocationRelativeTo(null);
        Pag.setVisible(true);
        Pag.setResizable(false);

        Pag.setIconImage(Toolkit.getDefaultToolkit().getImage("src/GVB/img/photos/IconFast.jpg"));

        Pag.NoSelected.setVisible(false);
        Pag.TABLA.setModel(new SimpleTableModel_P());
        ((SimpleTableModel_P) Pag.TABLA.getModel()).cargar();
        Pag.TABLA.setFillsViewportHeight(true);
        Pag.TABLA.setRowSorter(sorter);

Pag.result.setVisible(false);

        try {
            Files_Usuario.pintar(Pag.Imagen, Pag.Usuario);
        } catch (Exception e) {

        }
        if ((ArrayListEF.us.getTipo().equals("user")) || (ArrayListEF.us.getTipo().equals("cliente"))) {
            Pag.Crear.setEnabled(false);
            Pag.Eliminar.setEnabled(false);
            Pag.Modificar.setEnabled(false);
        }
        if ((ArrayListEF.us.getTipo().equals("user"))) {
            Pag.PaneCompra.setVisible(false);
        }
        if(ArrayListEF.us.getSueldoh()>0.0f){
            Pag.puntos.setVisible(true);
            Pag.puntos.setText("Usar puntos: "+ArrayListEF.us.getSueldoh()+Config.getMoneda());
        }else{
            Pag.puntos.setVisible(false);
        }
        pagina.inicializa();
        pagina.initLinkBox();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                JOptionPane.showMessageDialog(null, "Saliendo de la aplicación");
                Pag.dispose();
                System.exit(0);
            }
        });
        this.Pag.SIGUIENTE.setActionCommand("_SIGUIENTE");
        this.Pag.SIGUIENTE.addActionListener(this);

        this.Pag.ANTERIOR.setActionCommand("_ANTERIOR");
        this.Pag.ANTERIOR.addActionListener(this);

        this.Pag.primero.setActionCommand("_PRIMERO");
        this.Pag.primero.addActionListener(this);

        this.Pag.ultimo.setActionCommand("_ULTIMO");
        this.Pag.ultimo.addActionListener(this);

        this.Pag.VOLVER.setActionCommand("_VOLVER");
        this.Pag.VOLVER.addActionListener(this);

        this.Pag.MUESTRA.setActionCommand("_MUESTRA");
        this.Pag.MUESTRA.addActionListener(this);

        this.Pag.MenuGuardar.setActionCommand("Menu_Guardar");
        this.Pag.MenuGuardar.addActionListener(this);

        this.Pag.ABOUT.setActionCommand("_ABOUT");
        this.Pag.ABOUT.addActionListener(this);

        this.Pag.FormaJson.setActionCommand("Forma_Json");
        this.Pag.FormaJson.addActionListener(this);

        this.Pag.FormaXml.setActionCommand("Forma_Xml");
        this.Pag.FormaXml.addActionListener(this);

        this.Pag.FormaTxt.setActionCommand("Forma_Txt");
        this.Pag.FormaTxt.addActionListener(this);

        this.Pag.CONF_MONEDA_EURO.setActionCommand("_CONF_MONEDA_EURO");
        this.Pag.CONF_MONEDA_EURO.addActionListener(this);

        this.Pag.CONF_MONEDA_DOLAR.setActionCommand("_CONF_MONEDA_DOLAR");
        this.Pag.CONF_MONEDA_DOLAR.addActionListener(this);

        this.Pag.CONF_MONEDA_LIBRA.setActionCommand("_CONF_MONEDA_LIBRA");
        this.Pag.CONF_MONEDA_LIBRA.addActionListener(this);

        this.Pag.CONF_FECHA_1.setActionCommand("_CONF_FECHA_1");
        this.Pag.CONF_FECHA_1.addActionListener(this);

        this.Pag.CONF_FECHA_2.setActionCommand("_CONF_FECHA_2");
        this.Pag.CONF_FECHA_2.addActionListener(this);

        this.Pag.CONF_FECHA_3.setActionCommand("_CONF_FECHA_3");
        this.Pag.CONF_FECHA_3.addActionListener(this);

        this.Pag.CONF_FECHA_4.setActionCommand("_CONF_FECHA_4");
        this.Pag.CONF_FECHA_4.addActionListener(this);

        this.Pag.CONF_FECHA_5.setActionCommand("_CONF_FECHA_5");
        this.Pag.CONF_FECHA_5.addActionListener(this);

        this.Pag.CONF_FECHA_6.setActionCommand("_CONF_FECHA_6");
        this.Pag.CONF_FECHA_6.addActionListener(this);

        this.Pag.TABLA.setName("_TABLA");
        this.Pag.TABLA.addMouseListener(this);

        this.Pag.Crear.setActionCommand("_CREAR");
        this.Pag.Crear.addActionListener(this);
        this.Pag.Crear.addMouseListener(this);

        this.Pag.Modificar.setActionCommand("_MODIFICAR");
        this.Pag.Modificar.addActionListener(this);
        this.Pag.Modificar.addMouseListener(this);

        this.Pag.Eliminar.setActionCommand("_ELIMINAR");
        this.Pag.Eliminar.addActionListener(this);
        this.Pag.Eliminar.addMouseListener(this);

        this.Pag.buscador.setName("_BUSCADOR");
        this.Pag.buscador.setActionCommand("_BUSCADOR");
        this.Pag.buscador.addActionListener(this);
        this.Pag.buscador.addKeyListener(this);

        this.Pag.Refresh.setActionCommand("_REFRESH");
        this.Pag.Refresh.addActionListener(this);

        this.Pag.btnXml.setActionCommand("_XML");
        this.Pag.btnXml.addActionListener(this);

        this.Pag.btnJson.setActionCommand("_JSON");
        this.Pag.btnJson.addActionListener(this);

        this.Pag.btnTxt.setActionCommand("_TXT");
        this.Pag.btnTxt.addActionListener(this);

        this.Pag.Usuario.setName("USUARIO");
        this.Pag.Usuario.addMouseListener(this);

        this.Pag.Imagen.setName("IMAGEN");
        this.Pag.Imagen.addMouseListener(this);

        this.Pag.Logout.setName("LOGOUT");
        this.Pag.Logout.addMouseListener(this);
        
         this.Pag.carrito.setName("carrito");
        this.Pag.carrito.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (BLLControllerPaginador.Accion.valueOf(e.getActionCommand())) {
            case _ANTERIOR:
                pagina.currentPageIndex -= 1;
                pagina.initLinkBox();
                break;

            case _SIGUIENTE:
                pagina.currentPageIndex += 1;
                pagina.initLinkBox();
                break;

            case _PRIMERO:
                pagina.currentPageIndex = 1;
                pagina.initLinkBox();
                break;

            case _ULTIMO:
                pagina.currentPageIndex = pagina.maxPageIndex;
                pagina.initLinkBox();
                break;

            case _VOLVER:
                this.Pag.dispose();
                if (ArrayListEF.e.getTipo().equals("admin")) {
                    new BLLControllerPpal(new Ventana_ppal(), 0).iniciar(0);
                } else {
                    new BLLControllerPpal(new Ventana_Us(), 0).iniciar(0);
                }
                break;

            case _MUESTRA:
                pagina.itemsPerPage = Integer.parseInt(Pag.MUESTRA.getSelectedItem().toString());
                pagina.currentPageIndex = 1;
                pagina.initLinkBox();
                break;

            case _CREAR:
                BLLControllerVntPro.mod = 1;
                Pag.dispose();
                new BLLControllerVntPro(new Vnt_Productos()).iniciar();
                break;

            case _MODIFICAR:
                if (ArrayListPro.p != null) {
                    this.Pag.NoSelected.setVisible(false);
                    BLLControllerVntPro.mod = 11;
                    Pag.dispose();
                    new BLLControllerVntPro(new Vnt_Productos()).iniciar();
                } else {
                    this.Pag.NoSelected.setVisible(true);
                }
                break;

            case _ELIMINAR:
                if (ArrayListPro.p != null) {

                    this.Pag.NoSelected.setVisible(false);
                    BLLGraficoP.eliminador();
                   
                   
                    ((SimpleTableModel_P) Pag.TABLA.getModel()).cargar();
                    pagina.inicializa();
                   pagina.currentPageIndex=1;
                       pagina.initLinkBox();
                  
                } else {
                    this.Pag.NoSelected.setVisible(true);
                }
                break;

            case Menu_Guardar:
                BLL.GuardarTodo();
                break;

            case _ABOUT:

                Pag.dispose();
                new BLLControllerPpal(new About(), 1).iniciar(1);
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

            case _BUSCADOR:

                pagina.currentPageIndex = 1;
                ((SimpleTableModel_P) this.Pag.TABLA.getModel()).filtrar();
                break;

            case _REFRESH:
                ((SimpleTableModel_P) Pag.TABLA.getModel()).cargar();
                pagina.inicializa();
                pagina.initLinkBox();
                break;

            case _XML:
                int opc;
                String[] eleccion = {"ID", "Tipo"};
                BLLGraficoP.Saves(2);

                opc = Menus.menu2("Seleccione como desea ordenar los datos", eleccion);
                BLLBDProd.ImprimirID(opc);
                break;

            case _JSON:
                int opc1;
                String[] eleccion1 = {"ID", "Tipo"};
                BLLGraficoP.Saves(1);

                opc1 = Menus.menu2("Seleccione como desea ordenar los datos", eleccion1);
                BLLBDProd.ImprimirID(opc1);
                break;

            case _TXT:
                int opc2;
                String[] eleccion2 = {"ID", "Tipo"};
                BLLGraficoP.Saves(3);

                opc2 = Menus.menu2("Seleccione como desea ordenar los datos", eleccion2);
                BLLBDProd.ImprimirID(opc2);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
//0
    }

    @Override
    public void keyPressed(KeyEvent e) {
//0
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (BLLControllerPaginador.Accion.valueOf(e.getComponent().getName())) {
            case _BUSCADOR:
                pagina.currentPageIndex = 1;
                ((SimpleTableModel_P) this.Pag.TABLA.getModel()).filtrar();
                break;
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        switch (BLLControllerPaginador.Accion.valueOf(e.getComponent().getName())) {

            case _TABLA:
                
                
               
                int n,
                 selection,
                 inicio,
                 selection1;
                n = ((SimpleTableModel_P) Pag.TABLA.getModel()).getRowCount();

                if (n != 0) {

                    inicio = (pagina.currentPageIndex - 1) * pagina.itemsPerPage;
                    selection = Pag.TABLA.getSelectedRow();
                    selection1 = inicio + selection;

                    ArrayListPro.p = new Productos(Integer.parseInt(Pag.TABLA.getModel().getValueAt(selection1, 0).toString()));
                    BLLBDProd.buscarPorIDBLL();
                    int i;
//Se llena el spinner con el stock
                    String[] cants=new String[ArrayListPro.p.getStock()+1];
                    for (int j = 0; j <= ArrayListPro.p.getStock(); j++) {
                        cants[j] = j + "";
                    }
                     SpinnerListModel CantModel = new SpinnerListModel(cants);
                    Pag.cantidad.setModel(CantModel);

                    MuestraSelected.setText(" Nombre= " + ArrayListPro.p.getNombre() + "\n" + " Precio= " + ArrayListPro.p.getPrecio() + Config.getMoneda() + "\n" + " Tipo= " + ArrayListPro.p.getTipo());
                    MuestraSelected2.setText("     ID= " + ArrayListPro.p.getID() + "\n" + "     Stock= " + ArrayListPro.p.getStock() + "\n" + "     Descripcion= " + ArrayListPro.p.getDescripcion());
                    try {
                        Files_Usuario.pintar_Pro(Pag.ImgPro);
                    } catch (Exception ec) {

                    }
                }
                break;
            case USUARIO:
                ArrayListEF.e = ArrayListEF.us;
                BLLControllerVntEmp.mod = 11;
                Pag.dispose();
                new BLLControllerVntEmp(new Vnt_Empleados()).iniciar();
                break;

            case IMAGEN:
                Files_Usuario.pintar_guardar_imag(Pag.Imagen, 60, 60, 0);
                break;

            case LOGOUT:
                ArrayListEF.us = null;
                Pag.dispose();
                new BLLControllerLogin(new Login(), 2).iniciar(2);
                break;
                
            case carrito:
                if(new Integer(Pag.cantidad.getValue().toString())>0){
                String msg="¿Desea usted comprar "+Pag.cantidad.getValue().toString()+" "+ArrayListPro.p.getNombre()+"?"+"\n"+"En caso de aceptar, el coste sería de "+(new Integer(Pag.cantidad.getValue().toString())*ArrayListPro.p.getPrecio())+
                       Config.getMoneda()+ "\n"+"Se le enviaría un correo con la factura";
                String[] boton={"Comprar", "Cancelar"};
                        int opc;
                        int res;
                opc=Menus.menubasic(msg, "Comprar", boton);
                if(opc==0){
                    res=BLLGraficoPed.Comprar(new Integer (Pag.cantidad.getValue().toString()));
                    if(res==-111){
                        Pag.result.setText("Error en la compra");
                        Pag.result.setBackground(Color.red);
                    }else if(res==-11){
                        Pag.result.setText("Error, no posee suficiente saldo");
                        Pag.result.setBackground(Color.red);
                    }else{
                        BLLGraficoPed.Factura();
                        Pag.result.setText("Compra realizada con éxito");
                        Pag.result.setBackground(Color.red);
                        BLLGraficoPed.aviso();
                    }
                }
                }
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
    public void mouseEntered(MouseEvent e) {
        switch (BLLControllerPaginador.Accion.valueOf(e.getComponent().getName())) {
            case _CREAR:
                this.Pag.Crear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/edit_add.png")));
                break;

            case _MODIFICAR:
                this.Pag.Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/pencil.png")));
                break;

            case _ELIMINAR:
                this.Pag.Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/stop.png")));
                break;
            case carrito:
                this.Pag.carrito.setBorder(BorderFactory.createLineBorder(Color.black));
                break;
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        switch (BLLControllerPaginador.Accion.valueOf(e.getComponent().getName())) {

            case _CREAR:
                this.Pag.Crear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/edit_No_S.png")));
                break;

            case _MODIFICAR:
                this.Pag.Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/pencil_No_S.png")));
                break;

            case _ELIMINAR:
                this.Pag.Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/stop_No_S.png")));
                break;
                
                case carrito:
                this.Pag.carrito.setBorder(BorderFactory.createEmptyBorder());
                break;

        }
    }

}
