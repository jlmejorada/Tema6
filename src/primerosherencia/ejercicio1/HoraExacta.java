package primerosherencia.ejercicio1;

/**
 * Clase hora exacta, que hereda de hora, añadiendo los segundos
 */
public class HoraExacta extends Hora {
	
	/**
	 * Atributo que recoge los segundos
	 */
	private int segundos=0;

	/**
	 * Constructor con parametros que construye una hora exacta, a traves de las horas, minuots y segundos
	 * @param horas Hora usada para crear el objeto HoraExacta
	 * @param minutos Minutos usados para crear el objeto HoraExacta
	 * @param segundos Segundos usados para crear el objeto HoraExacta
	 */
	public HoraExacta(int horas, int minutos, int segundos) {
		//Llamamos al constructor de la superclase
		super(horas, minutos);
		if (segundos>-1&&segundos<60) {
			this.segundos = segundos;
		}
	}
	
	/**
	 * Metodo que incrementa la hora en un segundo
	 */
	void inc() {
		this.segundos++;
		if (segundos==60) {
			segundos=0;
			super.inc();
		}
	}
	
	/**
	 * Metodo que sustituye el metodo toString de la clase, devolviendo las horas, los minutos y los segundos
	 */
	@Override
	public String toString() {
		String res=super.toString() + ":";
		if (this.segundos<10) {
			res += 0;
		}
		res += this.segundos;
		return res;
	}

}
