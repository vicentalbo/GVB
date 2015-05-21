/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionEmpleados.GestionEF.Modelo.DAO;

import GVB.Modulos.GestionEmpleados.GestionE.Modelo.DAO.DAO;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.ArrayListEF;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.EmpleadoFijo;
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
public class EFDAOBD {

    public static int nuevoEFDAO(Connection con) {
        PreparedStatement stmt = null;
        int resultado = 0;
        try {
            stmt = con.prepareStatement("INSERT INTO gvbbdd.empleados"
                    + "(Nombre, DNI, Telef, edad, Fnac, Fcontr"
                    + ", Email, usuario, Password, Estado, Tipo, Avatar, Sueldof, Sueldoh, Antig) "
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            stmt.setString(1, ArrayListEF.e.getNombre());
            stmt.setString(2, ArrayListEF.e.getdNi());
            stmt.setString(3, ArrayListEF.e.getTelef());
            stmt.setInt(4, ArrayListEF.e.getEdad());
            stmt.setString(5, (ArrayListEF.e.getFnac()).toString());
            stmt.setString(6, ArrayListEF.e.getFcontr().toString());
            stmt.setString(7, ArrayListEF.e.getEmail());
            stmt.setString(8, ArrayListEF.e.getUsuario());
            stmt.setString(9, ArrayListEF.e.getPassword());
            stmt.setInt(10, ArrayListEF.e.getEstado());
            stmt.setString(11, ArrayListEF.e.getTipo());
            stmt.setString(12, ArrayListEF.e.getAvatar());
            stmt.setFloat(13, ArrayListEF.e.getSueldof());
            stmt.setFloat(14, ArrayListEF.e.getSueldoh());
            stmt.setInt(15, ArrayListEF.e.getAntig());

            resultado = stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un problema al insertar un nuevo usuario!");
        } finally {
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

    //Listamos todos los clientes y los metemos en su array
    public static void listAllEFDAO(Connection con) {
        ResultSet rs;
        PreparedStatement stmt = null;
        //DNI, Nombre, Telef, edad, Fnac, Fcontr" + ", Email, usuario, Password, Estado, Tipo, Avatar, Sueldof, Sueldoh, Antig
        ArrayListEF.efi.clear();
        try {
            stmt = con.prepareStatement("SELECT * FROM gvbbdd.empleados");
            rs = stmt.executeQuery();
            EmpleadoFijo em;
            while (rs.next()) {

                em = new EmpleadoFijo("");

                em.setNombre(rs.getString("Nombre"));
                em.setdNi(rs.getString("DNI"));
                em.setTelef(rs.getString("Telef"));
                em.setEdad(rs.getInt("edad"));
                em.setFnac(DAO.sacaFecha(rs.getString("Fnac")));
                em.setFcontr(DAO.sacaFecha(rs.getString("Fcontr")));
                em.setEmail(rs.getString("Email"));
                em.setUsuario(rs.getString("usuario"));
                em.setPassword(rs.getString("Password"));
                em.setEstado(rs.getInt("Estado"));
                em.setTipo(rs.getString("Tipo"));
                em.setAvatar(rs.getString("Avatar"));
                em.setSueldof(rs.getInt("Sueldof"));
                em.setSueldoh(rs.getInt("Sueldoh"));
                em.setAntig(rs.getInt("Antig"));
                ArrayListEF.efi.add(em);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un problema al obtener los usuarios!");
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

   //Modificamos un cliente
    public static boolean modificarEFDAO(Connection con) {
        boolean ok = false;
        PreparedStatement stmt = null;
        try {
            //DNI, Nombre, Telef, edad, Fnac, Fcontr" + ", Email, usuario, Password, Estado, Tipo, Avatar, Sueldof, Sueldoh, Antig
            stmt = con.prepareStatement("UPDATE gvbbdd.empleados SET  Nombre=?, DNI=?,"
                    + "Telef=?, Edad=?, Fnac=?, Fcontr=?,"
                    + "Email=?, usuario=?, Password=?, Estado=?, "
                    + "Tipo=?, Avatar=?, Sueldof=?, Sueldoh=?, Antig=? WHERE DNI=?");

            stmt.setString(1, ArrayListEF.e.getNombre());
            stmt.setString(2, ArrayListEF.e.getdNi());
            stmt.setString(3, ArrayListEF.e.getTelef());
            stmt.setInt(4, ArrayListEF.e.getEdad());
            stmt.setString(5, (ArrayListEF.e.getFnac()).toString());
            stmt.setString(6, ArrayListEF.e.getFcontr().toString());
            stmt.setString(7, ArrayListEF.e.getEmail());
            stmt.setString(8, ArrayListEF.e.getUsuario());
            stmt.setString(9, ArrayListEF.e.getPassword());
            stmt.setInt(10, ArrayListEF.e.getEstado());
            stmt.setString(11, ArrayListEF.e.getTipo());
            stmt.setString(12, ArrayListEF.e.getAvatar());
            stmt.setFloat(13, ArrayListEF.e.getSueldof());
            stmt.setFloat(14, ArrayListEF.e.getSueldoh());
            stmt.setInt(15, ArrayListEF.e.getAntig());

            stmt.setString(16, ArrayListEF.e.getdNi());
            stmt.executeUpdate();

            
            ok = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un problema al actualizar el usuario!");
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

    //Borramos un cliente
    public static boolean borrarEFDAO(Connection con) {
        PreparedStatement stmt = null;
        boolean ok = false;

        try {
            stmt = con.prepareStatement("DELETE FROM gvbbdd.empleados WHERE DNI=?");
            stmt.setString(1, ArrayListEF.e.getdNi());
            stmt.executeUpdate();
            ok = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un error al eliminar el usuario!");
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

    //Buscamos por dni un cliente
    public static boolean buscarPorDniDAO(Connection con) {
        boolean ok = false;
        ResultSet rs = null;
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM gvbbdd.empleados WHERE DNI=?");
            stmt.setString(1, ArrayListEF.e.getdNi());
            rs = stmt.executeQuery();
            while (rs.next()) {

                obtenEFFila(rs);
            }
            ok = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un problema al buscar el usuario por DNI");
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
 
 
    public static boolean obtenEFFila(ResultSet rs) {
        boolean error=false;
        try {

            ArrayListEF.e.setNombre(rs.getString("Nombre"));
            ArrayListEF.e.setdNi(rs.getString("DNI"));
            ArrayListEF.e.setTelef(rs.getString("Telef"));
            ArrayListEF.e.setEdad(rs.getInt("edad"));
            ArrayListEF.e.setFnac(DAO.sacaFecha(rs.getString("Fnac")));
            ArrayListEF.e.setFcontr(DAO.sacaFecha(rs.getString("Fcontr")));
            ArrayListEF.e.setEmail(rs.getString("Email"));
            ArrayListEF.e.setUsuario(rs.getString("usuario"));
            ArrayListEF.e.setPassword(rs.getString("Password"));
            ArrayListEF.e.setEstado(rs.getInt("Estado"));
            ArrayListEF.e.setTipo(rs.getString("Tipo"));
            ArrayListEF.e.setAvatar(rs.getString("Avatar"));
            ArrayListEF.e.setSueldof(rs.getInt("Sueldof"));
            ArrayListEF.e.setSueldoh(rs.getInt("Sueldoh"));
            ArrayListEF.e.setAntig(rs.getInt("Antig"));

        } catch (SQLException ex) {
            error=true;
        }
        return error;
    }

    public static String Proced_Activos(Connection con) {
        String cadena = "";
        CallableStatement cstmt = null;
        try {
            

            cstmt = con.prepareCall("{call Usuarios_Activos(?)}");
            cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
            cstmt.execute();
            cadena ="Usuarios activos: " + cstmt.getInt(1);
            
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, se.getErrorCode() + ": " + se.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                if (cstmt != null) {
                    cstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception fe) {
            }
            
        }
        return cadena;

    }
     public static void listporDNI(Connection con, int i) {
        ResultSet rs;
        PreparedStatement stmt = null;
        //DNI, Nombre, Telef, edad, Fnac, Fcontr" + ", Email, usuario, Password, Estado, Tipo, Avatar, Sueldof, Sueldoh, Antig
        ArrayListEF.efi.clear();
        try {
            if(i==0){
            stmt = con.prepareStatement("SELECT * FROM gvbbdd.empleados ORDER BY DNI");
            }
            if(i==1){
                    stmt = con.prepareStatement("SELECT * FROM gvbbdd.empleados ORDER BY edad");
            }
            rs = stmt.executeQuery();
            EmpleadoFijo em;
            while (rs.next()) {

                em = new EmpleadoFijo("");

                em.setNombre(rs.getString("Nombre"));
                em.setdNi(rs.getString("DNI"));
                em.setTelef(rs.getString("Telef"));
                em.setEdad(rs.getInt("edad"));
                em.setFnac(DAO.sacaFecha(rs.getString("Fnac")));
                em.setFcontr(DAO.sacaFecha(rs.getString("Fcontr")));
                em.setEmail(rs.getString("Email"));
                em.setUsuario(rs.getString("usuario"));
                em.setPassword(rs.getString("Password"));
                em.setEstado(rs.getInt("Estado"));
                em.setTipo(rs.getString("Tipo"));
                em.setAvatar(rs.getString("Avatar"));
                em.setSueldof(rs.getInt("Sueldof"));
                em.setSueldoh(rs.getInt("Sueldoh"));
                em.setAntig(rs.getInt("Antig"));
                ArrayListEF.efi.add(em);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un problema al obtener los usuarios!");
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
