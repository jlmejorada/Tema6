package primerosherencia.ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		Hora h1 = new Hora(23,59);
		
		System.out.println(h1);
		
		h1.inc();
		
		System.out.println(h1);
		
		System.out.println("Cambio a Hora exacta");
		
		Hora h2 = new HoraExacta(23, 59, 59);
		
		System.out.println(h2);
		
		h2.inc();
		
		System.out.println(h2);

	}

}
