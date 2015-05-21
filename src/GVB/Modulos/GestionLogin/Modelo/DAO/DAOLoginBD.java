/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionLogin.Modelo.DAO;

import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.ArrayListEF;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.DAO.EFDAOBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinche
 */
public class DAOLoginBD {

    public static boolean buscarPorXDAO(Connection con, int i) {
        boolean error = true;
        ResultSet rs = null;
        PreparedStatement stmt = null;
        try {
            if (i == 0) {
                stmt = con.prepareStatement("SELECT * FROM gvbbdd.empleados WHERE Email=?");
                stmt.setString(1, ArrayListEF.e.getEmail());
            }
            if (i == 1) {
                stmt = con.prepareStatement("SELECT * FROM gvbbdd.empleados WHERE usuario=?");
                stmt.setString(1, ArrayListEF.e.getUsuario());
            }
            rs = stmt.executeQuery();
            while (rs.next()) {
                error = EFDAOBD.obtenEFFila(rs);
                error = false;
            }
        } catch (SQLException ex) {
            error = true;
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
        return error;
    }
    
}
