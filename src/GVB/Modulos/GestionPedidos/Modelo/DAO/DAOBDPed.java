/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionPedidos.Modelo.DAO;

import GVB.Librerias.Funcions;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.ArrayListEF;
import GVB.Modulos.GestionPedidos.Modelo.Classe.ArrayListPedidos;
import GVB.Modulos.GestionPedidos.Modelo.Classe.Pedidos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinche
 */
public class DAOBDPed {
     public static int nuevoPedDAO(Connection con) {
        PreparedStatement stmt = null;
        int resultado = 0;
       try {
           
            stmt = con.prepareStatement("INSERT INTO gvbbdd.pedidos"
                    + "( DNI, Coste, ID_P, Nombre_P"
                    + ", Cantidad) "
                    + "VALUES(?,?,?,?,?)");

            stmt.setString(1, ArrayListPedidos.pe.getDNI());
           
            stmt.setFloat(2, ArrayListPedidos.pe.getCoste());
            stmt.setInt(3,ArrayListPedidos.pe.getID_P());
            stmt.setString(4, ArrayListPedidos.pe.getNombre_P());
            stmt.setInt(5, ArrayListPedidos.pe.getCantidad());
            
            
 
            resultado = stmt.executeUpdate();

       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Ha habido un problema al insertar un nuevo producto!");
        } 
        finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ha habido un error Logger!");
                }
            }
        }
        return resultado;
    }

    //Listamos todos los productos y los metemos en su array
    public static void listAllPedDAO(Connection con) {
        ResultSet rs;
        PreparedStatement stmt = null;

        ArrayListPedidos.ped.clear();
        try {
        
            stmt = con.prepareStatement("SELECT * FROM gvbbdd.pedidos");
         
            
            rs = stmt.executeQuery();
            
            Pedidos pr;
            while (rs.next()) {

                pr = new Pedidos(0);
                pr.setID(rs.getInt("ID"));
                pr.setDNI(rs.getString("DNI"));
                pr.setCoste(rs.getFloat("Coste"));
                pr.setID_P(rs.getInt("ID_P"));
                pr.setNombre_P(rs.getString("Nombre_P"));
                pr.setCantidad(rs.getInt("Cantidad"));
                
                if(ArrayListEF.us.getTipo().equals("admin")){
                     ArrayListPedidos.ped.add(pr);
                }else{
                if(ArrayListEF.us.getdNi().equals(pr.getDNI()))
                ArrayListPedidos.ped.add(pr);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un problema al obtener los pedidos!");
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ha habido un error Logger!");
                }
            }
        }

    }

   

    //Buscamos por ID un producto
    public static boolean buscarPorIDDAO(Connection con) {
        boolean ok = false;
        ResultSet rs = null;
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM gvbbdd.pedidos WHERE ID=?");
            stmt.setInt(1, ArrayListPedidos.pe.getID());
            rs = stmt.executeQuery();
            while (rs.next()) {

                obtenPedFila(rs);
            }
            ok = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un problema al buscar el pedido por ID");
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error en el Logger");
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error en el Logger");
                }
            }
        }
        return ok;
    }
 
 
    public static boolean obtenPedFila(ResultSet rs) {
        boolean error=false;
        try {

                ArrayListPedidos.pe.setID(rs.getInt("ID"));
                ArrayListPedidos.pe.setDNI(rs.getString("DNI"));
                ArrayListPedidos.pe.setCoste(rs.getFloat("Coste"));
                ArrayListPedidos.pe.setID_P(rs.getInt("ID_P"));
                ArrayListPedidos.pe.setNombre_P(rs.getString("Nombre_P"));
                ArrayListPedidos.pe.setCantidad(rs.getInt("Cantidad"));
            

        } catch (SQLException ex) {
            error=true;
        }
        return error;
    }

   

    
     public static void listporID(Connection con, int i) {
        ResultSet rs;
        PreparedStatement stmt = null;
        //DNI, Nombre, Telef, edad, Fnac, Fcontr" + ", Email, usuario, Password, Estado, Tipo, Avatar, Sueldof, Sueldoh, Antig
        ArrayListPedidos.ped.clear();
        try {
            
            if(i==0){
            stmt = con.prepareStatement("SELECT * FROM gvbbdd.pedidos ORDER BY ID");
            }
            if(i==1){
                    stmt = con.prepareStatement("SELECT * FROM gvbbdd.pedidos ORDER BY DNI");
            }
           
            
            
            rs = stmt.executeQuery();
            Pedidos pr;
            while (rs.next()) {

     

               
                  pr = new Pedidos(0);
                pr.setID(rs.getInt("ID"));
                pr.setDNI(rs.getString("DNI"));
                pr.setCoste(rs.getFloat("Coste"));
                pr.setID_P(rs.getInt("ID_P"));
                pr.setNombre_P(rs.getString("Nombre_P"));
                pr.setCantidad(rs.getInt("Cantidad"));
                
                if(ArrayListEF.us.getTipo().equals("admin")){
                     ArrayListPedidos.ped.add(pr);
                }else{
                if(ArrayListEF.us.getdNi().equals(pr.getDNI()))
                ArrayListPedidos.ped.add(pr);
                }

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un problema al obtener los pedidos!");
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ha habido un error Logger!");
                }
            }
        }

    }
}
