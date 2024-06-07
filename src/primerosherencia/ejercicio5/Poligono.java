package primerosherencia.ejercicio5;

abstract class Poligono {

	protected int numeroLados=0;
	
	public Poligono() {

	}

	public Poligono(int numeroLados) {
		if(numeroLados>=3) {
			this.numeroLados = numeroLados;
		}
	}
	
	public int getNumeroLados() {
		return numeroLados;
	}

	public abstract double area();
	
	@Override
	public String toString() {
		return "Numero lados: " + this.numeroLados;
	}
	
}
