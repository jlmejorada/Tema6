package interfaces.ejercicio3;

import java.util.Random;

public class Perro extends AnimalDomestico{

	@Override
	public void hacerRuido() {
		System.out.println("Woof");
		
	}

	@Override
	public boolean hacerCaso() {
		boolean responde=false;
		int num;
		Random rand = new Random();
		num=rand.nextInt(0,10);
		if (num<9) {
			responde=true;
		}
		return responde;
	}
	
	public void sacarPaseo() {
		System.out.println("Caca y pipi en la calle");
	}

}
