package interfaces.ejercicio1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Socio s1 = new Socio(24, "Jose Luis", 23);
		Socio s2 = new Socio(3, "Pablo", 21);
		Socio s3 = new Socio(10, "Dudu", 19);
		
		Socio[] listaSocios = {s1, s2, s3};
		
		Arrays.sort(listaSocios);
		
		for (Socio s : listaSocios) {
			System.out.println(s);
		}
		

	}

}
