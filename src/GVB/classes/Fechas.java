package GVB.classes;

import GVB.prpal;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;



import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Fechas")
public class Fechas implements Serializable {
	@XStreamAlias("fecha")
	private String fecha;
	@XStreamAlias("dia")
	private int dia;
	@XStreamAlias("mes")
	private int mes;
	@XStreamAlias("anno")
	private int anno;

	public Fechas(String fecha, int dia, int mes, int anno) {

		this.fecha = fecha;
		this.dia = dia;
		this.mes = mes;
		this.anno = anno;
	}

        @Override
	public String toString() {
		String cad = "";

		if (prpal.conf == null)
			cad = dia + "/" + mes + "/" + anno;

		if ("1".equals(Config.getFormaFecha())) {
			cad = dia + "/" + mes + "/" + anno;
		}
		if ("2".equals(Config.getFormaFecha())) {
			cad = anno + "/" + mes + "/" + dia;
		}
		if ("3".equals(Config.getFormaFecha())) {
			cad = mes + "/" + dia + "/" + anno;
		}
		if ("4".equals(Config.getFormaFecha())) {
			cad = dia + "-" + mes + "-" + anno;
		}
		if ("5".equals(Config.getFormaFecha())) {
			cad = anno + "-" + mes + "-" + dia;
		}
		if ("6".equals(Config.getFormaFecha())) {
			cad = mes + "-" + dia + "-" + anno;
		}
		return cad;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public int verMes() {
		if ((this.mes >= 1) && (this.mes <= 12)) {
			return this.mes;
		} else
			return -1;
	}

	public int verAnno() {

		if ((this.anno >= 1900) && (this.anno <= 2020))
			return this.anno;
		else
			return -1;
	}

	public int verDia() {
		int febr = 0, diac = 0;
		if ((this.mes == 1) || (this.mes == 3) || (this.mes == 5) || (this.mes == 6) || (this.mes == 8)
				|| (this.mes == 10) || (this.mes == 12)) {
			if ((this.dia >= 1) && (this.dia <= 31)) {
				diac = dia;
			} else
				diac = -1;
		}

		if ((this.mes == 4) || (this.mes == 7) || (this.mes == 9) || (this.mes == 11)) {
			if ((dia >= 1) && (dia <= 30))
				diac = dia;
			else
				diac = -1;
		}
		if (this.mes == 2) {
			febr = 28;
			if (((this.anno % 4) == 0) && ((this.anno % 100) != 0) || ((this.anno % 400) == 0)) {
				febr = 29;
			}
			if ((this.dia >= 0) && (this.dia <= febr)) {
				diac = dia;
			} else {
				diac = -1;
			}

		}
		return diac;
	}

	public int diaActual() {
		Calendar fech = new GregorianCalendar();
		int dia = fech.get(Calendar.DAY_OF_MONTH);
		return dia;
	}

	public int mesActual() {
		Calendar fech = new GregorianCalendar();
		int mes = fech.get(Calendar.MONTH);
		return mes + 1;
	}

	public int annoActual() {
		Calendar fech = new GregorianCalendar();
		int anyo = fech.get(Calendar.YEAR);
		return anyo;
	}

	public String restaFechas() {
		int annoac = 0, mesac = 0, diaac = 0, dif = 0, difm = 0, difd = 0;
		String diferencia = "";
		Calendar f = Calendar.getInstance();
		annoac = f.get(Calendar.YEAR);
		mesac = f.get(Calendar.MONTH);
		mesac = mesac + 1;
		diaac = f.get(Calendar.DATE);

		dif = annoac - this.anno;
		if (this.mes <= mesac) {
			difm = mesac - this.mes;// posible problema en la resta del actual
									// amb el this.dia/mes/anno
		}
		if (this.mes > mesac) {
			difm = (mesac - (this.mes + 12));
			dif = dif - 1;
		}
		if (this.dia <= diaac) {
			difd = diaac - this.dia;
		}
		if (this.dia > diaac) {
			if ((this.mes == 12) || (this.mes == 2) || (this.mes == 4) || (this.mes == 6) || (this.mes == 7)
					|| (this.mes == 9) || (this.mes == 11)) {
				difd = ((diaac + 31) - (this.dia));
				if (difm > 1)
					difm = difm - 1;
				else {
					difm = 11;
					dif = dif - 1;
				}
			}
			if ((this.mes == 3) || (this.mes == 5) || (this.mes == 8) || (this.mes == 10)) {
				difd = ((diaac + 30) - (this.dia));
				if (difm > 1)
					difm = difm - 1;
				else {
					difm = 12;
					dif = dif - 1;
				}
			}
			if (this.mes == 1) {

				if (((this.anno % 4) == 0) && ((this.anno % 100) != 0) || ((this.anno % 400) == 0)) {
					difd = ((diaac + 29) - (this.dia));
					if (difm > 1)
						difm = difm - 1;
					else {
						difm = 12;
						dif = dif - 1;
					}

				} else {
					difd = ((diaac + 28) - (this.dia));
					if (difm > 1)
						difm = difm - 1;
					else {
						difm = 12;
						dif = dif - 1;
					}
				}
			}
		}
		if ((difd >= 0) && (difm >= 0) && (dif >= 0)) {
			diferencia = "Hay una diferencia de " + difd + " dias " + "\n" + difm + " meses" + "\n" + "y " + dif
					+ " a�os";
		} else {
			diferencia = "Fecha incorrecta, superior a la que existe en memoria";
		}
		return diferencia;
	}

	public String restaFechasIntro(Fechas f1) {
		int annoac = 0, mesac = 0, diaac = 0, dif = 0, difm = 0, difd = 0;
		String diferencia = "";

		annoac = f1.getAnno();
		mesac = f1.getMes();

		diaac = f1.getDia();

		dif = annoac - this.anno;

		if (this.mes <= mesac) {
			difm = mesac - this.mes;// posible problema en la resta del actual
									// amb el this.dia/mes/anno
		}
		if (this.mes > mesac) {
			difm = (mesac - (this.mes + 12));
			dif = dif - 1;
		}
		if (this.dia <= diaac) {
			difd = diaac - this.dia;
		}
		if (this.dia > diaac) {
			if ((this.mes == 12) || (this.mes == 2) || (this.mes == 4) || (this.mes == 6) || (this.mes == 7)
					|| (this.mes == 9) || (this.mes == 11)) {
				difd = ((diaac + 31) - (this.dia));
				if (difm > 1)
					difm = difm - 1;
				else {
					difm = 11;
					dif = dif - 1;
				}
			}
			if ((this.mes == 3) || (this.mes == 5) || (this.mes == 8) || (this.mes == 10)) {
				difd = ((diaac + 30) - (this.dia));
				if (difm > 1)
					difm = difm - 1;
				else {
					difm = 12;
					dif = dif - 1;
				}
			}
			if (this.mes == 1) {

				if (((this.anno % 4) == 0) && ((this.anno % 100) != 0) || ((this.anno % 400) == 0)) {
					difd = ((diaac + 29) - (this.dia));
					if (difm > 1)
						difm = difm - 1;
					else {
						difm = 12;
						dif = dif - 1;
					}

				} else {
					difd = ((diaac + 28) - (this.dia));
					if (difm > 1)
						difm = difm - 1;
					else {
						difm = 12;
						dif = dif - 1;
					}
				}
			}
		}
		if ((difd >= 0) && (difm >= 0) && (dif >= 0)) {
			diferencia = "Hay una diferencia de " + difd + " dias " + "\n" + difm + " meses" + "\n" + "y " + dif
					+ " a�os";
		} else {
			diferencia = "Fecha incorrecta, superior a la que existe en memoria";
		}
		return diferencia;
	}

	public int restaFechasEdad() {
		int annoac , mesac, diaac , dif , difm=0 , difd ;

		Calendar f = Calendar.getInstance();
		annoac = f.get(Calendar.YEAR);
		mesac = f.get(Calendar.MONTH);
		mesac = mesac + 1;
		diaac = f.get(Calendar.DATE);

		dif = annoac - this.anno;

		if (this.mes <= mesac) {
			difm = mesac - this.mes;// posible problema en la resta del actual
									// amb el this.dia/mes/anno
		}
		if (this.mes > mesac) {
			difm = (mesac - (this.mes + 12));
			dif = dif - 1;
		}
		if (this.dia <= diaac) {
			difd = diaac - this.dia;
		}
		if (this.dia > diaac) {
			if ((this.mes == 12) || (this.mes == 2) || (this.mes == 4) || (this.mes == 6) || (this.mes == 7)
					|| (this.mes == 9) || (this.mes == 11)) {
				difd = ((diaac + 31) - (this.dia));
				if (difm > 1)
					difm = difm - 1;
				else {
					difm = 11;
					dif = dif - 1;
				}
			}
			if ((this.mes == 3) || (this.mes == 5) || (this.mes == 8) || (this.mes == 10)) {
				difd = ((diaac + 30) - (this.dia));
				if (difm > 1)
					difm = difm - 1;
				else {
					difm = 12;
					dif = dif - 1;
				}
			}
			if (this.mes == 1) {

				if (((this.anno % 4) == 0) && ((this.anno % 100) != 0) || ((this.anno % 400) == 0)) {
					difd = ((diaac + 29) - (this.dia));
					if (difm > 1)
						difm = difm - 1;
					else {
						difm = 12;
						dif = dif - 1;
					}

				} else {
					difd = ((diaac + 28) - (this.dia));
					if (difm > 1)
						difm = difm - 1;
					else {
						difm = 12;
						dif = dif - 1;
					}
				}
			}
		}
if(dif<0){
    dif=0;
}
		return dif;
	}

	public int comparaFechas(Fechas f1) {// -1 f.compraFechas(f2) "f2" seria
											// menor a "f"
		int val = 0;

		if (this.anno > f1.anno)
			val = 1;
		if (this.anno < f1.anno)
			val = -1;
		if (this.anno == f1.anno) {
			if (this.mes > f1.mes)
				val = 1;
			if (this.mes < f1.mes)
				val = -1;
			if (this.mes == f1.mes) {
				if (this.dia > f1.dia)
					val = 1;
				if (this.dia < f1.dia)
					val = -1;
				if (this.dia == f1.dia)
					val = 0;
			}
		}
		return val;
	}

	public Calendar StringtoCalendar() {

		Calendar c = Calendar.getInstance();
		Date data;

		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");

		try {
			data = formatoFecha.parse(this.fecha);
			c.setTime(data);
		} catch (Exception e) {

			c.set(1, 1, 1);
		}

		return c;

	}

	public String CalendartoString(Calendar c){
		return (c.getTime().toString());
	}
}
