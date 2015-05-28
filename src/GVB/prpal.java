package GVB;
import GVB.Modulos.GestionLogin.Controlador.BLLControllerLogin;
import GVB.Modulos.GestionLogin.Vista.Login;

import GVB.classes.Config;
public class prpal {
public static Config conf;
    
	public static void main(String[] args) {
          
            conf = new Config();
                        

            new BLLControllerLogin(new Login(),2).iniciar(2);

	}

}
