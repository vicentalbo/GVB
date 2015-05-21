package GVB.Librerias;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Format {

	public static String format1dec(float num) {
		DecimalFormat format1 = new DecimalFormat(".#");
		return format1.format(num);
	}

	public static String format2dec(float num) {
		DecimalFormat format2 = new DecimalFormat(".##");
		return format2.format(num);
	}

	public static String format3dec(float num) {
		DecimalFormat format3 = new DecimalFormat(".###");
		return format3.format(num);
	}

	public static String formatDolar(float moneda) {
		NumberFormat coin = NumberFormat.getCurrencyInstance(Locale.US);
		return coin.format(moneda);
	}

	public static String formatLibra(float moneda) {
		NumberFormat coin = NumberFormat.getCurrencyInstance(Locale.UK);
		return coin.format(moneda);
	}

	public static String formatEuro(float moneda) {
		NumberFormat coin = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		return coin.format(moneda);
	}

}
