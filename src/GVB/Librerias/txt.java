package GVB.Librerias;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

public class txt {
	public static void generatxtEF() {
		String PATH = null;
		try {
			File f;
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setAcceptAllFileFilterUsed(false);
			fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Texto (*.txt)", "txt"));
			int seleccion = fileChooser.showSaveDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				PATH = PATH + ".txt";
				f = new File(PATH);

				FileOutputStream fo = new FileOutputStream(f);
				ObjectOutputStream o = new ObjectOutputStream(fo);
				o.writeObject(ArrayListEF.efi);
				o.close();
				JOptionPane.showMessageDialog(null, "Archivo TXT guardado con exito", "Archivo TXT",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void generatxtEH() {
		String PATH = null;
		try {
			File f;
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setAcceptAllFileFilterUsed(false);
			fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Texto (*.txt)", "txt"));
			int seleccion = fileChooser.showSaveDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				PATH = PATH + ".txt";
				f = new File(PATH);

				FileOutputStream fo = new FileOutputStream(f);
				ObjectOutputStream o = new ObjectOutputStream(fo);
				o.writeObject(ArrayListEH.eho);
				o.close();
				JOptionPane.showMessageDialog(null, "Archivo TXT guardado con exito", "Archivo TXT",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void generatxtET() {
		String PATH = null;
		try {
			File f;
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setAcceptAllFileFilterUsed(false);
			fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Texto (*.txt)", "txt"));
			int seleccion = fileChooser.showSaveDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				PATH = PATH + ".txt";
				f = new File(PATH);

				FileOutputStream fo = new FileOutputStream(f);
				ObjectOutputStream o = new ObjectOutputStream(fo);
				o.writeObject(ArrayListET.ete);
				o.close();
				JOptionPane.showMessageDialog(null, "Archivo TXT guardado con exito", "Archivo TXT",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void generatxtOcultoEF() {
		String PATH = null;
		try {
			File f;
			PATH = new java.io.File(".").getCanonicalPath()
					+ "/src/GVB/Modulos/GestionEmpleados/GestionEF/Modelo/Archivo/ef.txt";

			f = new File(PATH);

			FileOutputStream fo = new FileOutputStream(f);
			ObjectOutputStream o = new ObjectOutputStream(fo);
			o.writeObject(ArrayListEF.efi);
			o.close();

		} catch (Exception e) {
		}
	}

	public static void generatxtOcultoEH() {
		String PATH = null;
		try {
			File f;
			PATH = new java.io.File(".").getCanonicalPath()
					+ "/src/GVB/Modulos/GestionEmpleados/GestionEH/Modelo/Archivo/eh.txt";

			f = new File(PATH);

			FileOutputStream fo = new FileOutputStream(f);
			ObjectOutputStream o = new ObjectOutputStream(fo);
			o.writeObject(ArrayListEH.eho);
			o.close();

		} catch (Exception e) {
		}
	}

	public static void generatxtOcultoET() {
		String PATH = null;
		try {
			File f;
			PATH = new java.io.File(".").getCanonicalPath()
					+ "/src/GVB/Modulos/GestionEmpleados/GestionET/Modelo/Archivo/et.txt";

			f = new File(PATH);

			FileOutputStream fo = new FileOutputStream(f);
			ObjectOutputStream o = new ObjectOutputStream(fo);
			o.writeObject(ArrayListET.ete);
			o.close();

		} catch (Exception e) {
		}
	}

	public static ArrayList<EmpleadoFijo> abrir_txtEF() {
		String PATH = null;
		try {
			File f;
			JFileChooser fileChooser = new JFileChooser();
			int seleccion = fileChooser.showOpenDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				f = new File(PATH);

				FileInputStream fi = new FileInputStream(f);
				ObjectInputStream oi = new ObjectInputStream(fi);
				ArrayListEF.efi = (ArrayList<EmpleadoFijo>) oi.readObject();
				oi.close();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al leer el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return ArrayListEF.efi;
	}

	public static ArrayList<EmpleadoHoras> abrir_txtEH() {
		String PATH = null;
		try {
			File f;
			JFileChooser fileChooser = new JFileChooser();
			int seleccion = fileChooser.showOpenDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				f = new File(PATH);

				FileInputStream fi = new FileInputStream(f);
				ObjectInputStream oi = new ObjectInputStream(fi);
				ArrayListEH.eho = (ArrayList<EmpleadoHoras>) oi.readObject();
				oi.close();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al leer el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return ArrayListEH.eho;
	}

	public static ArrayList<EmpleadoTemp> abrir_txtET() {
		String PATH = null;
		try {
			File f;
			JFileChooser fileChooser = new JFileChooser();
			int seleccion = fileChooser.showOpenDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				f = new File(PATH);

				FileInputStream fi = new FileInputStream(f);
				ObjectInputStream oi = new ObjectInputStream(fi);
				ArrayListET.ete = (ArrayList<EmpleadoTemp>) oi.readObject();
				oi.close();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al leer el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return ArrayListET.ete;
	}

	public static ArrayList<EmpleadoFijo> abrir_txtOcultoEF() {
		String PATH = null;
		try {
			File f;
			PATH = new java.io.File(".").getCanonicalPath()
					+ "/src/GVB/Modulos/GestionEmpleados/GestionEF/Modelo/Archivo/ef.txt";

			f = new File(PATH);

			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream oi = new ObjectInputStream(fi);
			ArrayListEF.efi = (ArrayList<EmpleadoFijo>) oi.readObject();
			oi.close();

		} catch (Exception e) {

		}
		return ArrayListEF.efi;
	}

	public static ArrayList<EmpleadoHoras> abrir_txtOcultoEH() {
		String PATH = null;
		try {
			File f;
			PATH = new java.io.File(".").getCanonicalPath()
					+ "/src/GVB/Modulos/GestionEmpleados/GestionEH/Modelo/Archivo/eh.txt";

			f = new File(PATH);

			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream oi = new ObjectInputStream(fi);
			ArrayListEH.eho = (ArrayList<EmpleadoHoras>) oi.readObject();
			oi.close();

		} catch (Exception e) {

		}
		return ArrayListEH.eho;
	}

	public static ArrayList<EmpleadoTemp> abrir_txtOcultoET() {
		String PATH = null;
		try {
			File f;
			PATH = new java.io.File(".").getCanonicalPath()
					+ "/src/GVB/Modulos/GestionEmpleados/GestionET/Modelo/Archivo/et.txt";

			f = new File(PATH);

			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream oi = new ObjectInputStream(fi);
			ArrayListET.ete = (ArrayList<EmpleadoTemp>) oi.readObject();
			oi.close();

		} catch (Exception e) {

		}
		return ArrayListET.ete;
	}

}
