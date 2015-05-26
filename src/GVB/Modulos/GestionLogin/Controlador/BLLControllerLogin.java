/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionLogin.Controlador;

import GVB.Modulos.GestionEmpleados.GestionE.Controlador.BLLControllerVntEmp;
import GVB.Modulos.GestionEmpleados.GestionE.Vista.Vnt_Empleados;
import GVB.Modulos.GestionLogin.Modelo.BLL.BLLLogin;
import GVB.Modulos.GestionLogin.Vista.Contraseña_O;
import GVB.Modulos.GestionLogin.Vista.Login;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinche
 */
public class BLLControllerLogin implements ActionListener, MouseListener {
    public static Login Log = new Login();

    
    public enum Accion{
        TXTUS,
        TXTPASS,
        INTRO,
        REGISTER,
        OLVIDAR
    }
 
 
 
 public BLLControllerLogin(JFrame Logg) {

        Log = (Login) Logg;

    }
 public void iniciar(){
     this.Log.setTitle("Login");
        this.Log.setLocationRelativeTo(null);
        this.Log.setVisible(true);
        this.Log.setResizable(false);
        Image icono = Toolkit.getDefaultToolkit().getImage("src/GVB/img/FastBurger.jpg");
        this.Log.setIconImage(icono);
this.Log.setSize(370, 475);
        
        this.Log.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                
                JOptionPane.showMessageDialog(null, "Saliendo de la aplicación");
                Log.dispose();
                System.exit(0);
            }
        });
        this.Log.NoPass.setVisible(false);
        this.Log.NoUsuario.setVisible(false);
        
         this.Log.TxtUsuario.setActionCommand("TXTUS");
        this.Log.TxtUsuario.addActionListener(this);
        this.Log.TxtUsuario.setName("TXTUS");
        this.Log.TxtUsuario.addMouseListener(this);
        
        this.Log.TxtPass.setActionCommand("TXTPASS");
        this.Log.TxtPass.addActionListener(this);
        this.Log.TxtPass.setName("TXTPASS");
        this.Log.TxtPass.addMouseListener(this);
        
        this.Log.OlvidPass.setName("OLVIDAR");
        this.Log.OlvidPass.addMouseListener(this);
        
        this.Log.Registrarse.setName("REGISTER");
        this.Log.Registrarse.addMouseListener(this);
        
          this.Log.Entrar.setActionCommand("INTRO");
        this.Log.Entrar.addActionListener(this);
}
 
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (BLLControllerLogin.Accion.valueOf(e.getActionCommand())){
            
            case TXTUS:
                this.Log.TxtPass.requestFocus();
                break;
                
            case TXTPASS:
                BLLLogin.Entrar(1);
                break;
                
            case INTRO:
                BLLLogin.Entrar(1);
                break;
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        switch (BLLControllerLogin.Accion.valueOf(e.getComponent().getName())){
            case OLVIDAR:
                this.Log.dispose();
                 new BLLControllerVO(new Contraseña_O(),1).iniciar(1);
                break;
                
            case REGISTER:
                BLLControllerVntEmp.mod=-1;
                this.Log.dispose();
                 new BLLControllerVntEmp(new Vnt_Empleados()).iniciar();
                break;
            case TXTUS:
                this.Log.TxtUsuario.setBackground(Color.white);
                break;
                
            case TXTPASS:
                this.Log.TxtPass.setBackground(Color.white);
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
