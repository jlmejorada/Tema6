package primerosherencia.ejercicio3;

public class Main {

	public static void main(String[] args) {
		double precio=0;
		Producto pr = new Producto ("Pera", 0.4);
		NoPerecedero np = new NoPerecedero ("Arroz", 1.20, "SOS");
		Perecedero pe = new Perecedero ("Croquetas", 2.0, 4);
		System.out.println(pr);
		System.out.println(np);
		System.out.println(pe);
		System.out.println("--------------------------");
		
		precio = pr.calcular(3);
		System.out.println(precio);
		precio = np.calcular(3);
		System.out.println(precio);
		precio = pe.calcular(3);
		System.out.println(precio);
		
	}

}
