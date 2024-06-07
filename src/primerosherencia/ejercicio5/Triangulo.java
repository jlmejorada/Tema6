package primerosherencia.ejercicio5;

public class Triangulo extends Poligono{

	private double lado1=0;
	
	private double lado2=0;
	
	private double lado3=0;

	public Triangulo() {
		
	}

	public Triangulo(double lado1, double lado2, double lado3) {
		super(3);
		if (lado1>0) {
			this.lado1 = lado1;
		}
		if (lado2>0) {
			this.lado2 = lado2;
		}
		if (lado3>0) {
			this.lado3 = lado3;
		}
	}

	public double getLado1() {
		return lado1;
	}

	public double getLado2() {
		return lado2;
	}
	
	public double getLado3() {
		return lado3;
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
	
	public void setLado3(double lado3) {
		if (lado3>0){
			this.lado3 = lado3;
		}
	}
	
	@Override
	public String toString() {
		String res="Poligono: Triangulo \n";
		res+=super.toString();
		res+="\n Lado1: " + this.lado1;
		res+="\n Lado2: " + this.lado2;
		res+="\n Lado3: " + this.lado3;
		res+="\n Area: " + area();
		return res;
	}

	@Override
	public double area() {
		double res=0;
		double semiP=(lado1+lado2+lado3)/2;
		res = Math.sqrt(semiP*(semiP-lado1)*(semiP-lado2)*(semiP-lado3));
		return res;
	}
}
