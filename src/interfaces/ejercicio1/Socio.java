package interfaces.ejercicio1;

public class Socio implements Comparable <Socio>{

	private int id=0;
	
	private String nombre="";
	
	private int edad=0;

	public Socio(int id, String nombre, int edad) {
		if (id >0) {
			this.id = id;
		}
		if (nombre!=null && !nombre.equals("")) {
			this.nombre = nombre;			
		}
		if (edad>0) {
			this.edad = edad;			
		}
	}

	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}

	@Override
	public int compareTo(Socio o) {
		int num=this.id-o.id;
		return num;
	}
	
	
}
