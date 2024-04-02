package primerosherencia.ejercicio1;

public class Main {

	public static void main(String[] args) {
		int hora=3;
		 
		int minuto=55;
		
		int segundo=59;
		
		Hora hr = new Hora(hora, minuto);
		
		hr.inc();
		
		System.out.println(hr);
		
		/*HoraExacta he = new HoraExacta(hora, minuto, segundo);
		
		he.inc();*/
		
		//System.out.println(he);
	}

}
