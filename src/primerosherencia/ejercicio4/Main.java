package primerosherencia.ejercicio4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

	static Electrodomestico[] lista = new Electrodomestico[4];
	
	public static void main(String[] args) {

		double precioLavadora=0;
		
		double precioTelevision=0;
		
		double precioTotal=0;
		
		
		lista[0]= new Electrodomestico(15, 30);
		
		lista[1]= new Electrodomestico("VERDE", 'B', 200, 25);

		lista[2] = new Lavadora("Verde", 'B', 200, 25, 25);
		
		lista[3] = new Television("Verde", 'B', 200, 25, 45, true);
	
		for (Electrodomestico cosa :lista) {
			cosa.precioFinal();
			System.out.println(cosa.getPrecioBase());
			precioTotal+=cosa.getPrecioBase();
			if (cosa instanceof Lavadora) {
				precioLavadora+=cosa.getPrecioBase();
			} else if (cosa instanceof Television) {
				precioTelevision+=cosa.getPrecioBase();
			}
		}
		
		
		System.out.println(Arrays.toString(lista));
		Arrays.sort(lista);
		System.out.println(Arrays.toString(lista));		
		
		
		System.out.println("El precio de todos los electrodomesticos es: " + precioTotal);
		
		System.out.println("El precio de todas las lavadoras es: " + precioLavadora);
		
		System.out.println("El precio de todas las televisores es: " + precioTelevision);
		
		
		
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
