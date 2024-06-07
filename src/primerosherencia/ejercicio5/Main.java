package primerosherencia.ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opc=-1;
		ArrayList<Poligono> lista = new ArrayList<Poligono>();
		Rectangulo rc=null;
		Triangulo tr=null;
		do {
			mostrarMenu();
			System.out.println("Elige una opc:");
			opc=sc.nextInt();
			sc.nextLine();
			switch(opc) {
			case 1->{
				tr=creaTri();
				lista.add(tr);
			}
			case 2->{
				rc=creaRec();
				lista.add(rc);
			}
			case 3->{
				for (Poligono mostrar: lista) {
					System.out.println(mostrar);
				}
				
			}
			default->{
				System.out.println("Opción " + opc + " no valida");
			}
			}
			
		} while (opc!=0);
		
		sc.close();
	}
	
	public static void mostrarMenu() {
		System.out.println("------------------------");
		System.out.println("----------Menu----------");
		System.out.println("------------------------");
		System.out.println("1.Introducir triángulo");
		System.out.println("2.Introducir rectangulo");
		System.out.println("3.Mostrar contenido");
		System.out.println("0.Salir");
		System.out.println("------------------------");
	}
	
	public static Rectangulo creaRec() {
		Rectangulo rc;
		double lado1=0;
		double lado2=0;
		System.out.println("Dame la longitud del lado 1");
		lado1=sc.nextDouble();
		sc.nextLine();
		System.out.println("Dame la longitud del lado 2");
		lado2=sc.nextDouble();
		sc.nextLine();
		rc = new Rectangulo(lado1, lado2);
		return rc;
	}
	
	public static Triangulo creaTri() {
		Triangulo tr;
		double lado1=0;
		double lado2=0;
		double lado3=0;
		System.out.println("Dame la longitud del lado 1");
		lado1=sc.nextDouble();
		sc.nextLine();
		System.out.println("Dame la longitud del lado 2");
		lado2=sc.nextDouble();
		sc.nextLine();
		System.out.println("Dame la longitud del lado 3");
		lado3=sc.nextDouble();
		sc.nextLine();
		tr = new Triangulo(lado1, lado2, lado3);
		return tr;
	}
}
