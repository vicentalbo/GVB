/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB;

import GVB.Librerias.Funcions;
import GVB.Modulos.GestionEmpleados.GestionE.Modelo.Classe.Empleado;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.BLL.EFBLLBD;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.ArrayListEF;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.EmpleadoFijo;
import GVB.Modulos.GestionProd.GestionProductos.Modelo.BLL.BLLBDProd;
import GVB.Modulos.GestionProd.GestionProductos.Modelo.Classe.ArrayListPro;
import GVB.Modulos.GestionProd.GestionProductos.Modelo.Classe.Productos;
import GVB.Modulos.GestionProd.GestionProductos.Modelo.DAO.DAOBDProd;
import GVB.classes.Conexion;
import GVB.classes.Fechas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;


/**
 *
 * @author Vinche
 */
public class Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Calendar fca = Calendar.getInstance();
        
        Funcions.result(fca.get(Calendar.DATE)+"-"+(fca.get(Calendar.MONTH)+1)+"-"+fca.get(Calendar.YEAR));
      /*Connection _con;
        Conexion _conexion_DB = new Conexion();

        _con = _conexion_DB.AbrirConexion();
        
       ResultSet rs;
        PreparedStatement stmt = null;

        
        try {
            stmt = _con.prepareStatement("SELECT * FROM gvbbdd.productos");
            rs = stmt.executeQuery();
            Productos pr;
            while (rs.next()) {

                pr = new Productos(0);
                pr.setID(rs.getInt("ID"));
                pr.setNombre(rs.getString("Nombre"));
                pr.setPrecio(rs.getFloat("Precio"));
                pr.setStock(rs.getInt("Stock"));
                pr.setTipo(rs.getString("Tipo"));
                pr.setDescripcion(rs.getString("Descripcion"));
                pr.setImagen(rs.getString("Imagen"));
                ArrayListPro.pro.add(pr);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un problema al obtener los productos!");
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ha habido un error Logger!");
                }
            }
        _conexion_DB.CerrarConexion(_con);
    }*/
}
}
