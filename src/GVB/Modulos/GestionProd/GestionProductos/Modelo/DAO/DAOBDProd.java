/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionProd.GestionProductos.Modelo.DAO;

import GVB.Librerias.Funcions;
import GVB.Modulos.GestionProd.GestionProductos.Modelo.Classe.ArrayListPro;
import GVB.Modulos.GestionProd.GestionProductos.Modelo.Classe.Productos;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinche
 */
public class DAOBDProd {
    public static int nuevoProdDAO(Connection con) {
        PreparedStatement stmt = null;
        int resultado = 0;
       try {
           
            stmt = con.prepareStatement("INSERT INTO gvbbdd.productos"
                    + "( Nombre, Precio, Stock, Tipo, Descripcion"
                    + ", Imagen) "
                    + "VALUES(?,?,?,?,?,?)");

            stmt.setString(1, ArrayListPro.p.getNombre());
           
            stmt.setFloat(2, ArrayListPro.p.getPrecio());
            stmt.setInt(3,ArrayListPro.p.getStock());
            stmt.setString(4, ArrayListPro.p.getTipo());
            stmt.setString(5, ArrayListPro.p.getDescripcion());
            stmt.setString(6, ArrayListPro.p.getImagen());
            
 
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
    public static void listAllProdDAO(Connection con) {
        ResultSet rs;
        PreparedStatement stmt = null;

        ArrayListPro.pro.clear();
        try {
            stmt = con.prepareStatement("SELECT * FROM gvbbdd.productos");
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
        }

    }

   //Modificamos un producto
    public static boolean modificarProdDAO(Connection con) {
        boolean ok = false;
        PreparedStatement stmt = null;
        try {
           
            stmt = con.prepareStatement("UPDATE gvbbdd.productos SET Nombre=?,"
                    + "Precio=?, Stock=?, Tipo=?, Descripcion=?,"
                    + "Imagen=? WHERE ID=?");

            
            stmt.setString(1, ArrayListPro.p.getNombre());
           
            stmt.setFloat(2, ArrayListPro.p.getPrecio());
            stmt.setInt(3,ArrayListPro.p.getStock());
            stmt.setString(4, ArrayListPro.p.getTipo());
            stmt.setString(5, ArrayListPro.p.getDescripcion());
            stmt.setString(6, ArrayListPro.p.getImagen());

            stmt.setInt(7, ArrayListPro.p.getID());
            stmt.executeUpdate();

            
            ok = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un problema al actualizar el producto!");
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ha habido un error Logger!");
                }
            }
        }
        return ok;
    }

    //Borramos un producto
    public static boolean borrarProdDAO(Connection con) {
        PreparedStatement stmt = null;
        boolean ok = false;

        try {
            stmt = con.prepareStatement("DELETE FROM gvbbdd.productos WHERE ID=?");
            stmt.setInt(1, ArrayListPro.p.getID());
            stmt.executeUpdate();
            ok = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un error al eliminar el producto!");
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error en el Logger!");
                }
            }
        }
        return ok;
    }

    //Buscamos por ID un producto
    public static boolean buscarPorIDDAO(Connection con) {
        boolean ok = false;
        ResultSet rs = null;
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM gvbbdd.productos WHERE ID=?");
            stmt.setInt(1, ArrayListPro.p.getID());
            rs = stmt.executeQuery();
            while (rs.next()) {

                obtenProdFila(rs);
            }
            ok = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un problema al buscar el producto por ID");
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
 
 
    public static boolean obtenProdFila(ResultSet rs) {
        boolean error=false;
        try {
ArrayListPro.p.setID(rs.getInt("ID"));
            ArrayListPro.p.setNombre(rs.getString("Nombre"));
            
            ArrayListPro.p.setPrecio(rs.getFloat("Precio"));
            ArrayListPro.p.setStock(rs.getInt("Stock"));
            ArrayListPro.p.setTipo((rs.getString("Tipo")));
           ArrayListPro.p.setDescripcion((rs.getString("Descripcion")));
            ArrayListPro.p.setImagen(rs.getString("Imagen"));
            

        } catch (SQLException ex) {
            error=true;
        }
        return error;
    }

   

    
     public static void listporID(Connection con, int i) {
        ResultSet rs;
        PreparedStatement stmt = null;
        //DNI, Nombre, Telef, edad, Fnac, Fcontr" + ", Email, usuario, Password, Estado, Tipo, Avatar, Sueldof, Sueldoh, Antig
        ArrayListPro.pro.clear();
        try {
            if(i==0){
            stmt = con.prepareStatement("SELECT * FROM gvbbdd.productos ORDER BY ID");
            }
            if(i==1){
                    stmt = con.prepareStatement("SELECT * FROM gvbbdd.productos ORDER BY Tipo");
            }
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
        }

    }
}
