package GVB.Librerias;


public class Validate {

	public static boolean validaEmail(String email) {
		return email
				.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	}

	public static boolean validaNombre(String nombre) { // para validar
														// nombres/apellidos/ciudades/...
		return nombre.matches("[a-zA-z]+([ ][a-zA-Z]+)*");
	}

	public static boolean validaDNI(String dNI) {
		boolean val = true;
		String dni2 = "", caracteres = "TRWAGMYFPDXBNJZSQVHLCKET";
		int dni = 0, modulo = 0;
		try {
			for (int i = 0; i < 8; i++)
				dni2 += dNI.charAt(i);

			char letra = dNI.charAt(8);
			dni = Integer.parseInt(dni2);
			modulo = dni % 23;
			char let = caracteres.charAt(modulo);
			if (let == letra)
				val = true;
			else
				val = false;
		} catch (Exception e) {
			
			val = false;
		}
		return val;
	}

	public static boolean contrasenna(String contra) {
		return contra.matches("(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$");
	}

	public static boolean validaTelf(String telf) {
		return telf
				.matches("0{0,2}([\\+]?[\\d]{1,3} ?)?([\\(]([\\d]{2,3})[)] ?)?[0-9][0-9 \\-]{6,}( ?([xX]|([eE]xt[\\.]?)) ?([\\d]{1,5}))?");
	}

	public static boolean validaCP(String cp) {
		return cp.matches("^([1-9]{2}|[0-9][1-9]|[1-9][0-9])[0-9]{3}$");
	}

	public static boolean validaCIF(String cIF) {
		return cIF.matches("^[a-zA-Z]{1}[0-9]{8}$");
	}

	public static boolean validaFecha(String fecha) {
		return fecha
				.matches("(0[1-9]|[12][0-9]|3[01])([/]|[-])(0[1-9]|1[012])([/]|[-])((175[7-9])|(17[6-9][0-9])|(1[8-9][0-9][0-9])|([2-9][0-9][0-9][0-9]))");
	}

}
