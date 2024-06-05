package primerosherencia.ejercicio1;

/**
 * Clase que representa un instante de tiempo compuesta por hora y minutos
 */
public class Hora {

	/**
	 * Atributo que recoge la hora
	 */
	private int horas=0;
	
	/**
	 * Atributo que recoge los minutos
	 */
	private int minutos=0;

	/**
	 * Constructor que crea una hora, a traves de las horas y minutos pasados por parametros
	 * @param hora Hora usada para crear el objeto Hora
	 * @param minuto Minutos usados para crear el objeto Hora
	 */
	public Hora(int horas, int minutos) {
		if (horas>=0 && horas<=23) {
			this.horas = horas;	
		}
		if (minutos>-1 && minutos<60) {
			this.minutos = minutos;
		}
	}
	
	/**
	 * Setter que se fija si la hora a introducir esta en el rango para cambiarlo
	 * @param horas Recibe como parametro la hora a cambiar
	 * @return Devuelve si la operación ha sido valida o no
	 */
	public boolean setHoras(int horas) {
		boolean valido=false;
		if (horas>=0 && horas<=23) {
			this.horas = horas;	
		}
		return valido;
	}

	/**
	 * Setter que se fija si los minutos a introducir estan en el rango para cambiarlo
	 * @param minutos Recibe como parametro los minutos a cambiar
	 * @return Devuelve si la operación ha sido valida o no
	 */
	public boolean setMinutos(int minutos) {
		boolean valido=false;
		if (minutos>-1 && minutos<60) {
			this.minutos = minutos;
		}
		return valido;
	}

	/**
	 * Metodo que incrementa la hora en un minuto
	 */
	void inc() {
		this.minutos++;
		if (minutos==60) {
			minutos=0;
			horas++;
		}
		if (horas==24) {
			horas=0;
		}
	}
	
	/**
	 * Metodo que sustituye el metodo toString de la clase, devolviendo las horas y los minutos
	 */
	@Override
	public String toString() {
		String res="";
		if (this.horas<10) {
			res += 0;
		}
		res += this.horas + ":";
		if (this.minutos<10) {
			res += 0;
		}
		res += this.minutos;
		return res;
	}
	
	
}
