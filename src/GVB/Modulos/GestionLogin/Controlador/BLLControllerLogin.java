/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionLogin.Controlador;

import GVB.Modulos.GestionEmpleados.GestionE.Controlador.BLLControllerVntEmp;
import GVB.Modulos.GestionEmpleados.GestionE.Vista.Vnt_Empleados;

import GVB.Modulos.GestionLogin.Modelo.BLL.BLLLogin;
import GVB.Modulos.GestionLogin.Modelo.DAO.DAOLogin;
import GVB.Modulos.GestionLogin.Vista.Contraseña_O;
import GVB.Modulos.GestionLogin.Vista.Login;
import GVB.Modulos.GestionLogin.Vista.Verificar;
import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
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
 public static Contraseña_O Cont=new Contraseña_O();
 public static Verificar Ver = new Verificar();
    
    public enum Accion{
        TXTUS,
        TXTPASS,
        INTRO,
        REGISTER,
        OLVIDAR,
         USUARIO,
        PASS,
         ACEPTAR,
         ENVIAR,
         EMAIL,
         VOLVER
    }
 
 
 
 public BLLControllerLogin(JFrame Logg, int i) {
if(i==0)
        Ver = (Verificar) Logg;

if(i==1)
    Cont=(Contraseña_O)Logg;
if(i==2)
        Log = (Login) Logg;

    }
 public void iniciar(int i){
     if(i==2){
     this.Log.setTitle("FastBurger");
        this.Log.setLocationRelativeTo(null);
        this.Log.setVisible(true);
        this.Log.setResizable(false);
        Image icono = Toolkit.getDefaultToolkit().getImage("src/GVB/img/photos/FastBurger.jpg");
        this.Log.setIconImage(icono);
this.Log.setSize(373, 498);
        
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
     if(i==1){
          Cont.setTitle("Recordar Contraseña");
        Cont.setLocationRelativeTo(null);
        Cont.setVisible(true);
        Cont.setResizable(false);

        Cont.setIconImage(Toolkit.getDefaultToolkit().getImage("src/GVB/img/V.jpg"));
         addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
        
                JOptionPane.showMessageDialog(null, "Saliendo de la aplicación");
                Cont.dispose();
                System.exit(0);
            }
        });
         
          this.Cont.Email.setActionCommand("EMAIL");
        this.Cont.Email.addActionListener(this);
        
        this.Cont.Enviar.setActionCommand("ENVIAR");
        this.Cont.Enviar.addActionListener(this);
        
        this.Cont.Volver.setActionCommand("VOLVER");
        this.Cont.Volver.addActionListener(this);
     }
     if(i==0){
         Ver.setTitle("Verificar");
        Ver.setLocationRelativeTo(null);
        Ver.setVisible(true);
        Ver.setResizable(false);

        Ver.setIconImage(Toolkit.getDefaultToolkit().getImage("src/GVB/img/IconFast.jpg"));
         addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
        
                JOptionPane.showMessageDialog(null, "Saliendo de la aplicación");
                Ver.dispose();
                System.exit(0);
            }
        });
         
         this.Ver.Usuario.setActionCommand("USUARIO");
        this.Ver.Usuario.addActionListener(this);
        
         this.Ver.Pass.setActionCommand("PASS");
        this.Ver.Pass.addActionListener(this);
        
         this.Ver.Aceptar.setActionCommand("ACEPTAR");
        this.Ver.Aceptar.addActionListener(this);
     }
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
                case USUARIO:
                    Ver.Pass.requestFocus();
                    break;
                    
                case PASS:
                    DAOLogin.Entrar(13);
                    break;
                    
                case ACEPTAR:
                    DAOLogin.Entrar(13);
                    break;
                     case EMAIL:
                         BLLLogin.Contraseña();
                         
                         
                         break;
                         
                     case ENVIAR:
                         BLLLogin.Contraseña();
                         break;
                         
                     case VOLVER:
                         BLLControllerLogin.Cont.dispose();
                         
                          new BLLControllerLogin(new Login(),2).iniciar(2);
                         break;
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        switch (BLLControllerLogin.Accion.valueOf(e.getComponent().getName())){
            case OLVIDAR:
                this.Log.dispose();
                 new BLLControllerLogin(new Contraseña_O(),1).iniciar(1);
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
