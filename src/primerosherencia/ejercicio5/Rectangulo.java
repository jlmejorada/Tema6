package primerosherencia.ejercicio5;

public class Rectangulo extends Poligono{

	private double lado1=0;
	
	private double lado2=0;

	public Rectangulo() {
		
	}

	public Rectangulo( double lado1, double lado2) {
		super(4);
		if (lado1>0) {
			this.lado1 = lado1;
		}
		if (lado2>0) {
			this.lado2 = lado2;
		}
	}

	public double getLado1() {
		return lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado1(double lado1) {
		if (lado1>0){
			this.lado1 = lado1;
		}
	}

	public void setLado2(double lado2) {
		if (lado2>0){
			this.lado2 = lado2;
		}
	}
	
	@Override
	public String toString() {
		String res="Poligono: Rectangulo \n";
		res+=super.toString();
		res+="\n Lado1: " + this.lado1;
		res+="\n Lado2: " + this.lado2;
		res+="\n Area: " + area();
		return res;
	}

	@Override
	public double area() {
		double res=lado1*lado2;
		return res;
	}
	
}
