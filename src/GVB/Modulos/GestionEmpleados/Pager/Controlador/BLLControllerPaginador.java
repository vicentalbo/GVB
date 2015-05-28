/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionEmpleados.Pager.Controlador;

import GVB.Modulos.GestionEmpleados.GestionE.Controlador.BLLControllerVntEmp;
import GVB.Modulos.GestionEmpleados.GestionE.Modelo.BLL.BLL;
import GVB.Modulos.GestionEmpleados.GestionE.Modelo.BLL.BLLGraficoE;
import GVB.Modulos.GestionEmpleados.GestionE.Modelo.Classe.SimpleTableModel_E;
import GVB.Modulos.GestionEmpleados.GestionE.Vista.Vnt_Empleados;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.BLL.EFBLLBD;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.ArrayListEF;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.EmpleadoFijo;
import GVB.Modulos.GestionEmpleados.Pager.Modelo.pagina;

import GVB.Modulos.GestionEmpleados.Pager.Vista.Paginador;
import static GVB.Modulos.GestionEmpleados.Pager.Vista.Paginador.MuestraSelected;
import static GVB.Modulos.GestionEmpleados.Pager.Vista.Paginador.MuestraSelected2;
import GVB.Modulos.GestionLogin.Controlador.BLLControllerLogin;
import GVB.Modulos.GestionLogin.Vista.Login;

import GVB.Modulos.Menu.Controlador.BLLControllerPpal;
import GVB.Modulos.Menu.Vista.About;

import GVB.Modulos.Menu.Vista.Ventana_ppal;
import GVB.Modulos.autocomplete.AutocompleteJComboBox;
import GVB.Librerias.Menus;
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
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Vinche
 */
public class BLLControllerPaginador implements ActionListener, KeyListener, MouseListener {

    public static ArrayList<EmpleadoFijo> datos = new ArrayList();
    public static ArrayList<EmpleadoFijo> datosaux = new ArrayList();

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

    public BLLControllerPaginador(JFrame Pagin) {

        Pag = (Paginador) Pagin;

    }
    public static AutocompleteJComboBox combo = null;
    public static TableRowSorter<TableModel> sorter = new TableRowSorter<>(new SimpleTableModel_E());

