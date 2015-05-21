/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionLogin.Controlador;

import GVB.Modulos.GestionLogin.Modelo.BLL.BLLLogin;
import GVB.Modulos.GestionLogin.Modelo.DAO.DAOLogin;
import GVB.Modulos.GestionLogin.Vista.Contraseña_O;
import GVB.Modulos.GestionLogin.Vista.Login;
import GVB.Modulos.GestionLogin.Vista.Verificar;
import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinche
 */
public class BLLControllerVO implements ActionListener {
     public static Contraseña_O Cont=new Contraseña_O();
 public static Verificar Ver = new Verificar();

 public enum Action{
     USUARIO,
     PASS,
     ACEPTAR,
     ENVIAR,
     EMAIL,
     VOLVER
 }
  public BLLControllerVO(JFrame Contra, int i) {
if(i==0)
        Ver = (Verificar) Contra;

if(i==1)
    Cont=(Contraseña_O)Contra;

    }
 public void iniciar(int i){
     if(i==0){
     Ver.setTitle("Verificar");
        Ver.setLocationRelativeTo(null);
        Ver.setVisible(true);
        Ver.setResizable(false);

        Ver.setIconImage(Toolkit.getDefaultToolkit().getImage("src/GVB/img/V.jpg"));
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

}
    @Override
    public void actionPerformed(ActionEvent e) {
        if(Ver.isVisible()){
            switch (BLLControllerVO.Action.valueOf(e.getActionCommand())){
                case USUARIO:
                    Ver.Pass.requestFocus();
                    break;
                    
                case PASS:
                    DAOLogin.Entrar(13);
                    break;
                    
                case ACEPTAR:
                    DAOLogin.Entrar(13);
                    break;
            }
        }
            if(Cont.isVisible()){
                boolean error;
                 switch (BLLControllerVO.Action.valueOf(e.getActionCommand())){
                     case EMAIL:
                         BLLLogin.Contraseña();
                         
                         
                         break;
                         
                     case ENVIAR:
                         BLLLogin.Contraseña();
                         break;
                         
                     case VOLVER:
                         BLLControllerVO.Cont.dispose();
                         
                          new BLLControllerLogin(new Login()).iniciar();
                         break;
                 }
            }
            
            
        
    }
    
}
