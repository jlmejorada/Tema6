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
		String lados="";
		lados+=numeroLados;
		return lados;
	}
	
	
	
	 public abstract void area();
}
