package GVB.Librerias;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.ArrayListEF;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.EmpleadoFijo;

import GVB.Modulos.GestionProd.GestionProductos.Modelo.Classe.ArrayListPro;
import GVB.Modulos.GestionProd.GestionProductos.Modelo.Classe.Productos;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;

public class xml {
	private static final String ENCODING = "UTF-8";

	public static void generaxmlEF() {
		String PATH ;
		try {
			OutputStream os = new ByteArrayOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, EmpleadoFijo.class);

			String header = "<?xml version=\"1.0\" encoding=\"" + ENCODING + "\"?>\n";
			xstream.toXML(ArrayListEF.efi, osw);
			StringBuffer xml = new StringBuffer();
			xml.append(header);
			xml.append(os.toString());

			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setAcceptAllFileFilterUsed(false);
			fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("XML (*.xml)", "xml"));
			int seleccion = fileChooser.showSaveDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				PATH = PATH + ".xml";

				FileWriter fileXml = new FileWriter(PATH);
				fileXml.write(xml.toString());
				fileXml.close();
				osw.close();
				os.close();
				JOptionPane.showMessageDialog(null, "Archivo XML guardado con exito", "Archivo TXT",
						JOptionPane.INFORMATION_MESSAGE);

			}
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Error al grabar el XML", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	

	
public static void generaxmlProd() {
		String PATH ;
		try {
			OutputStream os = new ByteArrayOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, Productos.class);

			String header = "<?xml version=\"1.0\" encoding=\"" + ENCODING + "\"?>\n";
			xstream.toXML(ArrayListPro.pro, osw);
			StringBuffer xml = new StringBuffer();
			xml.append(header);
			xml.append(os.toString());

			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setAcceptAllFileFilterUsed(false);
			fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("XML (*.xml)", "xml"));
			int seleccion = fileChooser.showSaveDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				PATH = PATH + ".xml";

				FileWriter fileXml = new FileWriter(PATH);
				fileXml.write(xml.toString());
				fileXml.close();
				osw.close();
				os.close();
				JOptionPane.showMessageDialog(null, "Archivo XML guardado con exito", "Archivo TXT",
						JOptionPane.INFORMATION_MESSAGE);

			}
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Error al grabar el XML", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}
