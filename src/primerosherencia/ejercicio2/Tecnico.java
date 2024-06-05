package primerosherencia.ejercicio2;

public class Tecnico extends Operario {
	
	public Tecnico(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		String res=super.toString();
		res += " -> Tecnico" ;
		return res;
	}
	
}
