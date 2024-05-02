package analisis.ejercicio01;

public class Motocicleta extends Vehiculo{

	private int cilindrada=0;
	
	public Motocicleta(String marca, String modelo, String color, String matricula, int cilindrada) {
		super(marca, modelo, color, matricula);
		if (cilindrada>0) {
			this.cilindrada = cilindrada;			
		}
	}
	
	
	public boolean tipoPermiso() {
		boolean requiere=false;
		if (this.cilindrada>125) {
			requiere=true;
		}
		return requiere;
	}
}
