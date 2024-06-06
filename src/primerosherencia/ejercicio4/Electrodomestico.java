package primerosherencia.ejercicio4;

public class Electrodomestico {

	enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}
	
	enum ConsumoEnergetico {
		A, B, C, D, E, F
	}

	protected double precioBase = 100;

	protected Color colorElegido = Color.BLANCO;
	
	protected ConsumoEnergetico consumoElegido = ConsumoEnergetico.F;
	
	protected double peso=5;

	public Electrodomestico() {
		
	}
	
	public Electrodomestico(double precioBase, double peso) {
		if (precioBase>=100) {
			this.precioBase = precioBase;
		}
		if (peso>=5) {
			this.peso = peso;
		}
	}

	public Electrodomestico(double precioBase, String colorElegido, char consumoElegido, double peso) {
		if (precioBase>=100) {
			this.precioBase = precioBase;
		}
		comprobarColor(colorElegido);
		comprobarConsumoEnergetico(consumoElegido);
		if (peso>=5) {
			this.peso = peso;
		}
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public Color getColorElegido() {
		return colorElegido;
	}

	public ConsumoEnergetico getConsumoElegido() {
		return consumoElegido;
	}

	public double getPeso() {
		return peso;
	}
	
	private void comprobarConsumoEnergetico(char letra) {
		letra=Character.toUpperCase(letra);
		switch (letra) {
		case 'A' ->{
			this.consumoElegido = ConsumoEnergetico.A;
		}
		case 'B' ->{
			this.consumoElegido = ConsumoEnergetico.B;
		}
		case 'C' ->{
			this.consumoElegido = ConsumoEnergetico.C;
		}
		case 'D' ->{
			this.consumoElegido = ConsumoEnergetico.D;
		}
		case 'E' ->{
			this.consumoElegido = ConsumoEnergetico.E;
		}
		default ->{
			this.consumoElegido = ConsumoEnergetico.F;
		}
		}
	}
	
	private void comprobarColor(String color) {
		color=color.toUpperCase();
		switch (color) {
		case "NEGRO" ->{
			this.colorElegido = Color.NEGRO;
		}
		case "ROJO" ->{
			this.colorElegido = Color.ROJO;
		}
		case "AZUL" ->{
			this.colorElegido = Color.AZUL;
		}
		case "GRIS" ->{
			this.colorElegido = Color.GRIS;
		}
		default ->{
			this.colorElegido = Color.BLANCO;
		}
		}
	}
	
	void precioFinal() {
		double res=this.precioBase;
		switch (this.consumoElegido) {
		case A ->{
			res+=100;
		}
		case B ->{
			res+=80;
		}
		case C ->{
			res+=60;
		}
		case D ->{
			res+=50;
		}
		case E ->{
			res+=30;
		}
		case F ->{
			res+=10;
		}
		}
		if (this.peso>0 && this.peso<=19) {
			res+=10;
		} else if (this.peso>=20 && this.peso<=49) {
			res+=50;
		} else if (this.peso>=50 && this.peso<=79) {
			res+=80;
		} else if (this.peso>=80) {
			res+=100;
		}
		this.precioBase=res;
	}
}
