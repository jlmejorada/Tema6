package primerosherencia.ejercicio4;

public class Television extends Electrodomestico {

	private double resolucion = 20;

	private boolean sintonizadorTDT = false;

	public Television() {
		super();
	}

	public Television(double precioBase, double peso) {
		super(precioBase, peso);
	}

	public Television(String color, char consumo, double precioBase, double peso, double resolucion,
			boolean sintonizadorTDT) {
		super(color, consumo, precioBase, peso);
		if (this.resolucion > 40) {
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
		if (this.resolucion > 40) {
			super.precioBase *= 1.3;
		}
		if (this.sintonizadorTDT) {
			super.precioBase += 50;
		}
	}

	@Override
	public String toString() {
		String res = super.toString();
		res += "Television [resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + "]";
		return res;
	}

}
