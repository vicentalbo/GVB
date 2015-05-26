/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.Menu.Controlador;

import GVB.Modulos.GestionEmpleados.Pager.Controlador.BLLControllerPaginador;
import GVB.Modulos.GestionEmpleados.Pager.Vista.Paginador;
import GVB.Modulos.Menu.Vista.Ventana_ppal;
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

    public static Ventana_ppal Ppal = new Ventana_ppal();

    public enum Accion {

        EMPLEADOS,
        PRODUCTOS,
        RESERVAS,
        PEDIDOS
    }
public BLLControllerPpal(JFrame Ppal1) {

        Ppal = (Ventana_ppal) Ppal1;

    }
    public void iniciar() {
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

            case PEDIDOS:

                break;

            case RESERVAS:

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
         
     }
}
