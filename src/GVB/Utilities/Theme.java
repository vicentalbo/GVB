package GVB.Utilities;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Theme {

	public static void temaVisual(int tema) {
		try {

			switch (tema) {

			case 0:// metal
				UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
				break;

			case 1:// windows
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				break;

			case 2:// Motif
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
				break;

			case 3:// Nimbus
				UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
				break;

			}

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "No pudo cargarse la apariencia deseada\n" + e.getMessage(), "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
