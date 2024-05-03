package primerosherencia.ejercicio4;

public class Lavadora extends Electrodomestico{

	private double carga=5;

	public Lavadora() {
		super();
	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
	}

	public Lavadora(String color, char consumo, double precioBase, double peso, double carga) {
		super(color, consumo, precioBase, peso);
		if (carga>0) {
			this.carga = carga;			
		}
	}

	public double getCarga() {
		return carga;
	}
	
	@Override
	public void precioFinal() {
		super.precioFinal();
		if (this.carga>30) {
			super.precioBase+=50;
		}
	}

	@Override
	public String toString() {
		String res=super.toString();
		res+="Lavadora [carga=" + carga + "]";
		return res;
	}
	
	
}
