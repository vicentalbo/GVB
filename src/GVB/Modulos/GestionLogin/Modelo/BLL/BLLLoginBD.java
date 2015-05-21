/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionLogin.Modelo.BLL;

import GVB.Modulos.GestionLogin.Modelo.DAO.DAOLoginBD;
import GVB.classes.Conexion;
import java.sql.Connection;

/**
 *
 * @author Vinche
 */
public class BLLLoginBD {

    public static boolean BuscarPorX(int i) {
        Connection con;
        boolean ok;
        Conexion conDB = new Conexion();
        con = conDB.AbrirConexion();
        ok = DAOLoginBD.buscarPorXDAO(con, i);
        conDB.CerrarConexion(con);
        return ok;
    }
    
}
