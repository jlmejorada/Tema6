package primerosherencia.ejercicio4;

public class Television extends Electrodomestico{

	private float resolucion = 20;
	
	private boolean sintonizadorTDT = false;

	public Television() {
		super();
	}

	public Television(float precio, float peso) {
		super(precio, peso);
	}

	public Television(float precioBase, consumoEnergetico tipo, colores color, float precio, float peso,
			float resolucion, boolean sintonizadorTDT) {
		super(precioBase, tipo, color, precio, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public float getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	
	
}
