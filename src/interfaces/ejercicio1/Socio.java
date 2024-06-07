package interfaces.ejercicio1;

public class Socio implements Comparable<Socio> {

	private int id = 1;

	private String nombre = "";

	private int edad = 18;

	public Socio(int id, String nombre, int edad) {
		if (id > 1) {
			this.id = id;
		}
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (edad >= 18) {
			this.edad = edad;
		}
	}
	
	@Override
	public String toString() {
		String res="";
		res += "Identificador: " + this.id + "\n";
		res += "Nombre: " + this.nombre + "\n";
		res += "Edad:" + this.edad + "\n";
		res += "--------------------";
		return res;
	}

	@Override
	public int compareTo(Socio o) {
		int res = 0;
		res = (this.id>o.id)? 1 : -1 ;
		return res;
	}

}
