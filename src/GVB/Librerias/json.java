package GVB.Librerias;

import java.io.File;

import java.io.FileWriter;


import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.ArrayListEF;
import GVB.Modulos.GestionEmpleados.GestionEF.Modelo.Classe.EmpleadoFijo;

import GVB.Modulos.GestionProd.GestionProductos.Modelo.Classe.Productos;

import com.google.gson.Gson;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

public class json {

	public static void generajsonEF() {// Guarda Json de empleado fijo
		String PATH = null;
		try {
			XStream xstreamjson = new XStream(new JettisonMappedXmlDriver());
			xstreamjson.setMode(XStream.NO_REFERENCES);
			xstreamjson.alias("EmpleadoFijo", EmpleadoFijo.class);

			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setAcceptAllFileFilterUsed(false);
			fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("JSON (*.json)", "json"));
			int seleccion = fileChooser.showSaveDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				PATH = PATH + ".json";

				Gson gson1 = new Gson();
				String json = gson1.toJson(ArrayListEF.efi);
				FileWriter fileXml = new FileWriter(PATH);
				fileXml.write(json.toString());
				fileXml.close();

				JOptionPane.showMessageDialog(null, "Archivo JSON guardado con exito", "Archivo JSON",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el JSON", "Error", JOptionPane.ERROR_MESSAGE);
		}

	}

	

	

	public static void generajsonProd() {// Guarda Json de producte
		String PATH = null;
		try {
			XStream xstreamjson = new XStream(new JettisonMappedXmlDriver());
			xstreamjson.setMode(XStream.NO_REFERENCES);
			xstreamjson.alias("Productos", Productos.class);

			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setAcceptAllFileFilterUsed(false);
			fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("JSON (*.json)", "json"));
			int seleccion = fileChooser.showSaveDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				PATH = PATH + ".json";

				Gson gson1 = new Gson();
				String json = gson1.toJson(ArrayListEF.efi);
				FileWriter fileXml = new FileWriter(PATH);
				fileXml.write(json.toString());
				fileXml.close();

				JOptionPane.showMessageDialog(null, "Archivo JSON guardado con exito", "Archivo JSON",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el JSON", "Error", JOptionPane.ERROR_MESSAGE);
		}

	}

}
