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
import GVB.Modulos.GestionEmpleados.Pager.Vista.Paginador;
import GVB.Modulos.GestionPedidos.Controlador.BLLControllerPedidos;
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
       new BLLControllerPedidos(new Paginador()).Iniciar();
}
}
