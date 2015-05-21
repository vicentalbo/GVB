/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionLogin.Modelo.BLL;

import GVB.Modulos.GestionLogin.Modelo.DAO.DAOLogin;

/**
 *
 * @author Vinche
 */
public class BLLLogin {
    public static void Entrar(int i){
        DAOLogin.Entrar(i);
    }
    public static boolean Contraseña(){
    return DAOLogin.Contraseña();
}
}
