package analisis.ejercicio01;

/**
 * Clase que lleva las propiedades que debe cumplir cada vehiculo, sea del tipo
 * que sea
 */
public class Vehiculo {

	/**
	 * Registra la marca del vehiculo
	 */
	private String marca = "";

	/**
	 * Registra el modelo del vehiculo
	 */
	private String modelo = "";

	/**
	 * Registra el color del vehiculo
	 */
	private String color = "";

	/**
	 * Registra la matricula del vehiculo
	 */
	private String matricula = "";

	/**
	 * Registra si el motor esta encendido o apagado
	 */
	public boolean motor = false;

	/**
	 * Registra la marcha en la que se encuentra el vehiculo
	 */
	public int marcha = 0;

	/**
	 * Registra la velocidad a la que se encuentra el vehiculo
	 */
	public int velocidad = 0;

	/**
	 * Constructor para los vehiculos estandard
	 * 
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param matricula
	 */
	public Vehiculo(String marca, String modelo, String color, String matricula) {
		if (marca != null && !marca.equals("")) {
			this.marca = marca;
		}
		if (modelo != null && !modelo.equals("")) {
			this.modelo = modelo;
		}
		if (color != null && !color.equals("")) {
			this.color = color;
		}
		if (matricula != null && !matricula.equals("")) {
			this.matricula = matricula;
		}
	}

	/**
	 * Marca el motor como encendido u apagado
	 * 
	 * @param motor
	 */
	public void setMotor(boolean motor) {
		this.motor = motor;
	}

	/**
	 * Marca la marcha dentro de un rango entre 0-5
	 * 
	 * @param marcha
	 */
	public void setMarcha(int marcha) {
		if (marcha >= 0 && marcha < 6) {
			this.marcha = marcha;
		}
	}

	/**
	 * Función que para el vehiculo
	 */
	public void parar() {
		// Ponemos la marcha del vehiculo como 0 (punto muerto)
		setMarcha(0);
		// Ponemos el motor como apagado
		setMotor(false);
	}

	/**
	 * Función que arranca el vehiculo
	 * 
	 * @return
	 */
	public boolean arrancar() {
		// Ponemos la marcha del vehiculo como 1 (primera marcha)
		setMarcha(1);
		// Ponemos el motor como encendido
		setMotor(true);
		// Devolvemos true
		return true;
	}

	/**
	 * Funcion que aumenta la velocidad y las marchas correspondientes a esa
	 * velocidad hasta llegar a la velocidad final
	 * 
	 * @param velocidad
	 */
	public void acelerar(int velocidad) {
		// Creamos una variable para la velocidad actual que está aumentando y lo
		// inicializamos a la velocidad del vehículo
		int velocidadActual = this.velocidad;
		// Mientras la velocidad actual no llegue a la especificada por parametros se
		// repite
		while (velocidadActual != velocidad) {
			switch (velocidadActual) {
			case 0 -> {
				arrancar();
			}
			case 29 -> {
				subirMarcha();
			}
			case 49 -> {
				subirMarcha();
			}
			case 69 -> {
				subirMarcha();
			}
			case 99 -> {
				subirMarcha();
			}
			}
			// Aumentamos al velocidad
			velocidadActual++;
		}
		this.velocidad = velocidadActual;
	}

	public void frenar() {
		// Creamos una variable para la velocidad actual que está disminuyendo y lo
		// inicializamos a la velocidad del vehículo
		int velocidadActual = this.velocidad;
		// Mientras la velocidad actual no llegue 0, se repite
		while (velocidadActual != velocidad) {
			switch (velocidadActual) {
			case 100 -> {
				bajarMarcha();
			}
			case 70 -> {
				bajarMarcha();
			}
			case 50 -> {
				bajarMarcha();
			}
			case 30 -> {
				bajarMarcha();
			}
			case 0 -> {
				parar();
			}
			}
			// Disminuimos la velocidad
			velocidadActual--;
		}
		this.velocidad = velocidadActual;
	}
	
	/**
	 * Funcion que se encarga de subir la marcha del vehiculo
	 */
	private void subirMarcha() {
		int marcha=this.marcha;
		setMarcha(++marcha);
	}
	
	/**
	 * Funcion que se encarga de bajar la marcha del vehiculo
	 */
	private void bajarMarcha() {
		int marcha=this.marcha;
		setMarcha(--marcha);
	}

}
