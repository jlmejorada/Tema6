package analisis.ejercicio01;

public class Turismo extends Vehiculo{

	enum Tipo {profesional, particular};
	
	private int plazas=0;
	
	private Tipo tipoMotor;

	public Turismo(String marca, String modelo, String color, String matricula, int plazas, Tipo tipo) {
		super(marca, modelo, color, matricula);
		if (plazas>2 && plazas<=9) {
			this.plazas = plazas;			
		}
		Tipo[] valor = Tipo.values();
		for (Tipo i : valor) {
			if (i==tipo) {
				this.tipoMotor = tipo;
			}            
        }	
	}

	
}
