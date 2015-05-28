/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionLogin.Modelo.DAO;

import GVB.Librerias.Funcions;
import GVB.Librerias.Validate;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.BLL.EFBLLBD;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.ArrayListEF;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.EmpleadoFijo;
import GVB.Modulos.GestionLogin.Controlador.BLLControllerLogin;
import static GVB.Modulos.GestionLogin.Controlador.BLLControllerLogin.Log;
import static GVB.Modulos.GestionLogin.Controlador.BLLControllerLogin.Ver;


import GVB.Modulos.GestionLogin.Modelo.BLL.BLLLoginBD;
import GVB.Modulos.GestionLogin.Vista.Contraseña_O;
import GVB.Modulos.GestionLogin.Vista.Verificar;
import GVB.Modulos.Menu.Controlador.BLLControllerPpal;
import GVB.Modulos.Menu.Vista.Ventana_Us;
import GVB.Modulos.Menu.Vista.Ventana_ppal;
import GVB.classes.Mail;
import java.awt.Color;

/**
 *
 * @author Vinche
 */
public class DAOLogin {
    public static void Entrar(int i){
        boolean ok=true, error, pasar;
        
        String pass, usu, encrpass;
        
        pass=BLLControllerLogin.Log.TxtPass.getText();
        usu=BLLControllerLogin.Log.TxtUsuario.getText();
        
        if(pass.isEmpty()){
            BLLControllerLogin.Log.TxtPass.setBackground(Color.red);
            ok=false;
        }
        if(usu.isEmpty()){
            BLLControllerLogin.Log.TxtUsuario.setBackground(Color.red);
            ok=false;
           
        }
        
        if(ok==true){
            if(usu.contains("@")){
                if(Validate.validaEmail(usu)==true){
                    
                
                ArrayListEF.e=new EmpleadoFijo(usu, 0);
                error=BLLLoginBD.BuscarPorX(0);
                try{
                    ArrayListEF.e.getdNi();
                    
                }catch(Exception e){
                    error=true;
                }
                }else{
                    error=true;
                    BLLControllerLogin.Log.TxtUsuario.setBackground(Color.red);
                }
                if((error==true)||(ArrayListEF.e.getdNi().equals(""))){
                    BLLControllerLogin.Log.NoUsuario.setVisible(true);
                }else{
                    pass=BLLControllerLogin.Log.TxtPass.getText();
                   
                    pasar=Funcions.validarTokenMD5(pass, ArrayListEF.e.getPassword());
                    if(pasar==true){
                        ArrayListEF.us=ArrayListEF.e;
                        if(ArrayListEF.us.getEstado()==1){
                        Log.dispose();
                        if(ArrayListEF.e.getTipo().equals("admin"))
                             new BLLControllerPpal(new Ventana_ppal(),0).iniciar(0);
                             else
                                 new BLLControllerPpal(new Ventana_Us(),0).iniciar(0);
                        }else{
                            Log.dispose();
                            if(ArrayListEF.e.getTipo().equals("admin"))
                             new BLLControllerPpal(new Ventana_ppal(),0).iniciar(0);
                             else
                                 new BLLControllerPpal(new Ventana_Us(),0).iniciar(0);
                        }
                    }
                }
            }else{
                //validate
                ArrayListEF.e=new EmpleadoFijo(usu, 1);
                error=BLLLoginBD.BuscarPorX(1);
                try{
                    ArrayListEF.e.getdNi();
                }catch(Exception e){
                    error=true;
                    
                }
                if((error==true)){
                    BLLControllerLogin.Log.NoUsuario.setVisible(true);
                }else{
                     pass=BLLControllerLogin.Log.TxtPass.getText();
                    pasar=Funcions.validarTokenMD5(pass, ArrayListEF.e.getPassword());
                     if(pasar==true){
                         if(i==13){
                             ArrayListEF.e.setEstado(1);
                             EFBLLBD.modificarEFBLL();
                             Ver.dispose();
                             if(ArrayListEF.e.getTipo().equals("admin"))
                             new BLLControllerPpal(new Ventana_ppal(),0).iniciar(0);
                             else
                                 new BLLControllerPpal(new Ventana_Us(),0).iniciar(0);
                         }else{
                         ArrayListEF.us=ArrayListEF.e;
                         if(ArrayListEF.us.getEstado()==1){
                        Log.dispose();
                  if(ArrayListEF.e.getTipo().equals("admin"))
                             new BLLControllerPpal(new Ventana_ppal(),0).iniciar(0);
                             else
                                 new BLLControllerPpal(new Ventana_Us(),0).iniciar(0);
                        }else{
                            Log.dispose();
                            if(ArrayListEF.e.getTipo().equals("admin"))
                             new BLLControllerPpal(new Ventana_ppal(),0).iniciar(0);
                             else
                                 new BLLControllerPpal(new Ventana_Us(),0).iniciar(0);
                        }
                         }
                     }else{
                         Log.NoPass.setVisible(true);
                     }
                }
            }
        }
    }
    public static boolean Contraseña(){
        boolean error=true;
        String email, pass, encpass, message;
        
        email=BLLControllerLogin.Cont.Email.getText();
        
         if(email.isEmpty()){
BLLControllerLogin.Cont.Email.setBackground(Color.red);            
        }else{
             if(Validate.validaEmail(email)==true){
                    
                
                ArrayListEF.e=new EmpleadoFijo(email, 0);
                error=BLLLoginBD.BuscarPorX(0);
                try{
                    ArrayListEF.e.getdNi();
                    
                }catch(Exception e){
                    error=true;
                }
                }else{
                    error=true;
                    BLLControllerLogin.Cont.Email.setBackground(Color.red);
                }
                if((error==true)||(ArrayListEF.e.getdNi().equals(""))){
                BLLControllerLogin.Cont.Email.setBackground(Color.red);
                }else{
                    try{
                    pass=Funcions.getCadenaAleatoria1(8);
                    encpass=Funcions.encriptarTokenMD5(pass);
                    message="Su contraseña ha sido modificada con éxito, para entrar en la aplicación use esta:"+"\n"+pass+"\n"+"\n"+"Si desea cambiar su contraseña hágalo desde la opción de editar usuario"+"\n"+"haciendo click sobre su nombre, el cual está bajo su avatar";
                    Mail correo = new Mail("1erdaw2015@gmail.com", "villadaw", ArrayListEF.e.getEmail(), ArrayListEF.e.getNombre(), message);
                    String env=correo.send();
                    
                        Funcions.result(env);
                    ArrayListEF.e.setPassword(encpass);
                    EFBLLBD.modificarEFBLL();
                    error=false;
                    }catch(Exception e){
                        error=true;
                    }
                }
         }
        EFBLLBD.listAllEFBLL();
        return error;
    }
   
}
