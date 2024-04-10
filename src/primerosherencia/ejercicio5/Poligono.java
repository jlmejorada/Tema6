package primerosherencia.ejercicio5;

public abstract class Poligono {

	protected int numeroLados=0;
	
	public Poligono() {
	}

	public Poligono(int numeroLados) {
		if(numeroLados>0) {
			this.numeroLados = numeroLados;			
		}
	}

	@Override
	public String toString() {
		String lados="Numero de lados: ";
		lados+=numeroLados + "\n";
		if (numeroLados == 2) {
			lados += "El Poligono de un Rectangulo:" + "\n";
		} else if (numeroLados == 3) {
			lados += "El Poligono es un Triangulo:" + "\n";
		}
		return lados;
	}
	
	
	
	 public abstract double area();
}
