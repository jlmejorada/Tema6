package interfaces.ejercicio1;

public class Main {

	public static void main(String[] args) {
		Socio s1 = new Socio(1, "Jose Luis", 23);
		Socio s2 = new Socio(2, "Pablo", 21);
		Socio s3 = new Socio(3, "Dudu", 19);
		
		Socio[] listaSocios = {s1, s2, s3};
		
		for (int i=0; i<listaSocios.length ;i++) {
			if (s1.compareTo(s3)<0) {
				System.out.println(s1);
				System.out.println(s3);
			}
		}
		

	}

}
