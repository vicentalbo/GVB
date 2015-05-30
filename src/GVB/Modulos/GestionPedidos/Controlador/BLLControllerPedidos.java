/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionPedidos.Controlador;

import GVB.Librerias.Menus;
import GVB.Modulos.GestionEmpleados.GestionE.Controlador.BLLControllerVntEmp;

import GVB.Modulos.GestionEmpleados.GestionE.Vista.Vnt_Empleados;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.ArrayListEF;
import GVB.Modulos.GestionLogin.Controlador.BLLControllerLogin;
import GVB.Modulos.GestionLogin.Vista.Login;
import GVB.Modulos.GestionPedidos.Modelo.BLL.BLLBDPed;
import GVB.Modulos.GestionPedidos.Modelo.BLL.BLLGraficoPed;
import GVB.Modulos.GestionPedidos.Modelo.Classe.ArrayListPedidos;
import GVB.Modulos.GestionPedidos.Modelo.Classe.Pedidos;
import GVB.Modulos.GestionPedidos.Modelo.Classe.SimpleTableModel_Ped;
import GVB.Modulos.GestionPedidos.Modelo.pagina;
import GVB.Modulos.GestionPedidos.Vista.Paginador;
import static GVB.Modulos.GestionPedidos.Vista.Paginador.MuestraSelected;
import static GVB.Modulos.GestionPedidos.Vista.Paginador.MuestraSelected2;
import GVB.Modulos.Menu.Controlador.BLLControllerPpal;
import GVB.Modulos.Menu.Vista.About;
import GVB.Modulos.Menu.Vista.Ventana_Us;
import GVB.Modulos.Menu.Vista.Ventana_ppal;
import GVB.classes.Config;
import GVB.classes.Files_Usuario;
import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Vinche
 */
public class BLLControllerPedidos implements ActionListener, KeyListener, MouseListener{
     public static ArrayList<Pedidos> datos = new ArrayList();
    public static ArrayList<Pedidos> datosaux = new ArrayList();

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
        LOGOUT

    }

    public BLLControllerPedidos(JFrame Pagin) {

        Pag = (Paginador) Pagin;

    }
  
    public static TableRowSorter<TableModel> sorter = new TableRowSorter<>(new SimpleTableModel_Ped());

    public void Iniciar() {

        Pag.setTitle("Paginador");
        Pag.setLocationRelativeTo(null);
        Pag.setVisible(true);
        Pag.setResizable(false);

        Pag.setIconImage(Toolkit.getDefaultToolkit().getImage("src/GVB/img/photos/FastBurger.jpg"));

        
        Pag.TABLA.setModel(new SimpleTableModel_Ped());
        ((SimpleTableModel_Ped) Pag.TABLA.getModel()).cargar();
        Pag.TABLA.setFillsViewportHeight(true);
        Pag.TABLA.setRowSorter(sorter);
        
try{
    Files_Usuario.pintar(Pag.Imagen, Pag.Usuario);
}catch(Exception e){
    
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
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (BLLControllerPedidos.Accion.valueOf(e.getActionCommand())) {
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
                if(ArrayListEF.e.getTipo().equals("admin"))
                             new BLLControllerPpal(new Ventana_ppal(),0).iniciar(0);
                             else
                                 new BLLControllerPpal(new Ventana_Us(),0).iniciar(0);
                break;

            case _MUESTRA:
                pagina.itemsPerPage = Integer.parseInt(Pag.MUESTRA.getSelectedItem().toString());
                pagina.currentPageIndex = 1;
                pagina.initLinkBox();
                break;

           

            case Menu_Guardar:
                BLLGraficoPed.GuardarTodo();
                break;

            case _ABOUT:
                
                Pag.dispose();
                new BLLControllerPpal(new About(),1).iniciar(1);
                break;

            case Forma_Json:
                BLLGraficoPed.Saves(1);
                break;

            case Forma_Xml:
                BLLGraficoPed.Saves(2);
                break;

            case Forma_Txt:
                BLLGraficoPed.Saves(3);
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
                ((SimpleTableModel_Ped) this.Pag.TABLA.getModel()).filtrar();
                break;
                
            case _REFRESH:
                ((SimpleTableModel_Ped) Pag.TABLA.getModel()).cargar();
                pagina.inicializa();
        pagina.initLinkBox();
                break;
                
                
            case _XML:
                int opc;
                String[] eleccion={"ID", "DNI"};
                BLLGraficoPed.Saves(2);
                
                opc=Menus.menu2("Seleccione como desea ordenar los datos", eleccion);
                BLLBDPed.ImprimirID(opc);
                break;
                
            case _JSON:
                int opc1;
                String[] eleccion1={"ID", "DNI"};
                BLLGraficoPed.Saves(1);
                
                opc1=Menus.menu2("Seleccione como desea ordenar los datos", eleccion1);
                BLLBDPed.ImprimirID(opc1);
                break;
                
            case _TXT:
                int opc2;
                String[] eleccion2={"ID", "DNI"};
                BLLGraficoPed.Saves(3);
                
                opc2=Menus.menu2("Seleccione como desea ordenar los datos", eleccion2);
                BLLBDPed.ImprimirID(opc2);
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
        switch (BLLControllerPedidos.Accion.valueOf(e.getComponent().getName())){
            case _BUSCADOR:
                pagina.currentPageIndex = 1;
                ((SimpleTableModel_Ped) this.Pag.TABLA.getModel()).filtrar();
                break;
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        switch (BLLControllerPedidos.Accion.valueOf(e.getComponent().getName())) {

            case _TABLA:

                int n,
                 selection,
                 inicio,
                 selection1;
                n = ((SimpleTableModel_Ped) Paginador.TABLA.getModel()).getRowCount();

                if (n != 0) {

                    inicio = (pagina.currentPageIndex - 1) * pagina.itemsPerPage;
                    selection = Paginador.TABLA.getSelectedRow();
                    selection1 = inicio + selection;

 
                    ArrayListPedidos.pe = new Pedidos(Integer.parseInt( Pag.TABLA.getModel().getValueAt(selection1, 0).toString()));
                    BLLBDPed.buscarPorIDBLL();
                    

                    MuestraSelected.setText(" DNI= " + ArrayListPedidos.pe.getDNI() + "\n" + " Coste= " + ArrayListPedidos.pe.getCoste()+ Config.getMoneda() + "\n" + " Nombre Producto= " + ArrayListPedidos.pe.getNombre_P() );
                    MuestraSelected2.setText("     ID= " + ArrayListPedidos.pe.getID() + "\n" + "     ID Producto= " + ArrayListPedidos.pe.getID_P()  + "\n" + "     Cantidad= " + ArrayListPedidos.pe.getCantidad() );

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
                    ArrayListEF.us=null;
                    Pag.dispose();
                    new BLLControllerLogin(new Login(),2).iniciar(2);
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
        //0
    }

    @Override
    public void mouseExited(MouseEvent e) {
       //0
    }

}
