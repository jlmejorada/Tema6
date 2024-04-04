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


	protected float precioBase = 100;



}
