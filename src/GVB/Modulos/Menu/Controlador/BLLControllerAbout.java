/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.Menu.Controlador;

import GVB.Modulos.GestionEmpleados.GestionE.Controlador.BLLControllerVntEmp;
import GVB.Modulos.GestionEmpleados.Pager.Controlador.BLLControllerPaginador;
import GVB.Modulos.GestionEmpleados.Pager.Vista.Paginador;
import GVB.Modulos.GestionLogin.Controlador.BLLControllerLogin;
import GVB.Modulos.GestionLogin.Vista.Login;
import GVB.Modulos.Menu.Vista.About;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;


/**
 *
 * @author Vinche
 */
public class BLLControllerAbout {
    public static About Ab = new About();
    public BLLControllerAbout(JFrame About) {

        Ab = (About) About;

    }
    public static void iniciar(){
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
    }
    public static void rellenador(){
    Ab.jTextPane1.setText("Creado por"+"\n"+"Vicent Albert Borrell"+"\n"+"\n"+"Versión 0.1.1");
}
}
