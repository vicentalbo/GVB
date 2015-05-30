/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionPedidos.Modelo.BLL;

import GVB.Modulos.GestionPedidos.Modelo.DAO.DAOBDPed;
import GVB.classes.Conexion;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinche
 */
public class BLLBDPed {
    public static int nuevoPedBLL() {
        int result;
        Connection _con;

        Conexion _conexion_DB = new Conexion();

        _con = _conexion_DB.AbrirConexion();
        

        result = DAOBDPed.nuevoPedDAO(_con);

        _conexion_DB.CerrarConexion(_con);
        return result;
    }
    // * obtener un arraylist con todos los clientes disponibles

    public static void listAllPedBLL() {
        Connection _con;
        Conexion _conexion_DB = new Conexion();

        _con = _conexion_DB.AbrirConexion();
        
        try {
            DAOBDPed.listAllPedDAO(_con);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un error Logger2!");
        }
        _conexion_DB.CerrarConexion(_con);
    }
public static boolean buscarPorIDBLL() {
        Connection _con;
        boolean ok;
        Conexion _conexion_DB = new Conexion();

        _con = _conexion_DB.AbrirConexion();
        
        ok = DAOBDPed.buscarPorIDDAO(_con);
        _conexion_DB.CerrarConexion(_con);
        return ok;
    }
    
    public static void ImprimirID(int i){
        Connection con;
        Conexion conDB=new Conexion();
        
        con=conDB.AbrirConexion();
        
        DAOBDPed.listporID(con, i);
        
        conDB.CerrarConexion(con);
        
        BLLGraficoPed.GuardarTodo();
    }
}
