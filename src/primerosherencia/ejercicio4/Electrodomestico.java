package primerosherencia.ejercicio4;

/**
 * Clase que alamacena los atributos y metodos que tendran los electrodomesticos
 * @author jlmejorada
 */
public class Electrodomestico {
	/**
	 * Atributo enumerado de la categoria según su cosumo energetico
	 */
	protected enum consumoEnergetico{
		A, B, C, D, E, F
	}
	
	/**
	 * Atributo enumerado de los colores disponibles para los electrodomesticos
	 */
	protected enum colores{
		blanco, negro, rojo, azul, gris
	}
	
	/*
	 * Atributo que almacena el precio base del producto
	 */
	protected float precioBase;
	
	/**
	 * Inicalizamos el consumo energetico en F por defecto
	 */
	protected consumoEnergetico tipo = consumoEnergetico.F;

	/**
	 * Inicalizamos el color en blanco por defecto
	 */
	protected colores color = colores.blanco;

	/**
	 *	Atributo que almacena el precio base de los electrodomesticos
	 */
	protected float precio = 100;

	/**
	 * Atributo que almacena el peso base de los electrodomesticos
	 */
	protected float peso = 5;

	/**
	 * Constructor sin parametros
	 */
	public Electrodomestico() {
		super();
	}

	/**
	 * Constructor con parametros precio y peso, que se asegura que el precio y el peso no es un número negativo
	 * @param precio
	 * @param peso
	 */
	public Electrodomestico(float precio, float peso) {
		if (precio >0 ){
			this.precio = precio;
		}
		if (peso > 0){
			this.peso = peso;
		}
	}

	//TENGO DUDAS DE COMO HACER ESTE CONSTRUCTOR Y DE SI SE HA HECHO BIEN
	public Electrodomestico(float precioBase, primerosherencia.ejercicio4.Electrodomestico.consumoEnergetico tipo,
							primerosherencia.ejercicio4.Electrodomestico.colores color, float precio, float peso) {
		boolean esCorrecto= false;
		this.precioBase = precioBase;

		this.tipo = tipo;
		this.color = color;
		this.precio = precio;
		this.peso = peso;
	}

	public float getPrecioBase() {
		return precioBase;
	}

	public primerosherencia.ejercicio4.Electrodomestico.consumoEnergetico getTipo() {
		return tipo;
	}

	public primerosherencia.ejercicio4.Electrodomestico.colores getColor() {
		return color;
	}

	public float getPrecio() {
		return precio;
	}

	public float getPeso() {
		return peso;
	}


}
