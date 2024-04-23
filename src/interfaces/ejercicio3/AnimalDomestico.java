package interfaces.ejercicio3;

public abstract class AnimalDomestico implements Animal {

	private String nombre="";
	
	private String raza="";
	
	private double peso=0;
	
	private String color="";
	
	@Override
	public void comer() {
		
	}

	@Override
	public void dormir() {
		
	}

	@Override
	public abstract void hacerRuido();

	public static void vacuna() {
		
	};
	
	public abstract boolean hacerCaso();
	
}
