/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionPedidos.Modelo.Classe;




import static GVB.Modulos.GestionPedidos.Controlador.BLLControllerPedidos.Pag;
import GVB.Modulos.GestionPedidos.Modelo.BLL.BLLBDPed;
import GVB.Modulos.GestionPedidos.Modelo.Classe.Pedidos;
import GVB.Modulos.GestionPedidos.Modelo.Classe.ArrayListPedidos;
import GVB.Modulos.GestionPedidos.Modelo.pagina;



import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Vinche
 */
public class SimpleTableModel_Ped extends AbstractTableModel {
    public static ArrayList<Pedidos> datos = new ArrayList();
    public static ArrayList<Pedidos> datosaux = new ArrayList();
    String[] columnas = {"ID", "DNI", "ID Producto", "Nombre", "Coste", "Cantidad"};

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
        Pedidos fila = (Pedidos) datos.get(row);

        switch (col) {
            case 0:
                dev = fila.getID();
                break;

            case 1:
                dev = fila.getDNI();
                break;

            case 2:

                dev = fila.getID_P();

                break;

            case 3:
                dev = fila.getNombre_P();
                break;
            
            case 4:
                dev = fila.getCoste();
                break;
            case 5:
                dev = fila.getCantidad();
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
        Pedidos fila = (Pedidos) datos.get(row);

        switch (col) {
            case 0:
                fila.setID(new Integer(value.toString()));
                break;

            case 1:
                fila.setDNI(value.toString());
                break;

            case 2:
                fila.setID_P(new Integer(value.toString()));
                break;

            case 3:
                fila.setNombre_P(value.toString());
                break;
            
            case 4:
                fila.setCoste(new Float(value.toString()));
                break;
                case 5:
                fila.setCantidad(new Integer(value.toString()));
                break;
            
        }
        fireTableCellUpdated(row, col);
    }

    public void addRow(Pedidos usu) {
        datos.add(usu);
        fireTableDataChanged();
    }

    public void cargar() {
        datos.clear();
        datosaux.clear();
        BLLBDPed.listAllPedBLL();
        
 
        for (int i = 0; i <  ArrayListPedidos.ped.size(); i++) {
    
           datos.add(ArrayListPedidos.ped.get(i));
          datosaux.add(ArrayListPedidos.ped.get(i));
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
         String ID=Pag.buscador.getText();
        for (int i = 0; i < datosaux.size(); i++) {
            if (((datosaux.get(i).getID())+"").toLowerCase().contains(ID.toLowerCase())) {
                
                addRow(datosaux.get(i));
                cont++;
            }
        }
        Pag.Proceds.setText(cont+" Coincidencias");
        pagina.initLinkBox();
    }

    public Pedidos buscar(String u) {
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

    public int buscaUsuario(Pedidos u) {
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
