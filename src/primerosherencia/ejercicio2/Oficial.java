package primerosherencia.ejercicio2;

public class Oficial extends Operario {
	
	public Oficial(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		String res=super.toString();
		res += " -> Oficial" ;
		return res;
	}
}
