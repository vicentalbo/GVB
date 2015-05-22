/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionProd.Pager.Modelo;

import GVB.Modulos.GestionEmpleados.Pager.Vista.Paginador;
import GVB.Modulos.GestionEmpleados.GestionE.Modelo.Classe.SimpleTableModel_E;
import GVB.Modulos.GestionEmpleados.Pager.Controlador.BLLControllerPaginador;
import static GVB.Modulos.GestionEmpleados.Pager.Modelo.pagina.box;
import static GVB.Modulos.GestionEmpleados.Pager.Modelo.pagina.itemsPerPage;
import static GVB.Modulos.GestionEmpleados.Pager.Modelo.pagina.maxPageIndex;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JRadioButton;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;

/**
 *
 * @author Vinche
 */
public class pagina {

    public static final LinkViewRadioButtonUI ui = new LinkViewRadioButtonUI();
    public static int LR_PAGE_SIZE = 5;
    public static Box box = Box.createHorizontalBox();

    public static int currentPageIndex = 1;
    public static int itemsPerPage = 5;
    public static int maxPageIndex;

    public static void inicializa() {
        int rowCount;
        //   switch (ppal.singleton_vtna){
        //      case "interfaz_actor":
        rowCount = ((SimpleTableModel_E) BLLControllerPaginador.Pag.TABLA.getModel()).getRowCount();
        //             break;
        //  case "interfaz_peli": 
        //          rowCount = ((SimpleTableModel_EH)pager.modules.pelis.interfaz_peli.TABLA.getModel()).getRowCount();
        //          break;
        //  case "interfaz_socio": 
        //          rowCount = ((miniSimpleTableModel_socio)pager.modules.socios.interfaz_socio.TABLA.getModel()).getRowCount();
        //          break;
        //  }

        int v = rowCount % itemsPerPage == 0 ? 0 : 1;
        maxPageIndex = rowCount / itemsPerPage + v;

        box.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
        //     switch (ppal.singleton_vtna){
        //         case "interfaz_actor":
        Paginador.jPanel4.setLayout(new BorderLayout());
        Paginador.jPanel4.add(pagina.box);
        //                 break;
        //        case "interfaz_peli": 
        //                interfaz_peli.jPanel4.setLayout(new BorderLayout());
        //               interfaz_peli.jPanel4.add(pagina.box);
        //               break;
        //        case "interfaz_socio": 
        //               interfaz_socio.jPanel4.setLayout(new BorderLayout());
        //               interfaz_socio.jPanel4.add(pagina.box);
        //               break;
        //  }   
    }

