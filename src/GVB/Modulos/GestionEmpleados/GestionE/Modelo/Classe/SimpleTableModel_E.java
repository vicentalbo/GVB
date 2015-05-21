/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionEmpleados.GestionE.Modelo.Classe;

import GVB.Modulos.GestionEmpleados.GestionE.Modelo.BLL.BLL;
import GVB.Modulos.GestionEmpleados.GestionE.Modelo.Classe.Empleado;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.BLL.EFBLLBD;

import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.ArrayListEF;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.EmpleadoFijo;
import GVB.Modulos.GestionEmpleados.Pager.Controlador.BLLControllerPaginador;
import static GVB.Modulos.GestionEmpleados.Pager.Controlador.BLLControllerPaginador.Pag;
import GVB.Modulos.GestionEmpleados.Pager.Vista.Paginador;
import GVB.Modulos.GestionEmpleados.Pager.Modelo.pagina;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Vinche
 */
public class SimpleTableModel_E extends AbstractTableModel {
    public static ArrayList<EmpleadoFijo> datos = new ArrayList();
    public static ArrayList<EmpleadoFijo> datosaux = new ArrayList();
    String[] columnas = {"DNI", "Nombre", "Teléfono", "Edad", "Sueldo anual"};

    ////////////////////estos métodos son necesarios para que jtable funcione/////////////////////
    @Override
    public String getColumnName(int col) {
        return columnas[col].toString();
    }

    //Devuelve el numero de filas
    @Override
    public int getRowCount() {
        return datos.size();
    }

    //Devuelve el numero de columnas
    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    //Devuelve el valor del objeto en la fila y columna
    @Override
    public Object getValueAt(int row, int col) {

        Object dev = null;
        Empleado fila = (EmpleadoFijo) datos.get(row);

        switch (col) {
            case 0:
                dev = fila.getdNi();
                break;

            case 1:
                dev = fila.getNombre();
                break;

            case 2:

                dev = fila.getTelef();

                break;

            case 3:
                dev = fila.getEdad();
                break;
            
            case 4:
                dev = ((EmpleadoFijo) fila).getSueldoh();
                break;
            

        }
        return dev;
    }

    //Determina si una fila y columna ha de ser editable
    @Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }

    //Actualiza un objeto de una fila y columna
    @Override
    public void setValueAt(Object value, int row, int col) {
        Empleado fila = (EmpleadoFijo) datos.get(row);

        switch (col) {
            case 0:
                fila.setdNi(value.toString());
                break;

            case 1:
                fila.setNombre(value.toString());
                break;

            case 2:
                fila.setTelef(value.toString());
                break;

            case 3:
                fila.setEdad(new Integer(value.toString()));
                break;
            
            case 4:
                ((EmpleadoFijo) fila).setSueldoh(Float.parseFloat(value.toString()));
                break;
            
        }
        fireTableCellUpdated(row, col);
    }

    public void addRow(Empleado usu) {
        datos.add((EmpleadoFijo) usu);
        fireTableDataChanged();
    }

    public void cargar() {
        datos.clear();
        datosaux.clear();
        EFBLLBD.listAllEFBLL();
        
 
        for (int i = 0; i <  ArrayListEF.efi.size(); i++) {
    
           datos.add(ArrayListEF.efi.get(i));
          datosaux.add(ArrayListEF.efi.get(i));
            try {
                Thread.sleep(1); //1 milliseconds
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void filtrar() {
       datos.clear();
       int cont=0;
         String dni=Pag.buscador.getText();
        for (int i = 0; i < datosaux.size(); i++) {
            if (datosaux.get(i).getdNi().toLowerCase().contains(dni.toLowerCase())) {
                addRow(datosaux.get(i));
                cont++;
            }
        }
        Pag.Proceds.setText(cont+" Coincidencias");
        pagina.initLinkBox();
    }

    public Empleado buscar(String u) {
        datos.clear();
        cargar();

        String res;
        for (int i = 0; i < datos.size(); i++) {
            res =datos.get(i).toString();
            if (res.contains(u)) {
                return datos.get(i);
            }
        }
        return null;
    }

    public int buscaUsuario(Empleado u) {
        datos.clear();
        cargar();

        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).equals(u)) {
                return i;
            }
        }
        return -1;
    }

    public void removeRow(int fila) {
         datos.remove(fila);
        fireTableDataChanged();
    }

    //para pintar ImageIcon
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }
}
