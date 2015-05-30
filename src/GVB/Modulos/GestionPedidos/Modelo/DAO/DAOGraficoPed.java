/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.GestionPedidos.Modelo.DAO;

import GVB.Librerias.Funcions;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.BLL.EFBLLBD;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.ArrayListEF;

import GVB.Modulos.GestionPedidos.Modelo.Classe.ArrayListPedidos;
import GVB.Modulos.GestionPedidos.Modelo.Classe.Pedidos;
import GVB.Modulos.GestionProd.GestionProductos.Modelo.Classe.ArrayListPro;
import static GVB.Modulos.GestionProd.Pager.Controlador.BLLControllerPaginador.Pag;
import GVB.classes.Config;
import GVB.classes.Mail;

/**
 *
 * @author Vinche
 */
public class DAOGraficoPed {
    public static void Comprar(int cantidad){
        float coste, sobra;
        if(Pag.puntos.isSelected()){
            if(ArrayListEF.us.getSueldoh()<(ArrayListPro.p.getPrecio()*cantidad)){
            coste=(ArrayListPro.p.getPrecio()*cantidad)-ArrayListEF.us.getSueldoh();
            sobra=0;
            }
            else{
                sobra=ArrayListEF.us.getSueldoh()-(ArrayListPro.p.getPrecio()*cantidad);
                coste=0;
                
            }
            if(coste>0)
            sobra= sobra+(coste*0.05f);
                
        }else{
            sobra=ArrayListEF.us.getSueldoh()+((ArrayListPro.p.getPrecio()*cantidad)*0.05f);
        }
        ArrayListEF.us.setSueldoh(sobra);
                ArrayListEF.e=ArrayListEF.us;
                EFBLLBD.modificarEFBLL();
        ArrayListPedidos.pe=new Pedidos( ArrayListEF.us.getdNi(), (ArrayListPro.p.getPrecio()*cantidad), ArrayListPro.p.getID(), ArrayListPro.p.getNombre(), cantidad );
    }
    public static void Factura(){
        String message = "Compra realizada el " + "\n" + "Usuario: " + ArrayListPedidos.pe.getDNI() + "\n" + "Producto: " + ArrayListPedidos.pe.getNombre_P() + "\n" + "Cantidad: " + ArrayListPedidos.pe.getCantidad()+ "\n"+"Coste: "+ ArrayListPedidos.pe.getCoste()+Config.getMoneda()+"\n"+"Gracias por usar su compra";
                Mail correo = new Mail("1erdaw2015@gmail.com", "villadaw", ArrayListEF.us.getEmail(), "Compra "+ArrayListPedidos.pe.getID(), message);
                String correoStr = correo.send();
                if (correoStr.equals("")) {
                    Funcions.result("Se le ha enviado un email con los datos de la factura");
                }
    }
    public static void aviso(){
        
        String message="El producto con ID "+ArrayListPedidos.pe.getID()+" tiene un stock menor a 5 ";
         Mail correo = new Mail("1erdaw2015@gmail.com", "villadaw", "vicent.albo@gmail.com", "Stock bajo", message);
                correo.send();
    }
}
