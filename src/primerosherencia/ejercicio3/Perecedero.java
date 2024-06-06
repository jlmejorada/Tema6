package primerosherencia.ejercicio3;

public class Perecedero extends Producto {

	private int diasACaducar=0;

	public Perecedero(String nombre, double precio, int diasACaducar) {
		super(nombre, precio);
		if (diasACaducar>1) {
			this.diasACaducar = diasACaducar;
		}
	}

	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		if (diasACaducar>1) {
			this.diasACaducar = diasACaducar;
		}
	}
	
	public double calcular(int cantidad) {
		double res=0;
		double precio=super.calcular(cantidad);
		switch (this.diasACaducar) {
		case 1->{
			res=precio/4;
		}
		case 2->{
			res=precio/3;
		}
		case 3->{
			res=precio/2;
		}
		default->{
			res=precio;
		}
		}
		return res;
	}
	
	@Override
	public String toString() {
		String res=super.toString();
		res+="\n" + "Días a caducar: " + this.diasACaducar;
		return res;
	}
	
}
