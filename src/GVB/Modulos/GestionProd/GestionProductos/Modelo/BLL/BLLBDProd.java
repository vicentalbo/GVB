/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionProd.GestionProductos.Modelo.BLL;

import GVB.Modulos.GestionProd.GestionProductos.Modelo.DAO.DAOBDProd;
import GVB.classes.Conexion;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinche
 */
public class BLLBDProd {
    public static int nuevoProdBLL() {
        int result;
        Connection _con;

        Conexion _conexion_DB = new Conexion();

        _con = _conexion_DB.AbrirConexion();
        

        result = DAOBDProd.nuevoProdDAO(_con);

        _conexion_DB.CerrarConexion(_con);
        return result;
    }
    // * obtener un arraylist con todos los clientes disponibles

    public static void listAllProdBLL() {
        Connection _con;
        Conexion _conexion_DB = new Conexion();

        _con = _conexion_DB.AbrirConexion();
        
        try {
            DAOBDProd.listAllProdDAO(_con);//Recuperamos los usuarios       
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un error Logger2!");
        }
        _conexion_DB.CerrarConexion(_con);
    }

     // modificar un cliente existente en la BD
    public static void modificarProdBLL() {
        boolean ok;
        Connection _con;

        Conexion _conexion_DB = new Conexion();

        _con = _conexion_DB.AbrirConexion();
        

        ok = DAOBDProd.modificarProdDAO(_con);
        _conexion_DB.CerrarConexion(_con);
    }

     // eliminar un cliente de la BD
    public static void borrarProdBLL() {
        Connection _con;
        boolean ok;

        Conexion _conexion_DB = new Conexion();

        _con = _conexion_DB.AbrirConexion();
        
        ok = DAOBDProd.borrarProdDAO(_con);
        _conexion_DB.CerrarConexion(_con);
    }

     //* buscar en la BD un cliente por su DNI
    public static boolean buscarPorIDBLL() {
        Connection _con;
        boolean ok;
        Conexion _conexion_DB = new Conexion();

        _con = _conexion_DB.AbrirConexion();
        
        ok = DAOBDProd.buscarPorIDDAO(_con);
        _conexion_DB.CerrarConexion(_con);
        return ok;
    }
    
    public static void ImprimirID(int i){
        Connection con;
        Conexion conDB=new Conexion();
        
        con=conDB.AbrirConexion();
        
        DAOBDProd.listporID(con, i);
        
        conDB.CerrarConexion(con);
        
        BLL.GuardarTodo();
    }
}
