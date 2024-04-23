package interfaces.ejercicio3;

import java.util.Random;

public class Gato extends AnimalDomestico{

	@Override
	public void hacerRuido() {
		System.out.println("Meow");
		
	}

	@Override
	public boolean hacerCaso() {
		boolean responde=false;
		int num;
		Random rand = new Random();
		num=rand.nextInt(0,10);
		if (num>9) {
			responde=true;
		}
		return responde;
	}
	
	public void toserBolaPelo() {
		System.out.println("Coof coof ¡Buagh!");
	}

}
