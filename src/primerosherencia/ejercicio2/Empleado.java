package primerosherencia.ejercicio2;

public class Empleado {
	
	private String nombre="";

	public Empleado() {
		
	}

	public Empleado(String nombre) {
		if (!nombre.equals("")) {
		this.nombre = nombre;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (!nombre.equals("")) {
			this.nombre = nombre;
			}
	}
	
	@Override
	public String toString() {
		String res="Empleado " + this.nombre;
		return res;
	}
	
	
	
	
	
	

}
