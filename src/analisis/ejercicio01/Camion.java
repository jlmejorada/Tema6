package analisis.ejercicio01;

public class Camion extends Vehiculo {
	
	private double pesoMax=0;
	
	private boolean mercanciaPel=false;

	public Camion(String marca, String modelo, String color, String matricula, double pesoMax, boolean mercanciaPel) {
		super(marca, modelo, color, matricula);
		if (pesoMax>0) {
			this.pesoMax = pesoMax;			
		}
		if (mercanciaPel==true) {
			this.mercanciaPel = mercanciaPel;
		}
	}
	
	
}
