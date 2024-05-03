package primerosherencia.ejercicio4;

public class Electrodomestico implements Comparable<Electrodomestico> {

	enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	};

	enum ConsumoEnergetico {
		A, B, C, D, E, F
	};

	private Color color = Color.BLANCO;

	private ConsumoEnergetico consumo = ConsumoEnergetico.F;

	protected double precioBase = 100;

	private double peso = 5;

	public Electrodomestico() {

	}

	public Electrodomestico(double precioBase, double peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (peso > 0) {
			this.peso = peso;
		}
	}

	public Electrodomestico(String color, char consumo, double precioBase, double peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (peso > 0) {
			this.peso = peso;

		}
		comprobarCosumoEnergetico(consumo);
		comprobarColor(color);
	}

	public Color getColor() {
		return color;
	}

	public ConsumoEnergetico getConsumo() {
		return consumo;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public double getPeso() {
		return peso;
	}

	public void comprobarCosumoEnergetico(char letra) {
		String caracter = Character.toString(letra).toUpperCase();
		try {
			this.consumo = ConsumoEnergetico.valueOf(caracter);
		} catch (IllegalArgumentException e) {
			this.consumo = ConsumoEnergetico.F;
		}

	}
	
	public void comprobarColor(String color) {
		try {
			this.color = Color.valueOf(color.toUpperCase());
		} catch (IllegalArgumentException e) {
			this.color = Color.BLANCO;
		}
	}
	
	public void precioFinal() {
		switch(consumo) {
		case A ->{
			this.precioBase+=100;
		}
		case B ->{
			this.precioBase+=80;
		}
		case C ->{
			this.precioBase+=60;
		}
		case D ->{
			this.precioBase+=50;
		}
		case E ->{
			this.precioBase+=30;
		}
		case F->{
			this.precioBase+=10;
		}
		}
		
		if (this.peso>0 && this.peso<=19) {
			this.precioBase+=10;
		} else if (this.peso>=20 && this.peso<=49) {
			this.precioBase+=50;
		} else if (this.peso>=50 && this.peso<=79) {
			this.precioBase+=80;
		} else if (this.peso>80) {
			this.precioBase+=100;
		}
		
	}

	@Override
	public int compareTo(Electrodomestico el) {
		int devuelve=0;
		
		if (this.precioBase<el.precioBase) {
			devuelve = -1;
		} else if (this.precioBase>el.precioBase) {
			devuelve = 1;
		}
		
		return devuelve;
	}

	@Override
	public String toString() {
		return "Electrodomestico [color=" + color + ", consumo=" + consumo + ", precioBase=" + precioBase + ", peso="
				+ peso + "]";
	}

	@Override
	public boolean equals(Object obj) {
		boolean esIgual=false;
		Electrodomestico objeto = (Electrodomestico) obj;
		if (this.peso == objeto.peso) {
			esIgual=true;
		}
		
		return esIgual;
	}
	
	
	
}
