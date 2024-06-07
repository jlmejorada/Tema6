package primerosherencia.ejercicio4;

public class Televisor extends Electrodomestico {
	
	private double resolucion=20;
	
	private boolean sintonizadorTDT=false;

	public Televisor() {

	}

	public Televisor(double precioBase, double peso) {
		super(precioBase, peso);
	}

	public Televisor(double precioBase, String colorElegido, char consumoElegido, double peso, double resolucion,
			boolean sintonizadorTDT) {
		super(precioBase, colorElegido, consumoElegido, peso);
		if (resolucion>=20) {
			this.resolucion = resolucion;		
		}
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public double getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	public void precioFinal() {
		super.precioFinal();
		if (resolucion>40) {
			super.precioBase*=1.3;
		}
		if (sintonizadorTDT) {
			super.precioBase+=50;
		}
	}
	
}