    public void Iniciar() {

        Pag.setTitle("Paginador");
        Pag.setLocationRelativeTo(null);
        Pag.setVisible(true);
        Pag.setResizable(false);

        Pag.setIconImage(Toolkit.getDefaultToolkit().getImage("src/GVB/img/V.jpg"));

        Pag.NoSelected.setVisible(false);
        Pag.TABLA.setModel(new SimpleTableModel_E());
        ((SimpleTableModel_E) Pag.TABLA.getModel()).cargar();
        Pag.TABLA.setFillsViewportHeight(true);
        Pag.TABLA.setRowSorter(sorter);
        
try{
    Files_Usuario.pintar(Pag.Imagen, Pag.Usuario);
}catch(Exception e){
    
}
if((ArrayListEF.us.getTipo().equals("user"))||(ArrayListEF.us.getTipo().equals("cliente"))){
    Pag.Crear.setEnabled(false);
    Pag.Eliminar.setEnabled(false);
    Pag.Modificar.setEnabled(false);
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
        
        this.Pag.ComboProceds.setActionCommand("_PROCEDS");
        this.Pag.ComboProceds.addActionListener(this);
        
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
                Pag.dispose();
                new BLLControllerPpal(new Ventana_ppal(),0).iniciar(0);
                break;

            case _MUESTRA:
                pagina.itemsPerPage = Integer.parseInt(Pag.MUESTRA.getSelectedItem().toString());
                pagina.currentPageIndex = 1;
                pagina.initLinkBox();
                break;

            case _CREAR:
                BLLControllerVntEmp.mod = 1;
                Pag.dispose();
                new BLLControllerVntEmp(new Vnt_Empleados()).iniciar();
                break;

            case _MODIFICAR:
                if (ArrayListEF.e != null) {
                    this.Pag.NoSelected.setVisible(false);
                    BLLControllerVntEmp.mod = 11;
                    Pag.dispose();
                    new BLLControllerVntEmp(new Vnt_Empleados()).iniciar();
                } else {
                    this.Pag.NoSelected.setVisible(true);
                }
                break;

            case _ELIMINAR:
                if (ArrayListEF.e != null) {

                    this.Pag.NoSelected.setVisible(false);
                    BLLGraficoE.eliminador();
                    //Pag.dispose();
                   // new BLLControllerPaginador(new Paginador()).Iniciar();
                    ((SimpleTableModel_E) Pag.TABLA.getModel()).cargar();
                    pagina.inicializa();
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
                new BLLControllerPpal(new About(),1).iniciar(1);
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

            case _BUSCADOR:

                pagina.currentPageIndex = 1;
                ((SimpleTableModel_E) this.Pag.TABLA.getModel()).filtrar();
                break;
                
            case _REFRESH:
                ((SimpleTableModel_E) Pag.TABLA.getModel()).cargar();
                pagina.inicializa();
        pagina.initLinkBox();
                break;
                
            case _PROCEDS:
                String type, cad="";

                
                type=this.Pag.ComboProceds.getSelectedItem().toString();
                if(type.equalsIgnoreCase("Usuarios Activos")){
                    cad=EFBLLBD.Proced_Activos();
                }
                this.Pag.Proceds.setText(cad);
                break;
                
            case _XML:
                int opc;
                String[] eleccion={"DNI", "edad"};
                BLLGraficoE.Saves(2);
                
                opc=Menus.menu2("Seleccione como desea ordenar los datos", eleccion);
                EFBLLBD.ImprimirDNI(opc);
                break;
                
            case _JSON:
                int opc1;
                String[] eleccion1={"DNI", "edad"};
                BLLGraficoE.Saves(1);
                
                opc1=Menus.menu2("Seleccione como desea ordenar los datos", eleccion1);
                EFBLLBD.ImprimirDNI(opc1);
                break;
                
            case _TXT:
                int opc2;
                String[] eleccion2={"DNI", "edad"};
                BLLGraficoE.Saves(3);
                
                opc2=Menus.menu2("Seleccione como desea ordenar los datos", eleccion2);
                EFBLLBD.ImprimirDNI(opc2);
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
        switch (BLLControllerPaginador.Accion.valueOf(e.getComponent().getName())){
            case _BUSCADOR:
                pagina.currentPageIndex = 1;
                ((SimpleTableModel_E) this.Pag.TABLA.getModel()).filtrar();
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
                n = ((SimpleTableModel_E) Paginador.TABLA.getModel()).getRowCount();

                if (n != 0) {

                    inicio = (pagina.currentPageIndex - 1) * pagina.itemsPerPage;
                    selection = Paginador.TABLA.getSelectedRow();
                    selection1 = inicio + selection;

                    ArrayListEF.e = new EmpleadoFijo((String) Pag.TABLA.getModel().getValueAt(selection1, 0));
                    EFBLLBD.buscarPorDniBLL();
                    //BLLGraficoE.pos = BLL.buscar(ArrayListEF.e, 1);
                   // ArrayListEF.e = (EmpleadoFijo) BLL.Obtener(BLLGraficoE.pos, 1);

                    MuestraSelected.setText(" Nombre= " + ArrayListEF.e.getNombre() + "\n" + " Telefono= " + ArrayListEF.e.getTelef() + "\n" + " Sueldo anual= " + ArrayListEF.e.getSueldoh() + Config.getMoneda() + "\n" + " Fecha de Contratación= " + ArrayListEF.e.getFcontr().toString() + "\n" + " Antigüedad= " + ArrayListEF.e.getAntig() + "\n" + " User= " + ArrayListEF.e.getUsuario());
                    MuestraSelected2.setText("     DNI= " + ArrayListEF.e.getdNi() + "\n" + "     Sueldo básico= " + ArrayListEF.e.getSueldof() + Config.getMoneda() + "\n" + "     Fecha de Nacimiento= " + ArrayListEF.e.getFnac().toString() + "\n" + "     Edad= " + ArrayListEF.e.getEdad() + "\n" + "     Email= " + ArrayListEF.e.getEmail() + "\n" + "     Tipo= " + ArrayListEF.e.getTipo());

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
                    new BLLControllerLogin(new Login()).iniciar();
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

        }
    }

}
