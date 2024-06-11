package interfaces.ejercicio2;

public class Futbolista {

	private int dorsal=1;
	
	private String nombre="";
	
	private int edad=1;
	
	private int numGoles=0;

	public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {
		if (numCamiseta>0) {
			this.dorsal = numCamiseta;			
		}
		if (nombre!=null&&!nombre.equals("")) {
			this.nombre = nombre;			
		}
		if (edad>0) {
			this.edad = edad;			
		}
		if (numGoles>=0) {
			this.numGoles = numGoles;			
		}
	}
	
	@Override
	public String toString() {
		String res="";
		res += "Dorsal: " + this.dorsal + "\n";
		res += "Nombre: " + this.nombre + "\n";
		res += "Edad: " + this.edad + "\n";
		res += "Numero de goles" + this.numGoles + "\n";
		return res;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean esIgual=false;
		Futbolista fb = (Futbolista) obj;
		(<)
		return esIgual;
	}
}
