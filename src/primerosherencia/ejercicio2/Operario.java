package primerosherencia.ejercicio2;

public class Operario extends Empleado{

	public Operario(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		String res=super.toString();
		res += " -> " + "Operario";
		return res;
	}
}
