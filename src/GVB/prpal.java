package GVB;
import GVB.Modulos.GestionLogin.Controlador.BLLControllerLogin;
import GVB.Modulos.GestionLogin.Vista.Login;
import GVB.Modulos.Menu.Controlador.BLLControllerPpal;
import GVB.Modulos.Menu.Vista.Start;

import GVB.classes.Config;
public class prpal {
public static Config conf;
    
	public static void main(String[] args) {
          
            conf = new Config();
                        

            new BLLControllerPpal(new Start(), -1).iniciar(-1);

	}

}
