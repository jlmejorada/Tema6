package primerosherencia.ejercicio4;

public class Lavadora extends Electrodomestico{

	private float carga = 5;

	public Lavadora() {
		super();
	}

	public Lavadora(float precio, float peso) {
		super(precio, peso);
	}

	public Lavadora(float precioBase, consumoEnergetico tipo, colores color, float precio, float peso, float carga) {
		super(precioBase, tipo, color, precio, peso);
		this.carga = carga;
	}

	public float getCarga() {
		return carga;
	}
	
	//Estoy perdidisimo
	private void precioFinal() {
		
	}
	

}
