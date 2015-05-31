/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionEmpleados.GestionEF.Modelo.BLL;

import GVB.Modulos.GestionEmpleados.GestionE.Modelo.BLL.BLL;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.DAO.EFDAOBD;
import GVB.Modulos.GestionLogin.Modelo.DAO.DAOLoginBD;
import GVB.classes.Conexion;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinche
 */
public class EFBLLBD {

    public static int nuevoEFBLL() {
        int result;
        Connection _con;

        Conexion _conexion_DB = new Conexion();

        _con = _conexion_DB.AbrirConexion();
        

        result = EFDAOBD.nuevoEFDAO(_con);

        _conexion_DB.CerrarConexion(_con);
        return result;
    }
    // * obtener un arraylist con todos los clientes disponibles

    public static void listAllEFBLL() {
        Connection _con;
        Conexion _conexion_DB = new Conexion();

        _con = _conexion_DB.AbrirConexion();
        
        try {
            EFDAOBD.listAllEFDAO(_con);//Recuperamos los usuarios       
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un error Logger2!");
        }
        _conexion_DB.CerrarConexion(_con);
    }

     // modificar un cliente existente en la BD
    public static boolean modificarEFBLL() {
        boolean ok;
        Connection _con;

        Conexion _conexion_DB = new Conexion();

        _con = _conexion_DB.AbrirConexion();
        

        ok = EFDAOBD.modificarEFDAO(_con);
        _conexion_DB.CerrarConexion(_con);
        return ok;
    }

     // eliminar un cliente de la BD
    public static boolean borrarEFBLL() {
        Connection _con;
        boolean ok;

        Conexion _conexion_DB = new Conexion();

        _con = _conexion_DB.AbrirConexion();
        
        ok = EFDAOBD.borrarEFDAO(_con);
        _conexion_DB.CerrarConexion(_con);
        return ok;
    }

     //* buscar en la BD un cliente por su DNI
    public static boolean buscarPorDniBLL() {
        Connection _con;
        boolean ok;
        Conexion _conexion_DB = new Conexion();

        _con = _conexion_DB.AbrirConexion();
        
        ok = EFDAOBD.buscarPorDniDAO(_con);
        _conexion_DB.CerrarConexion(_con);
        return ok;
    }
    public static String Proced_Activos(){
        String cad;
        Connection con;
        Conexion conDB=new Conexion();
        
        con=conDB.AbrirConexion();
        
        cad=EFDAOBD.Proced_Activos(con);
        
        conDB.CerrarConexion(con);
        return cad;
    }
    public static void ImprimirDNI(int i){
        Connection con;
        Conexion conDB=new Conexion();
        
        con=conDB.AbrirConexion();
        
        EFDAOBD.listporDNI(con, i);
        
        conDB.CerrarConexion(con);
        
        BLL.GuardarTodo();
    }
}