    public static void initLinkBox() {
        //  switch (ppal.singleton_vtna){
        //      case "interfaz_actor":
        BLLControllerPaginador.sorter.setRowFilter(new RowFilter<TableModel, Integer>() {
            @Override
            public boolean include(RowFilter.Entry<? extends TableModel, ? extends Integer> entry) {
                int ti = currentPageIndex - 1;
                int ei = entry.getIdentifier();
                return ti * itemsPerPage <= ei && ei < ti * itemsPerPage + itemsPerPage;
            }
        });
        /**
         * break; case "interfaz_peli":
         * pager.modules.pelis.interfaz_peli.sorter.setRowFilter(new
         * RowFilter<TableModel, Integer>() {
         *
         * @Override public boolean
         * include(RowFilter.Entry<? extends TableModel, ? extends Integer>
         * entry) { int ti = currentPageIndex - 1; int ei =
         * entry.getIdentifier(); return ti*itemsPerPage<=ei &&
         * ei<ti*itemsPerPage+itemsPerPage; } }); break; case "interfaz_socio":
         * pager.modules.socios.interfaz_socio.sorter.setRowFilter(new
         * RowFilter<TableModel, Integer>() { @Override public boolean
         * include(RowFilter.Entry<? extends TableModel, ? extends Integer>
         * entry) { int ti = currentPageIndex - 1; int e
         * i =
         * entry.getIden tifier(); return ti*itemsPerPage<=ei &&
         * ei<ti*itemsPerPage+itemsPerPage; } });
         *
         */ //             break;
        //  }

        int startPageIndex = currentPageIndex - LR_PAGE_SIZE;
        int endPageIndex;
        if (startPageIndex <= 0) {
            startPageIndex = 1;
        }

        int rowCount;
        //  switch (ppal.singleton_vtna){
        //     case "interfaz_actor":
        rowCount = ((SimpleTableModel_E) GVB.Modulos.GestionEmpleados.Pager.Vista.Paginador.TABLA.getModel()).getRowCount();
        /**
         * break; case "interfaz_peli": rowCount =
         * ((miniSimpleTableModel_peli)pager.modules.pelis.interfaz_peli.TABLA.getModel()).getRowCount();
         * break; case "interfaz_socio": rowCount =
         * ((miniSimpleTableModel_socio)pager.modules.socios.interfaz_socio.TABLA.getModel()).getRowCount();
         * break;
         *
         */
    //}

    int v = rowCount % itemsPerPage == 0 ? 0 : 1;
    maxPageIndex  = rowCount / itemsPerPage + v;
    endPageIndex  = currentPageIndex + LR_PAGE_SIZE - 1;
    if(endPageIndex
    >maxPageIndex

    
        ) {
            endPageIndex = maxPageIndex;
    }

    box.removeAll ();
    if(  (rowCount
    <=itemsPerPage
    ) && (rowCount

    
        >0)  ){ //caben todos los datos en la misma página
     //       switch (ppal.singleton_vtna){
    //        case "interfaz_actor":
                //actualizar botones y caja: desactivarlos
                GVB.Modulos.GestionEmpleados.Pager.Vista.Paginador.primero.setEnabled(false);
            GVB.Modulos.GestionEmpleados.Pager.Vista.Paginador.ANTERIOR.setEnabled(false);
            GVB.Modulos.GestionEmpleados.Pager.Vista.Paginador.SIGUIENTE.setEnabled(false);
            GVB.Modulos.GestionEmpleados.Pager.Vista.Paginador.ultimo.setEnabled(false);
            GVB.Modulos.GestionEmpleados.Pager.Vista.Paginador.CAJA.setText("");
        //          break;
        /**
         * case "interfaz_peli": //actualizar botones y caja: desactivarlos
         * pager.modules.pelis.interfaz_peli.primero.setEnabled(false);
         * pager.modules.pelis.interfaz_peli.ANTERIOR.setEnabled(false);
         * pager.modules.pelis.interfaz_peli.SIGUIENTE.setEnabled(false);
         * pager.modules.pelis.interfaz_peli.ultimo.setEnabled(false);
         * pager.modules.pelis.interfaz_peli.CAJA.setText(""); break; case
         * "interfaz_socio": //actualizar botones y caja: desactivarlos
         * pager.modules.socios.interfaz_socio.primero.setEnabled(false);
         * pager.modules.socios.interfaz_socio.ANTERIOR.setEnabled(false);
         * pager.modules.socios.interfaz_socio.SIGUIENTE.setEnabled(false);
         * pager.modules.socios.interfaz_socio.ultimo.setEnabled(false);
         * pager.modules.socios.interfaz_socio.CAJA.setText(""); break;
         */ //          }
        //actualizar enlaces: sólo 1 enlace
        ButtonGroup bg = new ButtonGroup();
        box.add(Box.createHorizontalGlue());
        JRadioButton c = makeRadioButton(1);
        box.add(c);
        bg.add(c);
        box.add(Box.createHorizontalGlue());
        box.revalidate();
        box.repaint();

    }
    else if(rowCount

    
        ==0) { //no hay rdos
      //      switch (ppal.singleton_vtna){
        //    case "interfaz_actor":
                //actualizar botones y caja: desactivarlos
      /**          pager.modules.actores.interfaz_actor.primero.setEnabled(false);
                pager.modules.actores.interfaz_actor.ANTERIOR.setEnabled(false);
                pager.modules.actores.interfaz_actor.SIGUIENTE.setEnabled(false);
                pager.modules.actores.interfaz_actor.ultimo.setEnabled(false);
                pager.modules.actores.interfaz_actor.CAJA.setText("");
                     break;
     
          case "interfaz_peli": 
                //actualizar botones y caja: desactivarlos
                pager.modules.pelis.interfaz_peli.primero.setEnabled(false);
                pager.modules.pelis.interfaz_peli.ANTERIOR.setEnabled(false);
                pager.modules.pelis.interfaz_peli.SIGUIENTE.setEnabled(false);
                pager.modules.pelis.interfaz_peli.ultimo.setEnabled(false);
                pager.modules.pelis.interfaz_peli.CAJA.setText("");
                break;
           case "interfaz_socio": 
     **/           //actualizar botones y caja: desactivarlos
                GVB.Modulos.GestionEmpleados.Pager.Vista.Paginador.primero.setEnabled(false);
            GVB.Modulos.GestionEmpleados.Pager.Vista.Paginador.ANTERIOR.setEnabled(false);
            GVB.Modulos.GestionEmpleados.Pager.Vista.Paginador.SIGUIENTE.setEnabled(false);
            GVB.Modulos.GestionEmpleados.Pager.Vista.Paginador.ultimo.setEnabled(false);
            GVB.Modulos.GestionEmpleados.Pager.Vista.Paginador.CAJA.setText("");
        //      break;
        // }
        //actualizar enlaces: no hay enlaces
        ButtonGroup bg = new ButtonGroup();
        box.add(Box.createHorizontalGlue());
        JRadioButton c = makeRadioButton(0);
        box.add(c);
        bg.add(c);
        box.add(Box.createHorizontalGlue());
        box.revalidate();
        box.repaint();

    }
    else if(rowCount
    >itemsPerPage

    
        ) {
     //       switch (ppal.singleton_vtna){
       //         case "interfaz_actor":
         /**          GVB.Modulos.Pager.Paginador.primero.setEnabled(currentPageIndex>1);
                    GVB.Modulos.Pager.Paginador.ANTERIOR.setEnabled(currentPageIndex>1);
                    GVB.Modulos.Pager.Paginador.SIGUIENTE.setEnabled(currentPageIndex<maxPageIndex);
                    pager.modules.actores.interfaz_actor.ultimo.setEnabled(currentPageIndex<maxPageIndex);
                    pager.modules.actores.interfaz_actor.CAJA.setText(Integer.toString(currentPageIndex) + String.format(" / %d", maxPageIndex));
                    break;
                case "interfaz_peli": 
                    pager.modules.pelis.interfaz_peli.primero.setEnabled(currentPageIndex>1);
                    pager.modules.pelis.interfaz_peli.ANTERIOR.setEnabled(currentPageIndex>1);
                    pager.modules.pelis.interfaz_peli.SIGUIENTE.setEnabled(currentPageIndex<maxPageIndex);
                    pager.modules.pelis.interfaz_peli.ultimo.setEnabled(currentPageIndex<maxPageIndex);
                    pager.modules.pelis.interfaz_peli.CAJA.setText(Integer.toString(currentPageIndex) + String.format(" / %d", maxPageIndex));
                    break;
                case "interfaz_socio": 
    **/               GVB.Modulos.GestionEmpleados.Pager.Vista.Paginador.primero.setEnabled(currentPageIndex > 1);
            GVB.Modulos.GestionEmpleados.Pager.Vista.Paginador.ANTERIOR.setEnabled(currentPageIndex > 1);
            GVB.Modulos.GestionEmpleados.Pager.Vista.Paginador.SIGUIENTE.setEnabled(currentPageIndex < maxPageIndex);
            GVB.Modulos.GestionEmpleados.Pager.Vista.Paginador.ultimo.setEnabled(currentPageIndex < maxPageIndex);
            GVB.Modulos.GestionEmpleados.Pager.Vista.Paginador.CAJA.setText(Integer.toString(currentPageIndex) + String.format(" / %d", maxPageIndex));
        //    break;
        //  }

        ButtonGroup bg = new ButtonGroup();
        box.add(Box.createHorizontalGlue());
        for (int i = startPageIndex; i <= endPageIndex; i++) {
            JRadioButton c = makeRadioButton(i);
            box.add(c);
            bg.add(c);
        }
        box.add(Box.createHorizontalGlue());
        box.revalidate();
        box.repaint();
    }
    }

    public static JRadioButton makeRadioButton(final int target) {
        JRadioButton radio = new JRadioButton(String.valueOf(target)) {
            @Override
            protected void fireStateChanged() {
                ButtonModel model1 = getModel();
                if (!model1.isEnabled()) {
                    setForeground(Color.GRAY);
                } else if (model1.isPressed() && model1.isArmed()) {
                    setForeground(Color.GREEN);
                } else if (model1.isSelected()) {
                    setForeground(Color.RED);
                }
                super.fireStateChanged();
            }
        };
        radio.setForeground(Color.BLUE);
        radio.setUI(ui);
        if (target == currentPageIndex) {
            radio.setSelected(true);
        }
        radio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentPageIndex = target;
                initLinkBox();
            }
        });
        return radio;
    }

}
