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
import GVB.Modulos.GestionEmpleados.GestionEH.Modelo.Classe.ArrayListEH;
import GVB.Modulos.GestionEmpleados.GestionEH.Modelo.Classe.EmpleadoHoras;
import GVB.Modulos.GestionEmpleados.GestionET.Modelo.Classe.ArrayListET;
import GVB.Modulos.GestionEmpleados.GestionET.Modelo.Classe.EmpleadoTemp;

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

	public static void generaxmlEH() {
		String PATH = null;
		try {
			OutputStream os = new ByteArrayOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, EmpleadoHoras.class);

			String header = "<?xml version=\"1.0\" encoding=\"" + ENCODING + "\"?>\n";
			xstream.toXML(ArrayListEH.eho, osw);
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

	public static void generaxmlET() {
		String PATH = null;
		try {
			OutputStream os = new ByteArrayOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, EmpleadoTemp.class);

			String header = "<?xml version=\"1.0\" encoding=\"" + ENCODING + "\"?>\n";
			xstream.toXML(ArrayListET.ete, osw);
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

	public static void generaxmlOcultoEF() {
		String PATH = null;
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

			PATH = new java.io.File(".").getCanonicalPath()
					+ "/src/GVB/Modulos/GestionEmpleados/GestionEF/Modelo/Archivo/ef.xml";

			FileWriter fileXml = new FileWriter(PATH);
			fileXml.write(xml.toString());
			fileXml.close();
			osw.close();
			os.close();

		} catch (Exception e1) {
		}
	}

	public static void generaxmlOcultoEH() {
		String PATH = null;
		try {
			OutputStream os = new ByteArrayOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, EmpleadoHoras.class);

			String header = "<?xml version=\"1.0\" encoding=\"" + ENCODING + "\"?>\n";
			xstream.toXML(ArrayListEH.eho, osw);
			StringBuffer xml = new StringBuffer();
			xml.append(header);
			xml.append(os.toString());

			PATH = new java.io.File(".").getCanonicalPath()
					+ "/src/GVB/Modulos/GestionEmpleados/GestionEH/Modelo/Archivo/eh.xml";

			FileWriter fileXml = new FileWriter(PATH);
			fileXml.write(xml.toString());
			fileXml.close();
			osw.close();
			os.close();

		} catch (Exception e1) {
		}
	}

	public static void generaxmlOcultoET() {
		String PATH = null;
		try {
			OutputStream os = new ByteArrayOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, EmpleadoTemp.class);

			String header = "<?xml version=\"1.0\" encoding=\"" + ENCODING + "\"?>\n";
			xstream.toXML(ArrayListET.ete, osw);
			StringBuffer xml = new StringBuffer();
			xml.append(header);
			xml.append(os.toString());

			PATH = new java.io.File(".").getCanonicalPath()
					+ "/src/GVB/Modulos/GestionEmpleados/GestionET/Modelo/Archivo/et.xml";

			FileWriter fileXml = new FileWriter(PATH);
			fileXml.write(xml.toString());
			fileXml.close();
			osw.close();
			os.close();

		} catch (Exception e1) {
		}
	}

	public static ArrayList<EmpleadoFijo> abrir_xmlEF() {
		String PATH = null;
		try {
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, EmpleadoFijo.class);

			JFileChooser fileChooser = new JFileChooser();
			int seleccion = fileChooser.showOpenDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				ArrayListEF.efi = (ArrayList<EmpleadoFijo>) xstream.fromXML(new FileReader(PATH));
			}

		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Error al leer el XML", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return ArrayListEF.efi;
	}

	public static ArrayList<EmpleadoHoras> abrir_xmlEH() {
		String PATH = null;
		try {
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, EmpleadoHoras.class);

			JFileChooser fileChooser = new JFileChooser();
			int seleccion = fileChooser.showOpenDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				ArrayListEH.eho = (ArrayList<EmpleadoHoras>) xstream.fromXML(new FileReader(PATH));
			}

		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Error al leer el XML", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return ArrayListEH.eho;
	}

	public static ArrayList<EmpleadoTemp> abrir_xmlET() {
		String PATH = null;
		try {
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, EmpleadoTemp.class);

			JFileChooser fileChooser = new JFileChooser();
			int seleccion = fileChooser.showOpenDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				ArrayListET.ete = (ArrayList<EmpleadoTemp>) xstream.fromXML(new FileReader(PATH));
			}

		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Error al leer el XML", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return ArrayListET.ete;
	}

	public static ArrayList<EmpleadoFijo> abrir_xmlOcultoEF() {
		String PATH = null;
		try {
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, EmpleadoFijo.class);

			PATH = new java.io.File(".").getCanonicalPath()
					+ "/src/GVB/Modulos/GestionEmpleados/GestionEF/Modelo/Archivo/ef.xml";
			ArrayListEF.efi = (ArrayList<EmpleadoFijo>) xstream.fromXML(new FileReader(PATH));

		} catch (Exception e1) {

		}
		return ArrayListEF.efi;
	}

	public static ArrayList<EmpleadoHoras> abrir_xmlOcultoEH() {
		String PATH = null;
		try {
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, EmpleadoHoras.class);

			PATH = new java.io.File(".").getCanonicalPath()
					+ "/src/GVB/Modulos/GestionEmpleados/GestionEH/Modelo/Archivo/eh.xml";
			ArrayListEH.eho = (ArrayList<EmpleadoHoras>) xstream.fromXML(new FileReader(PATH));

		} catch (Exception e1) {

		}
		return ArrayListEH.eho;
	}

	public static ArrayList<EmpleadoTemp> abrir_xmlOcultoET() {
		String PATH = null;
		try {
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, EmpleadoTemp.class);

			PATH = new java.io.File(".").getCanonicalPath()
					+ "/src/GVB/Modulos/GestionEmpleados/GestionET/Modelo/Archivo/et.xml";
			ArrayListET.ete = (ArrayList<EmpleadoTemp>) xstream.fromXML(new FileReader(PATH));

		} catch (Exception e1) {

		}
		return ArrayListET.ete;
	}

}
