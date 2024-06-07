package primerosherencia.ejercicio4;

import java.util.Arrays;

public class Main {

	static Electrodomestico[] lista = new Electrodomestico[4];
	
	public static void main(String[] args) {
		double precioTotal=0;
		
		double precioLavadora=0;
		
		double precioTelevisor=0;
		
		lista[0]= new Electrodomestico(15, 30);
		
		lista[1]= new Electrodomestico(200, "BLANCO", 'B', 50);

		lista[2] = new Lavadora(150, "VerDe", 'C', 150, 15);
		
		lista[3] = new Televisor(300, "NEGRO", 'B', 40, 30, true);
	
		for (Electrodomestico cosa :lista) {
			cosa.precioFinal();
			System.out.println(cosa.getPrecioBase());
			precioTotal+=cosa.getPrecioBase();
			if (cosa instanceof Lavadora) {
				precioLavadora+=cosa.getPrecioBase();
			} else if (cosa instanceof Televisor) {
				precioTelevisor+=cosa.getPrecioBase();
			}
		}
		
		
		System.out.println("El precio de todos los electrodomesticos es: " + precioTotal);
		
		System.out.println("El precio de todas las lavadoras es: " + precioLavadora);
		
		System.out.println("El precio de todas las televisores es: " + precioTelevisor);
		
		
		
	}
	
	public int posicionVacia() {
		int pos=-1;
		int cont=0;
		while (cont < lista.length && lista[cont]!=null) {
			cont++;
		}
		if (cont<lista.length) {
			pos = cont;
		}
			return pos;
	}
	

}
