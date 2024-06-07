package primerosherencia.ejercicio4;

public class Lavadora extends Electrodomestico {

	private double carga=5;

	public Lavadora() {
		
	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
	}

	public Lavadora(double precioBase, String colorElegido, char consumoElegido, double peso, double carga) {
		super(precioBase, colorElegido, consumoElegido, peso);
		if (carga>=5) {
			this.carga = carga;
		}
	}

	public double getCarga() {
		return carga;
	}
	
	public void precioFinal() {
		super.precioFinal();
		if (this.carga>30) {
			super.precioBase+=50;
		}
	}
	
	
	
}
