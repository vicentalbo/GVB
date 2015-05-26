/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.classes;

import GVB.Librerias.Funcions;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.BLL.EFBLLBD;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.ArrayListEF;
import GVB.Modulos.GestionProd.GestionProductos.Modelo.Classe.ArrayListPro;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Vinche
 */
public class Files_Usuario {

    public static String PATH_auto = "";

    public static void pintar(JLabel etiqueta, JLabel etiNom) {
        ImageIcon icon = new ImageIcon(ArrayListEF.us.getAvatar());
        Image img = icon.getImage();
        Image newimg = img.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newimg);
        etiqueta.setIcon(newIcon);

        etiNom.setText(ArrayListEF.us.getNombre());
    }
    
     public static void pintar_Pro(JLabel etiqueta) {
        ImageIcon icon = new ImageIcon(ArrayListPro.p.getImagen());
        Image img = icon.getImage();
        Image newimg = img.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newimg);
        etiqueta.setIcon(newIcon);

        
    }
    public static String pintar_String(JLabel etiqueta, int ancho, int alto){
        
        
         String ruta, totalpath="";
        File imagen;
        BufferedImage image;
        String extension;
        JFileChooser fileChooser = new JFileChooser();

        lista_blanca(fileChooser);
        fileChooser.setCurrentDirectory(null);
        fileChooser.setSelectedFile(null);

        int seleccion = fileChooser.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            imagen = fileChooser.getSelectedFile();

            ruta = imagen.getAbsolutePath();
            if (ruta.length() > 500) {
                JOptionPane.showMessageDialog(null, "La ruta de la imagen debe "
                        + "tener como máximo 500 caracteres", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                ImageIcon icon = new ImageIcon(ruta);
                Image img = icon.getImage();
                Image newimg = img.getScaledInstance(ancho, alto, java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimg);
                etiqueta.setIcon(newIcon); //pintamos la imagen en jlabel1

                try {
                    //guardamos la imagen
                    image = ImageIO.read(fileChooser.getSelectedFile().toURL());
                    extension = fileChooser.getSelectedFile().toURL().toString().substring(
                            fileChooser.getSelectedFile().toURL().toString().length() - 3);
                    String cad = Funcions.getCadenaAleatoria2(5);

                    PATH_auto = new java.io.File("") + "src/GVB/img/Prods/" + cad + "." + extension;
                    File f = new File(PATH_auto);
                    ImageIO.write(image, extension, f);
                    
                        totalpath=("src/GVB/img/Prods/" + cad + "." + extension);
                        
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error upload imagen", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        return totalpath;
        
    }
    public static void pintar_guardar_imag(JLabel etiqueta, int ancho, int alto, int i) {
        String ruta;
        File imagen;
        BufferedImage image;
        String extension;
        JFileChooser fileChooser = new JFileChooser();

        lista_blanca(fileChooser);
        fileChooser.setCurrentDirectory(null);
        fileChooser.setSelectedFile(null);

        int seleccion = fileChooser.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            imagen = fileChooser.getSelectedFile();

            ruta = imagen.getAbsolutePath();
            if (ruta.length() > 500) {
                JOptionPane.showMessageDialog(null, "La ruta de la imagen debe "
                        + "tener como máximo 500 caracteres", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                ImageIcon icon = new ImageIcon(ruta);
                Image img = icon.getImage();
                Image newimg = img.getScaledInstance(ancho, alto, java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimg);
                etiqueta.setIcon(newIcon); //pintamos la imagen en jlabel1

                try {
                    //guardamos la imagen
                    image = ImageIO.read(fileChooser.getSelectedFile().toURL());
                    extension = fileChooser.getSelectedFile().toURL().toString().substring(
                            fileChooser.getSelectedFile().toURL().toString().length() - 3);
                    String cad = Funcions.getCadenaAleatoria2(5);

                    PATH_auto = new java.io.File("") + "src/GVB/img/Avatar/" + cad + "." + extension;
                    File f = new File(PATH_auto);
                    ImageIO.write(image, extension, f);
                    if (i == 0) {
                        ArrayListEF.us.setAvatar("src/GVB/img/Avatar/" + cad + "." + extension);
                        ArrayListEF.e = ArrayListEF.us;
                        EFBLLBD.modificarEFBLL();
                    
                    }else{
                        ArrayListEF.e.setAvatar("src/GVB/img/Avatar/" + cad + "." + extension);
                        EFBLLBD.modificarEFBLL();
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error upload imagen", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
   
    }



    public static void lista_blanca(JFileChooser buscador) {
        buscador.setAcceptAllFileFilterUsed(false);
        buscador.addChoosableFileFilter(new FileNameExtensionFilter("Imágenes (*.jpg, *.gif, *.png)", "jpg", "gif", "png"));
    }
}
